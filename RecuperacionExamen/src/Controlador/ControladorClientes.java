/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.IngresoClientes;
import Vista.FrmIngresoClientes;
import Vista.FrmIngresoCorporativo;
import Vista.FrmIngresoGeneral;
import Vista.FrmIngresoMilitar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AsrockLeo
 */
public class ControladorClientes implements ActionListener,IngresoClientes {
    FrmIngresoClientes objVistaIngresoClientes= new FrmIngresoClientes();
    FrmIngresoCorporativo objVistaCorporativo = new  FrmIngresoCorporativo();
    FrmIngresoGeneral objVistaGeneral= new  FrmIngresoGeneral();
    FrmIngresoMilitar objVistaMilitar= new FrmIngresoMilitar();
    Scanner sc;
    public ControladorClientes(FrmIngresoClientes ventanaInCl,FrmIngresoCorporativo ventanaInCorp,FrmIngresoGeneral ventanaInGe,FrmIngresoMilitar ventanaInMil){
        this.objVistaIngresoClientes=ventanaInCl;
        this.objVistaCorporativo=ventanaInCorp;
        this.objVistaGeneral=ventanaInGe;
        this.objVistaMilitar=ventanaInMil;
        this.objVistaGeneral.btnAgregar.addActionListener(this);
        this.objVistaCorporativo.btnAgregar.addActionListener(this);
        this.objVistaIngresoClientes.jButton1.addActionListener(this);
        this.objVistaIngresoClientes.jButton2.addActionListener(this);
        this.objVistaIngresoClientes.jButton3.addActionListener(this);
        this.objVistaMilitar.btnAgregar.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent a) {
        //ACCIONAR BOTONES VENTANA INGRESO CLIENTES
        if(a.getSource()==objVistaIngresoClientes.jButton1){
            objVistaIngresoClientes.setVisible(false);
            objVistaGeneral.show();
        }
        if(a.getSource()==objVistaIngresoClientes.jButton2){
            objVistaIngresoClientes.setVisible(false);
            objVistaCorporativo.show();
        }
        if(a.getSource()==objVistaIngresoClientes.jButton3){
            objVistaIngresoClientes.setVisible(false);
            objVistaMilitar.show();
        }
        //ACCIONAR BOTONES VENTANA CORPORATIVO
        if(a.getSource()==objVistaCorporativo.btnAgregar){
            ingresoCliente();
        }
        
        
    }

    @Override
    public void ingresoCliente() {
        String nombreArchivo= "Corporativo";
        String carpeta= System.getProperty("user.dir");//toma la direccion en la que se va a alojar el archivo
        String direccionCompleta= carpeta +"/"+nombreArchivo+".txt";
        FileWriter ubicacion=null;
        try{

            ubicacion= new FileWriter(direccionCompleta);

        }catch(IOException ex){
            Logger.getLogger(ControladorClientes.class.getName()).log(Level.SEVERE,null,ex);
        }
        try{

            BufferedWriter escritor= new BufferedWriter(ubicacion);

            escritor.write(objVistaCorporativo.txtNombre.getText()+"\n");
            escritor.write(objVistaCorporativo.txtCedula.getText()+"\n");
            escritor.write(objVistaCorporativo.txtEmpresa.getText()+"\n");
            escritor.write(objVistaCorporativo.txtTelefono.getText()+"\n");
            escritor.write(objVistaCorporativo.txtIdEmpresa.getText()+"\n");
            

            escritor.close();
        }catch(Exception ex ){

        }
        FileReader fr= null;
        try{
            int nLineas=0;
            int i=0;
            String [] usuarios=null;
            String linea;

            sc= new Scanner(new File(direccionCompleta));
            File f= new File(direccionCompleta);

            fr= new FileReader(f);
            BufferedReader br= new BufferedReader(fr);
            try{
                while((linea=br.readLine())!=null){
                    nLineas++;
                }
            }catch(IOException ex){
                Logger.getLogger(FrmIngresoCorporativo.class.getName()).log(Level.SEVERE, null, ex);
            }
            usuarios=new String[nLineas];
            while(sc.hasNextLine()){
                usuarios[i++]=sc.nextLine();
            }
//            user = objVistaRegistroCl.txtCorreoRegistroCliente.getText();
//            password= objVistaRegistroCl.pwContraseñaRegistroCliente.getText();
        }catch(FileNotFoundException ex){
            Logger.getLogger(FrmIngresoCorporativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registroClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
