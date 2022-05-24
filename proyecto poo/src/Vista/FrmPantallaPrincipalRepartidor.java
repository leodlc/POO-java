/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario1
 */
public class FrmPantallaPrincipalRepartidor extends javax.swing.JFrame {

    /**
     * Creates new form FrmPantallaPrincipalRepartidor
     */
    public FrmPantallaPrincipalRepartidor() {
        initComponents();
        transparenciaBoton();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Fondo");
        setSize(720, 260);
        ImageIcon fondo = new ImageIcon("C:/Users/Usuario1/Documents/NetBeansProjects/GUIProyectoMongoApp/src/guiproyectomongoapp/Imagenes/prueba.png");
        Icon icono= new ImageIcon(fondo.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_DEFAULT));
        jLabel6.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVerPedido = new javax.swing.JButton();
        btnCambiarContraseñaRepartidor = new javax.swing.JButton();
        btnCerrarSesionRepartidor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel1.setText("Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btnVerPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/IconoHacerPedido.png"))); // NOI18N
        btnVerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, -1, -1));

        btnCambiarContraseñaRepartidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/IconoCambiarContraseña1.png"))); // NOI18N
        btnCambiarContraseñaRepartidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaRepartidorActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarContraseñaRepartidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 70, -1, -1));

        btnCerrarSesionRepartidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/CerrarSesion.png"))); // NOI18N
        btnCerrarSesionRepartidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionRepartidorActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesionRepartidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel2.setText("Ver pedido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel3.setText("Cambiar Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel4.setText("Cerrar sesión");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/prueba.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void transparenciaBoton(){
        btnVerPedido.setOpaque(false);
        btnVerPedido.setContentAreaFilled(false);
        btnVerPedido.setBorderPainted(false);
        btnCambiarContraseñaRepartidor.setOpaque(false);
        btnCambiarContraseñaRepartidor.setContentAreaFilled(false);
        btnCambiarContraseñaRepartidor.setBorderPainted(false);
        btnCerrarSesionRepartidor.setOpaque(false);
        btnCerrarSesionRepartidor.setContentAreaFilled(false);
        btnCerrarSesionRepartidor.setBorderPainted(false);
        
    }
    private void btnVerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidoActionPerformed
        // TODO add your handling code here:
        FrmListaPedidos ventanaLoginGeneral = new FrmListaPedidos();
        ventanaLoginGeneral.show();
        this.dispose();
    }//GEN-LAST:event_btnVerPedidoActionPerformed

    private void btnCambiarContraseñaRepartidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaRepartidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarContraseñaRepartidorActionPerformed

    private void btnCerrarSesionRepartidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionRepartidorActionPerformed
        // TODO add your handling code here:
        FrmLoginGeneral ventanaLoginGeneral = new FrmLoginGeneral();
        ventanaLoginGeneral.show();
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionRepartidorActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPantallaPrincipalRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipalRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipalRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPantallaPrincipalRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPantallaPrincipalRepartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarContraseñaRepartidor;
    private javax.swing.JButton btnCerrarSesionRepartidor;
    private javax.swing.JButton btnVerPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
