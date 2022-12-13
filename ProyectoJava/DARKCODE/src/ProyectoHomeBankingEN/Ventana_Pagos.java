package ProyectoHomeBankingEN;

import Metodo_sql.Metodos_Saldo_sql;
import ProyectoHomeBanking.*;
import Metodo_sql.Metodos_sql;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import javax.swing.JPanel;

public class Ventana_Pagos extends javax.swing.JFrame {

    private Object frame;
    Metodos_sql metodo = new Metodos_sql();
    ModeloTransferencia mod = General.modelotransferencia;
    String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
    DecimalFormat df = new DecimalFormat("###,###,###,###.##");
    Metodos_Saldo_sql saldos = new Metodos_Saldo_sql();

    public Ventana_Pagos() {
        initComponents();

        setLocationRelativeTo(null); // Para centralizar la ventana 
        setTitle("PAYMENTS");
        Time tiempo = new Time();
        lbtiempo.setText(tiempo.fechahora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelRound3 = new ProyectoHomeBanking.PanelRound();
        EDEMSA = new javax.swing.JButton();
        CTNET = new javax.swing.JButton();
        AYSAM = new javax.swing.JButton();
        ECOGAS = new javax.swing.JButton();
        panelRound2 = new ProyectoHomeBanking.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lbtiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(850, 550));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(0, 153, 204)));
        Fondo.setMinimumSize(new java.awt.Dimension(850, 550));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(0, 102, 153));
        btnVolver.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Back");
        btnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.setBorderPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        Fondo.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 120, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 87, -1, -1));

        panelRound3.setBackground(new java.awt.Color(204, 204, 204));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EDEMSA.setBackground(new java.awt.Color(0, 102, 153));
        EDEMSA.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        EDEMSA.setForeground(new java.awt.Color(255, 255, 255));
        EDEMSA.setText("EDEMSA");
        EDEMSA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EDEMSA.setBorderPainted(false);
        EDEMSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDEMSAActionPerformed(evt);
            }
        });
        panelRound3.add(EDEMSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 110, 103));

        CTNET.setBackground(new java.awt.Color(0, 102, 153));
        CTNET.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        CTNET.setForeground(new java.awt.Color(255, 255, 255));
        CTNET.setText("CTNET");
        CTNET.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CTNET.setBorderPainted(false);
        CTNET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTNETActionPerformed(evt);
            }
        });
        panelRound3.add(CTNET, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 110, 103));

        AYSAM.setBackground(new java.awt.Color(0, 102, 153));
        AYSAM.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        AYSAM.setForeground(new java.awt.Color(255, 255, 255));
        AYSAM.setText("AYSAM");
        AYSAM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AYSAM.setBorderPainted(false);
        AYSAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AYSAMActionPerformed(evt);
            }
        });
        panelRound3.add(AYSAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, 108));

        ECOGAS.setBackground(new java.awt.Color(0, 102, 153));
        ECOGAS.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        ECOGAS.setForeground(new java.awt.Color(255, 255, 255));
        ECOGAS.setText("ECOGAS");
        ECOGAS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ECOGAS.setBorderPainted(false);
        ECOGAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECOGASActionPerformed(evt);
            }
        });
        panelRound3.add(ECOGAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 110, 108));

        panelRound2.setBackground(new java.awt.Color(0, 102, 153));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Highlighted companies");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 260, -1));

        panelRound3.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 420, 42));

        Fondo.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 500, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mi proyecto.jpg"))); // NOI18N
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 220));

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-computer-icons-clip-art-profile-cliparts-free-5ab5a47b474ac4.304549771521853563292.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Name and Surname");

        lbtiempo.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        lbtiempo.setForeground(new java.awt.Color(255, 255, 255));
        lbtiempo.setText("Date/Time");

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

        Fondo.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EDEMSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDEMSAActionPerformed
        Ventana_Pagos_EDEMSA ventana = new Ventana_Pagos_EDEMSA();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EDEMSAActionPerformed

    private void ECOGASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECOGASActionPerformed
        Ventana_Pagos_ECOGAS ventana = new Ventana_Pagos_ECOGAS();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ECOGASActionPerformed

    private void AYSAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AYSAMActionPerformed
        Ventana_Pagos_AYSAM ventana = new Ventana_Pagos_AYSAM();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AYSAMActionPerformed

    private void CTNETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTNETActionPerformed
        Ventana_Pagos_CTNET ventana = new Ventana_Pagos_CTNET();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CTNETActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Window_MENU ventana = new Window_MENU();

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
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Pagos().setVisible(true);
            }
        });
        class RoundedPanel extends JPanel {

            private Color backgroundColor;
            private int cornerRadius = 15;

            public RoundedPanel(LayoutManager layout, int radius) {
                super(layout);
                cornerRadius = radius;
            }

            public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
                super(layout);
                cornerRadius = radius;
                backgroundColor = bgColor;
            }

            public RoundedPanel(int radius) {
                super();
                cornerRadius = radius;

            }

            public RoundedPanel(int radius, Color bgColor) {
                super();
                cornerRadius = radius;
                backgroundColor = bgColor;
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(cornerRadius, cornerRadius);
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                //Draws the rounded panel with borders.
                if (backgroundColor != null) {
                    graphics.setColor(backgroundColor);
                } else {
                    graphics.setColor(getBackground());
                }
                graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
                graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AYSAM;
    private javax.swing.JButton CTNET;
    private javax.swing.JButton ECOGAS;
    private javax.swing.JButton EDEMSA;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lbtiempo;
    private ProyectoHomeBanking.PanelRound panelRound2;
    private ProyectoHomeBanking.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables
}
