/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategyavion;

/**
 *
 * @author AsrockLeo
 */
public abstract class Avion {
    private Estado avionEstado;

    public void setEstado(Estado avionEstado) {
        this.avionEstado = avionEstado;
    }
    public void mover(){
        this.avionEstado.moverse();
    }
    
}
