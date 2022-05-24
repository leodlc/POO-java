/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasocuentaapp;

/**
 *
 * @author AsrockLeo
 */
public class RepasoCuenta {
    private String nombre;
    private String ncuenta;
    private double tipointeres;
    private double saldo;
    //constructores
    public RepasoCuenta(){ // constructor por defecto
    }
    public RepasoCuenta(String nombre, String ncuenta, double tipointeres, double saldo) { //constructor con parametros
        this.nombre = nombre;
        this.ncuenta = ncuenta;
        this.tipointeres = tipointeres;
        this.saldo=saldo;
    }
    //metodos
    public double retiroSaldo(double retiro){
        
        if(retiro<saldo){
            this.saldo-=retiro;
        }else{
            System.out.println("No tienes suficiente dinero para retirar esa cantidad");
        }
        return retiro;
        
    }
    
    
    public void imprimirCuenta(){
        System.out.println("----------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("----------------------------");
        System.out.println("Numero de cuenta: " + ncuenta);
        System.out.println("----------------------------");
        System.out.println("Tipo interes: " + tipointeres);
        System.out.println("----------------------------");
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------------");
    }    
    
    
    
    public double ingresoSaldo(double saldo){
        this.saldo+=saldo;
        return saldo;
    }
    public String getNombre() {
        return nombre;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public double getTipointeres() {
        return tipointeres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public void setTipointeres(double tipointeres) {
        this.tipointeres = tipointeres;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
