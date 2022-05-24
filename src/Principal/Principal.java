/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Controlador.ControladorClientes;
import Controlador.ControladorGeneral;
import Controlador.ControladorPedidos;
import Controlador.ControladorRepartidores;
import Vista.FrmAgregarRepartidores;
import Vista.FrmHacerPedido;
import Vista.FrmListaPedidos;
import Vista.FrmLoginGeneral;
import Vista.FrmRegistroCliente;

/**
 *
 * @author AsrockLeo and Grupo 4: Luis Cueva, Ariel Jara, Leonardo De La Cadena
 */
public class Principal {
    public static void main(String args[]){
//  
        
        FrmRegistroCliente ventanaReCliente = new FrmRegistroCliente();
        
        FrmHacerPedido ventanaHacerPedido = new FrmHacerPedido();
        FrmListaPedidos ventanaListaPedidos = new FrmListaPedidos();
        FrmAgregarRepartidores ventanaAgregarRep= new FrmAgregarRepartidores();
        FrmLoginGeneral ventanaLoginGeneral= new FrmLoginGeneral();
        ControladorGeneral controladorGeneral = new ControladorGeneral(ventanaReCliente,ventanaHacerPedido,ventanaListaPedidos,ventanaAgregarRep,ventanaLoginGeneral);
        
        ventanaLoginGeneral.setVisible(true);
        ventanaLoginGeneral.setLocationRelativeTo(ventanaLoginGeneral);
       
       
       
       
       
       
       
       
    }
}
