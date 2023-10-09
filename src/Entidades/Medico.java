/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author mco_a
 */
public class Medico extends Persona {
    
    private String CMP;
    private String especialidad;

    public Medico(String nombre) {
        super(nombre);
    }
    public Medico(String nombre, String CMP, String especialidad) {
        super(nombre);
        this.CMP = CMP;
        this.especialidad = especialidad;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.especialidad = Especialidad;
    }

    public String getTexto() {
       return super.getNombre() + "|" + this.CMP + "|" + this.especialidad;
    }
   
    @Override
    public String toString() {
       return getNombre(); // Devuelve el nombre del médico como representación de cadena
    }
}
