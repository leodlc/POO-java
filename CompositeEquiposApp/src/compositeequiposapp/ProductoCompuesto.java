
package compositeequiposapp;

import java.util.ArrayList;
import java.util.List;


public class ProductoCompuesto extends ProductoAbstracto {
    private List<ProductoAbstracto> listaProductos=new ArrayList<ProductoAbstracto>();
    
    public ProductoCompuesto(String nombre){
        super(nombre,0);
    }
    @Override
    public double getPrecio() {
       double resultado=0;
       for(ProductoAbstracto recorre:listaProductos){
           resultado+=recorre.getPrecio();
       }
       return resultado;
    }

    @Override
    public void setPrecio(double precio) {
        //podia modificarse algun precio de un elemento de la coleccion
    }
    public void adicionarProducto(ProductoAbstracto producto){
        listaProductos.add(producto);
    }
    public boolean eliminarProducto(ProductoAbstracto producto){
        return this.listaProductos.remove(producto);
    }
    
}
