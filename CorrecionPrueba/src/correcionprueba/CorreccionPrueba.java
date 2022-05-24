/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcionprueba;

/**
 *
 * @author AsrockLeo
 */
public class CorreccionPrueba {
    private char consumoEnergetico;
    private float precio;
    private int peso;
    private String color;
    
    
    
    
    public CorreccionPrueba(){
        consumoEnergetico= 'E';
        precio=100;
        peso=5;
        color="blanco";
    }
    public CorreccionPrueba(char consumoEnergetico, float precio, int peso, String color) {
        this.consumoEnergetico = consumoEnergetico;
        this.precio = precio;
        this.peso = peso;
        this.color = color;
    }
    
    public CorreccionPrueba(char consumoEnergetico, int peso, String color){
        if(comprobarConsumoEnergetico(consumoEnergetico)){
            this.consumoEnergetico=consumoEnergetico;
        }
        else{
            this.consumoEnergetico='E';
        }
        this.precio=100;
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
    
    public void establecerPrecioFinal(){
        if(consumoEnergetico=='A'){
            this.precio+=100;
            
        }
        if(consumoEnergetico=='B'){
            this.precio+=80;
            
        }
        if(consumoEnergetico=='C'){
            this.precio+=60;
            
        }
        if(consumoEnergetico=='D'){
            this.precio+=40;
            
        }
        if(consumoEnergetico=='E'){
            this.precio+=20;
            
        }
        
        if(peso>=0 && peso<=19){
            this.precio+=10;
            
        }
        if(peso>=20 && peso<=49){
            this.precio+=50;
            
        }
        if(peso>=50 && peso<=79){
            this.precio+=80;
            
        }
        if(peso>=80){
            this.precio+=100;
            
        }
        
    }
    
    public int lanzarDados(){
        int dado1=0;
        int dado2=0;
        int[] dados = new int[2];
        System.out.println("Lanzamiento primer dado");
        dados[0] = (int)(Math.random()*6 + 1); //Primer dado
        System.out.println(dados[0]);
        System.out.println("Lanzamiento segundo dado");
	dados[1] = (int)(Math.random()*6 + 1); //Segundo dado
        System.out.println(dados[1]);
        int sumaDados = dados[0]+dados[1];
        if(sumaDados==12){
            System.out.println("Usted recibira un descuento del 30%");
        }
        else{
            System.out.println("Usted no recibira un decuento");
        }
        return sumaDados;
    }
    
    public void definirDescuento(){
        precio= (float) (precio-(precio*0.30));
    }

    @Override
    public String toString() {
        return "CorreccionPrueba{" + "consumoEnergetico=" + consumoEnergetico + ", precio=" + precio + ", peso=" + peso + ", color=" + color + '}';
    }
    
    
    
}
