package ProyectoHomeBankingCH;

import Metodo_sql.Metodos_Saldo_sql;
import Metodo_sql.Metodos_sql;
import Metodo_sql.Saldos;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ventana_Inversion_PlazoFijo extends javax.swing.JFrame {

    Saldos sa = new Saldos();

    DecimalFormat df = new DecimalFormat("###,###,###,###.##");
    Metodos_sql metodo = new Metodos_sql();
    Metodos_Saldo_sql Msaldo = new Metodos_Saldo_sql();
    Saldos saldo = new Saldos();
    ModeloTransferencia mod = General.modelotransferencia;

    Time time = new Time();

    public Ventana_Inversion_PlazoFijo() {
        initComponents();
        btnContinuar.setEnabled(false);
        setLocationRelativeTo(null);
        setTitle("PLAZO FIJO");
        lbtiempo.setText(time.fechahora2);
        PanelConstitucion.setVisible(false);

        double mostrar_saldo = Double.parseDouble(Msaldo.buscarSaldoP(mod.getUsuario()));
        lblMostrarsaldo.setText("$" + String.valueOf(df.format(mostrar_saldo)));

        String busqueda_ca = metodo.buscarCa(mod.getUsuario());
        jComboBoxPlazoFijo.addItem("CA: " + busqueda_ca + "  $" + String.valueOf(df.format(mostrar_saldo)));
        
        String mostrar_plazofijo = (Msaldo.buscarMontoFinal(mod.getUsuario()));
        lblMostrarsaldo_Invertido.setText("$"+mostrar_plazofijo);
    }

    public void validar() {

        if (txtCapital.getText().isEmpty() | txtPlazo.getText().isEmpty()) {
            btnContinuar.setEnabled(false);
        } else {
            btnContinuar.setEnabled(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPlazo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Panel_Plazo_Uno = new javax.swing.JPanel();
        lblMostrarsaldo_Invertido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MuestraSaldo = new javax.swing.JPanel();
        lblMostrarsaldo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVolverSimulador = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCapital = new javax.swing.JTextField();
        txtPlazo = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PanelConstitucion = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCapital = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblPlazo = new javax.swing.JLabel();
        lblTNA = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblFechaMasDias = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnConstruirPlazo = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jComboBoxPlazoFijo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lbtiempo = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPlazo.setBackground(new java.awt.Color(255, 255, 255));
        PanelPlazo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Tu Portafolio ");

        Panel_Plazo_Uno.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Plazo_Uno.setOpaque(false);

        lblMostrarsaldo_Invertido.setFont(new java.awt.Font("Krungthep", 1, 12)); // NOI18N
        lblMostrarsaldo_Invertido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarsaldo_Invertido.setText("Tu saldo $");
        lblMostrarsaldo_Invertido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Krungthep", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inversiones en pesos");

        javax.swing.GroupLayout Panel_Plazo_UnoLayout = new javax.swing.GroupLayout(Panel_Plazo_Uno);
        Panel_Plazo_Uno.setLayout(Panel_Plazo_UnoLayout);
        Panel_Plazo_UnoLayout.setHorizontalGroup(
            Panel_Plazo_UnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Plazo_UnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMostrarsaldo_Invertido, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_Plazo_UnoLayout.setVerticalGroup(
            Panel_Plazo_UnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Plazo_UnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblMostrarsaldo_Invertido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        MuestraSaldo.setForeground(new java.awt.Color(255, 255, 255));
        MuestraSaldo.setOpaque(false);

        lblMostrarsaldo.setFont(new java.awt.Font("Krungthep", 1, 12)); // NOI18N
        lblMostrarsaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrarsaldo.setText("Tu saldo $");
        lblMostrarsaldo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout MuestraSaldoLayout = new javax.swing.GroupLayout(MuestraSaldo);
        MuestraSaldo.setLayout(MuestraSaldoLayout);
        MuestraSaldoLayout.setHorizontalGroup(
            MuestraSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MuestraSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMostrarsaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MuestraSaldoLayout.setVerticalGroup(
            MuestraSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MuestraSaldoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblMostrarsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Krungthep", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Constituye tu plazo fijo tradicional en pesos");

        jLabel7.setFont(new java.awt.Font("Krungthep", 1, 12)); // NOI18N
        jLabel7.setText("¿Cuanto dinero querés invertir?");

        jLabel10.setFont(new java.awt.Font("Krungthep", 0, 10)); // NOI18N
        jLabel10.setText("El monto minimo a invertir es de $100");

        jLabel8.setFont(new java.awt.Font("Krungthep", 1, 12)); // NOI18N
        jLabel8.setText("Digite la cantidad de días");

        btnVolverSimulador.setBackground(new java.awt.Color(0, 102, 153));
        btnVolverSimulador.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnVolverSimulador.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverSimulador.setText("Ir al simulador");
        btnVolverSimulador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolverSimulador.setBorderPainted(false);
        btnVolverSimulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSimuladorActionPerformed(evt);
            }
        });

        btnContinuar.setBackground(new java.awt.Color(0, 102, 153));
        btnContinuar.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContinuar.setBorderPainted(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Krungthep", 0, 10)); // NOI18N
        jLabel12.setText("La cantidad de días no puede ser inferior a 30");

        txtCapital.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtCapital.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapitalActionPerformed(evt);
            }
        });
        txtCapital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCapitalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapitalKeyTyped(evt);
            }
        });

        txtPlazo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPlazo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPlazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlazoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlazoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolverSimulador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolverSimulador)
                    .addComponent(btnContinuar))
                .addGap(36, 36, 36))
        );

        lblfecha.setForeground(new java.awt.Color(255, 255, 255));
        lblfecha.setText("fecha");

        jButton5.setBackground(new java.awt.Color(0, 102, 153));
        jButton5.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Volver");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Krungthep", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Disponibilidad de tu cuenta en Pesos");

        javax.swing.GroupLayout PanelPlazoLayout = new javax.swing.GroupLayout(PanelPlazo);
        PanelPlazo.setLayout(PanelPlazoLayout);
        PanelPlazoLayout.setHorizontalGroup(
            PanelPlazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPlazoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPlazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPlazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(MuestraSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel_Plazo_Uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        PanelPlazoLayout.setVerticalGroup(
            PanelPlazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlazoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblfecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPlazoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PanelPlazoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(PanelPlazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel_Plazo_Uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPlazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPlazoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(MuestraSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 37, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPlazoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(32, 32, 32))))))
        );

        getContentPane().add(PanelPlazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 850, 330));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(850, 320));
        jPanel3.setMinimumSize(new java.awt.Dimension(850, 320));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel5.setText("Monto Inicial");

        lblCapital.setBackground(new java.awt.Color(255, 255, 255));
        lblCapital.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        lblCapital.setText("concatenar + lblCapital");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel6.setText("Plazo");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel11.setText("Fecha de vencimiento");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel13.setText("TNA");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel14.setText("TEA");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel16.setText("Cuenta de origen");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel18.setText("Acción al vencimiento");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel19.setText("Monto final");

        lblPlazo.setBackground(new java.awt.Color(255, 255, 255));
        lblPlazo.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        lblPlazo.setText("concatenar + lblPlazo");

        lblTNA.setBackground(new java.awt.Color(255, 255, 255));
        lblTNA.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        lblTNA.setText("75.00%");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel20.setText("107.05%");

        lblFechaMasDias.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaMasDias.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        lblFechaMasDias.setText("concatenar + lblFechaMasDias");

        lblResultado.setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        lblResultado.setText("concatenar + lblResultado");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Krungthep", 0, 12)); // NOI18N
        jLabel21.setText("Acreditamiento en cuenta");

        btnConstruirPlazo.setBackground(new java.awt.Color(0, 102, 153));
        btnConstruirPlazo.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnConstruirPlazo.setForeground(new java.awt.Color(255, 255, 255));
        btnConstruirPlazo.setText("Constituir plazo fijo");
        btnConstruirPlazo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConstruirPlazo.setBorderPainted(false);
        btnConstruirPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstruirPlazoActionPerformed(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 153));
        jLabel26.setText("Confirmación del Plazo Fijo");

        jButton6.setBackground(new java.awt.Color(0, 102, 153));
        jButton6.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("volver");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBoxPlazoFijo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxPlazoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPlazoFijoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCapital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaMasDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlazo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(345, 345, 345))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConstruirPlazo)
                            .addComponent(jComboBoxPlazoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblCapital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblTNA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblFechaMasDias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblResultado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBoxPlazoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(btnConstruirPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout PanelConstitucionLayout = new javax.swing.GroupLayout(PanelConstitucion);
        PanelConstitucion.setLayout(PanelConstitucionLayout);
        PanelConstitucionLayout.setHorizontalGroup(
            PanelConstitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelConstitucionLayout.setVerticalGroup(
            PanelConstitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(PanelConstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 850, 330));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-computer-icons-clip-art-profile-cliparts-free-5ab5a47b474ac4.304549771521853563292.png"))); // NOI18N

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
                .addComponent(jLabel25)
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
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plazofijo2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(0, 316, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
            // TODO add your handling code here:
            double mostrar_saldo = Double.parseDouble(Msaldo.buscarSaldoP(mod.getUsuario()));
            double cap = Double.parseDouble(txtCapital.getText());
            int dia = Integer.parseInt(txtPlazo.getText());

            if (mostrar_saldo >= cap) {
                if (dia >= 30) {

                    double resultado = sa.Simulador_plazo(dia, cap);
                    double suma = sa.SumaPlazo(cap, resultado);

                    lblCapital.setText(String.valueOf(df.format(cap)));
                    lblPlazo.setText(String.valueOf(dia));
                    lblTNA.setText("75%");
                    lblFechaMasDias.setText(time.fechacomp);
                    lblResultado.setText(String.valueOf(df.format(suma)));

                    PanelPlazo.setVisible(false);
                    PanelConstitucion.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Error, digite un plazo mayor a 30 dias");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Saldo insuficiente");
            }


        }//GEN-LAST:event_btnContinuarActionPerformed

        private void btnConstruirPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstruirPlazoActionPerformed
            double mostrar_saldo = Double.parseDouble(Msaldo.buscarSaldoP(mod.getUsuario()));
            double cap = Double.parseDouble(txtCapital.getText());
            int dia = Integer.parseInt(txtPlazo.getText());

            double resultado = sa.Simulador_plazo(dia, cap);
            double suma = sa.SumaPlazo(cap, resultado);
            metodo.updatePlazo(time.fechahora, mod.getUsuario(), txtCapital.getText(), txtPlazo.getText(), String.valueOf(df.format(suma)), jComboBoxPlazoFijo.getSelectedItem().toString());
            //Msaldo.guardarPlazoFijo(time.fechahora, mod.getUsuario(), txtCapital.getText(), txtPlazo.getText(), String.valueOf(df.format(suma)),jComboBoxPlazoFijo.getSelectedItem().toString());
            String Saldo = String.valueOf(saldo.plazoFijo(mostrar_saldo, cap));
            Msaldo.updateSaldo(Saldo, mod.getUsuario());
            Ventana_Inversiones_Inicio ventana = new Ventana_Inversiones_Inicio();
            ventana.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Transaccion realizada con éxito");

        }//GEN-LAST:event_btnConstruirPlazoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Inversiones_Inicio ventana = new Ventana_Inversiones_Inicio();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnVolverSimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSimuladorActionPerformed
        String busqueda_nombre = metodo.buscarSoloNombre(mod.getUsuario());
        Ventana_Simulador ventana = new Ventana_Simulador();
        ventana.lblNombre.setText(busqueda_nombre);
        ventana.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverSimuladorActionPerformed

    private void txtCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapitalActionPerformed

    private void txtCapitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapitalKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtCapitalKeyTyped

    private void txtPlazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlazoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtPlazoKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        btnContinuar.setEnabled(false);
        PanelConstitucion.setVisible(false);
        PanelPlazo.setVisible(true);
        txtCapital.setText(null);
        txtPlazo.setText(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtCapitalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapitalKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txtCapitalKeyReleased

    private void txtPlazoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlazoKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txtPlazoKeyReleased

    private void jComboBoxPlazoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPlazoFijoActionPerformed

    }//GEN-LAST:event_jComboBoxPlazoFijoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Inversion_PlazoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inversion_PlazoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inversion_PlazoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inversion_PlazoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ventana_Inversion_PlazoFijo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MuestraSaldo;
    private javax.swing.JPanel PanelConstitucion;
    private javax.swing.JPanel PanelPlazo;
    private javax.swing.JPanel Panel_Plazo_Uno;
    private javax.swing.JButton btnConstruirPlazo;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolverSimulador;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBoxPlazoFijo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCapital;
    private javax.swing.JLabel lblFechaMasDias;
    private javax.swing.JLabel lblMostrarsaldo;
    private javax.swing.JLabel lblMostrarsaldo_Invertido;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlazo;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTNA;
    private javax.swing.JLabel lblfecha;
    public javax.swing.JLabel lbtiempo;
    private javax.swing.JTextField txtCapital;
    private javax.swing.JTextField txtPlazo;
    // End of variables declaration//GEN-END:variables

    private Ventana_Inversion_Cambio Ventana_Inversion_Cambio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
