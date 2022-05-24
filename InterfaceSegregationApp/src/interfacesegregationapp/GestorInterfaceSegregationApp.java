
package interfacesegregationapp;


public class GestorInterfaceSegregationApp {

    public static void main(String[] args) {
        Estanque estanque= new Estanque();
        estanque.enviarParaJugar(new Pato());
        System.out.println("--------------------------");
        estanque.enviarParaJugar(new PatoDeMadera());
        System.out.println("--------------------------");
        estanque.enviarParaJugar(new Rana());
        
 
    }
    
}
