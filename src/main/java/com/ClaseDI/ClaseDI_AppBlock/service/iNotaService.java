package com.ClaseDI.ClaseDI_AppBlock.service;

import com.ClaseDI.ClaseDI_AppBlock.model.Nota;

import java.util.List;

public interface iNotaService {
    List<Nota> obtenerTodas();
    Nota obtenerPorID(Long id);

    void crearNota (Nota nota);
    void eliminarNota (Long id);
    void editarNota (Long id, Nota notaActualizada);
}
