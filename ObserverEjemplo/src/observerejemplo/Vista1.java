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
public class Vista1 extends Observer {
    private double [][] tabla= new double[3][3];
    private int sig=0;
    public Vista1(Dominio d){
        super(d);
        this.update();
    }
    public void update(){
        double[3] s= ((Dominio).getSubject()).getState();
    }
}
