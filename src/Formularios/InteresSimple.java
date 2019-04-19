package Formularios;
import Clases.CalculoInteres;
import Clases.Tasa;
import java.awt.HeadlessException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;

public class InteresSimple extends javax.swing.JPanel {

    private final DecimalFormat formato;
    CalculoInteres calculo=new CalculoInteres(); 
    Tasa t=new Tasa();
    public InteresSimple() {
        initComponents();
        this.setSize(1185,565);
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        formato = new DecimalFormat("0.00", simbolos);
    }


   private void calcularAño(){
        int añio = 0;
        int mess = 0;
        int dia = 0;
        if (!año.getText().equals("")) {
            añio = Integer.parseInt(año.getText());
        }
        if (!mes.getText().equals("")) {
            mess = Integer.parseInt(mes.getText());
        }
        if (!dias.getText().equals("")) {
            dia = Integer.parseInt(dias.getText());
        }
        calculo.años(añio, mess, dia);
        tiempo.setText(formato.format(calculo.getTiempo()));
    }
   private void calcularAño1(){
        int añio = 0;
        int mess = 0;
        int dia = 0;
        if (!año1.getText().equals("")) {
            añio = Integer.parseInt(año1.getText());
        }
        if (!mes1.getText().equals("")) {
            mess = Integer.parseInt(mes1.getText());
        }
        if (!dias1.getText().equals("")) {
            dia = Integer.parseInt(dias1.getText());
        }
        calculo.años(añio, mess, dia);
        tiempo1.setText(formato.format(calculo.getTiempo()));
    }
   private void calcularAño2(){
        int añio = 0;
        int mess = 0;
        int dia = 0;
        if (!año2.getText().equals("")) {
            añio = Integer.parseInt(año2.getText());
        }
        if (!mes2.getText().equals("")) {
            mess = Integer.parseInt(mes2.getText());
        }
        if (!dias2.getText().equals("")) {
            dia = Integer.parseInt(dias2.getText());
        }
        calculo.años(añio, mess, dia);
        tiempo2.setText(formato.format(calculo.getTiempo()));
    }
   private void calcularAño3(){
        int añio = 0;
        int mess = 0;
        int dia = 0;
        if (!año4.getText().equals("")) {
            añio = Integer.parseInt(año4.getText());
        }
        if (!mes4.getText().equals("")) {
            mess = Integer.parseInt(mes4.getText());
        }
        if (!dias4.getText().equals("")) {
            dia = Integer.parseInt(dias4.getText());
        }
        calculo.años(añio, mess, dia);
        tiempo4.setText(formato.format(calculo.getTiempo()));
    }
   



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEncabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TablePanel = new javax.swing.JTabbedPane();
        PanelInteres = new javax.swing.JPanel();
        LimpiarInteres = new javax.swing.JButton();
        BotonInteres = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        capital = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tasa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tiempo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        año = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        dias = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        interes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        enterotasa = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        PanelTasa = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        capital1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tiempo1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        año1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        mes1 = new javax.swing.JTextField();
        dias1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        interes1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        monto1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tasa1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        BotonTasa = new javax.swing.JButton();
        LimpiarTasa = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        PanelValorPresente = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        capital2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tiempo2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        año2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        mes2 = new javax.swing.JTextField();
        dias2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        interes2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        monto2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        tasa2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        enterotasa1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        BotonCapital = new javax.swing.JButton();
        LimpiarCapital = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        PanelPeriodo = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        capital3 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tasa3 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tiempo3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        interes3 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        monto3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        enterotasa2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        BotonTiempo = new javax.swing.JButton();
        LimpiarTiempo = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        capital4 = new javax.swing.JTextField();
        tasa4 = new javax.swing.JTextField();
        tiempo4 = new javax.swing.JTextField();
        valorfuturo = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnEjecutar = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        año4 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        mes4 = new javax.swing.JTextField();
        dias4 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        enterotasa3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 435));

        PanelEncabezado.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel1.setText("INTERES SIMPLE");

        javax.swing.GroupLayout PanelEncabezadoLayout = new javax.swing.GroupLayout(PanelEncabezado);
        PanelEncabezado.setLayout(PanelEncabezadoLayout);
        PanelEncabezadoLayout.setHorizontalGroup(
            PanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(380, 380, 380))
        );
        PanelEncabezadoLayout.setVerticalGroup(
            PanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelInteres.setBackground(new java.awt.Color(255, 255, 255));
        PanelInteres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LimpiarInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Limpiar.png"))); // NOI18N
        LimpiarInteres.setText("LIMPIAR");
        LimpiarInteres.setBorderPainted(false);
        LimpiarInteres.setContentAreaFilled(false);
        LimpiarInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LimpiarInteres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LimpiarInteres.setIconTextGap(-4);
        LimpiarInteres.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LimpiarInteres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LimpiarInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarInteresActionPerformed(evt);
            }
        });
        PanelInteres.add(LimpiarInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 137, 94));

        BotonInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BotonInteres.setText("CALCULAR");
        BotonInteres.setBorderPainted(false);
        BotonInteres.setContentAreaFilled(false);
        BotonInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonInteres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonInteres.setIconTextGap(-4);
        BotonInteres.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonInteres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInteresActionPerformed(evt);
            }
        });
        PanelInteres.add(BotonInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 137, 94));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Capital:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 27, 50, 30));

        capital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                capitalKeyTyped(evt);
            }
        });
        jPanel3.add(capital, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tasa de Interes:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        tasa.setEditable(false);
        jPanel3.add(tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 70, 22));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tiempo:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        tiempo.setEditable(false);
        tiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tiempoKeyReleased(evt);
            }
        });
        jPanel3.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("Años");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 30, 30));

        año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                añoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                añoKeyTyped(evt);
            }
        });
        jPanel3.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("Dias");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 40, 30));

        mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mesKeyTyped(evt);
            }
        });
        jPanel3.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 40, -1));

        dias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diasKeyReleased(evt);
            }
        });
        jPanel3.add(dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 41, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Resultado");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 182, 82, 30));

        interes.setEditable(false);
        jPanel3.add(interes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Monto:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 30));

        monto.setEditable(false);
        jPanel3.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 120, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 182, 471, 10));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Interes:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setText("Meses");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 40, 30));

        enterotasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterotasaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterotasaKeyTyped(evt);
            }
        });
        jPanel3.add(enterotasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 50, -1));

        jLabel47.setText("Numero entero");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        PanelInteres.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 260));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/InteresSimple.PNG"))); // NOI18N
        PanelInteres.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 200, 80));

        TablePanel.addTab("Interes", PanelInteres);

        PanelTasa.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Capital:");

        capital1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                capital1KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tiempo:");

        tiempo1.setEditable(false);
        tiempo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tiempo1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tiempo1KeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setText("Años");

        año1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                año1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                año1KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Dias");

        mes1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mes1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mes1KeyTyped(evt);
            }
        });

        dias1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dias1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dias1KeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Interes:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("RESULTADO");

        monto1.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tasa de Interes:");

        tasa1.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Monto:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel19.setText("Meses");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(monto1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(capital1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(año1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dias1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(interes1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(año1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tasa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        BotonTasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BotonTasa.setText("CALCULAR");
        BotonTasa.setBorderPainted(false);
        BotonTasa.setContentAreaFilled(false);
        BotonTasa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonTasa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonTasa.setIconTextGap(-4);
        BotonTasa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonTasa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTasaActionPerformed(evt);
            }
        });

        LimpiarTasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Limpiar.png"))); // NOI18N
        LimpiarTasa.setText("LIMPIAR");
        LimpiarTasa.setBorderPainted(false);
        LimpiarTasa.setContentAreaFilled(false);
        LimpiarTasa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LimpiarTasa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LimpiarTasa.setIconTextGap(-4);
        LimpiarTasa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LimpiarTasa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LimpiarTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTasaActionPerformed(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/TasaInteresS.PNG"))); // NOI18N

        javax.swing.GroupLayout PanelTasaLayout = new javax.swing.GroupLayout(PanelTasa);
        PanelTasa.setLayout(PanelTasaLayout);
        PanelTasaLayout.setHorizontalGroup(
            PanelTasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTasaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(PanelTasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTasaLayout.createSequentialGroup()
                        .addComponent(BotonTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LimpiarTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTasaLayout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        PanelTasaLayout.setVerticalGroup(
            PanelTasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTasaLayout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTasaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimpiarTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TablePanel.addTab("Tasa", PanelTasa);

        PanelValorPresente.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Capital:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 50, 30));

        capital2.setEditable(false);
        jPanel5.add(capital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 180, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Tiempo:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        tiempo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tiempo2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tiempo2KeyTyped(evt);
            }
        });
        jPanel5.add(tiempo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setText("Años");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 30, 30));

        año2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                año2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                año2KeyTyped(evt);
            }
        });
        jPanel5.add(año2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 40, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setText("Dias");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 20, 30));

        mes2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mes2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mes2KeyTyped(evt);
            }
        });
        jPanel5.add(mes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 40, -1));

        dias2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dias2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dias2KeyTyped(evt);
            }
        });
        jPanel5.add(dias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 41, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Interes:");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, 30));
        jPanel5.add(interes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("RESULTADO");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 86, 30));

        monto2.setEditable(false);
        jPanel5.add(monto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 120, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, 480, 10));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Tasa de Interes:");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        tasa2.setEditable(false);
        tasa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tasa2KeyTyped(evt);
            }
        });
        jPanel5.add(tasa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, 19));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Monto:");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel28.setText("Meses");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 30, 30));

        enterotasa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterotasa1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterotasa1KeyTyped(evt);
            }
        });
        jPanel5.add(enterotasa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 50, -1));

        jLabel48.setText("Numero entero");
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        BotonCapital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BotonCapital.setText("CALCULAR");
        BotonCapital.setBorderPainted(false);
        BotonCapital.setContentAreaFilled(false);
        BotonCapital.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonCapital.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCapital.setIconTextGap(-4);
        BotonCapital.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonCapital.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCapitalActionPerformed(evt);
            }
        });

        LimpiarCapital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Limpiar.png"))); // NOI18N
        LimpiarCapital.setText("LIMPIAR");
        LimpiarCapital.setBorderPainted(false);
        LimpiarCapital.setContentAreaFilled(false);
        LimpiarCapital.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LimpiarCapital.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LimpiarCapital.setIconTextGap(-4);
        LimpiarCapital.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LimpiarCapital.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LimpiarCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCapitalActionPerformed(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/p.PNG"))); // NOI18N

        javax.swing.GroupLayout PanelValorPresenteLayout = new javax.swing.GroupLayout(PanelValorPresente);
        PanelValorPresente.setLayout(PanelValorPresenteLayout);
        PanelValorPresenteLayout.setHorizontalGroup(
            PanelValorPresenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelValorPresenteLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(PanelValorPresenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelValorPresenteLayout.createSequentialGroup()
                        .addComponent(BotonCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LimpiarCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelValorPresenteLayout.setVerticalGroup(
            PanelValorPresenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelValorPresenteLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelValorPresenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelValorPresenteLayout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelValorPresenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LimpiarCapital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonCapital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 52, Short.MAX_VALUE))
        );

        TablePanel.addTab("Valor Presente (Capital)", PanelValorPresente);

        PanelPeriodo.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Capital:");

        capital3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                capital3KeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Tasa de Interes:");

        tasa3.setEditable(false);
        tasa3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tasa3KeyTyped(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Tiempo:");

        tiempo3.setEditable(false);
        tiempo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tiempo3KeyReleased(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Resultado");

        interes3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                interes3KeyTyped(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Monto:");

        monto3.setEditable(false);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Interes:");

        enterotasa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterotasa2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterotasa2KeyTyped(evt);
            }
        });

        jLabel49.setText("Numero entero");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(monto3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel30)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(tasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel49)
                                .addGap(4, 4, 4)
                                .addComponent(enterotasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(interes3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(capital3)))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiempo3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 182, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capital3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel49)
                        .addComponent(enterotasa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BotonTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BotonTiempo.setText("CALCULAR");
        BotonTiempo.setBorderPainted(false);
        BotonTiempo.setContentAreaFilled(false);
        BotonTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonTiempo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonTiempo.setIconTextGap(-4);
        BotonTiempo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonTiempo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTiempoActionPerformed(evt);
            }
        });

        LimpiarTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Limpiar.png"))); // NOI18N
        LimpiarTiempo.setText("LIMPIAR");
        LimpiarTiempo.setBorderPainted(false);
        LimpiarTiempo.setContentAreaFilled(false);
        LimpiarTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LimpiarTiempo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LimpiarTiempo.setIconTextGap(-4);
        LimpiarTiempo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LimpiarTiempo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LimpiarTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTiempoActionPerformed(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/TiempoIS.PNG"))); // NOI18N

        javax.swing.GroupLayout PanelPeriodoLayout = new javax.swing.GroupLayout(PanelPeriodo);
        PanelPeriodo.setLayout(PanelPeriodoLayout);
        PanelPeriodoLayout.setHorizontalGroup(
            PanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPeriodoLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPeriodoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(BotonTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(LimpiarTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPeriodoLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel45)))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        PanelPeriodoLayout.setVerticalGroup(
            PanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPeriodoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPeriodoLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(PanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LimpiarTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelPeriodoLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        TablePanel.addTab("Tiempo", PanelPeriodo);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        capital4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                capital4KeyTyped(evt);
            }
        });

        tasa4.setEditable(false);
        tasa4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tasa4KeyTyped(evt);
            }
        });

        tiempo4.setEditable(false);
        tiempo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempo4ActionPerformed(evt);
            }
        });

        valorfuturo.setEditable(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Valor futuro");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Valor Presente:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Tasa");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Periodo");

        BtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Limpiar.png"))); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setBorderPainted(false);
        BtnLimpiar.setContentAreaFilled(false);
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLimpiar.setIconTextGap(-4);
        BtnLimpiar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseClicked(evt);
            }
        });

        BtnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BtnEjecutar.setText("CALCULAR");
        BtnEjecutar.setBorderPainted(false);
        BtnEjecutar.setContentAreaFilled(false);
        BtnEjecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEjecutar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEjecutar.setIconTextGap(-4);
        BtnEjecutar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEjecutarMouseClicked(evt);
            }
        });
        BtnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjecutarActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel42.setText("Años");

        año4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                año4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                año4KeyTyped(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel43.setText("Meses");

        mes4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mes4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mes4KeyTyped(evt);
            }
        });

        dias4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dias4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dias4KeyTyped(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel44.setText("Dias");

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/ValorFuturoIS.PNG"))); // NOI18N

        jLabel50.setText("Numero entero");

        enterotasa3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterotasa3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterotasa3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(BtnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(capital4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tasa4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                        .addComponent(jLabel50)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 208, Short.MAX_VALUE)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(enterotasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tiempo4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(año4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dias4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(valorfuturo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(capital4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tasa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(jLabel50)
                            .addComponent(enterotasa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tiempo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(año4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dias4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorfuturo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TablePanel.addTab("Valor Futuro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyReleased
        calcularAño();
    }//GEN-LAST:event_mesKeyReleased

    private void añoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añoKeyReleased
        calcularAño();
    }//GEN-LAST:event_añoKeyReleased

    private void tiempoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempoKeyReleased
        if (!(this.tiempo.getText().equals(""))) {
            double t = Double.parseDouble(this.tiempo.getText());
            calculo.tiempo(t);
            año.setText(calculo.getAño() + "");
            mes.setText(calculo.getMes() + "");
            dias.setText(calculo.getDia() + "");

        }
    }//GEN-LAST:event_tiempoKeyReleased

    private void capitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capitalKeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_capitalKeyTyped

    private void BotonInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInteresActionPerformed
double Capital,Tasa;
       try
        {
            if (((enterotasa.getText().equals("")))&&((capital.getText().equals("")))&& ((tiempo.getText().equals("")))) 
            {
               JOptionPane.showMessageDialog(null, "Ingrese los valores porfavor");
            }
            else
            {
                
                Capital = Double.parseDouble(capital.getText());
                Tasa = Double.parseDouble(tasa.getText());
               
                calculo.calcularInteres(Capital, Tasa, calculo.getTiempo());
                interes.setText(formato.format(calculo.getInteres()));
                monto.setText(formato.format(calculo.getMonto()));
        }
        }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BotonInteresActionPerformed

    private void LimpiarInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarInteresActionPerformed
        limpiar();
    }//GEN-LAST:event_LimpiarInteresActionPerformed

    private void diasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diasKeyReleased
        calcularAño();
    }//GEN-LAST:event_diasKeyReleased

    private void capital1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capital1KeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_capital1KeyTyped

    private void tiempo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempo1KeyReleased
        if (!(this.tiempo.getText().equals(""))) {
            double t = Double.parseDouble(this.tiempo.getText());
            calculo.tiempo(t);
            año.setText(calculo.getAño() + "");
            mes.setText(calculo.getMes() + "");
            dias.setText(calculo.getDia() + "");

        }
    }//GEN-LAST:event_tiempo1KeyReleased

    private void año1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año1KeyReleased
        calcularAño1();
    }//GEN-LAST:event_año1KeyReleased

    private void año1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año1KeyTyped
char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_año1KeyTyped

    private void mes1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes1KeyReleased
        calcularAño1();
    }//GEN-LAST:event_mes1KeyReleased

    private void dias1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias1KeyReleased
        calcularAño1();
    }//GEN-LAST:event_dias1KeyReleased

    private void BotonTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTasaActionPerformed
double Capital,Interes,Tiempo;

       try
        {
            if (((interes1.getText().equals("")))&&((capital1.getText().equals("")))&& ((tiempo1.getText().equals("")))) 
            {
               JOptionPane.showMessageDialog(null, "Ingrese los valores porfavor");
            }
            else
            { 
                Interes = Double.parseDouble(interes1.getText());
                Capital = Double.parseDouble(capital1.getText());
                Tiempo = Double.parseDouble(tiempo1.getText());
               
                calculo.CalcularTasa(Interes, Capital, Tiempo);
                tasa1.setText(formato.format(calculo.getTasa() * 100));
                monto1.setText(formato.format(calculo.getMonto()));
        }
        }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BotonTasaActionPerformed

    private void LimpiarTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTasaActionPerformed
        limpiar1();
    }//GEN-LAST:event_LimpiarTasaActionPerformed

    private void mes1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes1KeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_mes1KeyTyped

    private void dias1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias1KeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_dias1KeyTyped

    private void mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_mesKeyTyped

    private void añoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añoKeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_añoKeyTyped

    private void tiempo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempo1KeyTyped

    private void tiempo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempo2KeyReleased
        if (!(this.tiempo2.getText().equals(""))) {
            double t = Double.parseDouble(this.tiempo.getText());
            calculo.tiempo(t);
            año.setText(calculo.getAño() + "");
            mes.setText(calculo.getMes() + "");
            dias.setText(calculo.getDia() + "");

        }
    }//GEN-LAST:event_tiempo2KeyReleased

    private void tiempo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempo2KeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_tiempo2KeyTyped

    private void año2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año2KeyReleased
      calcularAño2();
    }//GEN-LAST:event_año2KeyReleased

    private void año2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año2KeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_año2KeyTyped

    private void mes2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes2KeyReleased
      calcularAño2();
    }//GEN-LAST:event_mes2KeyReleased

    private void mes2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes2KeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_mes2KeyTyped

    private void dias2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias2KeyReleased
      calcularAño2();
    }//GEN-LAST:event_dias2KeyReleased

    private void dias2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias2KeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_dias2KeyTyped

    private void BotonCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCapitalActionPerformed
double Interes,Tasa,Tiempo;

       try
        {
            if (((interes2.getText().equals("")))&&((tasa2.getText().equals("")))&& ((tiempo2.getText().equals("")))) 
            {
               JOptionPane.showMessageDialog(null, "Ingrese los valores porfavor");
            }
            else
            { 
                Interes = Double.parseDouble(interes2.getText());
                Tiempo = Double.parseDouble(tiempo2.getText());
                Tasa = Double.parseDouble(tasa2.getText());
                
                calculo.calcularCapital(Interes, Tiempo, Tasa);
                capital2.setText(formato.format(calculo.getCapital()));
                monto2.setText(formato.format(calculo.getMonto()));
        }
        }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BotonCapitalActionPerformed

    private void LimpiarCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCapitalActionPerformed
        limpiar2();
    }//GEN-LAST:event_LimpiarCapitalActionPerformed

    private void tasa2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasa2KeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_tasa2KeyTyped

    private void capital3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capital3KeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_capital3KeyTyped

    private void tiempo3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempo3KeyReleased
       if (!(this.tiempo3.getText().equals(""))) {
            double t = Double.parseDouble(this.tiempo.getText());
            calculo.tiempo(t);
            año.setText(calculo.getAño() + "");
            mes.setText(calculo.getMes() + "");
            dias.setText(calculo.getDia() + "");
        }
    }//GEN-LAST:event_tiempo3KeyReleased

    private void BotonTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTiempoActionPerformed
double Interes,Tasa,Capital;

       try
        {
            if (((interes3.getText().equals("")))&&((capital3.getText().equals("")))&& ((tasa3.getText().equals("")))) 
            {
               JOptionPane.showMessageDialog(null, "Ingrese los valores porfavor");
            }
            else
            { 
                Interes = Double.parseDouble(interes3.getText());
                Capital = Double.parseDouble(capital3.getText());
                Tasa = Double.parseDouble(tasa3.getText());
                
                calculo.calcularTiempo(Interes, Capital, Tasa );
                tiempo3.setText(formato.format(calculo.getTiempo()));
                monto3.setText(formato.format(calculo.getMonto()));
        }
        }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BotonTiempoActionPerformed

    private void LimpiarTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTiempoActionPerformed
        limpiar3();
    }//GEN-LAST:event_LimpiarTiempoActionPerformed

    private void interes3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_interes3KeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_interes3KeyTyped

    private void tasa3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasa3KeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_tasa3KeyTyped

    private void tiempo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempo4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tiempo4ActionPerformed

    private void BtnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseClicked
        capital.setText("");
        interes.setText("");
        tiempo4.setText("");
        valorfuturo.setText("");
    }//GEN-LAST:event_BtnLimpiarMouseClicked

    private void BtnEjecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEjecutarMouseClicked

    }//GEN-LAST:event_BtnEjecutarMouseClicked

    private void BtnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjecutarActionPerformed
double vp, tasai, periodo;

       try
        {
            if (((capital4.getText().equals("")))&&((tasa4.getText().equals("")))&& ((tiempo4.getText().equals("")))) 
            {
               JOptionPane.showMessageDialog(null, "Ingrese los valores porfavor");
            }
            else
            { 
                vp=Double.parseDouble(capital4.getText());
                tasai=Double.parseDouble(tasa4.getText());
                periodo=Double.parseDouble(tiempo4.getText());
                
                calculo.ValorFuturoInteresSimple(vp,tasai,periodo);
                valorfuturo.setText(formato.format(calculo.getValorfuturo()));
        }
        }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BtnEjecutarActionPerformed

    private void año4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año4KeyReleased
      calcularAño3();
    }//GEN-LAST:event_año4KeyReleased

    private void mes4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes4KeyReleased
      calcularAño3();
    }//GEN-LAST:event_mes4KeyReleased

    private void dias4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias4KeyReleased
      calcularAño3();
    }//GEN-LAST:event_dias4KeyReleased

    private void año4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año4KeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_año4KeyTyped

    private void mes4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes4KeyTyped
      char c = evt.getKeyChar();
      if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_mes4KeyTyped

    private void dias4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias4KeyTyped
      char c = evt.getKeyChar();
      if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_dias4KeyTyped

    private void capital4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capital4KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_capital4KeyTyped

    private void tasa4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasa4KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_tasa4KeyTyped

    private void enterotasaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasaKeyReleased
        if(enterotasa.getText().equals("")){
        tasa.setText("");
        }else
        {
        t.Tasa(Double.parseDouble(enterotasa.getText()));
        tasa.setText(String.valueOf(t.getResultado()));  
        } 
    }//GEN-LAST:event_enterotasaKeyReleased

    private void enterotasa1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasa1KeyReleased
        if(enterotasa1.getText().equals("")){
        tasa2.setText("");
        }else
        {
        t.Tasa(Double.parseDouble(enterotasa1.getText()));
        tasa2.setText(String.valueOf(t.getResultado()));  
        }  
    }//GEN-LAST:event_enterotasa1KeyReleased

    private void enterotasa2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasa2KeyReleased
        if(enterotasa2.getText().equals("")){
        tasa3.setText("");
        }else
        {
        t.Tasa(Double.parseDouble(enterotasa2.getText()));
        tasa3.setText(String.valueOf(t.getResultado()));  
        }
    }//GEN-LAST:event_enterotasa2KeyReleased

    private void enterotasa3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasa3KeyReleased
        if(enterotasa3.getText().equals("")){
        tasa4.setText("");
        }else
        {
        t.Tasa(Double.parseDouble(enterotasa3.getText()));
        tasa4.setText(String.valueOf(t.getResultado()));  
        }
    }//GEN-LAST:event_enterotasa3KeyReleased

    private void enterotasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasaKeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_enterotasaKeyTyped

    private void enterotasa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasa1KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_enterotasa1KeyTyped

    private void enterotasa2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasa2KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_enterotasa2KeyTyped

    private void enterotasa3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasa3KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_enterotasa3KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCapital;
    private javax.swing.JButton BotonInteres;
    private javax.swing.JButton BotonTasa;
    private javax.swing.JButton BotonTiempo;
    private javax.swing.JButton BtnEjecutar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton LimpiarCapital;
    private javax.swing.JButton LimpiarInteres;
    private javax.swing.JButton LimpiarTasa;
    private javax.swing.JButton LimpiarTiempo;
    private javax.swing.JPanel PanelEncabezado;
    private javax.swing.JPanel PanelInteres;
    private javax.swing.JPanel PanelPeriodo;
    private javax.swing.JPanel PanelTasa;
    private javax.swing.JPanel PanelValorPresente;
    private javax.swing.JTabbedPane TablePanel;
    private javax.swing.JTextField año;
    private javax.swing.JTextField año1;
    private javax.swing.JTextField año2;
    private javax.swing.JTextField año4;
    private javax.swing.JTextField capital;
    private javax.swing.JTextField capital1;
    private javax.swing.JTextField capital2;
    private javax.swing.JTextField capital3;
    private javax.swing.JTextField capital4;
    private javax.swing.JTextField dias;
    private javax.swing.JTextField dias1;
    private javax.swing.JTextField dias2;
    private javax.swing.JTextField dias4;
    private javax.swing.JTextField enterotasa;
    private javax.swing.JTextField enterotasa1;
    private javax.swing.JTextField enterotasa2;
    private javax.swing.JTextField enterotasa3;
    private javax.swing.JTextField interes;
    private javax.swing.JTextField interes1;
    private javax.swing.JTextField interes2;
    private javax.swing.JTextField interes3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField mes1;
    private javax.swing.JTextField mes2;
    private javax.swing.JTextField mes4;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField monto1;
    private javax.swing.JTextField monto2;
    private javax.swing.JTextField monto3;
    private javax.swing.JTextField tasa;
    private javax.swing.JTextField tasa1;
    private javax.swing.JTextField tasa2;
    private javax.swing.JTextField tasa3;
    private javax.swing.JTextField tasa4;
    private javax.swing.JTextField tiempo;
    private javax.swing.JTextField tiempo1;
    private javax.swing.JTextField tiempo2;
    private javax.swing.JTextField tiempo3;
    private javax.swing.JTextField tiempo4;
    private javax.swing.JTextField valorfuturo;
    // End of variables declaration//GEN-END:variables
public void limpiar(){
    enterotasa.setText("");
    monto.setText("");
    tasa.setText("");
    tiempo.setText("");
    interes.setText("");
    capital.setText("");
    año.setText("");
    mes.setText("");
    dias.setText("");
}

public void limpiar1(){

    monto1.setText("");
    tasa1.setText("");
    tiempo1.setText("");
    interes1.setText("");
    capital1.setText("");
    año1.setText("");
    mes1.setText("");
    dias1.setText("");
}

public void limpiar2(){
enterotasa1.setText("");
    monto2.setText("");
    tasa2.setText("");
    tiempo2.setText("");
    interes2.setText("");
    capital2.setText("");
    año2.setText("");
    mes2.setText("");
    dias2.setText("");
}

public void limpiar3(){
    enterotasa2.setText("");
    monto3.setText("");
    tasa3.setText("");
    tiempo3.setText("");
    interes3.setText("");
    capital3.setText("");

}

public void limpiar4(){
    enterotasa3.setText("");
    tasa4.setText("");
    tiempo4.setText("");
    capital4.setText("");
    año4.setText("");
    mes4.setText("");
    dias4.setText("");
    valorfuturo.setText("");
}

}
