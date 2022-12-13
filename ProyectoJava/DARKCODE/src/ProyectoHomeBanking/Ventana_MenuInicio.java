package ProyectoHomeBanking;

import Metodo_sql.Metodos_Saldo_sql;
import Metodo_sql.Metodos_sql;
import desplazable.Desface;

public class Ventana_MenuInicio extends javax.swing.JFrame {

    Metodos_sql metodo = new Metodos_sql();
    Metodos_Saldo_sql saldos = new Metodos_Saldo_sql();
    ModeloTransferencia mod = General.modelotransferencia;
    Time time = new Time();
    Desface desplace;

    public Ventana_MenuInicio() {
        initComponents();
        desplace = new Desface();
        desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -100, 10, 10);
        this.setLocationRelativeTo(null);
        Time tiempo = new Time();
        lbtiempo.setText(tiempo.fechahora2);
        setTitle("DARKCODE PAY");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MenuPlegable = new javax.swing.JPanel();
        MInicio = new javax.swing.JLabel();
        MTrasnferencia = new javax.swing.JLabel();
        MInversión = new javax.swing.JLabel();
        MPagos = new javax.swing.JLabel();
        MPréstamos = new javax.swing.JLabel();
        MSimulador = new javax.swing.JLabel();
        MCerrarSesión = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lbtiempo = new javax.swing.JLabel();
        lblMostrarsaldoP = new javax.swing.JLabel();
        CA = new javax.swing.JLabel();
        CAD = new javax.swing.JLabel();
        lblMostrarsaldoD = new javax.swing.JLabel();
        CAE = new javax.swing.JLabel();
        lblMostrarsaldoE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DARK CODE");
        setBackground(new java.awt.Color(0, 102, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPlegable.setBackground(new java.awt.Color(0, 102, 153));
        MenuPlegable.setForeground(new java.awt.Color(53, 63, 66));
        MenuPlegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tres rayas.png"))); // NOI18N
        MInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        MInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MInicioMouseClicked(evt);
            }
        });
        MenuPlegable.add(MInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 44));

        MTrasnferencia.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        MTrasnferencia.setForeground(new java.awt.Color(255, 255, 255));
        MTrasnferencia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MTrasnferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/horizontal_trasfer_icon.png"))); // NOI18N
        MTrasnferencia.setText("Transferencia       ");
        MTrasnferencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 11));
        MTrasnferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MTrasnferencia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MTrasnferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MTrasnferenciaMouseClicked(evt);
            }
        });
        MenuPlegable.add(MTrasnferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, 180, 44));

        MInversión.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        MInversión.setForeground(new java.awt.Color(255, 255, 255));
        MInversión.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MInversión.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invertir.png"))); // NOI18N
        MInversión.setText("Inversión               ");
        MInversión.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        MInversión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MInversión.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MInversión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MInversiónMouseClicked(evt);
            }
        });
        MenuPlegable.add(MInversión, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 149, -1, 44));

        MPagos.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        MPagos.setForeground(new java.awt.Color(255, 255, 255));
        MPagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pagar.png"))); // NOI18N
        MPagos.setText("Pagos                  ");
        MPagos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        MPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MPagos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MPagosMouseClicked(evt);
            }
        });
        MenuPlegable.add(MPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 44));

        MPréstamos.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        MPréstamos.setForeground(new java.awt.Color(255, 255, 255));
        MPréstamos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MPréstamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prestamos.png"))); // NOI18N
        MPréstamos.setText("Préstamos          ");
        MPréstamos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        MPréstamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MPréstamos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MPréstamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MPréstamosMouseClicked(evt);
            }
        });
        MenuPlegable.add(MPréstamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 304, 170, 44));

        MSimulador.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        MSimulador.setForeground(new java.awt.Color(255, 255, 255));
        MSimulador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MSimulador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/simular.png"))); // NOI18N
        MSimulador.setText("Simulador            ");
        MSimulador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        MSimulador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MSimulador.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MSimulador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MSimuladorMouseClicked(evt);
            }
        });
        MenuPlegable.add(MSimulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 387, 170, 44));

        MCerrarSesión.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        MCerrarSesión.setForeground(new java.awt.Color(255, 255, 255));
        MCerrarSesión.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MCerrarSesión.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4619645_power_reboot_reset_restart_start_icon.png"))); // NOI18N
        MCerrarSesión.setText("Cerrar Sesión      ");
        MCerrarSesión.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        MCerrarSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MCerrarSesión.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MCerrarSesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MCerrarSesiónMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MCerrarSesiónMouseExited(evt);
            }
        });
        MenuPlegable.add(MCerrarSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 472, 170, 42));

        getContentPane().add(MenuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 550));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-computer-icons-clip-art-profile-cliparts-free-5ab5a47b474ac4.304549771521853563292.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
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
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbtiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(264, Short.MAX_VALUE))
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        lblMostrarsaldoP.setBackground(new java.awt.Color(0, 102, 153));
        lblMostrarsaldoP.setForeground(new java.awt.Color(255, 255, 255));
        lblMostrarsaldoP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarsaldoP.setText("SALDOP");
        lblMostrarsaldoP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblMostrarsaldoP.setOpaque(true);

        CA.setBackground(new java.awt.Color(0, 102, 153));
        CA.setForeground(new java.awt.Color(255, 255, 255));
        CA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CA.setText("CA");
        CA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CA.setOpaque(true);

        CAD.setBackground(new java.awt.Color(0, 102, 153));
        CAD.setForeground(new java.awt.Color(255, 255, 255));
        CAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CAD.setText("CAD");
        CAD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CAD.setOpaque(true);

        lblMostrarsaldoD.setBackground(new java.awt.Color(0, 102, 153));
        lblMostrarsaldoD.setForeground(new java.awt.Color(255, 255, 255));
        lblMostrarsaldoD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarsaldoD.setText("SALDOD");
        lblMostrarsaldoD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblMostrarsaldoD.setOpaque(true);

        CAE.setBackground(new java.awt.Color(0, 102, 153));
        CAE.setForeground(new java.awt.Color(255, 255, 255));
        CAE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CAE.setText("CAE");
        CAE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CAE.setOpaque(true);

        lblMostrarsaldoE.setBackground(new java.awt.Color(0, 102, 153));
        lblMostrarsaldoE.setForeground(new java.awt.Color(255, 255, 255));
        lblMostrarsaldoE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarsaldoE.setText("SALDOE");
        lblMostrarsaldoE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblMostrarsaldoE.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel4.setText("DarkCode Pay");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CA, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(lblMostrarsaldoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMostrarsaldoD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CAE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMostrarsaldoE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CAD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMostrarsaldoD))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CAE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMostrarsaldoE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMostrarsaldoP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MInicioMouseClicked
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -100, 10, 10);
        } else if (MenuPlegable.getX() == -100) {
            desplace.desplazarDerecha(MenuPlegable, MenuPlegable.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_MInicioMouseClicked

    private void MTrasnferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MTrasnferenciaMouseClicked
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Transferencia VT = new Ventana_Transferencia();
        VT.lblNombre.setText(busqueda_nombre);
        VT.setVisible(true);
        dispose();

    }//GEN-LAST:event_MTrasnferenciaMouseClicked

    private void MInversiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MInversiónMouseClicked
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Inversiones_Inicio ventana = new Ventana_Inversiones_Inicio();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MInversiónMouseClicked

    private void MPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPagosMouseClicked
        
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Pagos ven = new Ventana_Pagos();
        ven.lblNombre.setText(busqueda_nombre);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MPagosMouseClicked

    private void MPréstamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPréstamosMouseClicked
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Prestamos VPS = new Ventana_Prestamos();
        VPS.lblNombre.setText(busqueda_nombre);
        VPS.setVisible(true);
        dispose();
    }//GEN-LAST:event_MPréstamosMouseClicked

    private void MSimuladorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MSimuladorMouseClicked
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Simulador ventana = new Ventana_Simulador();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_MSimuladorMouseClicked

    private void MCerrarSesiónMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MCerrarSesiónMouseExited

    }//GEN-LAST:event_MCerrarSesiónMouseExited

    private void MCerrarSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MCerrarSesiónMouseClicked

        mod.setUsuario(null);
        Ventana_Inicio VIN = new Ventana_Inicio();

        VIN.setVisible(true);
        dispose();
    }//GEN-LAST:event_MCerrarSesiónMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ventana_MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel CA;
    public javax.swing.JLabel CAD;
    public javax.swing.JLabel CAE;
    private javax.swing.JLabel MCerrarSesión;
    private javax.swing.JLabel MInicio;
    private javax.swing.JLabel MInversión;
    private javax.swing.JLabel MPagos;
    private javax.swing.JLabel MPréstamos;
    private javax.swing.JLabel MSimulador;
    private javax.swing.JLabel MTrasnferencia;
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblMostrarsaldoD;
    public javax.swing.JLabel lblMostrarsaldoE;
    public javax.swing.JLabel lblMostrarsaldoP;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lbtiempo;
    // End of variables declaration//GEN-END:variables
}
