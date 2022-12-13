package ProyectoHomeBanking;



import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import Metodo_sql.Metodos_Saldo_sql;
import Metodo_sql.Metodos_sql;
import Metodo_sql.Saldos;
import javax.swing.JOptionPane;

public class Ventana_Inversion_Cambio extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("###,###,###.##");
    ModeloTransferencia modelo = General.modelotransferencia;
    Metodos_Saldo_sql metodos = new Metodos_Saldo_sql();
    Metodos_sql metodo = new Metodos_sql();
    

    public Ventana_Inversion_Cambio() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("CAMBIO DE MONEDA");

        Time tiempo = new Time();

        //JCOMOBOX COMPRA DE DOLARES Y EUROS
        double mostrar_saldo = Double.parseDouble(metodos.buscarSaldoP(modelo.getUsuario()));
        String busqueda_ca = metodo.buscarCa(modelo.getUsuario());
        jComboBoxCompraDolares.addItem("CA: " + busqueda_ca + "  $" + String.valueOf(df.format(mostrar_saldo)));
        jComboBoxCompraEuro.addItem("CA: " + busqueda_ca + "  $" + String.valueOf(df.format(mostrar_saldo)));

        //JCOMBOBOX VENTA DE DOLARES
        double mostrar_saldoD = Double.parseDouble(metodos.buscarSaldoD(modelo.getUsuario()));
        String busqueda_cad = metodo.buscarCad(modelo.getUsuario());
        jComboBoxcuentasdolares.addItem("CAD: " + busqueda_cad + "  $USD" + String.valueOf(df.format(mostrar_saldoD)));

        //JCOMBOBOX VENTA DE EUROS
        double mostrar_saldoE = Double.parseDouble(metodos.buscarSaldoE(modelo.getUsuario()));
        String busqueda_cae = metodo.buscarCaE(modelo.getUsuario());
        jComboBoxVendaEuro.addItem("CAE: " + busqueda_cae + "  €" + String.valueOf(df.format(mostrar_saldoE)));

        jPanelComprarDolares.setVisible(false);
        jPanelComprarEuros.setVisible(false);
        jPanelVenderDolares.setVisible(false);
        jPanelVenderEuros.setVisible(false);
        jLabel17.setText(tiempo.fechahora2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btncomprad1 = new javax.swing.JButton();
        btnvendad1 = new javax.swing.JButton();
        btncomprae1 = new javax.swing.JButton();
        btnvendae1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ventad2 = new javax.swing.JTextField();
        ventae2 = new javax.swing.JTextField();
        comprae2 = new javax.swing.JTextField();
        comprad2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        btnvolver2 = new javax.swing.JButton();
        jPanelComprarEuros = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtmontoce = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtsinimpuesto1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtpais1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtrg1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtdebitar1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxCompraEuro = new javax.swing.JComboBox<>();
        btnborrar1 = new javax.swing.JButton();
        btnconfirmarCE = new javax.swing.JButton();
        jPanelComprarDolares = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtmontocd = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtsinimpuesto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtpais = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtrg = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtdebitar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jComboBoxCompraDolares = new javax.swing.JComboBox<>();
        btnborrar = new javax.swing.JButton();
        btnconfirmarCD = new javax.swing.JButton();
        jPanelVenderDolares = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtmontovd = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtacreditar = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jComboBoxcuentasdolares = new javax.swing.JComboBox<>();
        btnborrar2 = new javax.swing.JButton();
        btnconfirmarVD = new javax.swing.JButton();
        jPanelVenderEuros = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        txtmontove = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtacreditar1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jComboBoxVendaEuro = new javax.swing.JComboBox<>();
        btnborrar3 = new javax.swing.JButton();
        btnconfirmarVE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-computer-icons-clip-art-profile-cliparts-free-5ab5a47b474ac4.304549771521853563292.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Krungthep", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre y Apeliido");

        jLabel17.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Fecha/Hora");

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
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jLabel19.setFont(new java.awt.Font("Krungthep", 0, 10)); // NOI18N
        jLabel19.setText("Tu ingreso neto debe ser mayor a $86.850 o tener activos superiores a $347.000.");

        jLabel18.setFont(new java.awt.Font("Krungthep", 1, 13)); // NOI18N
        jLabel18.setText("Nuevo ingreso mínimo para comprar dólares ");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information-icon-6059.png"))); // NOI18N
        jLabel20.setOpaque(true);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mujer.png"))); // NOI18N
        jLabel28.setOpaque(true);

        btncomprad1.setBackground(new java.awt.Color(0, 102, 153));
        btncomprad1.setFont(new java.awt.Font("Krungthep", 1, 13)); // NOI18N
        btncomprad1.setForeground(new java.awt.Color(255, 255, 255));
        btncomprad1.setText("Comprar dólares");
        btncomprad1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btncomprad1.setBorderPainted(false);
        btncomprad1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncomprad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomprad1ActionPerformed(evt);
            }
        });

        btnvendad1.setBackground(new java.awt.Color(0, 102, 153));
        btnvendad1.setFont(new java.awt.Font("Krungthep", 1, 13)); // NOI18N
        btnvendad1.setForeground(new java.awt.Color(255, 255, 255));
        btnvendad1.setText("Vender dólares");
        btnvendad1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnvendad1.setBorderPainted(false);
        btnvendad1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvendad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvendad1ActionPerformed(evt);
            }
        });

        btncomprae1.setBackground(new java.awt.Color(0, 102, 153));
        btncomprae1.setFont(new java.awt.Font("Krungthep", 1, 13)); // NOI18N
        btncomprae1.setForeground(new java.awt.Color(255, 255, 255));
        btncomprae1.setText("Comprar euros");
        btncomprae1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btncomprae1.setBorderPainted(false);
        btncomprae1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncomprae1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomprae1ActionPerformed(evt);
            }
        });

        btnvendae1.setBackground(new java.awt.Color(0, 102, 153));
        btnvendae1.setFont(new java.awt.Font("Krungthep", 1, 13)); // NOI18N
        btnvendae1.setForeground(new java.awt.Color(255, 255, 255));
        btnvendae1.setText("Vender euros");
        btnvendae1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnvendae1.setBorderPainted(false);
        btnvendae1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvendae1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvendae1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btncomprad1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnvendad1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btncomprae1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(btnvendae1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncomprad1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvendad1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncomprae1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvendae1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel30.setText("Cotización de referencia");

        jPanel8.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        jLabel33.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel33.setText("Dolar");

        jLabel31.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel31.setText("Compra");

        jLabel32.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel32.setText("Venta");

        ventad2.setEditable(false);
        ventad2.setText("165.59");

        ventae2.setEditable(false);
        ventae2.setText("172.37");

        comprae2.setEditable(false);
        comprae2.setText("171.75");

        comprad2.setEditable(false);
        comprad2.setText("163.39");

        jLabel34.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel34.setText("Euro");

        btnvolver2.setBackground(new java.awt.Color(0, 102, 153));
        btnvolver2.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnvolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnvolver2.setText("Volver");
        btnvolver2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnvolver2.setBorderPainted(false);
        btnvolver2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvolver2.setMaximumSize(new java.awt.Dimension(60, 25));
        btnvolver2.setMinimumSize(new java.awt.Dimension(60, 25));
        btnvolver2.setPreferredSize(new java.awt.Dimension(60, 25));
        btnvolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnvolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33)
                                .addComponent(jLabel34))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comprae2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comprad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel32)
                                .addComponent(ventad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ventae2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel30)))
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addGap(26, 26, 26)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel31))
                                    .addGap(28, 28, 28)
                                    .addComponent(ventad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ventae2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comprad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel33))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comprae2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel34))))))
                    .addGap(65, 65, 65)
                    .addComponent(btnvolver2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 250, 340));

        jPanelComprarEuros.setBackground(new java.awt.Color(255, 255, 255));
        jPanelComprarEuros.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel15.setText("Ingresa el monto a comprar");

        txtmontoce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmontoceKeyReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel25.setText("Subtotal sin impuestos");

        txtsinimpuesto1.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel16.setText("Impuesto PAIS");

        txtpais1.setEditable(false);

        jLabel26.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel26.setText("Percepción RG 4815/20");

        txtrg1.setEditable(false);

        jLabel27.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel27.setText("TOTAL A DEBITAR");

        txtdebitar1.setEditable(false);

        jLabel29.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel29.setText("Cuenta de origen");

        jComboBoxCompraEuro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxCompraEuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCompraEuroActionPerformed(evt);
            }
        });

        btnborrar1.setBackground(new java.awt.Color(0, 102, 153));
        btnborrar1.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnborrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnborrar1.setText("Borrar");
        btnborrar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnborrar1.setBorderPainted(false);
        btnborrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnborrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrar1ActionPerformed(evt);
            }
        });

        btnconfirmarCE.setBackground(new java.awt.Color(0, 102, 153));
        btnconfirmarCE.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnconfirmarCE.setForeground(new java.awt.Color(255, 255, 255));
        btnconfirmarCE.setText("Confirmar");
        btnconfirmarCE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnconfirmarCE.setBorderPainted(false);
        btnconfirmarCE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconfirmarCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarCEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnborrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconfirmarCE, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxCompraEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdebitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmontoce, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsinimpuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpais1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtrg1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtmontoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsinimpuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtpais1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtrg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(txtdebitar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCompraEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconfirmarCE)
                    .addComponent(btnborrar1))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelComprarEurosLayout = new javax.swing.GroupLayout(jPanelComprarEuros);
        jPanelComprarEuros.setLayout(jPanelComprarEurosLayout);
        jPanelComprarEurosLayout.setHorizontalGroup(
            jPanelComprarEurosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComprarEurosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelComprarEurosLayout.setVerticalGroup(
            jPanelComprarEurosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComprarEurosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelComprarEuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 540, 340));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel13.setText("Ingresa el monto a comprar");

        txtmontocd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmontocdKeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel23.setText("Subtotal sin impuestos");

        txtsinimpuesto.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel14.setText("Impuesto PAIS");

        txtpais.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel21.setText("Percepción RG 4815/20");

        txtrg.setEditable(false);

        jLabel22.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel22.setText("TOTAL A DEBITAR");

        txtdebitar.setEditable(false);

        jLabel24.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel24.setText("Cuenta de origen");

        jComboBoxCompraDolares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxCompraDolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCompraDolaresActionPerformed(evt);
            }
        });

        btnborrar.setBackground(new java.awt.Color(0, 102, 153));
        btnborrar.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnborrar.setForeground(new java.awt.Color(255, 255, 255));
        btnborrar.setText("Borrar");
        btnborrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnborrar.setBorderPainted(false);
        btnborrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnconfirmarCD.setBackground(new java.awt.Color(0, 102, 153));
        btnconfirmarCD.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnconfirmarCD.setForeground(new java.awt.Color(255, 255, 255));
        btnconfirmarCD.setText("Confirmar");
        btnconfirmarCD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnconfirmarCD.setBorderPainted(false);
        btnconfirmarCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconfirmarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel14)
                            .addComponent(jLabel24)
                            .addComponent(jLabel13)
                            .addComponent(jLabel22))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(btnconfirmarCD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtmontocd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxCompraDolares, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpais)
                            .addComponent(txtrg)
                            .addComponent(txtdebitar)
                            .addComponent(txtsinimpuesto))))
                .addGap(28, 41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtmontocd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsinimpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtpais, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtdebitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCompraDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconfirmarCD)
                    .addComponent(btnborrar))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelComprarDolaresLayout = new javax.swing.GroupLayout(jPanelComprarDolares);
        jPanelComprarDolares.setLayout(jPanelComprarDolaresLayout);
        jPanelComprarDolaresLayout.setHorizontalGroup(
            jPanelComprarDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(jPanelComprarDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelComprarDolaresLayout.setVerticalGroup(
            jPanelComprarDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
            .addGroup(jPanelComprarDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelComprarDolaresLayout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelComprarDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 540, 340));

        jPanelVenderDolares.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setOpaque(false);

        jLabel35.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel35.setText("Ingresa el monto a vender");

        txtmontovd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmontovdKeyReleased(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel36.setText("TOTAL A ACREDITAR");

        txtacreditar.setEditable(false);

        jLabel37.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel37.setText("Cuenta de origen");

        jComboBoxcuentasdolares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxcuentasdolares.setMinimumSize(new java.awt.Dimension(250, 23));
        jComboBoxcuentasdolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxcuentasdolaresActionPerformed(evt);
            }
        });

        btnborrar2.setBackground(new java.awt.Color(0, 102, 153));
        btnborrar2.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnborrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnborrar2.setText("Borrar");
        btnborrar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnborrar2.setBorderPainted(false);
        btnborrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnborrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrar2ActionPerformed(evt);
            }
        });

        btnconfirmarVD.setBackground(new java.awt.Color(0, 102, 153));
        btnconfirmarVD.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnconfirmarVD.setForeground(new java.awt.Color(255, 255, 255));
        btnconfirmarVD.setText("Confirmar");
        btnconfirmarVD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnconfirmarVD.setBorderPainted(false);
        btnconfirmarVD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconfirmarVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarVDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtacreditar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmontovd, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxcuentasdolares, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnborrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnconfirmarVD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtmontovd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtacreditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jComboBoxcuentasdolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnborrar2)
                    .addComponent(btnconfirmarVD))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanelVenderDolaresLayout = new javax.swing.GroupLayout(jPanelVenderDolares);
        jPanelVenderDolares.setLayout(jPanelVenderDolaresLayout);
        jPanelVenderDolaresLayout.setHorizontalGroup(
            jPanelVenderDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(jPanelVenderDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVenderDolaresLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelVenderDolaresLayout.setVerticalGroup(
            jPanelVenderDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanelVenderDolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelVenderDolaresLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelVenderDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 540, 340));

        jPanelVenderEuros.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setOpaque(false);

        jLabel38.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel38.setText("Ingresa el monto a vender");

        txtmontove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmontoveKeyReleased(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel39.setText("TOTAL A ACREDITAR");

        txtacreditar1.setEditable(false);

        jLabel40.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jLabel40.setText("Cuenta de origen");

        jComboBoxVendaEuro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxVendaEuro.setMinimumSize(new java.awt.Dimension(250, 23));

        btnborrar3.setBackground(new java.awt.Color(0, 102, 153));
        btnborrar3.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnborrar3.setForeground(new java.awt.Color(255, 255, 255));
        btnborrar3.setText("borrar");
        btnborrar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnborrar3.setBorderPainted(false);
        btnborrar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnborrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrar3ActionPerformed(evt);
            }
        });

        btnconfirmarVE.setBackground(new java.awt.Color(0, 102, 153));
        btnconfirmarVE.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        btnconfirmarVE.setForeground(new java.awt.Color(255, 255, 255));
        btnconfirmarVE.setText("confirmar");
        btnconfirmarVE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnconfirmarVE.setBorderPainted(false);
        btnconfirmarVE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconfirmarVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarVEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtacreditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmontove, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVendaEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnborrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnconfirmarVE, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtmontove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtacreditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jComboBoxVendaEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnborrar3)
                    .addComponent(btnconfirmarVE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanelVenderEurosLayout = new javax.swing.GroupLayout(jPanelVenderEuros);
        jPanelVenderEuros.setLayout(jPanelVenderEurosLayout);
        jPanelVenderEurosLayout.setHorizontalGroup(
            jPanelVenderEurosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(jPanelVenderEurosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVenderEurosLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelVenderEurosLayout.setVerticalGroup(
            jPanelVenderEurosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
            .addGroup(jPanelVenderEurosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVenderEurosLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelVenderEuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 540, 340));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 850, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncomprad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprad1ActionPerformed
        jPanelComprarDolares.setVisible(true);
        jPanelComprarEuros.setVisible(false);
        jPanelVenderDolares.setVisible(false);
        jPanelVenderEuros.setVisible(false);
    }//GEN-LAST:event_btncomprad1ActionPerformed

    private void btncomprae1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprae1ActionPerformed
        jPanelComprarDolares.setVisible(false);
        jPanelComprarEuros.setVisible(true);
        jPanelVenderDolares.setVisible(false);
        jPanelVenderEuros.setVisible(false);
    }//GEN-LAST:event_btncomprae1ActionPerformed

    private void btnvendae1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvendae1ActionPerformed
        jPanelComprarDolares.setVisible(false);
        jPanelComprarEuros.setVisible(false);
        jPanelVenderDolares.setVisible(false);
        jPanelVenderEuros.setVisible(true);
    }//GEN-LAST:event_btnvendae1ActionPerformed

    private void btnvolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolver2ActionPerformed
        String busqueda_nombre = metodo.buscarSoloNombre(modelo.getUsuario());
        Ventana_Inversiones_Inicio window = new Ventana_Inversiones_Inicio();
        window.lblNombre.setText(busqueda_nombre);
        window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolver2ActionPerformed

    private void jComboBoxcuentasdolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxcuentasdolaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxcuentasdolaresActionPerformed

    private void txtmontoveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontoveKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            MetodosInversiones metodos = new MetodosInversiones();

            double monto = Double.parseDouble(txtmontove.getText());
            double ventaeuro = Double.parseDouble(comprae2.getText());

            txtacreditar1.setText("$" + df.format(metodos.calcularventadolar(monto, ventaeuro)));
    }//GEN-LAST:event_txtmontoveKeyReleased
    }
    private void btnborrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrar3ActionPerformed
        txtacreditar1.setText(null);
        txtmontove.setText(null);
    }//GEN-LAST:event_btnborrar3ActionPerformed

    private void jComboBoxCompraDolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCompraDolaresActionPerformed

    }//GEN-LAST:event_jComboBoxCompraDolaresActionPerformed

    private void btnconfirmarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarCDActionPerformed
        //COMPRA DE DOLARES

        MetodosInversiones metod = new MetodosInversiones();
        Saldos sa = new Saldos();

        double mostrar_saldo = Double.parseDouble(metodos.buscarSaldoP(modelo.getUsuario()));
        double mostrar_saldod = Double.parseDouble(metodos.buscarSaldoD(modelo.getUsuario()));
        double monto = Double.parseDouble(txtmontocd.getText());
        double compradolar = Double.parseDouble(ventad2.getText());
        double montototal = (metod.calcularcompradolar(monto, compradolar));

        if (mostrar_saldo >= montototal) {
            String saldo = Double.toString(sa.CompraD(mostrar_saldo, metod.calcularcompradolar(monto, compradolar)));
            String saldod = Double.toString(sa.saldod(mostrar_saldod, monto));
            metodos.updateSaldo(saldo, modelo.getUsuario());
            metodos.updateSaldoD(saldod, modelo.getUsuario());

            JOptionPane.showMessageDialog(this, "Compra Exitosa");
            Ventana_Inversiones_Inicio inicio = new Ventana_Inversiones_Inicio();
            inicio.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Error al realizar la operación");
        }


    }//GEN-LAST:event_btnconfirmarCDActionPerformed

    private void jComboBoxCompraEuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCompraEuroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCompraEuroActionPerformed

    private void btnborrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrar1ActionPerformed
        txtmontoce.setText(null);
        txtsinimpuesto1.setText(null);
        txtpais1.setText(null);
        txtrg1.setText(null);
        txtdebitar1.setText(null);
    }//GEN-LAST:event_btnborrar1ActionPerformed

    private void btnconfirmarCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarCEActionPerformed
        //COMPRA DE EUROS

        MetodosInversiones metod = new MetodosInversiones();
        Saldos sa = new Saldos();

        double mostrar_saldoP = Double.parseDouble(metodos.buscarSaldoP(modelo.getUsuario()));
        double mostrar_saldoE = Double.parseDouble(metodos.buscarSaldoE(modelo.getUsuario()));
        double monto = Double.parseDouble(txtmontoce.getText());
        double compraeuro = Double.parseDouble(ventae2.getText());
        double montototal = (metod.calcularcompradolar(monto, compraeuro));

        if (mostrar_saldoP >= montototal) {
            String saldo = Double.toString(sa.CompraD(mostrar_saldoP, metod.calcularcompradolar(monto, compraeuro)));
            String saldoE = Double.toString(sa.saldod(mostrar_saldoE, monto));
            metodos.updateSaldo(saldo, modelo.getUsuario());
            metodos.updateSaldoE(saldoE, modelo.getUsuario());

            JOptionPane.showMessageDialog(this, "Compra Exitosa");
            Ventana_Inversiones_Inicio inicio = new Ventana_Inversiones_Inicio();
            inicio.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Error al realizar la operación");
        }

    }//GEN-LAST:event_btnconfirmarCEActionPerformed

    private void btnvendad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvendad1ActionPerformed

        jPanelComprarDolares.setVisible(false);
        jPanelComprarEuros.setVisible(false);
        jPanelVenderDolares.setVisible(true);
        jPanelVenderEuros.setVisible(false);
    }//GEN-LAST:event_btnvendad1ActionPerformed

    private void txtmontocdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontocdKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            MetodosInversiones metodos = new MetodosInversiones();

            double monto = Double.parseDouble(txtmontocd.getText());
            double compradolar = Double.parseDouble(ventad2.getText());

            txtdebitar.setText("$" + df.format(metodos.calcularcompradolar(monto, compradolar)));
            txtpais.setText("$" + df.format(metodos.pais));
            txtrg.setText("$" + df.format(metodos.rg));
            txtsinimpuesto.setText("$" + df.format(metodos.totalsin));

        }
    }//GEN-LAST:event_txtmontocdKeyReleased

    private void txtmontoceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontoceKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            MetodosInversiones metodos = new MetodosInversiones();

            double monto = Double.parseDouble(txtmontoce.getText());
            double compradolar = Double.parseDouble(ventae2.getText());

            txtdebitar1.setText("$" + df.format(metodos.calcularcompradolar(monto, compradolar)));
            txtpais1.setText("$" + df.format(metodos.pais));
            txtrg1.setText("$" + df.format(metodos.rg));
            txtsinimpuesto1.setText("$" + df.format(metodos.totalsin));

        }
    }//GEN-LAST:event_txtmontoceKeyReleased

    private void txtmontovdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontovdKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            MetodosInversiones metodos = new MetodosInversiones();

            double monto = Double.parseDouble(txtmontovd.getText());
            double ventadolar = Double.parseDouble(comprad2.getText());

            txtacreditar.setText("$" + df.format(metodos.calcularventadolar(monto, ventadolar)));

        }

    }//GEN-LAST:event_txtmontovdKeyReleased

    private void btnborrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrar2ActionPerformed

        txtacreditar.setText(null);
        txtmontovd.setText(null);
    }//GEN-LAST:event_btnborrar2ActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed

        txtmontocd.setText(null);
        txtsinimpuesto.setText(null);
        txtpais.setText(null);
        txtrg.setText(null);
        txtdebitar.setText(null);
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnconfirmarVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarVDActionPerformed
        // VENTA DOLARES
        MetodosInversiones metod = new MetodosInversiones();
        Saldos sa = new Saldos();

        double mostrar_saldoP = Double.parseDouble(metodos.buscarSaldoP(modelo.getUsuario()));
        double mostrar_saldoD = Double.parseDouble(metodos.buscarSaldoD(modelo.getUsuario()));
        double monto = Double.parseDouble(txtmontovd.getText());
        double ventadolares = Double.parseDouble(comprad2.getText());
        double montototal = (metod.calcularventadolar(monto, ventadolares));

        if (mostrar_saldoD >= monto) {
            String saldo = Double.toString(sa.VentaD(mostrar_saldoP, montototal));
            String saldoD = Double.toString(sa.saldov(mostrar_saldoD, monto));
            metodos.updateSaldo(saldo, modelo.getUsuario());
            metodos.updateSaldoD(saldoD, modelo.getUsuario());

            JOptionPane.showMessageDialog(this, "Venta Exitosa");
            Ventana_Inversiones_Inicio inicio = new Ventana_Inversiones_Inicio();
            inicio.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Error al realizar la operación");
        }

    }//GEN-LAST:event_btnconfirmarVDActionPerformed

    private void btnconfirmarVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarVEActionPerformed
        // VENTA EUROS
        MetodosInversiones metod = new MetodosInversiones();
        Saldos sa = new Saldos();

        double mostrar_saldoP = Double.parseDouble(metodos.buscarSaldoP(modelo.getUsuario()));
        double mostrar_saldoE = Double.parseDouble(metodos.buscarSaldoE(modelo.getUsuario()));
        double monto = Double.parseDouble(txtmontove.getText());
        double ventaeuros = Double.parseDouble(comprae2.getText());
        double montototal = (metod.calcularventadolar(monto, ventaeuros));

        if (mostrar_saldoE >= monto) {
            String saldo = Double.toString(sa.VentaD(mostrar_saldoP, montototal));
            String saldoE = Double.toString(sa.saldov(mostrar_saldoE, monto));
            metodos.updateSaldo(saldo, modelo.getUsuario());
            metodos.updateSaldoE(saldoE, modelo.getUsuario());

            JOptionPane.showMessageDialog(this, "Venta Exitosa");
            Ventana_Inversiones_Inicio inicio = new Ventana_Inversiones_Inicio();
            inicio.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Error al realizar la operación");
        }


    }//GEN-LAST:event_btnconfirmarVEActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Inversion_Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inversion_Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inversion_Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inversion_Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Inversion_Cambio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnborrar1;
    private javax.swing.JButton btnborrar2;
    private javax.swing.JButton btnborrar3;
    private javax.swing.JButton btncomprad1;
    private javax.swing.JButton btncomprae1;
    private javax.swing.JButton btnconfirmarCD;
    private javax.swing.JButton btnconfirmarCE;
    private javax.swing.JButton btnconfirmarVD;
    private javax.swing.JButton btnconfirmarVE;
    private javax.swing.JButton btnvendad1;
    private javax.swing.JButton btnvendae1;
    private javax.swing.JButton btnvolver2;
    public javax.swing.JTextField comprad2;
    public javax.swing.JTextField comprae2;
    private javax.swing.JComboBox<String> jComboBoxCompraDolares;
    private javax.swing.JComboBox<String> jComboBoxCompraEuro;
    private javax.swing.JComboBox<String> jComboBoxVendaEuro;
    private javax.swing.JComboBox<String> jComboBoxcuentasdolares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelComprarDolares;
    private javax.swing.JPanel jPanelComprarEuros;
    private javax.swing.JPanel jPanelVenderDolares;
    private javax.swing.JPanel jPanelVenderEuros;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtacreditar;
    private javax.swing.JTextField txtacreditar1;
    private javax.swing.JTextField txtdebitar;
    private javax.swing.JTextField txtdebitar1;
    public javax.swing.JTextField txtmontocd;
    public javax.swing.JTextField txtmontoce;
    private javax.swing.JTextField txtmontovd;
    private javax.swing.JTextField txtmontove;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txtpais1;
    private javax.swing.JTextField txtrg;
    private javax.swing.JTextField txtrg1;
    private javax.swing.JTextField txtsinimpuesto;
    private javax.swing.JTextField txtsinimpuesto1;
    public javax.swing.JTextField ventad2;
    private javax.swing.JTextField ventae2;
    // End of variables declaration//GEN-END:variables
}
