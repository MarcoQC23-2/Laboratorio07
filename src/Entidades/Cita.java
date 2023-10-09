/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author mco_a
 */
public class Cita {
    private Medico medico;
    private Paciente paciente;
    private String fecha;
    private String hora;
    private String especialidad;

    public Cita(Medico medico, Paciente paciente, String fecha, String hora, String especialidad) {
        this.medico = medico;
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.especialidad = especialidad;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public String getTexto() {
        return 
               "M| " + medico.getNombre() +
               ", P| " + paciente.getNombre() +
               ", F| " + fecha + ", H| " +
               hora  +
               ", E| " + especialidad;
    }

    @Override
    public String toString() {
        return  
               "M|" + medico.getNombre() +
               "| P|" + paciente.getNombre() +
               "| F|" + fecha + "| H|" +
               hora + '\'' +
               "| E|" + especialidad;
              
    }
}
