package com.ClaseDI.ClaseDI_AppBlock.model;

public class Nota {
    private Long id_Nota;
    private String titulo;
    private String contenido;

    public Nota() {
    }

    public Nota(Long id_Nota, String titulo, String contenido) {
        this.id_Nota = id_Nota;
        this.titulo = titulo;
        this.contenido = contenido;
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
}

