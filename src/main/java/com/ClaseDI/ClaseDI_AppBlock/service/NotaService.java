package com.ClaseDI.ClaseDI_AppBlock.service;

import com.ClaseDI.ClaseDI_AppBlock.model.Nota;
import com.ClaseDI.ClaseDI_AppBlock.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaService implements iNotaService{
    private final NotaRepository notaRepository;

@Autowired
    public NotaService(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }


    @Override
    public List<Nota> obtenerTodas() {
        return notaRepository.findAll();
    }

    @Override
    public Nota obtenerPorID(Long id) {
        return notaRepository.findById(id);
    }

    @Override
    public void crearNota(Nota nota) {
    notaRepository.save(nota);
    }

    @Override
    public void eliminarNota(Long id) {
        notaRepository.delete(id);
    }
}
