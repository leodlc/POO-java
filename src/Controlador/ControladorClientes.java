/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.ClientesDAO;
import Modelo.Usuario;
import Vista.FrmLoginGeneral;
import Vista.FrmRegistroCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario1
 */
public class ControladorClientes implements ActionListener{
    FrmLoginGeneral ventanaG= new FrmLoginGeneral();
    ClientesDAO objetoDAO = new ClientesDAO();
    Clientes objClientes = new Clientes();
    FrmRegistroCliente objVista = new FrmRegistroCliente();

    public void setVentanaG(FrmLoginGeneral ventanaG) {
        this.ventanaG = ventanaG;
    }
    
    public ControladorClientes(FrmRegistroCliente v){
        this.objVista=v;
        this.objVista.btnGuardarCliente.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
//        if(ae.getSource()==ventanaG.jButton4){
//            if(ae.getSource()==objVista.btnGuardarCliente){
//            agregarClientes();
//            }
//        }
        //cargarGrafica();
        if(ae.getSource()==objVista.btnGuardarCliente){
            agregarClientes();
         }
        

    }
    public void agregarClientes(){
        objClientes.setNombre(objVista.txtRegistroNombreCliente.getText());
        objClientes.setApellido(objVista.txtRegistroApellidoCliente.getText());
        objClientes.setCedula(objVista.txtRegistroCedulaCliente.getText());
        objClientes.setCelular(objVista.txtRegistroCelularCliente.getText());
        objClientes.setCorreo(objVista.txtCorreoRegistroCliente.getText());
        objClientes.setContraseña(objVista.pwContraseñaRegistroCliente.getText());
        objClientes.setDireccion(objVista.txtDireccionRegistroCliente.getText());
        
        objetoDAO.guardarClientes(objClientes);
    }
    public void cargarGrafica(){
        ventanaG.setVisible(true);
    }
}
