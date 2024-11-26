/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Medico {
    private int rut;
    private String nombre;
    private String especialidad;
    private int numero_de_contacto;

    public Medico() {
    }

    public Medico(int rut, String nombre, String especialidad, int numero_de_contacto) {
        this.rut = rut;
        this.nombre = nombre;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumero_de_contacto() {
        return numero_de_contacto;
    }

    public void setNumero_de_contacto(int numero_de_contacto) {
        this.numero_de_contacto = numero_de_contacto;
    }

    @Override
    public String toString() {
        return "Medico{" + "rut=" + rut +
                ", nombre=" + nombre +
                ", especialidad=" + especialidad +
                ", numero_de_contacto=" + numero_de_contacto +
                '}';
    }
    
    
}
