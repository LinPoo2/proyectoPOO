/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorioremotogrupo5;

/**
 *
 * @author Melissa Aguilera
 */
public class Deportista extends Persona{
    
    private String especialidad;
    
    public Deportista(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public void ocupacion(){
        System.out.println("Soy deportista y mi área es el " + this.especialidad);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    
}
