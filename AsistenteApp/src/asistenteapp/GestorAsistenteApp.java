/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistenteapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorAsistenteApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1= new Persona();
        Persona p2= new Persona("Anita","123");
        Persona p3= new Persona("Pablo","345",17);
        Persona p4= new Persona("Maria",23,"789");
        p1.mostrarPersona();
        System.out.println("-----");
        p2.mostrarPersona();
        System.out.println("-----");
        p3.mostrarPersona();
        p3.mayoriaEdad();//determinar si es mayor o menor
        System.out.println("-----");
        p4.mostrarPersona();
        p4.mayoriaEdad();
        System.out.println("-----");
        Scanner sc= new Scanner(System.in);
        //obtener nombre
        System.out.println("======================");
        p1.getNombre();
        System.out.println("Nombre: "+ p2.getNombre());
        System.out.println("-----");
        System.out.println("Nombre: "+ p3.getNombre());
        System.out.println("-----");
        System.out.println("Nombre: "+ p4.getNombre());
        System.out.println("-----");
        System.out.println("======================");
        
        p2.setNombre("Marco");
        p2.mostrarPersona();
        System.out.println("-----");
        p3.setId("697");
        p3.mostrarPersona();
        System.out.println("======================");
        
    } 
        
}
    

