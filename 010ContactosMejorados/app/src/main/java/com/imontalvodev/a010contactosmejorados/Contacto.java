package com.imontalvodev.a010contactosmejorados;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    private int imagen;

    public Contacto(String nombre, String telefono, String email, int imagen) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.imagen = imagen;
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

    public String getEmail() {
        return email;
    }

    public int getImagen() {
        return imagen;
    }
}
