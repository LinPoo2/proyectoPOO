package com.proyects.persona;

/**
 *
 * @author Lin Reyes
 */
public abstract class Persona {

    public String nombre;
    public String apellido;
    public int edad;
    public double peso;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract void ocupacion();

}
