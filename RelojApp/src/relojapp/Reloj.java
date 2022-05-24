/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojapp;

/**
 *
 * @author AsrockLeo
 */
enum tipoHorario{H12,H24};
public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;
    
    //constructores
    public Reloj(){
        this.hora=0;
        this.minutos=0;
        this.segundos=0;
    }
    
    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    //metodos
    String dameHora(){
        return hora+":"+minutos+":"+segundos;
    }
    String dameHora(tipoHorario tipo){
        String resultado;
        if(tipo==tipoHorario.H12 && hora>12){
            resultado=""+(hora-12);
        }
        else{
            resultado=""+hora;
        }
        resultado+=":"+minutos+":"+segundos+((hora<12)?"am":"pm");
        return resultado;
    }
    public Reloj(int hora, int minutos)throws Exception{
        this(hora,minutos,0);
    }
    public void compruebaHora(int hora, int minutos, int segundos){//throws Exception{
        if(hora>23){
            System.out.println("Error en la hora");
            //throw new Exception
        }
        if(minutos>59){
            System.out.println("Error en los minutos");
            //throw new Exception
        }
        if(segundos>59){
            System.out.println("Error en los segundos");
            //throw new Exception
        }
    }
    
    
}
