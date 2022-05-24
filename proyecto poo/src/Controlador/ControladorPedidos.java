
package Controlador;

import Modelo.Pedidos;
import Modelo.PedidosDAO;
import Vista.FrmHacerPedido;
import Vista.FrmListaPedidos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario1
 */
public class ControladorPedidos implements ActionListener{
    PedidosDAO objetoDAO = new PedidosDAO();
    Pedidos objetoPedidos = new Pedidos();
    FrmHacerPedido objVista = new FrmHacerPedido();
    FrmListaPedidos objVista2 = new FrmListaPedidos();
    DefaultTableModel modelo;
    
    public ControladorPedidos(FrmHacerPedido v, FrmListaPedidos x){
        this.objVista = v;
        this.objVista.btnEnviarPedido.addActionListener(this);
        this.objVista2 = x;
        this.objVista2.btnActualizarLista.addActionListener(this);
    }
            
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==objVista.btnEnviarPedido){
            guardarPedidos();
        }   
        if (ae.getSource() == objVista2.btnActualizarLista) {
            llenarTabla(objVista2.jTable1);
        }
    }
    
    public void guardarPedidos(){
        
        objetoPedidos.setNombreCliente(objVista.txtNombreClientePedido.getText());
        objetoPedidos.setDescripcionPedido(objVista.txtDescripcionPedido.getText());
        objetoPedidos.setDireccionPedido(objVista.txtDireccionPedido.getText());
        objetoDAO.guardarPedidos(objetoPedidos);
    }
    
    public void llenarTabla(JTable tablaD)
    {
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Nombre del cliente:");
        modeloT.addColumn("Descripcion del pedido");
        modeloT.addColumn("Direccion del pedido");
        Object [] columna= new Object[3];
        int numReg= objetoDAO.obtenerPedidos().size();
        for (int i=0; i<numReg; i++)
        {
            objetoPedidos= (Pedidos)objetoDAO.obtenerPedidos().get(i);
            columna[0]= objetoPedidos.getNombreCliente();
            columna[1]=objetoPedidos.getDescripcionPedido();
            columna[2]=objetoPedidos.getDireccionPedido();
            modeloT.addRow(columna);

        }
    }
    
//    public void login(String correo, String contraseña) {
//        if (correo.equals("") && contraseña.equals("")) {
//            JOptionPane.showMessageDialog(null, "Datos no ingresados");
//        } else {
//            boolean correctCorreo, correctContra;
//            db = new MongoDBManager();
//            db.openConnection("Registry");
//            correctUser = db.verifyExistingData(userName,"Customers");
//            correctkey = db.verifyExistingData(password,"Customers");
//            if ((correctUser == true) && correctkey == true) {
//                Customer customer = new Customer();
//                customer.setCodeAppoinment(loginCustomer.txtUserName.getText());
//                loginCustomer.txtUserName.setText("");
//                loginCustomer.txpPassword.setText("");
//                hide();
//                CustomerMenu customerMenu;
//                customerMenu = new CustomerMenu();
//                CustomerMenuControl customerMenuControl;
//
//
//                customerMenuControl = new CustomerMenuControl(customerMenu);
//            } else {
//                loginCustomer.txtUserName.setText("");
//                loginCustomer.txpPassword.setText("");
//                JOptionPane.showMessageDialog(null, " Usuario o contaseña no existente \n\t Intente de nuevo");
//            }
//        }
//    }
    
}
