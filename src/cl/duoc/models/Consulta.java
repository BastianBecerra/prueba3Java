/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Consulta {
    private int id;
    private LocalDate fecha;
    private String hora;
    private String diagnostico;
    private String tratamiento;
    private int rut_paciente;
    private int rut_medico;

    public Consulta() {
    }

    public Consulta(int id, LocalDate fecha, String hora, String diagnostico, String tratamiento, int rut_paciente, int rut_medico) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.rut_paciente = rut_paciente;
        this.rut_medico = rut_medico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public int getRut_paciente() {
        return rut_paciente;
    }

    public void setRut_paciente(int rut_paciente) {
        this.rut_paciente = rut_paciente;
    }

    public int getRut_medico() {
        return rut_medico;
    }

    public void setRut_medico(int rut_medico) {
        this.rut_medico = rut_medico;
    }

    @Override
    public String toString() {
        return "consulta{" + "id=" + id +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", diagnostico=" + diagnostico +
                ", tratamiento=" + tratamiento +
                ", rut_paciente=" + rut_paciente +
                ", rut_medico=" + rut_medico + 
                '}';
    }
    
    
    
}
