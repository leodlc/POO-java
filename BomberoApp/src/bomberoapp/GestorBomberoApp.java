/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberoapp;

import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorBomberoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String n= sc.nextLine();
        System.out.println("Ingrese apellido");
        String a= sc.nextLine();
        System.out.println("Ingrese edad");
        int e= sc.nextInt();
        
        Bombero objBombero3 = new Bombero(n,a,e);
        Bombero objBombero1 = new Bombero("Pedro","Paez",22);
       
        Bombero objBombero2 = new Bombero("Juan","Alban",23);
        objBombero1.setNombre("Paul");
        System.out.println("Datos: "+ objBombero2.getNombre());
        System.out.println("Datos: "+ objBombero1.getNombre());
        objBombero1.setApellido("Fernandez");
        objBombero1.setEdad(14);
        System.out.println("Datos: "+ objBombero1.getApellido());
        System.out.println("Datos: "+ objBombero1.getEdad());
        
        
        
        //objBombero1.imprimirBombero();
        //objBombero2.imprimirBombero();
    }
    
}
