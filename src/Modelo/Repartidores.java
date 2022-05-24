
package Modelo;


public class Repartidores extends Usuario{
    private String numeroDePlaca;

    public Repartidores(String numeroDePlaca, String nombre, String apellido, String cedula, String correo, String contraseña) {
        super(nombre, apellido, cedula, correo, contraseña);
        this.numeroDePlaca = numeroDePlaca;
    }

    public Repartidores(String numeroDePlaca) {
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
