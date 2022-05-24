/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerejemplo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AsrockLeo
 */
public abstract class Subject {
    private List<Observer>observers;
    public void add(Observer o){
        this.observers.add(o);
    }
    public void remove(Observer o){
        this.observers.remove(o);
    }
    
    public void notify(){
        for(int i=0;i<this.observers.size();i++){
            this.observers.get(i).update();
        }
    }
    public Subject(){
        this.observers=new ArrayList<Observer>();
    }
    
}
