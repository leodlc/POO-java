/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasocuentaapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorRepasoCuentaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner so= new Scanner(System.in);
        RepasoCuenta cuenta=new RepasoCuenta("Fernando Suarez","2545783",0d,1500d);
        int opc;
        boolean salir=false;
        
        while(!salir){
            System.out.println("==================================================== ");
            System.out.println("======================MENU========================== ");
            System.out.println("==================================================== ");
            System.out.println("1.-Crear cuenta ");
            System.out.println("2.-Ingresar Saldo ");
            System.out.println("3.-Retirar Saldo ");
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
                        System.out.println("Ingrese el nombre de la cuenta");
                        String nombre=so.nextLine();
                        System.out.println("Ingrese el numero de la cuenta");
                        String ncuenta=so.nextLine();
                        RepasoCuenta cuenta2=new RepasoCuenta(nombre,ncuenta,0d,0d);
                        cuenta2.imprimirCuenta();
                        
                        
                        
                        break;
                    case 2:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Ingrese el monto:");
                        double saldo=so.nextDouble();
                        cuenta.ingresoSaldo(saldo);
                        System.out.println("Saldo actual: "+cuenta.getSaldo());
                        break;
                    case 3:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Ingrese el monto a retirar  ");
                        double retiro=so.nextDouble();
                        cuenta.retiroSaldo(retiro);
                        System.out.println("Usted a retirado: $"+retiro);
                        System.out.println("Su saldo acutal es de:  $"+cuenta.getSaldo());
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
    
    
    
}//fin clase
