/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notasapp;
import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class NotasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas_altas, notas_bajas,contador,nota;
        notas_altas=0;
        notas_bajas=0;
        contador=1;
        while(contador<=10){
            System.out.println("Ingrese la nota");
            nota = sc.nextInt();
            if(nota>=7){
                notas_altas=notas_altas+1;
            }else{
                notas_bajas=notas_bajas+1;
            }
            contador=contador+1;
        }
        System.out.println("Numero de alumnos con notas mayores e iguales a 7 son: " + notas_altas);
        System.out.println("Numero de alumnos con notas menores a 7 son: " + notas_bajas);
        

    }
    
}
