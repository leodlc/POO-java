/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaautoaapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorListaAutoaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner sd= new Scanner(System.in);
        //ListaAutos lista = new ListaAutos();
        
        System.out.println("Ingrese el numero de autos que desee ingresar: ");
        int cantidadAutos=sd.nextInt();
        Auto arregloautos[]=new Auto[cantidadAutos];
        ListaAutos lista = new ListaAutos();
        
        for(int i=0;i<arregloautos.length;i++){
            System.out.println("Ingrese la matrícula del auto ["+i+"]: ");
            sd.nextLine();
            String matricula=sd.nextLine();
            System.out.println("Ingrese la marca del auto ["+i+"]: ");
            String marca=sd.nextLine();
            System.out.println("Ingrese el modelo del auto ["+i+"]: ");
            String modelo=sd.nextLine();
            System.out.println("Ingrese el kilometraje del auto ["+i+"]: ");
            int  kilometraje=sd.nextInt();
            Auto auto=new Auto(matricula,marca,modelo,kilometraje);
            lista.adicionarAuto(auto);
            
        }
        lista.mostrarAutos();
            
            
        //lista
        int opc;
        boolean salir=false;
        
        while(!salir){
            System.out.println("==================================================== ");
            System.out.println("======================MENU========================== ");
            System.out.println("==================================================== ");
            System.out.println("1.-Información del auto con mayor km ");
            System.out.println("2.-Información de autos que superan un km ingresado");
            System.out.println("3.-Información de autos de una marca específica");
            System.out.println("4.-Información de todos los autos ordenados por km");
            System.out.println("5.-Salir ");

            System.out.println("==================================================== ");
            try{
                System.out.println("Eliga una opcion: ");
                opc=sc.nextInt();
                
                
                switch(opc){
                    case 1:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Auto con mayor kilometraje");
                        lista.mostrarMayorKm();
                        lista.toString();
                        break;
                    case 2:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Autos que superan el kilometraje ");
                        System.out.println("Ingrese el kilometraje  ");
                        int kilomesup= sd.nextInt();
                        lista.mostrarKmpasado(kilomesup);
                        break;
                    case 3:
                        System.out.println("------------------------------------------------ ");
                        System.out.println("Ingrese el marca  ");
                        String marcainput=sd.nextLine();
                        lista.mostrarPorMarca(marcainput);
                        break;
                    case 4:
                        System.out.println("------------------------------------------------ ");
                        lista.ordenarKilometraje();
                        lista.mostrarAutos();
                        break;
                    case 5:
                        salir=true;
                        break;
                        
                    default:
                        System.out.println("Las opciones son entre 1 y 5");

                }
            }catch(InputMismatchException ex){
                System.out.println("Debes introducir en numero..");
                sc.next();
            }
            
            
            
        }
        System.out.println("Fin del menú.");
        
    }
    
}
