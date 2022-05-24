/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revistaobservadorapp;

import java.util.Observer;

/**
 *
 * @author AsrockLeo
 */
public interface Sujeto {
    public  void suscribirse(Observador ob);
    public void desafiliarse(Observador ob);
    public void enviarRevista(Revista r);
}
