/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapractica3parcialapp;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AsrockLeo
 */
public class VentaObraTaller {
    private int numeroObra;
    private String nombreDeObra;
    private List<PiezaAbstracta> piezas = new ArrayList<PiezaAbstracta>();

    public VentaObraTaller(int numeroObra, String nombreDeObra) {
        this.numeroObra = numeroObra;
        this.nombreDeObra = nombreDeObra;
    }

    

    public int getNumeroObra() {
        return numeroObra;
    }

    public void setNumeroObra(int ordenId) {
        this.numeroObra = ordenId;
    }

    public String getNombreDeObra() {
        return nombreDeObra;
    }

    public void setNombreDeObra(String cliente) {
        this.nombreDeObra = cliente;
    }

    public List<PiezaAbstracta> getPiezas() {
        return piezas;
    }

    public void setProductos(List<PiezaAbstracta> piezas) {
        this.piezas = piezas;
    }
    public double definirPrecioTotal(){
        double precio=0;
        Pieza tornillo= new Pieza(1,"MARCA GENERICA","ACEITE",30,5);
        precio+=tornillo.precio;
        
       for(PiezaAbstracta recorre:piezas){
           precio+=recorre.getPrecio();

       }
       return precio;
    }
    
    public double definirTiempoTotal(){
        double precio=0;
        Pieza tornillo= new Pieza(1,"MARCA GENERICA","ACEITE",30,20);
        precio+=tornillo.precio;
       for(PiezaAbstracta recorre:piezas){
           precio+=recorre.getTiempo();
       }
       return precio;
    }
    public void adicionarProducto(PiezaAbstracta piezas){
        this.piezas.add(piezas);
    }
    public void eliminarProducto(PiezaAbstracta piezas){
        this.piezas.remove(this);
    }
    
    public void imprimirOrden() {

        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("\n=============================================\nOrden: " + numeroObra + "\nNombre de la obra: " + nombreDeObra + "\nKits:\n");
        for (PiezaAbstracta recorre : piezas) {
            //System.out.println(recorre.getNombre() + "$ " + formater.format(recorre.getPrecio()));

        }
        System.out.println("Total precio: " + formater.format(definirPrecioTotal()) + "\n========================");
        System.out.println("Tiempo total"+formater.format(definirTiempoTotal())+"\n========================");
    }    
}
