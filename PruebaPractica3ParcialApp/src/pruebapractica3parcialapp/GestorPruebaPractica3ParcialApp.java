/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapractica3parcialapp;

/**
 *
 * @author AsrockLeo
 */
public class GestorPruebaPractica3ParcialApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pieza aceite= new Pieza(1,"helix","aceite",5,3);
        Pieza tapa= new Pieza(2,"Marca generica","tapa",2,1);
        Pieza filtroAceite= new Pieza(3,"Marca generica","Filtro de aceite",6,2);
        Pieza aceite2= new Pieza(4,"helix","aceite",4,2);
        Pieza tapa2= new Pieza(5,"Marca generica","tapa",1,1);
        Pieza filtroAceite2= new Pieza(6,"Marca generica","Filtro de aceite",3,2);
        


        Kit kit1= new Kit(1,"Kit 1");
        kit1.adicionarProducto(aceite);
        kit1.adicionarProducto(tapa);
        kit1.adicionarProducto(filtroAceite);
        

        Kit kit2= new Kit(2,"Kit 2");
        kit2.adicionarProducto(aceite2);
        kit2.adicionarProducto(tapa2);
        kit2.adicionarProducto(filtroAceite2);

        Kit obraTaller= new Kit(1,"Obra del Taller");
        kit2.adicionarProducto(kit1);
        kit2.adicionarProducto(kit2);
        
        VentaObraTaller ordenObraTaller= new VentaObraTaller(1,"Juan Pablo");
        ordenObraTaller.adicionarProducto(obraTaller);
        ordenObraTaller.imprimirOrden();

    }
    
}
