
package herenciaanimalapp;


public class Canino extends Animal {
    public Canino(String foto,String comida,String localizacion,String tamaño){
        super(foto,comida,localizacion,tamaño);
    }
    public void rugir(){
        System.out.println("Canino ruge");
    }
    
    
}
