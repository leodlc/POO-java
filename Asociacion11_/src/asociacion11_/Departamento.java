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
public class Departamento {
    /*
    private int numeroDpto;
    private Persona dirigeDpto;

    public Departamento() {
    }
    


    public Departamento(int numeroDpto) {
        this.numeroDpto = numeroDpto;
        this.dirigeDpto= new Persona();
    }

    public Departamento(int numeroDtpo, Persona dirigeDpto) {
        this.numeroDpto = numeroDtpo;
        this.dirigeDpto = dirigeDpto;
        //Enlance
    }
    */
    private int numeroDpto;
    private Persona dirigeDpto;

    public Departamento() {
    }

    public Departamento(int numeroDpto) {
        this.numeroDpto = numeroDpto;
        this.dirigeDpto=new Persona();
    }

    public Departamento(int numeroDpto, Persona dirigeDpto) {
        this.numeroDpto = numeroDpto;
        this.dirigeDpto = dirigeDpto;
        //ENLACE
        this.dirigeDpto.setDpto(this);
    }

    public int getNumeroDpto() {
        return numeroDpto;
    }

    public Persona getDirigeDpto() {
        return dirigeDpto;
    }

    public void setNumeroDpto(int numeroDpto) {
        this.numeroDpto = numeroDpto;
    }

    public void setDirigeDpto(Persona dirigeDpto) {
        this.dirigeDpto = dirigeDpto;
    }

    @Override
    public String toString() {
        return "Departamento{" + "numeroDpto=" + numeroDpto +
                ", dirigeDpto=" + dirigeDpto.getNombrePersona() + '}';
    }
    /*
    void setDirigeDpto(Persona aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
