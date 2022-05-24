
package herenciaanimalapp;

public class Animal {
    private String foto;
    private String comida;
    private String localizacion;
    private String tamaño;

    public Animal(String foto, String comida, String localizacion, String tamaño) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamaño = tamaño;
    }
    public void hacerRuido(){
        System.out.println("Animal hace ruido");
    }
     public void comer(){
        System.out.println("Animal come");
    }
     public void dormir(){
        System.out.println("Animal duerme");
    }
      public void rugir(){
        System.out.println("Animal ruge");
    }
                    
}

