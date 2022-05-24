/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapracticaapp;


public class Electrodomestico {
    private double precioInicial;
    private double peso;
    private String color;
    private char consumoEnergetico;
    //constructores
    public Electrodomestico(double precio,double peso, String color, char consumoEnergetico) {
        this.precioInicial=precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }
    public Electrodomestico(){
        this.precioInicial=100;
        this.peso=5;
        this.color="blanco";
        this.consumoEnergetico='E';
    }
    
    public Electrodomestico(char consumoEnergetico, double peso, String color){
        if(comprobarConsumoEnergetico(consumoEnergetico)){
            this.consumoEnergetico=consumoEnergetico;
        }
        else{
            this.consumoEnergetico='E';
        }
        this.precioInicial=100;
        this.peso=peso;
        if(comprobarColor(color)){
            this.color=color;
        }
        else{
            this.color="blanco";
        }

    }
    
    public boolean comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico=='E'){
            return true;
        }
        else{
            return false;
        }      
    }
    
    public boolean comprobarColor(String color){
        if(color=="blanco"){
            return true;
        }
        else{
            return false;
        } 
    }
    public void comprobarColor(){
        if(color=="blanco"){
            System.out.println(color);
        }else{
            System.out.println(color);
        }
    }
    public void establecerPrecio(){ //String consumoEnergetico,double tamaño
        if(consumoEnergetico=='A'){
            this.precioInicial+=100;
            
        }
        if(consumoEnergetico=='B'){
            this.precioInicial+=80;
            
        }
        if(consumoEnergetico=='C'){
            this.precioInicial+=60;
            
        }
        if(consumoEnergetico=='D'){
            this.precioInicial+=40;
            
        }
        if(consumoEnergetico=='E'){
            this.precioInicial+=20;
            
        }
        
        if(peso>=0 && peso<=19){
            this.precioInicial+=10;
            
        }
        if(peso>=20 && peso<=49){
            this.precioInicial+=50;
            
        }
        if(peso>=50 && peso<=79){
            this.precioInicial+=80;
            
        }
        if(peso>=80){
            this.precioInicial+=100;
            
        }
    }
    public int lanzamientoDados(){
        int sumaLanzamiento;
        int [] resultado= new int[2];
        System.out.println("Primer intento:");
        resultado[0]=(int)(Math.random()*6+1);
        System.out.println(resultado[0]);
        System.out.println("segundo intento:");
        resultado[1]=(int)(Math.random()*6+1);
        System.out.println(resultado[1]);
        sumaLanzamiento=resultado[0]+resultado[1];
        System.out.println("La suma de sus dados es: "+ sumaLanzamiento);
        if(sumaLanzamiento==12){
            System.out.println("Usted recibira un descuento del 30%");
        }
        else{
            System.out.println("Usted no recibira un decuento");
        }
        return sumaLanzamiento;
    }
    
    public void definirDescuento(){
        precioInicial= (float) (precioInicial-(precioInicial*0.30));
    }
    
    public void setPrecioInicial(double precioInicial) {
        this.precioInicial = precioInicial;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPrecioInicial() {
        return precioInicial;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioInicial=" + precioInicial + ", peso=" + peso + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + '}';
    }
    public void darDescuento(){
        int descuento=30;
        descuento= (100*(100-descuento))/100;
        System.out.println(descuento);
    }
    
    
}
