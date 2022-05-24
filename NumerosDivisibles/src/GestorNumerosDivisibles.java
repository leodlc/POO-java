/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author AsrockLeo
 */
public class GestorNumerosDivisibles {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Programa para determinar si un numero es divisible para 2 ");
        System.out.println("Ingrese un numero: ");
        int number=sc.nextInt();
        if ((number%2)==0) {
            System.out.println("Este numero es divisible para 2");
        
        }
        else {
            System.out.println("Este numero NO es divisible para 2");
        }
        
        }
        
    
    
}
