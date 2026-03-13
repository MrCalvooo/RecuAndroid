package com.imontalvodev.a020agendacitas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Cita {
    private String nombrePaciente;
    private Calendar fechaHora;

    public Cita(String nombre, Calendar fechaHora) {
        this.nombrePaciente = nombre;
        this.fechaHora = fechaHora;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public void setFechaHora(Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm", Locale.getDefault());
        return nombrePaciente + "\n" + sdf.format(fechaHora.getTime());
    }
}
