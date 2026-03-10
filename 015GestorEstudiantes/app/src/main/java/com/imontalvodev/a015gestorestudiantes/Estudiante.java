package com.imontalvodev.a015gestorestudiantes;

public class Estudiante {
    private String nombre;
    private int edad;
    private String grado;
    private String genero;
    private boolean repite;

    public Estudiante(String nombre, int edad, String grado, String genero, boolean repite) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.genero = genero;
        this.repite = repite;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrado() {
        return grado;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isRepite() {
        return repite;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setRepite(boolean repite) {
        this.repite = repite;
    }
}
