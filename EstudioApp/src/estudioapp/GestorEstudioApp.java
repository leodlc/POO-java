/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudioapp;

/**
 *
 * @author AsrockLeo
 */
public class GestorEstudioApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*
        int n;
        int [] x = new int[2];
        
        n=4;
        x[0]=6;
        x[1]=8;
        System.out.println("Antes: "+n+" "+x[0]);
        */
        int n;
        int [] x = new int[2];
        n=4;
        x[0]=6;
        x[1]=8;
        System.out.println("Antes: " + n + " " + x[0] +" "+ x[1]);
        cambiar(n, x);
        System.out.println("Despues: " + n + " " + x[0] +" "+ x[1]);
    }
    public static void cambiar (int p, int [] q) 
    {
        p = 10;
        q[0] = 12;
        q[1] = 14;
        System.out.println("Dentro: " + p + " " + q[0] +" "+ q[1]);

    }
}
    

