/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author ethan, alex, valen
 */
public class NuevoProducto {

    protected String NombreP;
    protected String Codigo;
    protected String CantidadCU;
    protected int unidades;

    public NuevoProducto(String nombreP, String Codigo, String cantidadCU, int unidades) {
        this.NombreP = nombreP;
        this.Codigo = Codigo;
        this.CantidadCU = cantidadCU;
        this.unidades = unidades;
    }

    public NuevoProducto() {
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String nombreP) {
        this.NombreP = nombreP;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCantidadCU() {
        return CantidadCU;
    }

    public void setCantidadCU(String cantidadCU) {
        this.CantidadCU = cantidadCU;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "NuevoProducto{" + "nombreP=" + NombreP + ", Codigo=" + Codigo + ", cantidadCU=" + CantidadCU + ", unidades=" + unidades + '}';
    }
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
}
