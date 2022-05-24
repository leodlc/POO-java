/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Participante;
import Modelo.ParticipanteDao;
import Vista.FrmInterfazGraficaSubasta;
import Vista.FrmPujador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AsrockLeo
 */
public class ControladorParticipante implements ActionListener {

   
    ParticipanteDao objetoDAO=new ParticipanteDao();
    Participante objetoParticipante= new Participante();
    FrmInterfazGraficaSubasta objetoVista= new FrmInterfazGraficaSubasta();
    FrmPujador ObjetoVista2= new FrmPujador();
    DefaultTableModel modelo;
    
    public ControladorParticipante(FrmPujador x,FrmInterfazGraficaSubasta v){
        this.ObjetoVista2=x;
        this.objetoVista=v;
        this.ObjetoVista2.btnPujar.addActionListener(this);
        this.objetoVista.btnAgregarPujador.addActionListener(this);
        this.objetoVista.btnMostrar.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ObjetoVista2.btnPujar){
            agregarParticipante();
        }   
        if(e.getSource()==objetoVista.btnMostrar){
            llenarTabla(objetoVista.jTable1);
            
        }
        if(e.getSource()==objetoVista.btnAgregarPujador){
            agregarParticipante();
            llenarTabla(objetoVista.jTable1);
            
        }
       
        
    }
    
    
    public void agregarParticipante(){
       
        objetoParticipante.setNombre(ObjetoVista2.txtNombre.getText());
        //objetoParticipante.setPujaAportada(ObjetoVista2.txtMontoIngresado.getText());
        objetoDAO.insertarParticipante(objetoParticipante);
        
        
    }
    public void llenarTabla(JTable tablaD)
    {
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("NOMBRE");
        modeloT.addColumn("PUJA");
        
        Object [] columna= new Object[2];
        int numReg= objetoDAO.obtenerParticipantes().size();
        for (int i=0; i<numReg; i++)
        {
            objetoParticipante= (Participante)objetoDAO.obtenerParticipantes().get(i);
            columna[0]=objetoParticipante.getPujaAportada();
            columna[1]= objetoParticipante.getNombre();
            
            modeloT.addRow(columna);
            
        }
    }

    
    
}
