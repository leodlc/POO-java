/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberoapp;

/**
 *
 * @author AsrockLeo
 */
public class Bombero {
    //atributos
    //visibilidad + tipo + nombre
    private String nombre;
    private String apellido;
    private int edad;
    
    //métodos
    //métodos constructores
    //visibilidad  + nombre(argumentos)
    
    public Bombero(String nombre, String apellido, int edad)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        
    } 
    
    
    
    //métodos adicionales
    //GET
        //visibilidad + tipoRetorno + nombre(argumentos)
    public String getNombre()
    {
        
        return nombre;
    }
        
    
        
    
    
    
    
    //SET
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getApellido(){
        
        
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public int getEdad(){
        
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    
    public void imprimirBombero()
    {
        System.out.println("nombre:"+ nombre);
        System.out.println("apellido:"+ apellido);
        System.out.println("edad:"+ edad);
    }
    
}
