package correccionapp;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String codigo;
    private String nombre;
    private String numeroCuentaBancaria;
    private String direccion;
    private String telefono;
    private List<Mascota> mascotas = new ArrayList<>();

    public Cliente(String codigo, String nombre, String numeroCuentaBancaria, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCuentaBancaria = numeroCuentaBancaria;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuentaBancaria() {
        return numeroCuentaBancaria;
    }

    public void setNumeroCuentaBancaria(String numeroCuentaBancaria) {
        this.numeroCuentaBancaria = numeroCuentaBancaria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public List<Mascota> getMascotas() {
        return mascotas;
    }
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }
}
