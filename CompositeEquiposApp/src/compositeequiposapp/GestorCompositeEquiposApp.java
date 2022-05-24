/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeequiposapp;

/**
 *
 * @author AsrockLeo
 */
public class GestorCompositeEquiposApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoSimple ram4gb= new ProductoSimple("Kingstone","Memoria ram 4gb",750);
        ProductoSimple ram8gb= new ProductoSimple("Kingstone","Memoria ram 8gb",1000);
        ProductoSimple disco500gb= new ProductoSimple("ACME","Disco duro de 500gb",1500);
        ProductoSimple disco1tb= new ProductoSimple("ACME","Disco duro de 1tb",2000);
        ProductoSimple cpuAMD= new ProductoSimple("AMD","Ryzen 7",4000);
        ProductoSimple cpuIntel= new ProductoSimple("INTEL","Core i7",4500);
        ProductoSimple gabinetePequeño= new ProductoSimple("EXCOM","Gabinete pequeño",2000);
        ProductoSimple gabineteGrande = new ProductoSimple("EXCOM","Gabinete grande",2200);
        ProductoSimple monitor20inch= new ProductoSimple("HP","Monitor 20plg",1500);
        ProductoSimple monitor30inch= new ProductoSimple("HP","Monitor 30plg",2000);
        ProductoSimple mouseSimple= new ProductoSimple("Genius","mouse simple",150);
        ProductoSimple mouseGamer= new ProductoSimple("Alien","mouse gamer",750);
        //computador para gammer que tenga 8gb RAM, disco 1tb, procesador intel
        //gabinete grande,monitor de 30 y un mouse gamer
        ProductoCompuesto gammerPC= new ProductoCompuesto("Gamer PC");
        gammerPC.adicionarProducto(ram8gb);
        gammerPC.adicionarProducto(disco1tb);
        gammerPC.adicionarProducto(cpuIntel);
        gammerPC.adicionarProducto(gabineteGrande);
        gammerPC.adicionarProducto(monitor30inch);
        gammerPC.adicionarProducto(mouseGamer);
        //computador para casa que tenga 4gb RAM,disco de 500gb,procesador AMD
        //gabinete chico, monitor 20, y mouse simple
        ProductoCompuesto HogarPC= new ProductoCompuesto("Hogar PC");
        HogarPC.adicionarProducto(ram4gb);
        HogarPC.adicionarProducto(disco500gb);
        HogarPC.adicionarProducto(cpuAMD);
        HogarPC.adicionarProducto(gabinetePequeño);
        HogarPC.adicionarProducto(monitor20inch);
        HogarPC.adicionarProducto(mouseSimple);
        //Paquete compuesto de dos paquetes: paquete Gammer PC y hogar PC
        ProductoCompuesto paquete2x1= new ProductoCompuesto("paquete Gamer+hogar");
        paquete2x1.adicionarProducto(gammerPC);
        paquete2x1.adicionarProducto(HogarPC);
        
        OrdenVenta ordenGammer= new OrdenVenta(1,"Alicia Perez");
        ordenGammer.adicionarProducto(gammerPC);
        ordenGammer.imprimirOrden();
        //System.out.println("Orden 2");
        OrdenVenta ordenHogar= new OrdenVenta(2,"Fernando Suarez");
        ordenHogar.adicionarProducto(HogarPC);
        ordenHogar.imprimirOrden();
        
        OrdenVenta ordenCompleta= new OrdenVenta(3,"Alan Perez");
        ordenCompleta.adicionarProducto(paquete2x1);
        ordenCompleta.imprimirOrden();
        
        OrdenVenta ordenMaxima= new OrdenVenta(4,"Jordan Alvarez");
        ordenMaxima.adicionarProducto(paquete2x1);
        ordenMaxima.adicionarProducto(mouseGamer);
        ordenMaxima.imprimirOrden();
        
        OrdenVenta ordenMixta= new OrdenVenta(5,"Camila Ramos");
        ordenMixta.adicionarProducto(HogarPC);
        ordenMixta.adicionarProducto(ram8gb);
        ordenMixta.adicionarProducto(ram4gb);
        ordenMixta.adicionarProducto(monitor30inch);
        ordenMixta.adicionarProducto(mouseGamer);
        ordenMixta.imprimirOrden();
        
        
        
        
        
    }
    
}
