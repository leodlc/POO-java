/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escepcionapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorEscepcionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean continuarCiclo=true;
        int a=0,b=0,x=0;
        
        do
        {
            try
            {
                System.out.println("Ingrese un numero:");
                a=sc.nextInt();
                System.out.println("Ingrese un numero:");
                b=sc.nextInt();
                //division
                System.out.println("El resultado es: "+a/b);
                System.out.println("Quieres continuar?: 0: no  1: si");
                x=sc.nextInt();
                if(x==0) continuarCiclo=false;
            }
            catch(InputMismatchException ime)
            {
                System.out.println("pusiste una letra en vez de numero...");
                System.out.println("vuelve a intentarlo");
                sc.nextLine();
                
            }
            catch(ArithmeticException ae)
            {
                System.out.println("estas dividiendo para cero");
                System.out.println("especifica otro numero");
                sc.nextLine();
            }
            finally
            {
                System.out.println("listo para otro intento");
            }
        }while(continuarCiclo);
        System.out.println("Adios");
    }
    
}
