/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadainmobiliaria;

/**
 *
 * @author AsrockLeo
 */
public class FachadaInmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Interesado i= new Interesado();
        //Primer Cliente
        Inmobiliaria inmo= new Inmobiliaria();
        inmo.atencionCliente(c);
        inmo.atencionInteresado(i);
        MuestraPropiedad muestraPropiedad= new MuestraPropiedad();
        muestraPropiedad.mostrarPropietario(123);
        VentaInmueble venta= new VentaInmueble();
        venta.gestionVenta();
        AdministracionAlquiler alquiler = new AdministracionAlquiler();
        alquiler.cobro(1200);
        CuentasaPagar cuentasAPagar= new CuentasaPagar();
        cuentasAPagar.pagoPropietario(1100);
        
        //Segundo Cliente (lo mismo pero usando el Facade)
        Inmobiliaria inmo2= new Inmobiliaria();
        inmo2.atencion(i);
        inmo2.atencion(c);
        inmo2.muestraPropiedad.mostrarPropietario(123);
        inmo2.venta.gestionVenta();
        inmo2.gestionaVenta();
        inmo2.cobraAlquiler(1200);
        inmo2.paga(1100);
    }
    
}
