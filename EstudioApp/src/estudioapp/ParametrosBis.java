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
public class ParametrosBis {
    private int p;
    private int []q;

    public ParametrosBis(int p, int[] q) {
        this.p = p;
        this.q = q;
    }
    
    public static void cambiar(int p,int[] q)
    {
        p=10;
        q[0]=12;
        q[1]=14;
        System.out.println("Dentro: "+p+" "+q[0]+" "+q[1]);
    }
    
}

