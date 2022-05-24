
package tallerp2app;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AsrockLeo
 */
public class GestorTallerP2App {

    
    public static void main(String[] args) {
        ArrayList<Edificio> lista = new ArrayList<Edificio>();
        EdificioOficinas of1 = new EdificioOficinas(10,30,60,7);
        EdificioOficinas of2 = new EdificioOficinas(8,20,40,6);
        EdificioOficinas of3 = new EdificioOficinas(5,30,60,7);
        
        Polideportivo pd1 = new Polideportivo("Polideportivo Quito",1,100,400);
        Polideportivo pd2 = new Polideportivo("Polideportivo Guayaquil",1,200,500);
        lista.add(of1);
        lista.add(of2);
        lista.add(of3);
        lista.add(pd1);
        lista.add(pd2);
        Iterator<Edificio> it = lista.iterator();
        while(it.hasNext()){
        System.out.println(it.next().mostrarInfo());
        }
    }
    
}
