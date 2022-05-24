/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistenteapp;

/**
 *
 * @author AsrockLeo
 */
public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private String ID;
    
    //constructores
    
    public Persona()
    {
       this.nombre="";
       this.edad=0;
       this.ID="";
    }
    public Persona(String nombre, int edad, String ID){
        this.nombre=nombre;
        this.edad=edad;
        this.ID=ID;
    }
    
    public Persona(String nombre, String ID)
    {
        this.nombre=nombre;
        this.edad=0;
        this.ID=ID;
    }
    public Persona(String nombre,String ID, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.ID=ID;
    }
    public void mostrarPersona()
    {
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
        System.out.println("ID: "+ID);
    }
     public String getNombre()
    {
        
        return nombre;
    }
        
    //SET
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getId(){
        
        
        return ID;
    }
    
    public void setId(String ID){
        this.ID=ID;
    }
    
    public int getEdad(){
        
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public boolean mayoriaEdad(){
        int edad=this.edad;
        
        if(edad>=18)
        {
            System.out.println("Es mayor de edad");
            return true;
        }else 
        {
            System.out.println("NO es mayor de edad");
            return false;
        }
    }
    
    
    
}
