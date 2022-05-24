/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategybiblioteca;

/**
 *
 * @author AsrockLeo
 */
public class Profesor extends Persona {
    private String catedra;

    public Profesor() {
    }
    

    public Profesor(String catedra) {
        this.catedra = catedra;
    }

    public String getCatedra() {
        return catedra;
    }
    
}
