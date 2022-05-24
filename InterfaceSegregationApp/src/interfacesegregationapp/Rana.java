
package interfacesegregationapp;


public class Rana implements PoderJugar,PoderFlotar {

    @Override
    public void jugar() {
        this.flotar();
        this.saltar();
    }

    @Override
    public void flotar() {
        System.out.println("La Rana esta flotando");
    }
    
    public void saltar(){
        System.out.println("La rana esta saltando");
    }
    
}
