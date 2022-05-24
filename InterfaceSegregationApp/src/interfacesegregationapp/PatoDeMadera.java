
package interfacesegregationapp;

class PatoDeMadera implements PoderFlotar,PoderJugar {

    @Override
    public void flotar() {
        System.out.println("El pato de madera esta flotando");
    }

    @Override
    public void jugar() {
        this.flotar();
    }

   
    
}
