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
public abstract class Persona {
    private Prestamo tipoPrestamo;

    public void setTipoPrestamo(Prestamo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }
    public void prestarLibro(){
        this.tipoPrestamo.estadoDelLibro();
        this.tipoPrestamo.prestarLibro();
        
    }
}
