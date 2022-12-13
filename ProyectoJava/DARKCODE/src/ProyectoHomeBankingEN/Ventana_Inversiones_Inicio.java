package ProyectoHomeBankingEN;

import Metodo_sql.Metodos_Saldo_sql;
import Metodo_sql.Metodos_sql;
import java.text.DecimalFormat;

public class Ventana_Inversiones_Inicio extends javax.swing.JFrame {

    Metodos_sql metodo = new Metodos_sql();
    ModeloTransferencia mod = General.modelotransferencia;
    Metodos_Saldo_sql saldos = new Metodos_Saldo_sql();
    DecimalFormat df = new DecimalFormat("###,###,###,###.##");

    public Ventana_Inversiones_Inicio() {
        setTitle("INVESTMENTS");

        initComponents();
        setLocationRelativeTo(null);
        Time tiempo = new Time();
        lbtiempo.setText(tiempo.fechahora2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lbtiempo = new javax.swing.JLabel();
        btnplazofijo = new javax.swing.JButton();
        btnfondos = new javax.swing.JButton();
        btnmoneda = new javax.swing.JButton();
        btncripto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnvolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inver..png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(286, 84));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-computer-icons-clip-art-profile-cliparts-free-5ab5a47b474ac4.304549771521853563292.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Name and Surname");

        lbtiempo.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        lbtiempo.setForeground(new java.awt.Color(255, 255, 255));
        lbtiempo.setText("Date/Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbtiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        btnplazofijo.setBackground(new java.awt.Color(0, 102, 153));
        btnplazofijo.setFont(new java.awt.Font("Krungthep", 1, 13)); // NOI18N
        btnplazofijo.setForeground(new java.awt.Color(255, 255, 255));
        btnplazofijo.setText("Time deposit");
        btnplazofijo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnplazofijo.setBorderPainted(false);
        btnplazofijo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnplazofijo.setIconTextGap(15);
        btnplazofijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplazofijoActionPerformed(evt);
            }
        });

        btnfondos.setBackground(new java.awt.Color(0, 102, 153));
        btnfondos.setFont(new java.awt.Font("Krungthep", 1, 13)); // NOI18N
        btnfondos.setForeground(new java.awt.Color(255, 255, 255));
        btnfondos.setText("Funds");
        btnfondos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnfondos.setBorderPainted(false);
        btnfondos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnfondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfondosActionPerformed(evt);
            }
        });

        btnmoneda.setBackground(new java.awt.Color(0, 102, 153));
        btnmoneda.setFont(new java.awt.Font("Krungthep", 1, 13)); // NOI18N
        btnmoneda.setForeground(new java.awt.Color(255, 255, 255));
        btnmoneda.setText("Currency exchange");
        btnmoneda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnmoneda.setBorderPainted(false);
        btnmoneda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmonedaActionPerformed(evt);
            }
        });

        btncripto.setBackground(new java.awt.Color(0, 102, 153));
        btncripto.setFont(new java.awt.Font("Krungthep", 1, 13)); // NOI18N
        btncripto.setForeground(new java.awt.Color(255, 255, 255));
        btncripto.setText("Criptocurrency");
        btncripto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btncripto.setBorderPainted(false);
        btncripto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncriptoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Choose the best ");

        jLabel6.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("INVESTMENT OPPORTUNITY");

        btnvolver.setBackground(new java.awt.Color(0, 102, 153));
        btnvolver.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        btnvolver.setForeground(new java.awt.Color(255, 255, 255));
        btnvolver.setText("Back");
        btnvolver.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnvolver.setBorderPainted(false);
        btnvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addComponent(btnfondos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnplazofijo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(btnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmoneda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncripto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnplazofijo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addGap(33, 157, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnfondos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncripto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnvolver)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnplazofijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplazofijoActionPerformed
       
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Inversion_PlazoFijo ventana = new Ventana_Inversion_PlazoFijo();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnplazofijoActionPerformed

    private void btnmonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmonedaActionPerformed
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Inversion_Cambio v = new Ventana_Inversion_Cambio();
        v.lblNombre.setText(busqueda_nombre);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnmonedaActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Window_MENU ventana = new Window_MENU();

        //Mostrar caja de ahorro en pesos y saldo
        double mostrar_saldoP = Double.parseDouble(saldos.buscarSaldoP(mod.getUsuario()));
        ventana.CA.setText("CA: " + metodo.buscarCa(mod.getUsuario()));
        ventana.lblMostrarsaldoP.setText("ARS $: " + String.valueOf(df.format(mostrar_saldoP)));
        //Mostrar caja de ahorro en dolares y saldo
        double mostrar_saldoD = Double.parseDouble(saldos.buscarSaldoD(mod.getUsuario()));
        ventana.CAD.setText("CAD: " + metodo.buscarCad(mod.getUsuario()));
        ventana.lblMostrarsaldoD.setText("U$D: " + String.valueOf(df.format(mostrar_saldoD)));
        //Mostrar caja de ahorro en euro y saldo
        double mostrar_saldoE = Double.parseDouble(saldos.buscarSaldoE(mod.getUsuario()));
        ventana.CAE.setText("CAE: " + metodo.buscarCaE(mod.getUsuario()));
        ventana.lblMostrarsaldoE.setText("€: " + String.valueOf(df.format(mostrar_saldoE)));

        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnfondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfondosActionPerformed
        // TODO add your handling code here:
        Ventana_Inversiones_Extra extra = new Ventana_Inversiones_Extra();
        extra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnfondosActionPerformed

    private void btncriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncriptoActionPerformed
        // TODO add your handling code here:
        Ventana_Inversiones_Extra extra = new Ventana_Inversiones_Extra();
        extra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncriptoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Inversiones_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inversiones_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inversiones_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inversiones_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ventana_Inversiones_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncripto;
    private javax.swing.JButton btnfondos;
    private javax.swing.JButton btnmoneda;
    private javax.swing.JButton btnplazofijo;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lbtiempo;
    // End of variables declaration//GEN-END:variables
}
