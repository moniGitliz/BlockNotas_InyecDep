package com.ClaseDI.ClaseDI_AppBlock.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

import java.util.Date;

@Entity
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Aqui se establece como un AUTOINCREMENT
    private Long id_Nota;
    @Column(nullable = false, length = 100)
    private String titulo;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String contenido;
    @Column(nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaCreacion;

    public Nota() {
    }

    public Nota(Long id_Nota, String titulo, String contenido, LocalDate fechaCreacion) {
        this.id_Nota = id_Nota;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
    }


    public Long getId_Nota() {
        return id_Nota;
    }

    public void setId_Nota(Long id_Nota) {
        this.id_Nota = id_Nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

