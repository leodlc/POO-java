package coreccion2examenapp;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
    private int codigo, numeroDeCuentaBancaria, telefono;
    private String nombre, direccion;
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

    public Cliente() {

    }

    public Cliente(int codigo, int numeroDeCuentaBancaria, int telefono, String nombre, String direccion) {
        this.codigo = codigo;
        this.numeroDeCuentaBancaria = numeroDeCuentaBancaria;
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
    }
//Getters and Setters


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroDeCuentaBancaria() {
        return numeroDeCuentaBancaria;
    }

    public void setNumeroDeCuentaBancaria(int numeroDeCuentaBancaria) {
        this.numeroDeCuentaBancaria = numeroDeCuentaBancaria;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void adicionarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void mostrarMascotas() {
        System.out.println("Mostrando mascotas de " + this.getNombre());
        Mascota aux;
        Iterator it = mascotas.iterator();
        while (it.hasNext()) {
            aux = (Mascota) it.next();
            System.out.println(aux.getAlias());
        }
    }
}
