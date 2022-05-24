
import java.text.DecimalFormat;
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
public class GestorDescuentoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        Scanner sn= new Scanner(System.in);
        DecimalFormat formatodec = new DecimalFormat("#.00"); // formato para que solo se utilicen dos decimales
        System.out.println("        DESCUENTO POR COMPRA EN SUPERMERCADO      ");
        System.out.println("1) descuento de pago con tarjeta al 5%: ");
        System.out.println("2) descuento de pago con efectivo al 2%: ");
        System.out.println("Eliga una opción");
        opcion = sn.nextInt();
        

        switch(opcion){
            case 1: 
                System.out.println("    Descuento con tarjeta al 5%       ");
                System.out.println("Ingrese el valor a pagar: ");
                float pago = sc.nextFloat();
                float porcentaje = (pago*5)/100;
                float pago_final = pago-porcentaje;
                System.out.println("El descuento es de  : $" +formatodec.format(porcentaje));
                System.out.println("El valor total a pagar es de  : $" +formatodec.format(pago_final));
                break;
            case 2:
                System.out.println("     Descuento con efectivo al 2%      ");
                System.out.println("Ingrese el valor a pagar");
                pago = sc.nextFloat();
                porcentaje = (pago*2)/100;
                pago_final = pago-porcentaje;
                System.out.println("El descuento es de : $" +formatodec.format(porcentaje));
                System.out.println("El valor final a pagar es de  : $" + formatodec.format(pago_final));
                break;
            default:
                System.out.println("La opcion que ha seleccionado no es la correcta.");
        }
        
    }
    }
    

