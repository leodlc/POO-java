/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaapp;

/**
 *
 * @author AsrockLeo
 */
public class Bicicleta {
    private int velocidadActual;
    private int platoActual;
    private int piñonActual;
    //constructores
    public Bicicleta(){
        this.velocidadActual=0;
        this.piñonActual=1;
        this.platoActual=1;
    }
    
    public Bicicleta(int velocidadActual,int platoActual,int piñonActual)
    {
        this.velocidadActual=velocidadActual;
        this.piñonActual=piñonActual;
        this.platoActual=platoActual;
    }
   // metodos
    public void acelerar()
    {
        //System.out.println("Velocidad actual: "+ velocidadActual);
        velocidadActual *=2;
       //System.out.println( velocidadActual);
        
    }
    public void mostrarBicicleta(){
        System.out.println("Velocidad actual: "+ velocidadActual);
        System.out.println("piñon actual: "+ piñonActual);
        System.out.println("plato actual: "+ platoActual);
    }
    
    public void frenar()
    {
        velocidadActual *=0.5;
    }
    public void cambiarPlato(int plato)
    {
        platoActual=plato;
    }
    public void cambiarPñon(int piñon)
    {
        piñonActual=piñon;
    }    
}
