/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correexamenapp;

import java.util.ArrayList;


public class Cliente {
    private int codigo;
    private String nombre;
    private String numCuenta;
    private String direccion;
    private String telefono;
    
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

    public Cliente(int codigo, String nombre, String numCuenta, String direccion, String telefono) {
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.direccion = direccion;
        this.telefono = telefono;

    }
    public void imprimir() {
        
        System.out.println("Cliente" + "\ncodigo=" + codigo + ", nombre=" + nombre + ", numeroDeCuenta=" + numCuenta + ", direccion=" + direccion + ", telefono=" + telefono);
        System.out.println("Mascotas : ");
        
        for (Mascota mascota : mascotas) {
            System.out.println(" codigo : "+ mascota.getCodigo()+" ---color de pelo : "+ mascota.getColorPelo()+"--fecha de nacimiento : "+ mascota.getFechaNacimiento()+" --peso Medio : "+mascota.getPesoMedio()+" --peso Actual : "+mascota.getPesoActual()+" --raza : "+mascota.getRaza());
        }
        
        System.out.println("-------------------------------------");
        System.out.println();
    }
    
     public void agregarMascota(int codigo, String raza, String colorPelo,String fechaNacimiento, float pesoMedio, float pesoActual ) throws Throwable {
        Mascota masc = new Mascota( codigo,raza, colorPelo, fechaNacimiento, pesoMedio, pesoActual);
        mascotas.add(masc);
    }
         
     public void agregarMascota(Mascota masc ) throws Throwable {
        mascotas.add(masc);
    }
    
    public void getCantidadMascotas(){
        int contador = 0;
        for(Mascota mascota: mascotas){
            contador ++;            
        }
        System.out.println(" El veterinario atiende :  " + contador + " mascotas ");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
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

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", numCuenta=" + numCuenta + ", direccion=" + direccion + 
                ", telefono=" + telefono + ", mascotas=" + mascotas + '}';
    }
    
    
}

     

     
     



    

