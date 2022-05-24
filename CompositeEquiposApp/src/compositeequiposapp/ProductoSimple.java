
package compositeequiposapp;

public class ProductoSimple extends ProductoAbstracto {
    protected String marca;

    public ProductoSimple(String marca, String nombre, double precio) {
        super(nombre, precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    @Override
    public double getPrecio() {
       return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio=precio;
    }
    
}
