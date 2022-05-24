
package compositetallerapp;


public class GestorCompositeTallerApp {

    
    public static void main(String[] args) {
        PiezaSimple tornilloDeLlanta = new PiezaSimple("Tornillo Llanta","Tornillo Llanta Marca ACME",0.21);
        PiezaCompuesta llantaACME15= new PiezaCompuesta("Llanta ACME 15 pulgadas",tornilloDeLlanta,"Llanta ACME 15 Pulgadas",45.22);
        PiezaCompuesta llantaACME16= new PiezaCompuesta("Llanta ACME 16 pulgadas",tornilloDeLlanta,"Llanta ACME 16 Pulgadas",51.00);
        PiezaCompuesta llantaACME17= new PiezaCompuesta("Llanta ACME 17 pulgadas",tornilloDeLlanta,"Llanta ACME 17 Pulgadas",54.00);
        PiezaSimple neumaticoMichelin15 = new PiezaSimple("Neumatico de 15 pulgadas","neumatico Marca Michelin",13.42);
        PiezaSimple neumaticoMichelin16 = new PiezaSimple("Neumatico de 16 pulgadas","neumatico Marca Michelin",14.98);
        PiezaSimple neumaticoMichelin17 = new PiezaSimple("Neumatico de 17 pulgadas","neumatico Marca Michelin",17.22);
        PiezaSimple valvulaGenerica = new PiezaSimple("Valvula","valvula Marca generica",0.49);
        PiezaSuperCompuesta rueda15=new PiezaSuperCompuesta("Rueda de 15 pulgadas");
        rueda15.adicionarPieza(llantaACME15);
        rueda15.adicionarPieza(neumaticoMichelin15);
        PiezaSuperCompuesta rueda16=new PiezaSuperCompuesta("Rueda de 16 pulgadas");
        rueda16.adicionarPieza(llantaACME16);
        rueda16.adicionarPieza(neumaticoMichelin16);
        
        PiezaSuperCompuesta rueda17=new PiezaSuperCompuesta("Rueda de 17 pulgadas");
        rueda17.adicionarPieza(llantaACME17);
        rueda17.adicionarPieza(neumaticoMichelin17);
        
        OrdenVenta ordenRueda15= new OrdenVenta(1,"Amelia Ramos");
        ordenRueda15.adicionarProducto(rueda15);
        ordenRueda15.imprimirOrden();
        
        OrdenVenta ordenRueda16= new OrdenVenta(2,"Marco Andrade");
        ordenRueda16.adicionarProducto(rueda16);
        ordenRueda16.imprimirOrden();
        
        OrdenVenta ordenRueda17= new OrdenVenta(3,"Juan Segundo");
        ordenRueda17.adicionarProducto(rueda17);
        ordenRueda17.imprimirOrden();
        
        
        
        
    }
    
}
