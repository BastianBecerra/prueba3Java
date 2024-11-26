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
public class Hospitalizacion {
    private int id;
    private LocalDate fecha_de_ingreso;
    private LocalDate fecha_de_alta;
    private String tipo_de_hospitalizacion;
    private int rut_paciente;

    public Hospitalizacion() {
    }

    public Hospitalizacion(int id, LocalDate fecha_de_ingreso, LocalDate fecha_de_alta, String tipo_de_hospitalizacion, int rut_paciente) {
        this.id = id;
        this.fecha_de_ingreso = fecha_de_ingreso;
        this.fecha_de_alta = fecha_de_alta;
        this.tipo_de_hospitalizacion = tipo_de_hospitalizacion;
        this.rut_paciente = rut_paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha_de_ingreso() {
        return fecha_de_ingreso;
    }

    public void setFecha_de_ingreso(LocalDate fecha_de_ingreso) {
        this.fecha_de_ingreso = fecha_de_ingreso;
    }

    public LocalDate getFecha_de_alta() {
        return fecha_de_alta;
    }

    public void setFecha_de_alta(LocalDate fecha_de_alta) {
        this.fecha_de_alta = fecha_de_alta;
    }

    public String getTipo_de_hospitalizacion() {
        return tipo_de_hospitalizacion;
    }

    public void setTipo_de_hospitalizacion(String tipo_de_hospitalizacion) {
        this.tipo_de_hospitalizacion = tipo_de_hospitalizacion;
    }

    public int getRut_paciente() {
        return rut_paciente;
    }

    public void setRut_paciente(int rut_paciente) {
        this.rut_paciente = rut_paciente;
    }

    @Override
    public String toString() {
        return "Hospitalizacion{" + "id=" + id +
                ", fecha_de_ingreso=" + fecha_de_ingreso +
                ", fecha_de_alta=" + fecha_de_alta +
                ", tipo_de_hospitalizacion=" + tipo_de_hospitalizacion +
                ", rut_paciente=" + rut_paciente +
                '}';
    }
    
    
}
