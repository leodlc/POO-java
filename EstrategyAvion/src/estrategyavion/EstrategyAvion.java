
package estrategyavion;


public class EstrategyAvion {

    public static void main(String[] args) {
        AvionComercial avionComercial= new AvionComercial();
        AvionRapido avionRapido= new AvionRapido();
        System.out.println("-------------------");
        System.out.println("Avion Comercial");
        avionComercial.setEstado(new EnTierra());
        avionComercial.mover();
        avionComercial.setEstado(new EnAire());
        avionComercial.mover();
        System.out.println("-------------------");
        System.out.println("Avion Rapido");
        avionRapido.setEstado(new EnTierra());
        avionRapido.mover();
        avionRapido.setEstado(new VelocidadMaxima());
        avionRapido.mover();
        System.out.println("-------------------");
        System.out.println("Avion comercial veloz");
        avionComercial.setEstado(new VelocidadMaxima());
        avionComercial.mover();
        
              
    }
    
}
