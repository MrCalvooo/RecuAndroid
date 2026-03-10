package com.imontalvodev.a011galeriaimagenes;

public class Imagen {
    private String titullo;
    private int recurso;

    public Imagen(String titullo, int recurso) {
        this.titullo = titullo;
        this.recurso = recurso;
    }

    public String getTitulo() {
        return titullo;
    }

    public void setTitullo(String titullo) {
        this.titullo = titullo;
    }

    public void setRecurso(int recurso) {
        this.recurso = recurso;
    }

    public int getRecurso() {
        return recurso;
    }
}
