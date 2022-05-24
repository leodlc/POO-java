/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import com.mongodb.BasicDBObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Proveedor;
import modelo.ProveedorDao;
import vista.ProveedorFrm;
/**
 *
 * @author AsrockLeo
 */
public class ControladorProveedor implements ActionListener {
    ProveedorDao objetoDAO=new ProveedorDao();
    Proveedor objetoProveedor= new Proveedor();
    ProveedorFrm objetoVista= new ProveedorFrm();
    DefaultTableModel modelo;
    String paisOrigen;
    public ControladorProveedor(ProveedorFrm v){
        this.objetoVista=v;
        this.objetoVista.btnAgregar.addActionListener(this);
        this.objetoVista.btnMostrar.addActionListener(this);
        this.objetoVista.btnBuscar.addActionListener(this);
        this.objetoVista.btnEliminar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.btnMostrar){
            llenarTabla(objetoVista.tabla);
            
        }
        if(e.getSource()==objetoVista.btnAgregar){
            agregarProveedor();
            
        }
        if(e.getSource()==objetoVista.btnBuscar){
            
            int seleccion= objetoVista.tabla.getSelectedRow();
            objetoVista.txtNombre.setText(String.valueOf(objetoVista.tabla.getValueAt(seleccion, 0)));
            objetoVista.txtPais.setText(String.valueOf(objetoVista.tabla.getValueAt(seleccion, 1)));
            paisOrigen=objetoVista.txtPais.getText();
            
        }
        
        if (e.getSource()==objetoVista.btnEliminar)
        {
            String nombreEliminar= objetoVista.txtNombre.getText();
            
            objetoDAO.eliminarProveedor(nombreEliminar);
            JOptionPane.showMessageDialog(null, "El proveedor se eliminó de la base de datos");
            
        }
    }
    
    
    public void agregarProveedor(){
       
        objetoProveedor.setNombre(objetoVista.txtNombre.getText());
        objetoProveedor.setPais(objetoVista.txtPais.getText());
        objetoDAO.insertarProveedor(objetoProveedor);
        
        
    }
    public void llenarTabla(JTable tablaD)
    {
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("NOMBRE");
        modeloT.addColumn("PAIS");
        
        Object [] columna= new Object[2];
        int numReg= objetoDAO.obtenerProveedores().size();
        for (int i=0; i<numReg; i++)
        {
            objetoProveedor= (Proveedor)objetoDAO.obtenerProveedores().get(i);
            columna[0]= objetoProveedor.getNombre();
            columna[1]=objetoProveedor.getPais();
            modeloT.addRow(columna);
            
        }
    }

    
    
    

    
}
