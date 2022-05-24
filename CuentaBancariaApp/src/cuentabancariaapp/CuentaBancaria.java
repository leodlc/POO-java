/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancariaapp;

/**
 *
 * @author AsrockLeo
 */
public class CuentaBancaria 
{
    private String estado;
    private double tipoInteres;
    private double saldo;
    //constructores
    public CuentaBancaria(String estado,double saldo)
    {
        this.estado=estado;
        this.tipoInteres=0;
        this.saldo=saldo;
        
    }
    
    public void definirInteres()
    {
        if(saldo>1000 && saldo<5000)
        {
            tipoInteres=0.0340f;
        }
        else if(saldo>5000 && saldo < 1000)
            tipoInteres=0.0345f;
        else if (saldo>10000 && saldo<25000)
            tipoInteres=0.03350f;
        else
            tipoInteres=0.0355f;
        
    }
    
    
    
    
    
    /*
    public void Cuentabancaria()
    {
        estado = "";
        tipoInteres = 0;
        saldo = 0;
        
    }
    */
    
    public void ingresarDinero(double valordeIngreso){
        saldo=saldo+valordeIngreso;
    }

    public void retirarDinero(float valorRetiro){
        if(valorRetiro<=saldo)
        {
            saldo -=valorRetiro;
        }
        else
        {
            System.out.println("El valor ingresado excede el monto total de su cuenta.");
            
        }

    }

    public double getsaldoAct(){
        return saldo;
    }
    
    public void abonarInteres()
    {
        saldo=saldo + (saldo*tipoInteres);
    }

    public String getEstado() {
        return estado;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
   
    
    public void mostrarCuenta(){
        System.out.println("----------------------------");
        System.out.println("Estado: " + estado);
        System.out.println("----------------------------");
        System.out.println("Tipo de Interes: " + tipoInteres);
        System.out.println("----------------------------");
        System.out.println("Saldo Actual: " + saldo);
        System.out.println("----------------------------");
    }    
    
}
