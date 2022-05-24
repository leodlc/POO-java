/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerejemplo;

/**
 *
 * @author AsrockLeo
 */
public class Dominio extends Subject {
    private double a,b,c;
    public Dominio(double[3] s){
        super();
        this.a=s[0];
        this.b=s[1];
        this.c=s[2];
    }
    public double[3]getState(){
        double[3]s=new double[3];
        s[0]=this.a;
        s[1]=this.b;
        s[2]=this.c;
        return s;
    }
    public void setState(double[3] s){
        this.a=s[0];
        this.b=s[1];
        this.c=s[2];
        this.notify();
    }
}
