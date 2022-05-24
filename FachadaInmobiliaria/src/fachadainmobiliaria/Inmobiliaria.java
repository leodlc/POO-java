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
public class Inmobiliaria {
    protected MuestraPropiedad muestraPropiedad;
    protected VentaInmueble venta;
    protected CuentasaPagar cuentasaPagar;
    protected AdministracionAlquiler alquiler;
    
    public Inmobiliaria(){
        muestraPropiedad= new MuestraPropiedad();
        venta= new VentaInmueble();
        cuentasaPagar= new CuentasaPagar();
        alquiler= new AdministracionAlquiler();
    }
    public void atencionCliente(Cliente c ){
        System.out.println("Atendiendo a un cliente");
    }
    public void atencionPropietario(Propietario p){
        System.out.println("Atencion a un propietario");
    }
    public void atencionInteresado(Interesado i){
        System.out.println("Atencion a un interesado en una propiedad");
    }
    public void atencion(Persona p){
        if(p instanceof Cliente){
            atencionCliente((Cliente)p);
        }else if(p instanceof Propietario){
            atencionPropietario((Propietario)p);
        }
    }
}
