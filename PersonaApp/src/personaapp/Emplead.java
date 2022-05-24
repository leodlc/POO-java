/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaapp;
// clase 27 de mayor de 2021, insertamos codigo set y get y tostring para ahorrar tiempo
/**
 *
 * @author AsrockLeo
 */
public class Emplead {
    private String nombre;
    private String apellido;
    private double salario;

    public Emplead(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Emplead{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + '}';
    }
    
    
    
}
