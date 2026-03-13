package com.imontalvodev.a016notasconmenus;

public class Nota {
    private String titulo;
    private String contenido;
    private String fecha;
    private boolean favorita;

    public Nota(String titulo, String contenido, String fecha, boolean favorita) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
        this.favorita = favorita;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }
}
