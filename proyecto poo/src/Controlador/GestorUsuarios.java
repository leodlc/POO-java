
package Controlador;

import Modelo.ConexionAdministrador;
import Modelo.ConexionClientes;
import Modelo.ConexionRepartidores;
import Vista.FrmLoginGeneral;
import Vista.FrmRegistroCliente;


public class GestorUsuarios {
    public static void main(String args[]){
//        ConexionClientes con = new ConexionClientes();
//        ConexionRepartidores cone = new ConexionRepartidores();
//        ConexionAdministrador conex = new ConexionAdministrador();
        FrmLoginGeneral ventanaLoginPrincipal = new FrmLoginGeneral();
        ventanaLoginPrincipal.setVisible(true);
        FrmRegistroCliente ventanaregistro = new FrmRegistroCliente();
        ControladorClientes c = new ControladorClientes(ventanaregistro);
        ventanaregistro.setVisible(true);
        ventanaregistro.setLocationRelativeTo(ventanaregistro);
        
      
        
    }
}
