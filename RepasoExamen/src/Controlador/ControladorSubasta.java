/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Puja;
import Modelo.PujaAbstracta;
import Modelo.PujaCompuesta;
import Modelo.PujaDAO;
import Vista.FrmListaPujas;
import Vista.FrmUsuarioPujador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AsrockLeo
 */
public class ControladorSubasta implements ActionListener {
    FrmListaPujas objVistaventanaLista= new FrmListaPujas();
    FrmUsuarioPujador objVistaventanaUsuarioPujador= new FrmUsuarioPujador();
    Puja objPuja= new Puja();
    PujaDAO objPujaDAO= new  PujaDAO();
    PujaCompuesta objPujaCompuesta= new PujaCompuesta();
    public ControladorSubasta(FrmListaPujas vistaVentanaLista,FrmUsuarioPujador vistaUsuarioPujador){
        this.objVistaventanaLista=vistaVentanaLista;
        this.objVistaventanaUsuarioPujador=vistaUsuarioPujador;
        this.objVistaventanaLista.btnActualizar.addActionListener(this);
        this.objVistaventanaUsuarioPujador.btnPujar.addActionListener(this);
        this.objVistaventanaUsuarioPujador.txtNombrePujador.addActionListener(this);
        this.objVistaventanaUsuarioPujador.txtPujaHecha.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void guardarPujas(){
        
    }
    public void llenarTabla(JTable tablaD)
    {
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Nombre del pujador:");
        modeloT.addColumn("Puja Otorgada");
       
        Object [] columna= new Object[2];
        int numReg= objPujaDAO.obtenerPuja().size();
        for (int i=0; i<numReg; i++)
        {
            objPuja= (Puja)objPujaDAO.obtenerPuja().get(i);
            columna[0]= objPuja.getNombrePujador();
            columna[1]=objPuja.getPujaInicial();
            
            modeloT.addRow(columna);

        }
    }
    
}
