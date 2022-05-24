/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacion11_;

/**
 *
 * @author AsrockLeo
 */
public class Persona {
    /*
    private String nombrePersona;
    private Departamento dpto;
    
    public Persona(String nombrePersona){
        this.nombrePersona=nombrePersona;
        this.dpto= new Departamento();
    }
    public Persona(String nombrePersona, Departamento dpto){
        this.nombrePersona=nombrePersona;
        this.dpto= dpto;
        //this.dpto.setDirigeDpto(this);
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombrePersona=" + nombrePersona + ", dpto=" + dpto + '}';
    }
    */
    private String nombrePersona;
    private Departamento dpto;

    public Persona() {
    }

    public Persona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
        this.dpto=new Departamento();
    }

    public Persona(String nombrePersona, Departamento dpto) {
        this.nombrePersona = nombrePersona;
        this.dpto = dpto;
        //PENDIENTE ENLACE
        this.dpto.setDirigeDpto(this);
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombrePersona=" + nombrePersona + ", dpto=" + dpto.getNumeroDpto() + '}';
        //FALTA ALGO
    }
    
    
    
}
