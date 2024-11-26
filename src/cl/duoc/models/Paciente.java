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
public class Paciente {
    private int rut;
    private String nombre;
    private LocalDate fecha_de_nacimiento;
    private String direccion;
    private int numero_de_contacto;

    public Paciente() {
    }

    public Paciente(int rut, String nombre, LocalDate fecha_de_nacimiento, String direccion, int numero_de_contacto) {
        this.rut = rut;
        this.nombre = nombre;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.direccion = direccion;
        this.numero_de_contacto = numero_de_contacto;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero_de_contacto() {
        return numero_de_contacto;
    }

    public void setNumero_de_contacto(int numero_de_contacto) {
        this.numero_de_contacto = numero_de_contacto;
    }

    @Override
    public String toString() {
        return "paciente{" + "rut=" + rut +
                ", nombre=" + nombre +
                ", fecha_de_nacimiento=" + fecha_de_nacimiento +
                ", direccion=" + direccion +
                ", numero_de_contacto=" + numero_de_contacto +
                '}';
    }
    
    
}
