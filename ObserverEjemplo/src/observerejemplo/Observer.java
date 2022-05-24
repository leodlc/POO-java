/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerejemplo;

/**
 *
 * @author AsrockLeo
 */
public abstract class Observer {
    private Subject subject;
    protected Subject getSubject(){
        return this.subject;
    }
    public Observer(Subject s){
        this.subject=s;
    }
    public abstract void update();
}
