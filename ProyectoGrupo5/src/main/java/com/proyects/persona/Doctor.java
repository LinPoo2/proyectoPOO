package com.proyects.persona;

public class Doctor extends Persona {

    private String especialidad;

    public Doctor(String nombre, String apellido, int edad, double peso, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.especialidad = especialidad;
    }

    @Override
    public void ocupacion() {
        System.out.println("Es doctor con especializado como " + especialidad);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
