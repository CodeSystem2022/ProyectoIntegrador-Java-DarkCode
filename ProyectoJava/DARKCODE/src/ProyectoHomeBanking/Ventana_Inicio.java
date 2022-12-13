package ProyectoHomeBanking;

import Metodo_sql.Metodos_Saldo_sql;
import Metodo_sql.Metodos_sql;
import ProyectoHomeBankingEN.*;
import ProyectoHomeBankingCH.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Ventana_Inicio extends javax.swing.JFrame {

    Metodos_sql metodos = new Metodos_sql();
    Metodo_sql.Metodos_Saldo_sql SAL = new Metodos_Saldo_sql();
    Time time = new Time();
    DecimalFormat df = new DecimalFormat("###,###,###,###.##");
    
   
   
    public Ventana_Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("DARKCODE PAY");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jmostrar = new javax.swing.JCheckBox();
        BtnEresNuevo = new javax.swing.JButton();
        BtnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnenglish = new javax.swing.JButton();
        btnchinese = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DARKCODE");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUsuario.setOpaque(true);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 240, 30));

        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("**********");
        txtPassword.setToolTipText("");
        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPassword.setOpaque(true);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 240, 30));

        jmostrar.setBackground(new java.awt.Color(255, 255, 255));
        jmostrar.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jmostrar.setText("Mostrar");
        jmostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmostrarMouseClicked(evt);
            }
        });
        jmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 90, 20));

        BtnEresNuevo.setBackground(new java.awt.Color(0, 102, 153));
        BtnEresNuevo.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        BtnEresNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BtnEresNuevo.setText("Crear cuenta");
        BtnEresNuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEresNuevo.setBorderPainted(false);
        BtnEresNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEresNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEresNuevoMouseClicked(evt);
            }
        });
        jPanel1.add(BtnEresNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 110, 30));

        BtnIngresar.setBackground(new java.awt.Color(0, 102, 153));
        BtnIngresar.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        BtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setText("Ingresar");
        BtnIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnIngresar.setBorderPainted(false);
        BtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
        });
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 160, 40));

        jLabel3.setFont(new java.awt.Font("Krungthep", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("DarkCode Pay");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginginicio.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 710, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Krungthep", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("PREPARATE PARA LA NUEVA EXPERIENCIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("¿No tienes cuenta?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Hola, ingresa a tu cuenta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Selecciona idioma");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        btnenglish.setBackground(new java.awt.Color(0, 102, 153));
        btnenglish.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnenglish.setForeground(new java.awt.Color(255, 255, 255));
        btnenglish.setText("English");
        btnenglish.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnenglish.setBorderPainted(false);
        btnenglish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnenglishMouseClicked(evt);
            }
        });
        btnenglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenglishActionPerformed(evt);
            }
        });
        jPanel1.add(btnenglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 90, -1));

        btnchinese.setBackground(new java.awt.Color(0, 102, 153));
        btnchinese.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnchinese.setForeground(new java.awt.Color(255, 255, 255));
        btnchinese.setText("简体中文");
        btnchinese.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnchinese.setBorderPainted(false);
        btnchinese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchineseActionPerformed(evt);
            }
        });
        jPanel1.add(btnchinese, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 90, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 120, 0));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed

        if (txtUsuario.getText().equals("Ingrese su nombre de usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.BLACK);
        }
        if (String.valueOf(txtPassword.getText()).isEmpty()) {
            txtPassword.setText("**********");
            txtPassword.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        // TODO add your handling code here:
        if (String.valueOf(txtPassword.getText()).equals("**********")) {
            txtPassword.setText("");
            txtPassword.setForeground(Color.BLACK);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPasswordMousePressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (String.valueOf(txtPassword.getText()).equals("**********")) {
            txtPassword.setText("");
            txtPassword.setForeground(Color.BLACK);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void jmostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmostrarMouseClicked

        if (jmostrar.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jmostrarMouseClicked

    private void jmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmostrarActionPerformed

    private void BtnEresNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEresNuevoMouseClicked
        // TODO add your handling code here:
        Ventana_Crear_Usuario VNU = new Ventana_Crear_Usuario();
        VNU.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnEresNuevoMouseClicked

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked
        // TODO add your handling code here:

        String busqueda_usuarios = metodos.buscarUsarioRegistrado(txtUsuario.getText(), txtPassword.getText());
        if (txtUsuario.getText().equals("root") && txtPassword.getText().equals("root")) {
            //JOptionPane.showMessageDialog(this, "DEVELOPER MODE");
            Ventana_MenuInicio ventana = new Ventana_MenuInicio();
            ventana.lblNombre.setText("DEVELOPER MODE");
            ventana.setVisible(true);
            this.dispose();
        } else if (busqueda_usuarios.equals("Usuario encontrado")) {
            String busqueda_nombre = metodos.buscarNombre(txtUsuario.getText());
            metodos.updateDatos(time.fechahora, txtUsuario.getText());
            Ventana_MenuInicio ventana = new Ventana_MenuInicio();
            ModeloTransferencia modelo = General.modelotransferencia;
            modelo.setUsuario(txtUsuario.getText());
            //Mostrar caja de ahorro en pesos y saldo
            double mostrar_saldoP = Double.parseDouble(SAL.buscarSaldoP(modelo.getUsuario()));
            ventana.CA.setText("CA: " + metodos.buscarCa(modelo.getUsuario()));
            ventana.lblMostrarsaldoP.setText("ARS $: " + String.valueOf(df.format(mostrar_saldoP)));
            //Mostrar caja de ahorro en dolares y saldo
            double mostrar_saldoD = Double.parseDouble(SAL.buscarSaldoD(modelo.getUsuario()));
            ventana.CAD.setText("CAD: " + metodos.buscarCad(modelo.getUsuario()));
            ventana.lblMostrarsaldoD.setText("U$D: " + String.valueOf(df.format(mostrar_saldoD)));
            //Mostrar caja de ahorro en euro y saldo
            double mostrar_saldoE = Double.parseDouble(SAL.buscarSaldoE(modelo.getUsuario()));
            ventana.CAE.setText("CAE: " + metodos.buscarCaE(modelo.getUsuario()));
            ventana.lblMostrarsaldoE.setText("€: " + String.valueOf(df.format(mostrar_saldoE)));

            ventana.lblNombre.setText("Bienvenido: " + busqueda_nombre);
            ventana.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Crea una cuenta, es gratis");
        }
    }//GEN-LAST:event_BtnIngresarMouseClicked


    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed

    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String busqueda_usuarios = metodos.buscarUsarioRegistrado(txtUsuario.getText(), txtPassword.getText());
            if (txtUsuario.getText().equals("root") && txtPassword.getText().equals("root")) {
                //JOptionPane.showMessageDialog(this, "DEVELOPER MODE");
                Ventana_MenuInicio ventana = new Ventana_MenuInicio();
                ventana.lblNombre.setText("DEVELOPER MODE");
                ventana.setVisible(true);
                this.dispose();
            } else if (busqueda_usuarios.equals("Usuario encontrado")) {
                String busqueda_nombre = metodos.buscarNombre(txtUsuario.getText());
                metodos.updateDatos(time.fechahora, txtUsuario.getText());

                Ventana_MenuInicio ventana = new Ventana_MenuInicio();
                ModeloTransferencia modelo = General.modelotransferencia;
                modelo.setUsuario(txtUsuario.getText());
                //Mostrar caja de ahorro en pesos y saldo
                double mostrar_saldoP = Double.parseDouble(SAL.buscarSaldoP(modelo.getUsuario()));
                ventana.CA.setText("CA: " + metodos.buscarCa(modelo.getUsuario()));
                ventana.lblMostrarsaldoP.setText("ARS $: " + String.valueOf(df.format(mostrar_saldoP)));
                //Mostrar caja de ahorro en dolares y saldo
                double mostrar_saldoD = Double.parseDouble(SAL.buscarSaldoD(modelo.getUsuario()));
                ventana.CAD.setText("CAD: " + metodos.buscarCad(modelo.getUsuario()));
                ventana.lblMostrarsaldoD.setText("U$D: " + String.valueOf(df.format(mostrar_saldoD)));
                //Mostrar caja de ahorro en euro y saldo
                double mostrar_saldoE = Double.parseDouble(SAL.buscarSaldoE(modelo.getUsuario()));
                ventana.CAE.setText("CAE: " + metodos.buscarCaE(modelo.getUsuario()));
                ventana.lblMostrarsaldoE.setText("€: " + String.valueOf(df.format(mostrar_saldoE)));
                ventana.lblNombre.setText("Bienvenido: " + busqueda_nombre);
                ventana.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Puede crear un usuario nuevo");

            }
    }//GEN-LAST:event_txtPasswordKeyReleased
    }

    private void btnenglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenglishActionPerformed

    }//GEN-LAST:event_btnenglishActionPerformed

    private void btnenglishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenglishMouseClicked
        // TODO add your handling code here:
        Window_Login window = new Window_Login();
        window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnenglishMouseClicked

    private void btnchineseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchineseActionPerformed
        // TODO add your handling code here:
        Ventana_InicioCH ventana = new Ventana_InicioCH();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnchineseActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ventana_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEresNuevo;
    private javax.swing.JButton BtnIngresar;
    public javax.swing.JButton btnchinese;
    public javax.swing.JButton btnenglish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JCheckBox jmostrar;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables


}
