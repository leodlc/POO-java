
package interfacesegregationapp;


public class Pato implements PoderFlotar,PoderGraznar,PoderJugar {

    @Override
    public void flotar() {
        System.out.println("El pato esta flotando");
    }

    @Override
    public void graznar() {
        System.out.println("El pato esta graznando");
    }

    @Override
    public void jugar() {
        this.flotar();
        this.graznar();
    }
    
}
