/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaautoaapp;

/**
 *
 * @author AsrockLeo
 */
public class Auto implements Comparable <Auto> {
    private String matricula;
    private String marca;
    private String modelo;
    private int km;
    
    
    
    public Auto(String matricula, String marca, String modelo, int km) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    public Auto() {
        this.matricula= "";
        this.marca="";
        this.modelo="";
        this.km=0;
    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKm() {
        return km;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Auto{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km + '}';
    }
    @Override
    public int compareTo(Auto o){
        return this.matricula.compareTo(o.getMatricula());
    }
    
    
    
}
