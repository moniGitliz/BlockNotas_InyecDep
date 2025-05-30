package com.ClaseDI.ClaseDI_AppBlock.repository;

import com.ClaseDI.ClaseDI_AppBlock.model.Nota;

import java.util.List;

public interface iNotaRepository {
    List<Nota> findAll();
    Nota findById(Long id);
    void save(Nota nota);
    void delete(Long id);
}
