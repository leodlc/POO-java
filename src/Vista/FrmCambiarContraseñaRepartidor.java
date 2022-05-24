/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario1
 */
public class FrmCambiarContraseñaRepartidor extends javax.swing.JFrame {

    /**
     * Creates new form FrmCambiarContraseñaRepartidor
     */
    public FrmCambiarContraseñaRepartidor() {
        initComponents();
        transparenciaBoton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void transparenciaBoton(){
        btnRegresar.setOpaque(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pwContraseñaActualRepartidor = new javax.swing.JPasswordField();
        pwNuevaContraseñaRepartidor = new javax.swing.JPasswordField();
        btnGuardarContraRe = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        jLabel1.setText("Cambio de contraseña (Repartidor)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña actual:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, -1, 39));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel3.setText("Nueva contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 169, -1, 39));

        pwContraseñaActualRepartidor.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.add(pwContraseñaActualRepartidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 112, 266, 39));

        pwNuevaContraseñaRepartidor.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.add(pwNuevaContraseñaRepartidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 172, 266, 39));

        btnGuardarContraRe.setBackground(new java.awt.Color(51, 255, 51));
        btnGuardarContraRe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/save.png"))); // NOI18N
        btnGuardarContraRe.setText("Guardar");
        btnGuardarContraRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarContraReActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarContraRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 244, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/BotonRegrese1.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 279, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproyectomongoapp/Imagenes/prueba.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarContraReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarContraReActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Su contraseña se ha cambiado correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnGuardarContraReActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCambiarContraseñaRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCambiarContraseñaRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCambiarContraseñaRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCambiarContraseñaRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCambiarContraseñaRepartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardarContraRe;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pwContraseñaActualRepartidor;
    private javax.swing.JPasswordField pwNuevaContraseñaRepartidor;
    // End of variables declaration//GEN-END:variables
}
