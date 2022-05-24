
package Modelo;


public class Clientes extends Usuario{
    private String celular;
    private String direccion;

    public Clientes(String celular, String direccion, String nombre, String apellido, String cedula, String correo, String contraseña) {
        super(nombre, apellido, cedula, correo, contraseña);
        this.celular = celular;
        this.direccion = direccion;
    }

    public Clientes(String celular, String direccion) {
        this.celular = celular;
        this.direccion = direccion;
    }

    public Clientes() {
        
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Clientes{" + "celular=" + celular + ", direccion=" + direccion + '}';
    }
    
}
