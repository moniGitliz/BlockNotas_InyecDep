package com.ClaseDI.ClaseDI_AppBlock.repository;

import com.ClaseDI.ClaseDI_AppBlock.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface iNotaRepository  extends JpaRepository<Nota, Long> {

//    List<Nota> findAll();
//    Nota findById(Long id);
//    void save(Nota nota);
//    void delete(Long id);
}
