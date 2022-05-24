
package compositeequiposapp;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;


public class OrdenVenta {
    private int ordenId;
    private String cliente;
    private List<ProductoAbstracto> productos = new ArrayList<ProductoAbstracto>();

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

    public List<ProductoAbstracto> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoAbstracto> productos) {
        this.productos = productos;
    }
    public double definirPrecioTotal(){
        double precio=0;
       for(ProductoAbstracto recorre:productos){
           precio+=recorre.getPrecio();
       }
       return precio;
    }
    public void adicionarProducto(ProductoAbstracto producto){
        this.productos.add(producto);
    }
    public void eliminarProducto(ProductoAbstracto producto){
        this.productos.remove(this);
    }
    
    public void imprimirOrden() {

        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("\n=============================================\nOrden: " + ordenId + "\nCliente: " + cliente + "\nProductos:\n");
        for (ProductoAbstracto recorre : productos) {
            System.out.println(recorre.getNombre() + "$ " + formater.format(recorre.getPrecio()));

        }
        System.out.println("Total: " + formater.format(definirPrecioTotal()) + "\n========================");
    }    
}
