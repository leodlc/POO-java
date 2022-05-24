
package correexamenapp;

import java.util.ArrayList;
import java.util.Iterator;


public class ListaCliente {
    ArrayList <Cliente> listaA;

    public ListaCliente() {
        listaA = new ArrayList <Cliente> ();
    }
    
    public void adicionarCliente(Cliente at)
    {
        listaA.add(at);
    }
    
    public int definirTamanioLista()
    {
        return listaA.size();
    }
    
    public Cliente obtenerAtleta(int indice)
    {
        return listaA.get(indice);
    }
    
    public void borrarAtleta(Cliente at)
    {
        listaA.remove(at);
    }
    
    public void mostrarLista()
    {
        Iterator <Cliente> it = listaA.iterator();
        while (it.hasNext())
        {
            Cliente at = it.next();
            System.out.println(at.toString());
        }
    }
    
    public void getMayorRaza(){
        
    }

}
