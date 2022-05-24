/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaapp;

/**
 *
 * @author AsrockLeo
 */
public class Mascota {
    private int codigo;
    private String alias,raza,colorPelo,fechaNacimiento;
    private double pesoMedioAnimal,pesoActualAnimal;

    public Mascota(int codigo, String alias, String raza, String colorPelo, String fechaNacimiento, double pesoMedioAnimal, double pesoActualAnimal) {
        this.codigo = codigo;
        this.alias = alias;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoMedioAnimal = pesoMedioAnimal;
        this.pesoActualAnimal = pesoActualAnimal;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAlias() {
        return alias;
    }

    public String getRaza() {
        return raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getPesoMedioAnimal() {
        return pesoMedioAnimal;
    }

    public double getPedoActualAnimal() {
        return pesoActualAnimal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPesoMedioAnimal(double pesoMedioAnimal) {
        this.pesoMedioAnimal = pesoMedioAnimal;
    }

    public void setPedoActualAnimal(double pesoActualAnimal) {
        this.pesoActualAnimal = pesoActualAnimal;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", alias=" + alias + ", raza=" + raza + ", colorPelo=" + colorPelo + ", fechaNacimiento=" 
                + fechaNacimiento + ", pesoMedioAnimal=" + pesoMedioAnimal + ", pedoActualAnimal=" + pesoActualAnimal + '}';
    }
    
}
