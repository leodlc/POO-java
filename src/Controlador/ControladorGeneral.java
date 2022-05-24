/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.ClientesDAO;
import Modelo.Pedidos;
import Modelo.PedidosDAO;
import Modelo.Repartidores;
import Modelo.RepartidoresDAO;
import Modelo.Seguridad;
import Principal.Principal;
import Vista.FrmAgregarRepartidores;
import Vista.FrmCambiarContraseñaAdministrador;
import Vista.FrmCambiarContraseñaCliente;
import Vista.FrmCambiarContraseñaRepartidor;
import Vista.FrmDatosTarjeta;
import Vista.FrmHacerPedido;
import Vista.FrmListaPedidos;
import Vista.FrmLoginAdministrador;
import Vista.FrmLoginCliente;
import Vista.FrmLoginGeneral;
import Vista.FrmLoginRepartidor;
import Vista.FrmPantallaPrincipalAdministrador;
import Vista.FrmPantallaPrincipalCliente;
import Vista.FrmPantallaPrincipalRepartidor;
import Vista.FrmRegistroCliente;
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AsrockLeo
 */
public class ControladorGeneral implements ActionListener {
    FrmLoginGeneral objVistaLogGeneral = new FrmLoginGeneral();
    ClientesDAO objetoClienDAO = new ClientesDAO();
    Clientes objClientes = new Clientes();
    FrmRegistroCliente objVistaRegistroCl = new FrmRegistroCliente();
    PedidosDAO objetoPedDao = new  PedidosDAO();
    Pedidos objPedidos= new Pedidos();
    FrmHacerPedido objVistaHacerPed= new FrmHacerPedido();
    FrmListaPedidos objVistaListaPed= new FrmListaPedidos();
    RepartidoresDAO objetoRepDAO = new RepartidoresDAO();
    Repartidores objetoRepartidores = new Repartidores();
    FrmAgregarRepartidores objVistaRepartidor = new FrmAgregarRepartidores();
    DefaultTableModel modelo;
    FrmLoginCliente objVistaLoginCl= new FrmLoginCliente();
    FrmLoginRepartidor objVistaLoginRe = new FrmLoginRepartidor();
    FrmLoginAdministrador objVistaLoginAd= new FrmLoginAdministrador();
    FrmPantallaPrincipalAdministrador objVistaPantAd= new FrmPantallaPrincipalAdministrador();
    FrmPantallaPrincipalCliente objVistaPantCl= new FrmPantallaPrincipalCliente();
    FrmPantallaPrincipalRepartidor objVistaPantRe= new FrmPantallaPrincipalRepartidor();
    FrmDatosTarjeta objVistaPantDT = new FrmDatosTarjeta();
    FrmCambiarContraseñaAdministrador objVistaCambiarContraAd = new FrmCambiarContraseñaAdministrador();
    FrmCambiarContraseñaCliente objVistaCambiarContraCl= new FrmCambiarContraseñaCliente();
    FrmCambiarContraseñaRepartidor objVistaCambiarContraRe = new FrmCambiarContraseñaRepartidor();
    
    
    String res;
    
    Scanner sc;
    int intentos;
    String user,password;
    
    public ControladorGeneral(FrmRegistroCliente vistaCl, FrmHacerPedido vistaHPed, FrmListaPedidos vistaListP, FrmAgregarRepartidores vistaARep,FrmLoginGeneral vistaLogG){
        
        this.objVistaRegistroCl=vistaCl;
        this.objVistaRegistroCl.btnGuardarCliente.addActionListener(this);
        this.objVistaHacerPed=vistaHPed;
        this.objVistaHacerPed.btnEnviarPedido.addActionListener(this);
        this.objVistaListaPed=vistaListP;
        this.objVistaListaPed.btnActualizarLista.addActionListener(this);
        this.objVistaRepartidor=vistaARep;
        this.objVistaRepartidor.btnGuardarRepartidores.addActionListener(this);
        this.objVistaLogGeneral=vistaLogG;
        this.objVistaLogGeneral.btnIngresarCliente.addActionListener(this);
        this.objVistaLogGeneral.btnIngresoAdmin.addActionListener(this);
        this.objVistaLogGeneral.btnIngresoRepartidor.addActionListener(this);
        this.objVistaLogGeneral.btnRegistroCliente.addActionListener(this);
        this.objVistaLoginCl.btnRegresar.addActionListener(this);
        this.objVistaRegistroCl.btnRegresar.addActionListener(this);
        this.objVistaLoginCl.btnIngresarLoginCliente.addActionListener(this);
        this.objVistaPantCl.btnHacerPedido.addActionListener(this);
        this.objVistaPantCl.btnCerrarSesionCliente.addActionListener(this);
        this.objVistaHacerPed.btnRegresar.addActionListener(this);
        this.objVistaLoginAd.btnIngresar.addActionListener(this);
        this.objVistaLoginAd.btnRegresar.addActionListener(this);
        this.objVistaPantAd.btnAgregarRepartidor.addActionListener(this);
        this.objVistaPantAd.btnCerrarSesionAdministrador.addActionListener(this);
        this.objVistaRepartidor.btnRegresar.addActionListener(this);
        this.objVistaPantRe.btnVerPedido.addActionListener(this);
        this.objVistaPantRe.btnCerrarSesionRepartidor.addActionListener(this);
        this.objVistaLoginRe.btnIngresarLoginRepartidor.addActionListener(this);
        this.objVistaLoginRe.btnRegresar.addActionListener(this);
        this.objVistaListaPed.btnRegresar.addActionListener(this);
        this.objVistaHacerPed.btnPagarTarjeta.addActionListener(this);
        this.objVistaHacerPed.btnPagarDebito.addActionListener(this);
        this.objVistaPantDT.btnRegresar.addActionListener(this);
        this.objVistaPantDT.btnConfirmarPago.addActionListener(this);
        this.objVistaCambiarContraCl.btnGuardarCambioDeContraseña.addActionListener(this);
        this.objVistaCambiarContraAd.btnGuardarNuevaContraseñaAdministrador.addActionListener(this);
        this.objVistaCambiarContraRe.btnRegresar.addActionListener(this);
        this.objVistaCambiarContraAd.btnRegresar.addActionListener(this);
        this.objVistaCambiarContraCl.btnRegresar.addActionListener(this);
        this.objVistaCambiarContraRe.btnGuardarContraRe.addActionListener(this);
        this.objVistaPantCl.btnCambiarContraseñaCliente.addActionListener(this);
        this.objVistaPantRe.btnCambiarContraseñaRepartidor.addActionListener(this);
        this.objVistaPantAd.btnCambiarContraseñaAdministrador.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //accionar botones de la ventana Login General
        if(ae.getSource()==objVistaLogGeneral.btnRegistroCliente){
            objVistaLogGeneral.setVisible(false);
            objVistaRegistroCl.show();
        }
        if(ae.getSource()==objVistaLogGeneral.btnIngresarCliente){
            objVistaLogGeneral.setVisible(false);
            objVistaLoginCl.show();
        }
        if(ae.getSource()==objVistaLogGeneral.btnIngresoAdmin){
            objVistaLogGeneral.setVisible(false);
            objVistaLoginAd.show();
        }
        if(ae.getSource()==objVistaLogGeneral.btnIngresoRepartidor){
            objVistaLogGeneral.setVisible(false);
            objVistaLoginRe.show();
        }
        //accionar botones de la ventana Login Cliente
        if(ae.getSource()==objVistaLoginCl.btnIngresarLoginCliente){
            validarIngresoCliente();
        }
        if(ae.getSource()==objVistaLoginCl.btnRegresar){
            objVistaLoginCl.setVisible(false);
            objVistaLogGeneral.show();
        }
        //accionar botones de la ventana registroCliente
        if(ae.getSource()==objVistaRegistroCl.btnGuardarCliente){
            agregarClientes();
            ficheroClientes();
        }
        if(ae.getSource()==objVistaRegistroCl.btnRegresar){
            objVistaRegistroCl.setVisible(false);
            objVistaLogGeneral.show();
        }
        //accionar botones de la ventana principal cliente
        if(ae.getSource()==objVistaHacerPed.btnEnviarPedido){
            guardarPedidos();
        }
        if(ae.getSource()==objVistaPantCl.btnHacerPedido){
            objVistaPantCl.setVisible(false);
            objVistaHacerPed.show();
        }
        if(ae.getSource()==objVistaPantCl.btnCerrarSesionCliente){
            objVistaPantCl.setVisible(false);
            objVistaLogGeneral.show();
        }
        if(ae.getSource()==objVistaHacerPed.btnRegresar){
            objVistaHacerPed.setVisible(false);
            objVistaPantCl.show();
        }
        if(ae.getSource()==objVistaHacerPed.btnPagarDebito){
            String item=objVistaHacerPed.btnPagarDebito.getLabel();
            objVistaHacerPed.txtSeleccionado.setText(item);
        }
        if(ae.getSource()==objVistaHacerPed.btnPagarTarjeta){
            String item=objVistaHacerPed.btnPagarTarjeta.getLabel();
            objVistaHacerPed.txtSeleccionado.setText(item);
            objVistaPantDT.show();
        }
        if(ae.getSource()==objVistaPantDT.btnRegresar){
            objVistaPantDT.setVisible(false);
        }
        if(ae.getSource()==objVistaPantDT.btnConfirmarPago){
            ficheroDatosTarjeta();
            objVistaPantDT.setVisible(false);
        }
        if(ae.getSource()==objVistaPantCl.btnCerrarSesionCliente){
            objVistaPantCl.setVisible(false);
            objVistaLogGeneral.show();
            
        }
        if(ae.getSource()==objVistaPantCl.btnCambiarContraseñaCliente){
            objVistaPantCl.setVisible(false);
            objVistaCambiarContraCl.show();
        }
        if(ae.getSource()==objVistaCambiarContraCl.btnGuardarCambioDeContraseña){
            objVistaCambiarContraCl.setVisible(false);
            objVistaPantCl.show();
        }
        if(ae.getSource()==objVistaCambiarContraCl.btnRegresar){
           objVistaCambiarContraCl.setVisible(false);
           objVistaPantCl.show();
        }
        
        //ACCIONAR BOTONES DE VENTANA PRINCIPAL LISTA PEDIDOS REPARTIDOR
        if (ae.getSource() == objVistaListaPed.btnActualizarLista) {
            llenarTabla(objVistaListaPed.jTable1);
        }
        //ACCIONAT BOTONES DE login ADMINISTRADOR
        if(ae.getSource()==objVistaLoginAd.btnIngresar){
            ingresoUsuarioAdmin();
        }
        if(ae.getSource()==objVistaLoginAd.btnRegresar){
            objVistaLoginAd.setVisible(false);
            objVistaLogGeneral.show();
        }
        //ACCIONAR BOTONES DE PANTALLA PRINCIPAL ADMINISTRADOR
        if(ae.getSource()==objVistaPantAd.btnAgregarRepartidor){
            objVistaPantAd.setVisible(false);
            objVistaRepartidor.show();
            
        }
        if(ae.getSource()==objVistaPantAd.btnCerrarSesionAdministrador){
            objVistaPantAd.setVisible(false);
            objVistaLogGeneral.show();
        }
        if(ae.getSource()==objVistaRepartidor.btnGuardarRepartidores){
            agregarRepartidores();
            ficheroRepartidores();
        }
        if(ae.getSource()==objVistaRepartidor.btnRegresar){
            objVistaRepartidor.setVisible(false);
            objVistaPantAd.show();
        }
        if(ae.getSource()==objVistaPantAd.btnCambiarContraseñaAdministrador){
            objVistaPantAd.setVisible(false);
            objVistaCambiarContraAd.show();
        }
        if(ae.getSource()==objVistaCambiarContraAd.btnGuardarNuevaContraseñaAdministrador){
            objVistaCambiarContraAd.setVisible(false);
            objVistaPantAd.show();
        }
        if(ae.getSource()==objVistaCambiarContraAd.btnRegresar){
            objVistaCambiarContraAd.setVisible(false);
            objVistaPantAd.show();
        }
        
        
        //ACCIONAR BOTONES DE LOGIN REPARTIDOR
        if(ae.getSource()==objVistaLoginRe.btnIngresarLoginRepartidor){
            validarIngresoRepartidor();
        }
        if(ae.getSource()==objVistaLoginRe.btnRegresar){
            objVistaLoginRe.setVisible(false);
            objVistaLogGeneral.show();
        }
        //ACCIONAR BOTONES DE VENTANA PRINCIPAL REPARTIDOR
        if(ae.getSource()==objVistaPantRe.btnVerPedido){
            objVistaPantRe.setVisible(false);
            objVistaListaPed.show();
        }
        if(ae.getSource()==objVistaListaPed.btnRegresar){
            objVistaListaPed.setVisible(false);
            objVistaPantRe.show();
        }
        if(ae.getSource()==objVistaPantRe.btnCerrarSesionRepartidor){
            objVistaPantRe.setVisible(false);
            objVistaLogGeneral.show();
        }
        if(ae.getSource()==objVistaPantRe.btnCambiarContraseñaRepartidor){
            objVistaPantRe.setVisible(false);
            objVistaCambiarContraRe.show();
        }
        if(ae.getSource()==objVistaCambiarContraRe.btnGuardarContraRe){
            objVistaCambiarContraRe.setVisible(false);
            objVistaPantRe.show();
        }
        if(ae.getSource()==objVistaCambiarContraRe.btnRegresar){
           objVistaCambiarContraRe.setVisible(false);
           objVistaPantRe.show();
        }
        
        
        //ACCIONAR BOTONES DE VENTANA PAGAR CON TARJETA
//        if(ae.getSource()==objVistaPantDT.btnConfirmarPago){
//            objVistaPantDT.setVisible(false);
//            
//        }
        
    }
    
    public void agregarClientes(){
        objClientes.setNombre(objVistaRegistroCl.txtRegistroNombreCliente.getText());
        objClientes.setApellido(objVistaRegistroCl.txtRegistroApellidoCliente.getText());
        objClientes.setCedula(objVistaRegistroCl.txtRegistroCedulaCliente.getText());
        objClientes.setCelular(objVistaRegistroCl.txtRegistroCelularCliente.getText());
        objClientes.setCorreo(objVistaRegistroCl.txtCorreoRegistroCliente.getText());
        objClientes.setContraseña(objVistaRegistroCl.pwContraseñaRegistroCliente.getText());
        objClientes.setDireccion(objVistaRegistroCl.txtDireccionRegistroCliente.getText());
        
        objetoClienDAO.guardarClientes(objClientes);
    }
    public void guardarPedidos(){
        
        objPedidos.setNombreCliente(objVistaHacerPed.txtNombreClientePedido.getText());
        objPedidos.setDescripcionPedido(objVistaHacerPed.txtDescripcionPedido.getText());
        objPedidos.setDireccionPedido(objVistaHacerPed.txtDireccionPedido.getText());
        objPedidos.setMetodoDePago(objVistaHacerPed.txtSeleccionado.getText());
        objetoPedDao.guardarPedidos(objPedidos);
    }
    public void agregarRepartidores(){
        objetoRepartidores.setNombre(objVistaRepartidor.txtNombreRepartidor.getText());
        objetoRepartidores.setApellido(objVistaRepartidor.txtApellidoRepartidor.getText());
        objetoRepartidores.setCedula(objVistaRepartidor.txtCedulaRepartidor.getText());
        objetoRepartidores.setNumeroDePlaca(objVistaRepartidor.txtNumeroPlacaRepartidor.getText());
        objetoRepartidores.setCorreo(objVistaRepartidor.txtCorreoRepartidor.getText());
        objetoRepartidores.setContraseña(objVistaRepartidor.pwContraseñaRepartidor.getText());
        objetoRepDAO.guardarRepartidores(objetoRepartidores);
    }
    
    public void llenarTabla(JTable tablaD)
    {
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Nombre del cliente:");
        modeloT.addColumn("Descripcion del pedido");
        modeloT.addColumn("Direccion del pedido");
        modeloT.addColumn("Metodo de pago");
        Object [] columna= new Object[4];
        int numReg= objetoPedDao.obtenerPedidos().size();
        for (int i=0; i<numReg; i++)
        {
            objPedidos= (Pedidos)objetoPedDao.obtenerPedidos().get(i);
            columna[0]= objPedidos.getNombreCliente();
            columna[1]=objPedidos.getDescripcionPedido();
            columna[2]=objPedidos.getDireccionPedido();
            columna[3]=objPedidos.getMetodoDePago();
            modeloT.addRow(columna);

        }
    }
    public void ficheroClientes(){

        String nombreArchivo= "Clientes";
        String carpeta= System.getProperty("user.dir");//toma la direccion en la que se va a alojar el archivo
        String direccionCompleta= carpeta +"/"+nombreArchivo+".txt";
        FileWriter ubicacion=null;
        try{

            ubicacion= new FileWriter(direccionCompleta);

        }catch(IOException ex){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,ex);
        }
        try{

            BufferedWriter escritor= new BufferedWriter(ubicacion);

            escritor.write(objVistaRegistroCl.txtCorreoRegistroCliente.getText()+"\n");
            escritor.write(objVistaRegistroCl.pwContraseñaRegistroCliente.getText()+"\n");
            escritor.write(objVistaRegistroCl.txtRegistroNombreCliente.getText()+"\n");
            escritor.write(objVistaRegistroCl.txtRegistroApellidoCliente.getText()+"\n");
            escritor.write(objVistaRegistroCl.txtRegistroCedulaCliente.getText()+"\n");
            escritor.write(objVistaRegistroCl.txtRegistroCelularCliente.getText()+"\n");
            escritor.write(objVistaRegistroCl.txtDireccionRegistroCliente.getText()+"\n");

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
                Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
            usuarios=new String[nLineas];
            while(sc.hasNextLine()){
                usuarios[i++]=sc.nextLine();
            }
            user = objVistaRegistroCl.txtCorreoRegistroCliente.getText();
            password= objVistaRegistroCl.pwContraseñaRegistroCliente.getText();
        }catch(FileNotFoundException ex){
            Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void validarIngresoCliente(){

        String nombreArchivo= "Clientes";
        String carpeta= System.getProperty("user.dir");//toma la direccion en la que se va a alojar el archivo
        String direccionCompleta= carpeta +"/"+nombreArchivo+".txt";
        FileWriter ubicacion=null;
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
                Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
            usuarios=new String[nLineas]; //tamaño del array
            while(sc.hasNextLine()){
                usuarios[i++]=sc.nextLine(); //almacenando cada linea en una posicion del arreglo
            }
            intentos++;
            user = objVistaLoginCl.txtLoginCorreoCliente.getText();
            password= objVistaLoginCl.pwLoginContraseñaCliente.getText();
            
            validarCliente(usuarios, user, password, intentos);
        }catch(FileNotFoundException ex){
            Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void validarCliente(String usuarios[],String user,String password,int intentos){
        boolean encontrado=false;
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i].equalsIgnoreCase(user)&&usuarios[i+1].equalsIgnoreCase(password)){
                res="Bienvenido "+user;
                encontrado=true;
                JOptionPane.showMessageDialog(null, res,"Inicio de Sesion cliente",JOptionPane.INFORMATION_MESSAGE);
                objVistaLoginCl.setVisible(false);
                objVistaPantCl.show();
               
                intentos=0;
                break;

                }
            }//fin para
            if(encontrado==false){
                res="Clave y/o usuarios erroneos "+intentos + " intentos fallidos";
                JOptionPane.showMessageDialog(null, res,"Inicio de Sesion",JOptionPane.INFORMATION_MESSAGE);
            }
            if(intentos>2){
                JOptionPane.showMessageDialog(null, "3 intentos fallidos, no podrá ingresa","Inicio de Sesion",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
    }
    public void ingresoUsuarioAdmin(){
        String usuario = this.objVistaLoginAd.txtLoginCorreoAdministrador.getText();
        String contraseña = this.objVistaLoginAd.pwLoginContraseñaAdministrador.getText();
        if(usuario.equals("Nando@hotmail.com")&&contraseña.equals("1234")){
            objVistaLoginAd.setVisible(false);
            objVistaPantAd.show();
        }
    }
    public void ficheroRepartidores(){
        String nombreArchivo= "Repartidores";
        String carpeta= System.getProperty("user.dir");//toma la direccion en la que se va a alojar el archivo
        String direccionCompleta= carpeta +"/"+nombreArchivo+".txt";
        FileWriter ubicacion=null;
        try{

            ubicacion= new FileWriter(direccionCompleta);

        }catch(IOException ex){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,ex);
        }
        try{

            BufferedWriter escritor= new BufferedWriter(ubicacion);

            escritor.write(objVistaRepartidor.txtCorreoRepartidor.getText()+"\n");
            escritor.write(objVistaRepartidor.pwContraseñaRepartidor.getText()+"\n");
            escritor.write(objVistaRepartidor.txtNombreRepartidor.getText()+"\n");
            escritor.write(objVistaRepartidor.txtApellidoRepartidor.getText()+"\n");
            escritor.write(objVistaRepartidor.txtCedulaRepartidor.getText()+"\n");
            escritor.write(objVistaRepartidor.txtNumeroPlacaRepartidor.getText()+"\n");
            

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
                Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
            usuarios=new String[nLineas];
            while(sc.hasNextLine()){
                usuarios[i++]=sc.nextLine();
            }
            user = objVistaRegistroCl.txtCorreoRegistroCliente.getText();
            password= objVistaRegistroCl.pwContraseñaRegistroCliente.getText();
        }catch(FileNotFoundException ex){
            Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void validarIngresoRepartidor(){
        String nombreArchivo= "Repartidores";
        String carpeta= System.getProperty("user.dir");//toma la direccion en la que se va a alojar el archivo
        String direccionCompleta= carpeta +"/"+nombreArchivo+".txt";
        FileWriter ubicacion=null;
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
                Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
            usuarios=new String[nLineas]; //tamaño del array
            while(sc.hasNextLine()){
                usuarios[i++]=sc.nextLine(); //almacenando cada linea en una posicion del arreglo
            }
            intentos++;
            user = objVistaLoginRe.txtLoginCorreoRepartidor.getText();
            password= objVistaLoginRe.pwLoginContraseñaRepartidor.getText();
            
            validarRepartidor(usuarios, user, password, intentos);
        }catch(FileNotFoundException ex){
            Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void validarRepartidor(String usuarios[],String user,String password,int intentos){
        boolean encontrado=false;
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i].equalsIgnoreCase(user)&&usuarios[i+1].equalsIgnoreCase(password)){
                res="Bienvenido "+user;
                encontrado=true;
                JOptionPane.showMessageDialog(null, res,"Inicio de Sesion Repartidor",JOptionPane.INFORMATION_MESSAGE);
                objVistaLoginRe.setVisible(false);
                objVistaPantRe.show();
               
                intentos=0;
                break;

                }
            }//fin para
            if(encontrado==false){
                res="Clave y/o usuarios erroneos "+intentos + " intentos fallidos";
                JOptionPane.showMessageDialog(null, res,"Inicio de Sesion",JOptionPane.INFORMATION_MESSAGE);
            }
            if(intentos>2){
                JOptionPane.showMessageDialog(null, "3 intentos fallidos, no podrá ingresa","Inicio de Sesion",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    public void ficheroDatosTarjeta(){
        String nombreArchivo= "Datos Tarjeta";
        String carpeta= System.getProperty("user.dir");//toma la direccion en la que se va a alojar el archivo
        String direccionCompleta= carpeta +"/"+nombreArchivo+".txt";
        FileWriter ubicacion=null;
        try{

            ubicacion= new FileWriter(direccionCompleta);

        }catch(IOException ex){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,ex);
        }
        try{

            BufferedWriter escritor= new BufferedWriter(ubicacion);

            escritor.write(objVistaPantDT.txtAñoVencimiento.getText()+"\n");
            escritor.write(objVistaPantDT.txtCodigoDeSeguridad.getText()+"\n");
            escritor.write(objVistaPantDT.txtCodigoPostal.getText()+"\n");
            escritor.write(objVistaPantDT.txtMesVencimiento.getText()+"\n");
            escritor.write(objVistaPantDT.txtNombreTitularTarjeta.getText()+"\n");
            escritor.write(objVistaPantDT.txtNumeroTarjeta.getText()+"\n");
            
            
            

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
                Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
            usuarios=new String[nLineas];
            while(sc.hasNextLine()){
                usuarios[i++]=sc.nextLine();
            }
            user = objVistaRegistroCl.txtCorreoRegistroCliente.getText();
            password= objVistaRegistroCl.pwContraseñaRegistroCliente.getText();
        }catch(FileNotFoundException ex){
            Logger.getLogger(FrmLoginGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
        
        
    
    
    
    
    
}
