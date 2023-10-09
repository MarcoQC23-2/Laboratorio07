/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author mco_a
 */
public class Paciente extends Persona {
   
   private String dni;

   public Paciente(String nombre){
       super(nombre);
   }
   public Paciente(String nombre, String telefono, String dni, String sexo) {
       super(nombre, telefono, sexo);
       this.dni = dni;
   }

   public String getDni() {
       return dni;
   }

   public void setDni(String dni) {
       this.dni = dni;
   }

   public String getTexto() {
       return super.getNombre() + "|" + this.dni + "|" + super.getTelefono()+ "|" + super.getSexo();
   }
   @Override
    public String toString() {
       return getNombre(); // Devuelve el nombre del médico como representación de cadena
    }
}
