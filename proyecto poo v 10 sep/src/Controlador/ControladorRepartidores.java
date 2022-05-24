
package Controlador;

import Modelo.Repartidores;
import Modelo.RepartidoresDAO;
import Vista.FrmAgregarRepartidores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Usuario1
 */
public class ControladorRepartidores implements ActionListener{
    RepartidoresDAO objetoDAO = new RepartidoresDAO();
    Repartidores objetoRepartidores = new Repartidores();
    FrmAgregarRepartidores objVista = new FrmAgregarRepartidores();
    public ControladorRepartidores(FrmAgregarRepartidores v){
        this.objVista=v;
        this.objVista.btnGuardarRepartidores.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==objVista.btnGuardarRepartidores){
            agregarRepartidores();
        }
    }
    public void agregarRepartidores(){
        objetoRepartidores.setNombre(objVista.txtNombreRepartidor.getText());
        objetoRepartidores.setApellido(objVista.txtApellidoRepartidor.getText());
        objetoRepartidores.setCedula(objVista.txtCedulaRepartidor.getText());
        objetoRepartidores.setNumeroDePlaca(objVista.txtNumeroPlacaRepartidor.getText());
        objetoRepartidores.setCorreo(objVista.txtCorreoRepartidor.getText());
        objetoRepartidores.setContraseña(objVista.pwContraseñaRepartidor.getText());
        objetoDAO.guardarRepartidores(objetoRepartidores);
    }
    
}
