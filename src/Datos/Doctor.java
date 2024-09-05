package Datos;

import java.util.ArrayList;

public class Doctor {
    private String nombre;
    private String apellido;
    private String especialidad;

    // Constructor
    public Doctor(String nombre, String apellido, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    // Método toString para imprimir la información del doctor
    @Override
    public String toString() {
        return "Doctor: " + nombre + " " + apellido + ", Especialidad: " + especialidad;
    }


    public static ArrayList<Doctor> listaDeDoctores() {
        ArrayList<Doctor> doctores = new ArrayList<>();

        // Añadir 5 doctores a la lista
        doctores.add(new Doctor("Paco", "Ochoa", "Cardiología"));
        doctores.add(new Doctor("Ana", "Martínez", "Pediatría"));
        doctores.add(new Doctor("Luis", "García", "Dermatología"));
        doctores.add(new Doctor("María", "López", "Neurología"));
        doctores.add(new Doctor("Carlos", "Pérez", "Oftalmología"));

        return doctores;
    }
}
