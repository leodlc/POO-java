/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaalummnoapp;

/**
 *
 * @author AsrockLeo
 */
public class Alumno implements Comparable <Alumno> {
    private int ID;
    private String nombre;
    private int edad;
    //constructores
    public Alumno(int ID, String nombre, int edad) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Alumno() {
        this.ID = 0;
        this.nombre = "";
        this.edad = 0;
    }
    //get and set

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "ID=" + ID + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

//    @Override
//    public int compareTo(Alumno o) {
//        return this.nombre.compareTo(o.getNombre());
//    }
    @Override
    public int compareTo(Alumno o){
        return this.nombre.compareTo(o.getNombre());
    }
    
}
