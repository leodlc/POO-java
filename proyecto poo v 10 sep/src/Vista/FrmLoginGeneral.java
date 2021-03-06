
package Vista;
import Controlador.ControladorClientes;
import Controlador.ControladorGeneral;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Usuario1
 */
public class FrmLoginGeneral extends javax.swing.JFrame {
    /**
     * Creates new form LoginGeneral
     */
    private ControladorGeneral controlaC;
    public void setControlaC(ControladorGeneral controlaC) {
        this.controlaC = controlaC;
    }
    


    

    
    public FrmLoginGeneral() {
        
        initComponents();
        transparenciaBoton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegistroCliente = new javax.swing.JButton();
        btnIngresoAdmin = new javax.swing.JButton();
        btnIngresoRepartidor = new javax.swing.JButton();
        btnIngresarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        jLabel2.setText("Bienvenido a ExpressPlaneta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistroCliente.setBackground(new java.awt.Color(204, 255, 153));
        btnRegistroCliente.setText("??Eres un nuevo cliente? Registrate ahora!");
        btnRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        btnIngresoAdmin.setBackground(new java.awt.Color(102, 255, 153));
        btnIngresoAdmin.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnIngresoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/IconoAdministrador.png"))); // NOI18N
        btnIngresoAdmin.setText("Ingresar como administrador");
        btnIngresoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 330, -1));

        btnIngresoRepartidor.setBackground(new java.awt.Color(102, 255, 153));
        btnIngresoRepartidor.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnIngresoRepartidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/IconoRepartidor.png"))); // NOI18N
        btnIngresoRepartidor.setText("Ingresar como Repartidor");
        btnIngresoRepartidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoRepartidorActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresoRepartidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 330, -1));

        btnIngresarCliente.setBackground(new java.awt.Color(102, 255, 153));
        btnIngresarCliente.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnIngresarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/IconoCliente.png"))); // NOI18N
        btnIngresarCliente.setText("Ingresar como Cliente");
        btnIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/LoginGeneral1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void transparenciaBoton(){
//        btnIngresarCliente.setOpaque(false);
//        btnIngresarCliente.setContentAreaFilled(false);
//        btnIngresarCliente.setBorderPainted(false);
        
    }
    private void btnIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarClienteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnIngresarClienteActionPerformed

    private void btnIngresoRepartidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoRepartidorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnIngresoRepartidorActionPerformed

    private void btnIngresoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoAdminActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnIngresoAdminActionPerformed

    private void btnRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroClienteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnRegistroClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLoginGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoginGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoginGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoginGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLoginGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresarCliente;
    public javax.swing.JButton btnIngresoAdmin;
    public javax.swing.JButton btnIngresoRepartidor;
    public javax.swing.JButton btnRegistroCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    


 




}
