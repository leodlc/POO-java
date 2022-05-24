/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoarreglosapp;

import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorRepasoArreglosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        int myArray []= new int[n];
        
        
    
    //lenar array
        for(i=0;i<myArray.length;i++){
            System.out.println("[ "+i+" ] = ");
            myArray[i]=sc.nextInt();
           
        
        }
        
        for(i=0;i<n;i++){
            System.out.println(myArray[i]);
        }
        
    
    }
    
}
