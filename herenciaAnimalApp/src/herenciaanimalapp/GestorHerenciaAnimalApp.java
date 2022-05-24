
package herenciaanimalapp;


public class GestorHerenciaAnimalApp {

    
    public static void main(String[] args) {
        Lobo lobo = new Lobo("foto1","comida1","norte","medio");
//        lobo.hacerRuido();
//        lobo.rugir();
//        lobo.comer();
//        lobo.dormir();
//        Animal animal= new Lobo("foto1","comida","norte","medio");
//        animal.hacerRuido();
//        animal.rugir();
//        animal.comer();
//        animal.dormir();
          Lobo lbo= new Lobo("foto1","comida","norte","medio"); 
          Canino canino= lobo;
          canino.comer();
          Animal animal= new Lobo("foto2","comida2","sur","medio");
          Animal animal2= lobo;
          animal2.comer();
          animal.comer();
          lobo=(Lobo)animal;
          lobo.comer();
          Lobo otroLobo=(Lobo)canino;
          otroLobo.rugir();
          Lobo error= (Lobo)new Canino("Foto3","comida3","oeste","medio");
          error.comer();
    }
    
}
