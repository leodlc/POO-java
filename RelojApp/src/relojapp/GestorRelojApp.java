/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojapp;

import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorRelojApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora:");
        int h=sc.nextInt();
        System.out.println("Ingrese el minuto:");
        int m=sc.nextInt();
        System.out.println("Ingrese el segundo:");
        int s=sc.nextInt();
        
        Reloj reloj= new Reloj(h,m,s);
        reloj.compruebaHora(h, m, s);
        System.out.println(reloj.dameHora(tipoHorario.H12));
        
    }
    
}
