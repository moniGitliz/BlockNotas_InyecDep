package com.ClaseDI.ClaseDI_AppBlock.controller;


import com.ClaseDI.ClaseDI_AppBlock.model.Nota;
import com.ClaseDI.ClaseDI_AppBlock.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotasController {

    private final NotaService notaService;

    @Autowired
    public NotasController(NotaService notaService) {
        this.notaService = notaService;
    }

    @GetMapping
    public List<Nota> obtenerTodas() {
        return notaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Nota obtenerPorId(@PathVariable  Long id){
        return notaService.obtenerPorID(id);
    }

    @PostMapping ("/crear")
    public ResponseEntity<String> crearNota(@RequestBody Nota nota) {
        notaService.crearNota(nota);
        return ResponseEntity.ok("Nota creada con éxito");
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<String> eliminarNota(@PathVariable  Long id) {
        notaService.eliminarNota(id);
        return ResponseEntity.ok("Nota eliminada con éxito");
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarNota (@PathVariable Long id, @RequestBody Nota notaActualizada){
        notaService.editarNota(id, notaActualizada);
        return ResponseEntity.ok("Nota actualizada con éxito!");
    }



}
