/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaautoaapp;

import java.util.Comparator;

/**
 *
 * @author AsrockLeo
 */
public class OrdenarAutoKm implements Comparator <Auto> {
    @Override
    public int compare(Auto o1,Auto o2){
        return o1.getKm()-o2.getKm();
    }
    
}
