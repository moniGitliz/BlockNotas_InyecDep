package com.ClaseDI.ClaseDI_AppBlock.service;

import com.ClaseDI.ClaseDI_AppBlock.model.Nota;
import com.ClaseDI.ClaseDI_AppBlock.repository.iNotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaService implements iNotaService{

    private final iNotaRepository notaRepository;

@Autowired
    public NotaService(iNotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }


    @Override
    public List<Nota> obtenerTodas() {
        return notaRepository.findAll();
    }

    @Override
    public Nota obtenerPorID(Long id) {
        return notaRepository.findById(id).orElse(null);
    }

    @Override
    public void crearNota(Nota nota) {
    notaRepository.save(nota);
    }

    @Override
    public void eliminarNota(Long id) {
        notaRepository.deleteById(id);
    }

    @Override
    public void editarNota(Long id, Nota notaActualizada) {
        //primero saber si existe
        Nota notaExistente = notaRepository.findById(id).orElse(null);

        if(notaExistente != null){
            //Actualizar los campos de la nota existente
            notaExistente.setTitulo(notaActualizada.getTitulo());
            notaExistente.setContenido(notaActualizada.getContenido());
            notaExistente.setFechaCreacion(notaActualizada.getFechaCreacion());

            //guardo a la nota actualizada
            notaRepository.save(notaExistente);
        } else {
            throw new RuntimeException("Nota no encontrada con el id: " + id);
        }

    }
}
