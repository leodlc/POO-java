
package compositetallerapp;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;


public class OrdenVenta {
    private int ordenId;
    private String cliente;
    private List<PiezaAbstracta> piezas = new ArrayList<PiezaAbstracta>();

    public OrdenVenta(int ordenId, String cliente) {
        this.ordenId = ordenId;
        this.cliente = cliente;
    }

    public int getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(int ordenId) {
        this.ordenId = ordenId;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<PiezaAbstracta> getProductos() {
        return piezas;
    }

    public void setProductos(List<PiezaAbstracta> piezas) {
        this.piezas = piezas;
    }
    public double definirPrecioTotal(){
        double precio=0;
        PiezaSimple tornillo= new PiezaSimple("tornillo","Tornillo ACME 15",0.21);
        precio+=tornillo.precio;
       for(PiezaAbstracta recorre:piezas){
           precio+=recorre.getPrecio();
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
        System.out.println("\n=============================================\nOrden: " + ordenId + "\nCliente: " + cliente + "\nProductos:\n");
        for (PiezaAbstracta recorre : piezas) {
            System.out.println(recorre.getNombre() + "$ " + formater.format(recorre.getPrecio()));

        }
        System.out.println("Total: " + formater.format(definirPrecioTotal()) + "\n========================");
    }    
}
