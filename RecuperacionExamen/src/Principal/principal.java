/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Controlador.ControladorClientes;
import Vista.FrmIngresoClientes;
import Vista.FrmIngresoCorporativo;
import Vista.FrmIngresoGeneral;
import Vista.FrmIngresoMilitar;

/**
 *
 * @author AsrockLeo
 */
public class principal {
    public static void main(String args[]){
//  
        
        FrmIngresoClientes ventanaInCliente = new FrmIngresoClientes();
        
        FrmIngresoCorporativo ventanaInCorp = new FrmIngresoCorporativo();
        FrmIngresoGeneral ventanaInGe= new FrmIngresoGeneral();
        FrmIngresoMilitar ventanaInMil= new FrmIngresoMilitar();
        
        ControladorClientes controladorClientes = new ControladorClientes(ventanaInCliente,ventanaInCorp,ventanaInGe,ventanaInMil);
        
        ventanaInCliente.setVisible(true);
        ventanaInCliente.setLocationRelativeTo(ventanaInCliente);
       
       
       
       
       
       
       
       
    }
}
