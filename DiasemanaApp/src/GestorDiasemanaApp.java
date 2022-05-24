
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AsrockLeo
 */


public class GestorDiasemanaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        int numero;
        System.out.println("Elige un numero y el programa te ayudara a ver que dia de la semana le corresponde a ese numero");
        System.out.println("Ingresa un numero");
        numero=sc.nextInt();
        if(numero<1 || numero>7){
            
            System.out.println("Ese dia de la semana no existe");
                
        }
        if(numero>=1 || numero<=7){
            if(numero==1){
                System.out.println("Lunes");
                
            }
            if(numero==2){
                System.out.println("Martes");
                
            }
            if(numero==3){
                System.out.println("Miercoles");
                
            }
            if(numero==4){
                System.out.println("Jueves");
                
            }
            if(numero==5){
                System.out.println("Viernes");
                
            }
            if(numero==6){
                System.out.println("Sabado");
                
            }
            if(numero==7){
                System.out.println("Domingo");
                
            }
            
            
            
        }
        
       
        
    }
    
}
