/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaapp;

/**
 *
 * @author AsrockLeo
 */
public class Cliente {
    private int codigoCliente;
    private  String nombre,numeroCuenta,direccion,telefono;
    private Mascota mascota;
    

    public Cliente(int codigoCliente, String nombre, String numeroCuenta, String direccion, String telefono, Mascota mascota) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mascota = mascota;
    }
    
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", "
                + "direccion=" + direccion + ", telefono=" + telefono + ", mascota=" + mascota + '}';
    }
    
    
    
}
