
package herenciaanimalapp;


public class Lobo extends Canino {
    public Lobo(String foto,String comida,String localizacion,String tamaño){
        super(foto,comida,localizacion,tamaño);
    }
    public void hacerRuido(){
        System.out.println("Lobo hace ruido");
    
    }
    public void comer(){
        //super.comer();
        System.out.println("Lobo come");
    }
}
