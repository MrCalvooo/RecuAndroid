package com.imontalvodev.a009listapeliculas;

public class Pelicula {
    private String titulo;
    private String director;
    private int anyo;
    private double calificacion;
    private int imagen;

    public Pelicula(String titulo, String director, int anyo, double calificacion, int imagen) {
        this.titulo = titulo;
        this.director = director;
        this.anyo = anyo;
        this.calificacion = calificacion;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getAnyo() {
        return anyo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getImagen() {
        return imagen;
    }
}
