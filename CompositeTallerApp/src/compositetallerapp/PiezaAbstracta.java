
package compositetallerapp;


public abstract class PiezaAbstracta {
    protected String nombre;
    protected double precio;

    public PiezaAbstracta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();
    public abstract void setPrecio(double precio);
}
