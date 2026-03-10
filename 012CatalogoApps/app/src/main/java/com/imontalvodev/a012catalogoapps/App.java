package com.imontalvodev.a012catalogoapps;

public class App {
    private String nombre;
    private String categoria;
    private double valoracion;
    private int icono;

    public App(String nombre, String categoria, double valoracion, int icono) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.valoracion = valoracion;
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValoracion() {
        return valoracion;
    }

    public int getIcono() {
        return icono;
    }

    // Generar estrellas según valoración
    private String generarEstrellas(double valoracion) {
        int estrellas = (int) Math.round(valoracion);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i < estrellas) {
                sb.append("★");
            } else {
                sb.append("☆");
            }
        }
        return sb.toString();
    }
}
