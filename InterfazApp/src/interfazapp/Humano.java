/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazapp;

/**
 *
 * @author AsrockLeo
 */
public class Humano implements AccionesHumano,AccionesGeneral {

    @Override
    public void bailar() {
        System.out.println("Humano baila");
    }

    @Override
    public void tocarInstrumento() {
        System.out.println("Humano toca instrumento");
    }

    @Override
    public void estudiar() {
        System.out.println("Humano estudia");
    }

    @Override
    public void trabajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hablar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desplazarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alimentarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dormir() {
        
    }
    
}
