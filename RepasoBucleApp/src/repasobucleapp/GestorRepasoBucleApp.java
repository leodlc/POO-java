/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobucleapp;

import java.util.Scanner;

/**
 *
 * @author AsrockLeo
 */
public class GestorRepasoBucleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String cadena;
        int posiciona, posicionb;
        cadena=sc.nextLine();
        
        posiciona=sc.nextInt();
        posicionb=sc.nextInt();
        int longitud=cadena.length();
        if((longitud>=1 && longitud<=100)&&(posiciona>=0 && 
            posicionb>posiciona)&&(posicionb<=longitud)){
            System.out.println(cadena.substring(posiciona, posicionb));
        }else{
            System.exit(0);
        }
        
        
       
        
    }
    
}
