package ProyectoHomeBankingCH;


import Metodo_sql.Metodos_Saldo_sql;
import Metodo_sql.Metodos_sql;
import Metodo_sql.Saldos;
import javax.swing.JOptionPane;

public class Ventana_Pagos_AYSAM extends javax.swing.JFrame {

    Metodos_sql metodo = new Metodos_sql();
    ModeloTransferencia mod = General.modelotransferencia;
    Metodos_Saldo_sql metodos = new Metodos_Saldo_sql();
    Saldos sa = new Saldos();
    Time tiempo = new Time();
    

    public Ventana_Pagos_AYSAM() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PAGOS");
        lbtiempo.setText(tiempo.fechahora2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Cancelar_Pago = new javax.swing.JButton();
        pagar = new javax.swing.JButton();
        cliente = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        panelRound3 = new ProyectoHomeBanking.PanelRound();
        panelRound5 = new ProyectoHomeBanking.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        VOLVER = new javax.swing.JButton();
        pagar1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblaysampago = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        CHECK_PAGO = new javax.swing.JCheckBox();
        panelRound8 = new ProyectoHomeBanking.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        panelRound7 = new ProyectoHomeBanking.PanelRound();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lbtiempo = new javax.swing.JLabel();

        jLabel2.setText("SALDO A PAGAR");

        Cancelar_Pago.setText("CANCELAR");
        Cancelar_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_PagoActionPerformed(evt);
            }
        });

        pagar.setText("PAGAR");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });

        cliente.setText("jTextField1");

        saldo.setText("jTextField1");

        jLabel3.setText("NUMERO DE CLIENTE");

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound5.setBackground(new java.awt.Color(0, 102, 153));
        panelRound5.setRoundBottomLeft(50);
        panelRound5.setRoundBottomRight(50);
        panelRound5.setRoundTopLeft(50);
        panelRound5.setRoundTopRight(50);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SALDO A PAGAR");
        panelRound5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 394, 228, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTADO DE PAGO");
        panelRound5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Imprint MT Shadow", 0, 8)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        panelRound5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("IMPORTE");
        panelRound5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, 20));

        jLabel14.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("FECHA DE VTO");
        panelRound5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        VOLVER.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        VOLVER.setText("Volver");
        VOLVER.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VOLVER.setBorderPainted(false);
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });
        panelRound5.add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 124, 37));

        pagar1.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        pagar1.setText("Pagar");
        pagar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pagar1.setBorderPainted(false);
        pagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar1ActionPerformed(evt);
            }
        });
        panelRound5.add(pagar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 124, 37));

        jLabel19.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("VENCIMIENTOS");
        panelRound5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("1200");
        panelRound5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 70, 20));

        jLabel21.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("1500");
        panelRound5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 70, 20));

        lblaysampago.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        lblaysampago.setForeground(new java.awt.Color(255, 255, 255));
        lblaysampago.setText("1300");
        panelRound5.add(lblaysampago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 70, 20));

        jLabel23.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("01/11/2022");
        panelRound5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel24.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("01/12/2022");
        panelRound5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel25.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("01/10/2022");
        panelRound5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel26.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setText("VENCIDO");
        panelRound5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel27.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 255, 102));
        jLabel27.setText("PAGADO");
        panelRound5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel28.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 255, 51));
        jLabel28.setText("PAGADO");
        panelRound5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        CHECK_PAGO.setBackground(new java.awt.Color(102, 153, 255));
        CHECK_PAGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECK_PAGOActionPerformed(evt);
            }
        });
        panelRound5.add(CHECK_PAGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 30, 20));

        panelRound8.setBackground(new java.awt.Color(255, 255, 255));
        panelRound8.setRoundBottomLeft(30);
        panelRound8.setRoundBottomRight(30);
        panelRound8.setRoundTopLeft(30);
        panelRound8.setRoundTopRight(30);
        panelRound8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agua1.png"))); // NOI18N
        panelRound8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        panelRound5.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 300, 240));

        panelRound3.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 810, 270));

        panelRound7.setBackground(new java.awt.Color(0, 102, 153));
        panelRound7.setRoundBottomLeft(50);
        panelRound7.setRoundBottomRight(50);
        panelRound7.setRoundTopLeft(50);
        panelRound7.setRoundTopRight(50);
        panelRound7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NUMERO DE CLIENTE");
        panelRound7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 63, 170, -1));

        jLabel16.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("SALDO A PAGAR");
        panelRound7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 122, 228, -1));

        panelRound3.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 810, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aysam.png"))); // NOI18N
        panelRound3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, -1));

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-computer-icons-clip-art-profile-cliparts-free-5ab5a47b474ac4.304549771521853563292.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre y Apeliido");

        lbtiempo.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        lbtiempo.setForeground(new java.awt.Color(255, 255, 255));
        lbtiempo.setText("Fecha/Hora");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lbtiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbtiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        panelRound3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        getContentPane().add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancelar_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_PagoActionPerformed
        Ventana_Pagos ventana = new Ventana_Pagos();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Cancelar_PagoActionPerformed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagarActionPerformed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Pagos ventana = new Ventana_Pagos();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VOLVERActionPerformed

    private void pagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar1ActionPerformed

        double pagoaysam = Double.parseDouble(lblaysampago.getText());
        double mostrar_saldo = Double.parseDouble(metodos.buscarSaldoP(mod.getUsuario()));
        String CTNET = "0";
        String ECOGAS = "0";
        String EDEMSA = "0";

        if (CHECK_PAGO.isSelected()) {

            if (mostrar_saldo >= pagoaysam) {

                metodos.guardarPagos(mod.getUsuario(), tiempo.fechahora, lblaysampago.getText(), CTNET, ECOGAS, EDEMSA);
                sa.pagos(mostrar_saldo, pagoaysam);
                String saldo = String.valueOf(sa.pagos(mostrar_saldo, pagoaysam));
                metodos.updateSaldo(saldo, mod.getUsuario());
            }
            JOptionPane.showMessageDialog(null, "Su pago fue realizado");
            Ventana_Pagos ventana = new Ventana_Pagos();
            ventana.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar para pagar");
        }
    }//GEN-LAST:event_pagar1ActionPerformed

    private void CHECK_PAGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECK_PAGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHECK_PAGOActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Pagos_AYSAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos_AYSAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos_AYSAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos_AYSAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Ventana_Pagos_AYSAM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CHECK_PAGO;
    private javax.swing.JButton Cancelar_Pago;
    private javax.swing.JButton VOLVER;
    private javax.swing.JTextField cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblaysampago;
    private javax.swing.JLabel lbtiempo;
    private javax.swing.JButton pagar;
    private javax.swing.JButton pagar1;
    private ProyectoHomeBanking.PanelRound panelRound3;
    private ProyectoHomeBanking.PanelRound panelRound5;
    private ProyectoHomeBanking.PanelRound panelRound7;
    private ProyectoHomeBanking.PanelRound panelRound8;
    private javax.swing.JTextField saldo;
    // End of variables declaration//GEN-END:variables
}
