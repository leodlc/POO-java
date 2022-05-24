
package Modelo;


public class Clientes extends Usuario {

    private String celular;

    private String direccion;

    public Clientes(String celular, String direccion, String nombre, String apellido, String cedula, String contraseña, String correo) {
        super(nombre, apellido, cedula, contraseña, correo);
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
    

    
    
}
