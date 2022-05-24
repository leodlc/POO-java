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
public class Socio extends Persona {
    private double cuota;

    public Socio() {
    }
    
    public Socio(double cuota) {
        this.cuota = cuota;
    }

    public double getCuota() {
        return cuota;
    }
    
}
