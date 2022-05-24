/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.ClientesDAO;
import Vista.FrmRegistroCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario1
 */
public class ControladorClientes implements ActionListener{
    ClientesDAO objetoDAO = new ClientesDAO();
    Clientes objetoClientes = new Clientes();
    FrmRegistroCliente objVista = new FrmRegistroCliente();
    
    public ControladorClientes(FrmRegistroCliente v){
        this.objVista=v;
        this.objVista.btnGuardarCliente.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==objVista.btnGuardarCliente){
            agregarClientes();
        }
    }
    public void agregarClientes(){
        objetoClientes.setNombre(objVista.txtRegistroNombreCliente.getText());
        objetoClientes.setApellido(objVista.txtRegistroApellidoCliente.getText());
        objetoClientes.setCedula(objVista.txtRegistroCedulaCliente.getText());
        objetoClientes.setCelular(objVista.txtRegistroCelularCliente.getText());
        objetoClientes.setCorreo(objVista.txtCorreoRegistroCliente.getText());
        objetoClientes.setContraseña(objVista.pwContraseñaRegistroCliente.getText());
        objetoClientes.setDireccion(objVista.txtDireccionRegistroCliente.getText());
        
        objetoDAO.guardarClientes(objetoClientes);
    }
}
