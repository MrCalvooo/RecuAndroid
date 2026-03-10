package com.imontalvodev.a014carritocompra;

import androidx.annotation.NonNull;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private int imagen;

    public Producto(String nombre, double precio, int cantidad, int imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", imagen=" + imagen +
                '}';
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getImagen() {
        return imagen;
    }
}
