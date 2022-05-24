/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;
import vista.FrmCliente;

/**
 *
 * @author AsrockLeo
 */
public class ControladorCliente implements ActionListener {
    ClienteDAO objetoDAO=new ClienteDAO();
    Cliente objetoCliente= new Cliente();
    FrmCliente objetoVista= new FrmCliente();
    DefaultTableModel modelo;
    public ControladorCliente(FrmCliente v){
        this.objetoVista=v;
        this.objetoVista.btnAdicionar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.btnAdicionar){
            agregarCliente();
            
        }
    }
    public void agregarCliente(){
        objetoCliente.setId(objetoVista.txtID.getText());
        objetoCliente.setNombre(objetoVista.txtNombre.getText());
        objetoCliente.setEdad(Integer.parseInt(objetoVista.txtEdad.getText()));
        objetoDAO.insertarCliente(objetoCliente);
        
    }

    
    
    
}
