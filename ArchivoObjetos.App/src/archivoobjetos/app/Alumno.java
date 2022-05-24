/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoobjetos.app;

import java.io.Serializable;

/**
 *
 * @author AsrockLeo
 */
public class Alumno implements Serializable {
    private String nombre;
    private String dni;
    private float nota;

    public Alumno(String nombre, String dni, float nota) {
        this.nombre = nombre;
        this.dni = dni;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public float getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", nota=" + nota + '}';
    }
    
}
