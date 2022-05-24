/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuapp;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author AsrockLeo
 */
public class GestorMenuApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opc;
        boolean salir=false;
        
        while(!salir){
            System.out.println("==================================================== ");
            System.out.println("======================MENU========================== ");
            System.out.println("==================================================== ");
            System.out.println("1.- ");
            System.out.println("2.- ");
            System.out.println("3.- ");
            System.out.println("4.- ");
            System.out.println("5.- ");
            System.out.println("6.- ");
            System.out.println("7.- ");
            System.out.println("8.- ");
            System.out.println("9.- ");
            System.out.println("10.-Salir ");
            System.out.println("==================================================== ");
            try{
                System.out.println("Eliga una opcion: ");
                opc=sc.nextInt();
                
                
                switch(opc){
                    case 1:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Esta es la opcion 1 ");
                        break;
                    case 2:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Esta es la opcion 2 ");
                        break;
                    case 3:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Esta es la opcion 3 ");
                        break;
                    case 4:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Esta es la opcion 4 ");
                        break;
                    case 5:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Esta es la opcion 5 ");
                        break;
                    case 6:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Esta es la opcion 6 ");
                        break;
                    case 7:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Esta es la opcion 7 ");
                        break;
                    case 8:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Esta es la opcion 8 ");
                        break;
                    case 9:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Esta es la opcion 9 ");
                        break;
                    case 10:
                        salir=true;
                        break;
                    default:
                        System.out.println("Las opciones son tre 1 y 10");

                }
            }catch(InputMismatchException ex){
                System.out.println("Debes introducir en numero..");
                sc.next();
            }
            
            
            
        }
        System.out.println("Fin del menú.");
        
       
    }//fin del main
    
    
}//fin de la clase
