
package Controlador;

import Modelo.Administrador;
import Modelo.AdministradorDAO;
import Vista.FrmAgregarAdministrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorAdministrador implements ActionListener{
    AdministradorDAO objetoDAO = new AdministradorDAO();
    Administrador objAdministrador = new Administrador();
    FrmAgregarAdministrador objVista = new FrmAgregarAdministrador();
    public ControladorAdministrador(FrmAgregarAdministrador v){
        this.objVista=v;
        
        this.objVista.btnAgregarAdministrador.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==objVista.btnAgregarAdministrador){
            agregarAdministrador();
        }
    }
    public void agregarAdministrador(){
        objAdministrador.setNombre(objVista.txtNombreAdministrador.getText());
        objAdministrador.setApellido(objVista.txtApellidoAdministrador.getText());
        objAdministrador.setCedula(objVista.txtCedulaAdministrador.getText());
        objAdministrador.setCorreo(objVista.txtCorreoAdministrador.getText());
        objAdministrador.setContraseña(objVista.pwContraseñaAdministrador.getText());
        objetoDAO.guardarAdministrador(objAdministrador);
    }
}
