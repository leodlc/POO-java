
package examencorreccion2app;

import java.util.ArrayList;
import java.util.Iterator;


public class Cliente {
   private int codigo,numeroDeCuentaBancaria,telefono;
   private String nombre, direccion;
   private ArrayList<Mascota> mascotas= new ArrayList<Mascota>();

    public Cliente() {
    }

    public Cliente(int codigo, int numeroDeCuentaBancaria, int telefono, String nombre, String direccion) {
        this.codigo = codigo;
        this.numeroDeCuentaBancaria = numeroDeCuentaBancaria;
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
        
    }
    //geters and setters

    public int getCodigo() {
        return codigo;
    }

    public int getNumeroDeCuentaBancaria() {
        return numeroDeCuentaBancaria;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNumeroDeCuentaBancaria(int numeroDeCuentaBancaria) {
        this.numeroDeCuentaBancaria = numeroDeCuentaBancaria;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    public void adicionarMascota(){
        mascotas.add(mascota);
    }
    public void mostrarMascotas(){
        System.out.println("Mostrando mascotas de"+ this.getNombre());
        mascota aux;
        Iterator it = mascotas.iterator();
        while(it.hasNext()){
        }
    }
   
}
