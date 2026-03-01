package com.imontalvodev.a008listacontactos;

public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre='" + nombre + '\'' + ", telefono='" + telefono + '\'' + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
