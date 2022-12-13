package ProyectoHomeBankingEN;

import ProyectoHomeBanking.*;
import java.text.DecimalFormat;
import Metodo_sql.Metodos_sql;

public class Window_Prestamos_SimuladorEN extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("###,###,###.##");
    Metodos_sql metodo = new Metodos_sql();
    ModeloTransferencia mod = General.modelotransferencia;

    public Window_Prestamos_SimuladorEN() {
        initComponents();
        setLocationRelativeTo(null);
        Time tiempo = new Time();
        lbtiempo.setText(tiempo.fechahora2);
        setTitle("PERSONAL LOANS");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CajaPedirMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        montoEntregar = new javax.swing.JTextField();
        montoMensaul = new javax.swing.JTextField();
        cuotaPagar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnPedirP = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lbtiempo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cuota6 = new javax.swing.JRadioButton();
        cuota9 = new javax.swing.JRadioButton();
        cuota12 = new javax.swing.JRadioButton();
        cuota18 = new javax.swing.JRadioButton();
        cuota24 = new javax.swing.JRadioButton();
        cuota36 = new javax.swing.JRadioButton();
        cuota42 = new javax.swing.JRadioButton();
        cuota48 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Calculate your monthly repayments");

        jLabel2.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        jLabel2.setText("Enter your loan amount ");

        jLabel3.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        jLabel3.setText("Loan term");

        montoEntregar.setEditable(false);

        montoMensaul.setEditable(false);

        cuotaPagar.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        jLabel4.setText("Loan amount");

        jLabel5.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        jLabel5.setText("Monthly repayment");

        jLabel6.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        jLabel6.setText("Total repayment");

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calculate");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPedirP.setBackground(new java.awt.Color(0, 102, 153));
        btnPedirP.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        btnPedirP.setForeground(new java.awt.Color(255, 255, 255));
        btnPedirP.setText("Apply now!");
        btnPedirP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPedirP.setBorderPainted(false);
        btnPedirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirPActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(0, 102, 153));
        btnVolver.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Back");
        btnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.setBorderPainted(false);
        btnVolver.setPreferredSize(new java.awt.Dimension(60, 23));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prestamos1.png"))); // NOI18N

        buttonGroup1.add(cuota6);
        cuota6.setText("6 Months");
        cuota6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuota6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(cuota9);
        cuota9.setText("9 Months");

        buttonGroup1.add(cuota12);
        cuota12.setText("12 Months");

        buttonGroup1.add(cuota18);
        cuota18.setText("18 Months");

        buttonGroup1.add(cuota24);
        cuota24.setText("24 Months");

        buttonGroup1.add(cuota36);
        cuota36.setText("36 Months");

        buttonGroup1.add(cuota42);
        cuota42.setText("42 Months");

        buttonGroup1.add(cuota48);
        cuota48.setText("48 Months");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CajaPedirMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cuotaPagar, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(montoMensaul, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(montoEntregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuota6)
                            .addComponent(cuota24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cuota9)
                                .addGap(18, 18, 18)
                                .addComponent(cuota12)
                                .addGap(18, 18, 18)
                                .addComponent(cuota18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cuota36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cuota42)
                                .addGap(18, 18, 18)
                                .addComponent(cuota48))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnPedirP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CajaPedirMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuota6)
                            .addComponent(cuota9)
                            .addComponent(cuota12)
                            .addComponent(cuota18))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuota36)
                            .addComponent(cuota42)
                            .addComponent(cuota48)
                            .addComponent(cuota24))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(montoEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(montoMensaul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuotaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(216, 216, 216)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPedirP)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int num1;
        float Porcentaje;
        //Parsear String a numericos
        num1 = Integer.parseInt(CajaPedirMonto.getText());
        //operacion

        if (cuota6.isSelected()) {
            Porcentaje = 14;
            String num2 = CajaPedirMonto.getText();

            double n1 = Double.parseDouble(num2);
            double p = (n1 * Porcentaje) / 100;
            double m = (n1 + p);
            double t = (m / 6);
            montoMensaul.setText("" + df.format(t));
            cuotaPagar.setText("" + m); //Es el monto total a devolver

        }
        if (cuota9.isSelected()) {

            Porcentaje = 18;
            String num2 = CajaPedirMonto.getText();

            double n1 = Double.parseDouble(num2);
            double p = (n1 * Porcentaje) / 100;
            double m = (n1 + p);
            double t = (m / 9);
            montoMensaul.setText("" + df.format(t));
            cuotaPagar.setText("" + m);

        }
        if (cuota12.isSelected()) {
            Porcentaje = 25;
            String num2 = CajaPedirMonto.getText();

            double n1 = Double.parseDouble(num2);
            double p = (n1 * Porcentaje) / 100;
            double m = (n1 + p);
            double t = (m / 12);
            montoMensaul.setText("" + t);
            cuotaPagar.setText("" + m);
        }
        if (cuota18.isSelected()) {
            Porcentaje = 40;
            String num2 = CajaPedirMonto.getText();

            double n1 = Double.parseDouble(num2);
            double p = (n1 * Porcentaje) / 100;
            double m = (n1 + p);
            double t = (m / 18);
            montoMensaul.setText("" + t);
            cuotaPagar.setText("" + m);

        }
        if (cuota24.isSelected()) {
            Porcentaje = 55;
            String num2 = CajaPedirMonto.getText();

            double n1 = Double.parseDouble(num2);
            double p = (n1 * Porcentaje) / 100;
            double m = (n1 + p);
            double t = (m / 24);
            montoMensaul.setText("" + t);
            cuotaPagar.setText("" + m);
        }

        if (cuota36.isSelected()) {
            Porcentaje = 73;
            String num2 = CajaPedirMonto.getText();

            double n1 = Double.parseDouble(num2);
            double p = (n1 * Porcentaje) / 100;
            double m = (n1 + p);
            double t = (m / 36);
            montoMensaul.setText("" + t);
            cuotaPagar.setText("" + m);
        }
        if (cuota42.isSelected()) {
            Porcentaje = 84;
            String num2 = CajaPedirMonto.getText();

            double n1 = Double.parseDouble(num2);
            double p = (n1 * Porcentaje) / 100;
            double m = (n1 + p);
            double t = (m / 42);
            montoMensaul.setText("" + t);
            cuotaPagar.setText("" + m);
        }
        if (cuota48.isSelected()) {
            Porcentaje = 92;
            String num2 = CajaPedirMonto.getText();

            double n1 = Double.parseDouble(num2);
            double p = (n1 * Porcentaje) / 100;
            double m = (n1 + p);
            double t = (m / 48);
            montoMensaul.setText("" + t);
            cuotaPagar.setText("" + m);
        }

        //Copiamos la info de un cuadro de texto a otro
        //Primer TXT
        montoEntregar.setText(CajaPedirMonto.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPedirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirPActionPerformed
        // TODO add your handling code here:
        Window_Prestamos_InstanteEN v4 = new Window_Prestamos_InstanteEN();
        v4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPedirPActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Window_PrestamosEN v6 = new Window_PrestamosEN();
        v6.lblNombre.setText(busqueda_nombre);
        v6.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void cuota6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuota6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuota6ActionPerformed

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
            java.util.logging.Logger.getLogger(Window_Prestamos_SimuladorEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window_Prestamos_SimuladorEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window_Prestamos_SimuladorEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window_Prestamos_SimuladorEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Window_Prestamos_SimuladorEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaPedirMonto;
    private javax.swing.JButton btnPedirP;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cuota12;
    private javax.swing.JRadioButton cuota18;
    private javax.swing.JRadioButton cuota24;
    private javax.swing.JRadioButton cuota36;
    private javax.swing.JRadioButton cuota42;
    private javax.swing.JRadioButton cuota48;
    private javax.swing.JRadioButton cuota6;
    private javax.swing.JRadioButton cuota9;
    private javax.swing.JTextField cuotaPagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lbtiempo;
    private javax.swing.JTextField montoEntregar;
    private javax.swing.JTextField montoMensaul;
    // End of variables declaration//GEN-END:variables
}
