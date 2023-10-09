/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author mco_a
 */
public class Persona {
   
    private String nombre;
    private String telefono;
    private String sexo;

    public Persona() {
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, String telefono, String sexo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
