package ProyectoHomeBanking;

import Metodo_sql.Metodos_sql;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ventana_Crear_Usuario extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("###,###,###,###.##");

    public Ventana_Crear_Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnGuardar.setEnabled(false);
        setTitle("DARKCODE PAY");
    }
    Metodos_sql metodos = new Metodos_sql();
    CBU modo = new CBU();
    Time time = new Time();

    public void validar() {

        if (txtDNI.getText().isEmpty()) {
            lblDNI.setText("* Campo obligatorio");
        } else {
            lblDNI.setText("");
        }

        if (txtNombre.getText().isEmpty()) {
            lblNombre.setText("* Campo obligatorio");
        } else {
            lblNombre.setText("");
        }

        if (txtApellido.getText().isEmpty()) {
            lblApellido.setText("* Campo obligatorio");
        } else {
            lblApellido.setText("");
        }

        if (txtUsuario.getText().isEmpty()) {
            lblUsuario.setText("* Campo obligatorio");
        } else {
            lblUsuario.setText("");
        }
        if (txtCorreo.getText().isEmpty()) {
            lblCorreo.setText("* Campo obligatorio");
        } else if (!txtCorreo.getText().contains("@") || !txtCorreo.getText().contains(".")) {
            lblCorreo.setText("* Correo inválido");
        } else {
            lblCorreo.setText("");
        }

        if (txtContraseña.getText().isEmpty()) {
            lblContraseña.setText("* Campo obligatorio");
        } else {
            lblContraseña.setText("");
        }

        if (txtDNI.getText().isEmpty() || txtApellido.getText().isEmpty() || txtNombre.getText().isEmpty() || txtUsuario.getText().isEmpty() || txtContraseña.getText().isEmpty() || txtCorreo.getText().isEmpty() || lblCorreo.getText().equals("* CORREO INVALIDO")) {
            btnGuardar.setEnabled(false);
        } else {
            btnGuardar.setEnabled(true);
        }
        Ventana_Crear_Usuario ol = new Ventana_Crear_Usuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        BtnAtras = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel13.setText("Repetir contraseña");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DARKCODE");
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel7.setText("Dni");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 120, 30));

        txtCorreo.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 250, -1));

        txtDNI.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        txtDNI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDNIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });
        jPanel2.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 250, -1));

        txtApellido.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 250, -1));

        txtNombre.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 250, -1));

        txtUsuario.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 250, -1));

        txtContraseña.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
        });
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 250, -1));

        BtnAtras.setBackground(new java.awt.Color(0, 102, 153));
        BtnAtras.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        BtnAtras.setForeground(new java.awt.Color(255, 255, 255));
        BtnAtras.setText("Volver");
        BtnAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAtras.setBorderPainted(false);
        BtnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAtrasMouseClicked(evt);
            }
        });
        jPanel2.add(BtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 111, 32));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 153));
        btnGuardar.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Crear");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 96, 32));

        jLabel12.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel12.setText("Apellido");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 120, 30));

        jLabel14.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel14.setText("Nombre");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 100, 30));

        jLabel15.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel15.setText("Usuario");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 120, 30));

        jLabel20.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel20.setText("Contraseña");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 120, 30));

        lblDNI.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 164, 20));

        jLabel16.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel16.setText("Correo");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 120, 33));

        lblApellido.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 164, 20));

        lblNombre.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 164, 20));

        lblUsuario.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 164, 20));

        lblCorreo.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 164, 20));

        lblContraseña.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 164, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crear_usuario.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 220));

        jLabel2.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Crea tu cuenta ahora");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        jLabel3.setText("Vive el futuro digital");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txtContraseñaKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String SaldoP = "1500000";
        String SaldoD = "1";
        String SaldoE = "1";
        String MontoFinal ="0";
        String Monto ="0";
        String Plazo ="0";
        String CA ="0";
        int i = metodos.guardar(txtDNI.getText(), txtApellido.getText(), txtNombre.getText(), txtUsuario.getText(), txtCorreo.getText(), txtContraseña.getText(), time.fechahora, modo.CBU, modo.CA, modo.CAD, modo.CBUD, modo.CBUE,modo.CAE);
        metodos.guardarSaldo(txtUsuario.getText(),SaldoP,SaldoD,SaldoE);
        metodos.guardarPlazofijo(time.fechahora,txtUsuario.getText(),Monto,Plazo,MontoFinal,CA);
        if (i > 0) {
            JOptionPane.showMessageDialog(this, "Datos Guardados Correctamente");
            Ventana_Inicio ventana = new Ventana_Inicio();
            ventana.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo guardar los datos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void BtnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAtrasMouseClicked
        // TODO add your handling code here:
        Ventana_Inicio VIN = new Ventana_Inicio();
        VIN.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnAtrasMouseClicked

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
        evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
        evt.consume();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
        evt.consume();
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txtDNIKeyReleased

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
            java.util.logging.Logger.getLogger(Ventana_Crear_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Crear_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Crear_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Crear_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Crear_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
