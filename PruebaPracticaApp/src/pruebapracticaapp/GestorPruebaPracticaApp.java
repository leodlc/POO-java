
package pruebapracticaapp;


public class GestorPruebaPracticaApp {

    
    public static void main(String[] args) {
        Electrodomestico electro= new Electrodomestico();
        
        
        
        System.out.println(electro.getPrecioInicial());
        Electrodomestico electro2= new Electrodomestico('A',50,"azul");
        System.out.println(electro2.getPrecioInicial());
        electro2.establecerPrecio();
        System.out.println(electro2.toString());
        electro2.lanzamientoDados();
        System.out.println("El descuento es de: ");
        electro2.darDescuento();
        
    }
    
}
