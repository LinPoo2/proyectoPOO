package com.proyects.persona;

public class Main {

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Emilio", "Dominguez", 45, 80.5, "Traumatólogo");

        System.out.println("Nombre: " + doctor.nombre + " " + doctor.apellido);
        System.out.println("Edad: " + doctor.edad + " años");
        System.out.println("Peso: " + doctor.peso + " kg");
        doctor.ocupacion();

    }
}
