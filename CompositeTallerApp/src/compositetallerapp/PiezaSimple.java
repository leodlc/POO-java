
package compositetallerapp;


public class PiezaSimple extends PiezaAbstracta {
    protected String descripcion;

//    public PiezaSimple(String nombre, double precio) {
//        super(nombre, precio);
//    }
    

    public PiezaSimple(String descripcion, String nombre, double precio) {
        super(nombre, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
