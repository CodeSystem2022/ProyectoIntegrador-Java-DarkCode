package ProyectoHomeBanking;

import Metodo_sql.Metodos_Saldo_sql;
import Metodo_sql.Metodos_sql;
import Metodo_sql.Saldos;
import javax.swing.JOptionPane;

public class Ventana_Pagos_CTNET extends javax.swing.JFrame {

    Metodos_sql metodo = new Metodos_sql();
    ModeloTransferencia mod = General.modelotransferencia;
    Metodos_Saldo_sql metodos = new Metodos_Saldo_sql();
    Saldos sa = new Saldos();
    Time tiempo = new Time();

    public Ventana_Pagos_CTNET() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PAGOS");
        Time tiempo = new Time();
        lbtiempo.setText(tiempo.fechahora2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        panelRound6 = new ProyectoHomeBanking.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        VOLVER1 = new javax.swing.JButton();
        pagar2 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblCTNET = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        panelRound9 = new ProyectoHomeBanking.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        CHECK_PAGO1 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        panelRound1 = new ProyectoHomeBanking.PanelRound();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lbtiempo = new javax.swing.JLabel();
        panelRound10 = new ProyectoHomeBanking.PanelRound();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setSize(new java.awt.Dimension(850, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ctnet.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 124, 114));

        panelRound6.setBackground(new java.awt.Color(0, 102, 153));
        panelRound6.setRoundBottomLeft(50);
        panelRound6.setRoundBottomRight(50);
        panelRound6.setRoundTopLeft(50);
        panelRound6.setRoundTopRight(50);
        panelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SALDO A PAGAR");
        panelRound6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 394, 228, -1));

        jLabel29.setFont(new java.awt.Font("Imprint MT Shadow", 0, 8)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        panelRound6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        VOLVER1.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        VOLVER1.setText("Volver");
        VOLVER1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VOLVER1.setBorderPainted(false);
        VOLVER1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVER1ActionPerformed(evt);
            }
        });
        panelRound6.add(VOLVER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 124, 37));

        pagar2.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        pagar2.setText("Pagar");
        pagar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pagar2.setBorderPainted(false);
        pagar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar2ActionPerformed(evt);
            }
        });
        panelRound6.add(pagar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 124, 37));

        jLabel33.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("5800");
        panelRound6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 60, 20));

        jLabel34.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("5800");
        panelRound6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 60, 20));

        lblCTNET.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        lblCTNET.setForeground(new java.awt.Color(255, 255, 255));
        lblCTNET.setText("5800");
        panelRound6.add(lblCTNET, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 60, 20));

        jLabel36.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("01/11/2022");
        panelRound6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 90, -1));

        jLabel37.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("01/12/2022");
        panelRound6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 90, -1));

        jLabel38.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("01/10/2022");
        panelRound6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 90, -1));

        panelRound9.setBackground(new java.awt.Color(255, 255, 255));
        panelRound9.setRoundBottomLeft(30);
        panelRound9.setRoundBottomRight(30);
        panelRound9.setRoundTopLeft(30);
        panelRound9.setRoundTopRight(30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ctn1.png"))); // NOI18N

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound9Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        panelRound6.add(panelRound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 290, 230));

        CHECK_PAGO1.setBackground(new java.awt.Color(0, 153, 255));
        CHECK_PAGO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECK_PAGO1ActionPerformed(evt);
            }
        });
        panelRound6.add(CHECK_PAGO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("VENCIMIENTOS");
        panelRound6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, -1));

        jLabel13.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("IMPORTE");
        panelRound6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, -1));

        jLabel14.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("FECHA DE VTO");
        panelRound6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 100, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ESTADO DE PAGO");
        panelRound6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 110, -1));

        jLabel28.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 255, 51));
        jLabel28.setText("PAGADO");
        panelRound6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 70, -1));

        jLabel27.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 255, 102));
        jLabel27.setText("PAGADO");
        panelRound6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 70, -1));

        jLabel26.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setText("VENCIDO");
        panelRound6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 70, -1));

        getContentPane().add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 810, 270));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-computer-icons-clip-art-profile-cliparts-free-5ab5a47b474ac4.304549771521853563292.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre y Apellido");

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

        panelRound10.setBackground(new java.awt.Color(0, 102, 153));
        panelRound10.setRoundBottomLeft(50);
        panelRound10.setRoundBottomRight(50);
        panelRound10.setRoundTopLeft(50);
        panelRound10.setRoundTopRight(50);
        panelRound10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("NUMERO DE CLIENTE");
        panelRound10.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 63, 170, -1));

        jLabel44.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("SALDO A PAGAR");
        panelRound10.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 122, 228, -1));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHECK_PAGO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECK_PAGO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHECK_PAGO1ActionPerformed

    private void pagar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar2ActionPerformed
        double pagoaysam = Double.parseDouble(lblCTNET.getText());
        double mostrar_saldo = Double.parseDouble(metodos.buscarSaldoP(mod.getUsuario()));
        String AYSAM = "0";
        String ECOGAS = "0";
        String EDEMSA = "0";

        if (CHECK_PAGO.isSelected()) {

            if (mostrar_saldo >= pagoaysam) {

                metodos.guardarPagos(mod.getUsuario(), tiempo.fechahora, AYSAM, lblCTNET.getText(), ECOGAS, EDEMSA);
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
    }//GEN-LAST:event_pagar2ActionPerformed

    private void VOLVER1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVER1ActionPerformed
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Pagos ventana = new Ventana_Pagos();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_VOLVER1ActionPerformed
    static {
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos_CTNET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos_CTNET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos_CTNET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos_CTNET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Pagos_CTNET().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CHECK_PAGO1;
    private javax.swing.JButton VOLVER1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCTNET;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lbtiempo;
    private javax.swing.JButton pagar2;
    private ProyectoHomeBanking.PanelRound panelRound1;
    private ProyectoHomeBanking.PanelRound panelRound10;
    private ProyectoHomeBanking.PanelRound panelRound6;
    private ProyectoHomeBanking.PanelRound panelRound9;
    // End of variables declaration//GEN-END:variables

    private static class checkpago {

        private static boolean isSelected() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public checkpago() {
        }
    }

    private static class CHECK_PAGO {

        private static boolean isSelected() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public CHECK_PAGO() {
        }
    }
}
