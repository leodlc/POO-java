
package Modelo;


public class Repartidores extends Usuario {

    private String numeroDePlaca;

    public Repartidores(String numeroDePlaca, String nombre, String apellido, String cedula, String contraseña, String correo) {
        super(nombre, apellido, cedula, contraseña, correo);
        this.numeroDePlaca = numeroDePlaca;
    }

    public Repartidores() {
    }
    

    public String getNumeroDePlaca() {
        return numeroDePlaca;
    }

    public void setNumeroDePlaca(String numeroDePlaca) {
        this.numeroDePlaca = numeroDePlaca;
    }

    @Override
    public String toString() {
        return "Repartidores{" + "numeroDePlaca=" + numeroDePlaca + '}';
    }

    
    
    
    
    
    
}
