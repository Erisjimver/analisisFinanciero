package Formularios;

import Clases.CalculoInteres;
import Clases.Tasa;
import java.awt.HeadlessException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;

public class InteresCompuesto extends javax.swing.JPanel {
    CalculoInteres calculo=new CalculoInteres();
    Tasa t=new Tasa();
    private final DecimalFormat formato;
    public InteresCompuesto() {
        initComponents();
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        formato = new DecimalFormat("0.00", simbolos);

    }
    
   private void calcularAño(){
        int añio = 0;
        int mess = 0;
        int dia = 0;
        if (!año3.getText().equals("")) {
            añio = Integer.parseInt(año3.getText());
        }
        if (!mes3.getText().equals("")) {
            mess = Integer.parseInt(mes3.getText());
        }
        if (!dias3.getText().equals("")) {
            dia = Integer.parseInt(dias3.getText());
        }
        calculo.años(añio, mess, dia);
        tiempo3.setText(formato.format(calculo.getTiempo()));
    }
   private void calcularAño1(){
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
   private void calcularAño2(){
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Periodos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        valorinicial = new javax.swing.JTextField();
        tasa = new javax.swing.JTextField();
        tiempo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        valorfinal = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dias = new javax.swing.JTextField();
        BtnEjecutar1 = new javax.swing.JButton();
        BtnLimpiar1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        enterotasa = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        valorfinal1 = new javax.swing.JTextField();
        tasa1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tiempo1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        valorinicial1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        año1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        mes1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        dias1 = new javax.swing.JTextField();
        BtnEjecutar2 = new javax.swing.JButton();
        BtnLimpiar2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        enterotasa1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        valorinicial2 = new javax.swing.JTextField();
        tiempo2 = new javax.swing.JTextField();
        tasa2 = new javax.swing.JTextField();
        valorfinal2 = new javax.swing.JTextField();
        BtnEjecutar3 = new javax.swing.JButton();
        BtnLimpiar3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        enterotasa2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BtnEjecutar = new javax.swing.JButton();
        tiempo3 = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tasa3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        año3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valorfinal3 = new javax.swing.JTextField();
        valorinicial3 = new javax.swing.JTextField();
        dias3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        mes3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 453));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel1.setText("INTERES COMPUESTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Valor Presente:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, 100, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Interes:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 85, 50, 20));
        jPanel3.add(valorinicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 56, 80, -1));

        tasa.setEditable(false);
        jPanel3.add(tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 85, 80, -1));

        tiempo.setEditable(false);
        jPanel3.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 120, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Periodos:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 112, 70, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Valor futuro:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 169, 125, 22));

        valorfinal.setEditable(false);
        jPanel3.add(valorfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 169, 109, -1));

        año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                añoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                añoKeyTyped(evt);
            }
        });
        jPanel3.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 115, 40, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setText("Años");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 112, 30, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel20.setText("Meses");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 112, -1, 30));

        mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mesKeyTyped(evt);
            }
        });
        jPanel3.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 115, 40, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("Dias");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 112, 26, 30));

        dias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diasKeyTyped(evt);
            }
        });
        jPanel3.add(dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 115, 41, -1));

        BtnEjecutar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BtnEjecutar1.setText("CALCULAR");
        BtnEjecutar1.setBorderPainted(false);
        BtnEjecutar1.setContentAreaFilled(false);
        BtnEjecutar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEjecutar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEjecutar1.setIconTextGap(-4);
        BtnEjecutar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjecutar1ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnEjecutar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 209, 137, 94));

        BtnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Limpiar.png"))); // NOI18N
        BtnLimpiar1.setText("LIMPIAR");
        BtnLimpiar1.setBorderPainted(false);
        BtnLimpiar1.setContentAreaFilled(false);
        BtnLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnLimpiar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLimpiar1.setIconTextGap(-4);
        BtnLimpiar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiar1MouseClicked(evt);
            }
        });
        jPanel3.add(BtnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 209, 137, 94));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 149, 900, 10));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/VFIC.PNG"))); // NOI18N
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 318, -1));

        jLabel47.setText("Numero entero");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        enterotasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterotasaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterotasaKeyTyped(evt);
            }
        });
        jPanel3.add(enterotasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 50, -1));

        jTabbedPane1.addTab("Valor futuro en interes compuesto", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Valor Futuro:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Interes:");

        valorfinal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorfinal1KeyTyped(evt);
            }
        });

        tasa1.setEditable(false);
        tasa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tasa1KeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Periodos:");

        tiempo1.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Valor Presente:");

        valorinicial1.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel21.setText("Años");

        año1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                año1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                año1KeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setText("Meses");

        mes1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mes1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mes1KeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setText("Dias");

        dias1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dias1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dias1KeyTyped(evt);
            }
        });

        BtnEjecutar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BtnEjecutar2.setText("CALCULAR");
        BtnEjecutar2.setBorderPainted(false);
        BtnEjecutar2.setContentAreaFilled(false);
        BtnEjecutar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEjecutar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEjecutar2.setIconTextGap(-4);
        BtnEjecutar2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjecutar2ActionPerformed(evt);
            }
        });

        BtnLimpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Limpiar.png"))); // NOI18N
        BtnLimpiar2.setText("LIMPIAR");
        BtnLimpiar2.setBorderPainted(false);
        BtnLimpiar2.setContentAreaFilled(false);
        BtnLimpiar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnLimpiar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLimpiar2.setIconTextGap(-4);
        BtnLimpiar2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiar2MouseClicked(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/VPIC.PNG"))); // NOI18N

        jLabel49.setText("Numero entero");

        enterotasa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterotasa1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterotasa1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BtnEjecutar2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorinicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(tasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel49)
                                        .addGap(4, 4, 4)
                                        .addComponent(enterotasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(año1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dias1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(234, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(valorfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tasa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel49)
                                .addComponent(enterotasa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(año1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorinicial1))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEjecutar2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("Valor Presente en interescompuesto", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Valor Futuro:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Interes:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Periodos:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Valor Presente:");

        valorinicial2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorinicial2KeyTyped(evt);
            }
        });

        tiempo2.setEditable(false);

        tasa2.setEditable(false);
        tasa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tasa2KeyTyped(evt);
            }
        });

        valorfinal2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorfinal2KeyTyped(evt);
            }
        });

        BtnEjecutar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BtnEjecutar3.setText("CALCULAR");
        BtnEjecutar3.setBorderPainted(false);
        BtnEjecutar3.setContentAreaFilled(false);
        BtnEjecutar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEjecutar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEjecutar3.setIconTextGap(-4);
        BtnEjecutar3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjecutar3ActionPerformed(evt);
            }
        });

        BtnLimpiar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Limpiar.png"))); // NOI18N
        BtnLimpiar3.setText("LIMPIAR");
        BtnLimpiar3.setBorderPainted(false);
        BtnLimpiar3.setContentAreaFilled(false);
        BtnLimpiar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnLimpiar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLimpiar3.setIconTextGap(-4);
        BtnLimpiar3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiar3MouseClicked(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/TiempoIC.PNG"))); // NOI18N

        jLabel50.setText("Numero entero");

        enterotasa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterotasa2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterotasa2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tasa2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(valorinicial2))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel50)
                                .addGap(4, 4, 4)
                                .addComponent(enterotasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(tiempo2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(BtnEjecutar3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(350, 350, 350)
                    .addComponent(valorfinal2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorinicial2))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tasa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel50)
                        .addComponent(enterotasa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tiempo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEjecutar3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(valorfinal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(285, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Tiempo Interes compuesto", jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BtnEjecutar.setText("CALCULAR");
        BtnEjecutar.setBorderPainted(false);
        BtnEjecutar.setContentAreaFilled(false);
        BtnEjecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEjecutar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEjecutar.setIconTextGap(-4);
        BtnEjecutar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjecutarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 214, 137, 94));
        jPanel2.add(tiempo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 120, 80, -1));

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
        jPanel2.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 214, 137, 94));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tasa interes");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 174, 125, 22));

        tasa3.setEditable(false);
        jPanel2.add(tasa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 174, 109, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setText("Años");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 112, 30, 30));

        año3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                año3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                año3KeyTyped(evt);
            }
        });
        jPanel2.add(año3, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 115, 40, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Capital final");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Capital inicial");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, 90, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Periodos:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, 70, 20));

        valorfinal3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorfinal3KeyTyped(evt);
            }
        });
        jPanel2.add(valorfinal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 56, 80, -1));

        valorinicial3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorinicial3KeyTyped(evt);
            }
        });
        jPanel2.add(valorinicial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 85, 80, -1));

        dias3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dias3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dias3KeyTyped(evt);
            }
        });
        jPanel2.add(dias3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 115, 41, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel19.setText("Meses");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 112, -1, 30));

        mes3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mes3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mes3KeyTyped(evt);
            }
        });
        jPanel2.add(mes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 115, 40, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Dias");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 112, 26, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 152, 890, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/TasaIC.PNG"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, 170));

        jTabbedPane1.addTab("Interes Compuesto(Tasa)", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseClicked
    limpiar3();
    }//GEN-LAST:event_BtnLimpiarMouseClicked

    private void BtnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjecutarActionPerformed
      
double vi, vf, periodo;

       try
        {
            if (((valorfinal3.getText().equals("")))&&((valorinicial3.getText().equals("")))&& ((tiempo3.getText().equals("")))) 
            {
               JOptionPane.showMessageDialog(null, "Ingrese los valores porfavor");
            }
            else
            { 
                vf=Double.parseDouble(valorfinal3.getText());
                vi=Double.parseDouble(valorinicial3.getText());
                periodo=Double.parseDouble(tiempo3.getText());

                calculo.interescompuesto(vf, vi, periodo);
                tasa3.setText(formato.format(calculo.getInterescompuesto()));
        }
        }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BtnEjecutarActionPerformed

    private void año3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año3KeyReleased
        calcularAño();
    }//GEN-LAST:event_año3KeyReleased

    private void año3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año3KeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_año3KeyTyped

    private void mes3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes3KeyReleased
        calcularAño();
    }//GEN-LAST:event_mes3KeyReleased

    private void mes3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes3KeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_mes3KeyTyped

    private void dias3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias3KeyReleased
        calcularAño();
    }//GEN-LAST:event_dias3KeyReleased

    private void dias3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias3KeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_dias3KeyTyped

    private void añoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añoKeyReleased
        calcularAño1();
    }//GEN-LAST:event_añoKeyReleased

    private void añoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añoKeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_añoKeyTyped

    private void mesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyReleased
        calcularAño1();
    }//GEN-LAST:event_mesKeyReleased

    private void mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_mesKeyTyped

    private void diasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diasKeyReleased
        calcularAño1();
    }//GEN-LAST:event_diasKeyReleased

    private void diasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diasKeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_diasKeyTyped

    private void BtnEjecutar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjecutar1ActionPerformed
double capit, inter, periodo;

       try
        {
            if (((valorinicial.getText().equals("")))&&((enterotasa.getText().equals("")))&& ((tiempo.getText().equals("")))) 
            {
               JOptionPane.showMessageDialog(null, "Ingrese los valores porfavor");
            }
            else
            {
                capit=Double.parseDouble(valorinicial.getText());
                inter=Double.parseDouble(tasa.getText());
                periodo=Double.parseDouble(tiempo.getText());

                calculo.VFinterescompuesto(capit, inter, periodo);
                valorfinal.setText(formato.format(calculo.getVfinterescompuesto()));
        }
        }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BtnEjecutar1ActionPerformed

    private void BtnLimpiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiar1MouseClicked
        limpiar();
    }//GEN-LAST:event_BtnLimpiar1MouseClicked

    private void valorfinal3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorfinal3KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_valorfinal3KeyTyped

    private void año1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año1KeyReleased
        calcularAño2();
    }//GEN-LAST:event_año1KeyReleased

    private void año1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_año1KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_año1KeyTyped

    private void mes1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes1KeyReleased
        calcularAño2();
    }//GEN-LAST:event_mes1KeyReleased

    private void mes1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mes1KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_mes1KeyTyped

    private void dias1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias1KeyReleased
        calcularAño2();
    }//GEN-LAST:event_dias1KeyReleased

    private void dias1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias1KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_dias1KeyTyped

    private void BtnEjecutar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjecutar2ActionPerformed
double vf, i, n;

       try
        {
            if (((valorfinal1.getText().equals("")))&&((enterotasa1.getText().equals("")))&& ((tiempo1.getText().equals("")))) 
            {
               JOptionPane.showMessageDialog(null, "Ingrese los valores porfavor");
            }
            else
            { 
                vf=Double.parseDouble(valorfinal1.getText());
                i=Double.parseDouble(tasa1.getText());
                n=Double.parseDouble(tiempo1.getText());
                
                calculo.VPinterescompuesto(vf,i,n);
                valorinicial1.setText(formato.format(calculo.getVpinterescompuesto()));
        }
        }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BtnEjecutar2ActionPerformed

    private void BtnLimpiar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiar2MouseClicked
       limpiar1();
    }//GEN-LAST:event_BtnLimpiar2MouseClicked

    private void valorfinal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorfinal1KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_valorfinal1KeyTyped

    private void tasa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasa1KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_tasa1KeyTyped

    private void tasa2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasa2KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_tasa2KeyTyped

    private void valorfinal2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorfinal2KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_valorfinal2KeyTyped

    private void BtnEjecutar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjecutar3ActionPerformed
double vf, vi, i;

       try
        {
            if (((valorfinal2.getText().equals("")))&&((valorinicial2.getText().equals("")))&& ((enterotasa2.getText().equals("")))) 
            {
               JOptionPane.showMessageDialog(null, "Ingrese los valores porfavor");
            }
            else
            { 
                vf=Double.parseDouble(valorfinal2.getText());
                vi=Double.parseDouble(valorinicial2.getText());
                i=Double.parseDouble(tasa2.getText());
                
                calculo.nic(vf,vi,i);
                tiempo2.setText(formato.format(calculo.getNinterescompuesto()));
        }
        }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_BtnEjecutar3ActionPerformed

    private void BtnLimpiar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiar3MouseClicked
       limpiar2();
    }//GEN-LAST:event_BtnLimpiar3MouseClicked

    private void valorinicial2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorinicial2KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_valorinicial2KeyTyped

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
            tasa1.setText("");
        }else
        {
            t.Tasa(Double.parseDouble(enterotasa1.getText()));
            tasa1.setText(String.valueOf(t.getResultado()));
        }
    }//GEN-LAST:event_enterotasa1KeyReleased

    private void enterotasa2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasa2KeyReleased
        if(enterotasa2.getText().equals("")){
            tasa2.setText("");
        }else
        {
            t.Tasa(Double.parseDouble(enterotasa2.getText()));
            tasa2.setText(String.valueOf(t.getResultado()));
        }
    }//GEN-LAST:event_enterotasa2KeyReleased

    private void valorinicial3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorinicial3KeyTyped
       char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_valorinicial3KeyTyped

    private void enterotasa2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasa2KeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_enterotasa2KeyTyped

    private void enterotasa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasa1KeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_enterotasa1KeyTyped

    private void enterotasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasaKeyTyped
      char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'/'))evt.consume();
    }//GEN-LAST:event_enterotasaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEjecutar;
    private javax.swing.JButton BtnEjecutar1;
    private javax.swing.JButton BtnEjecutar2;
    private javax.swing.JButton BtnEjecutar3;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnLimpiar1;
    private javax.swing.JButton BtnLimpiar2;
    private javax.swing.JButton BtnLimpiar3;
    private javax.swing.ButtonGroup Periodos;
    private javax.swing.JTextField año;
    private javax.swing.JTextField año1;
    private javax.swing.JTextField año3;
    private javax.swing.JTextField dias;
    private javax.swing.JTextField dias1;
    private javax.swing.JTextField dias3;
    private javax.swing.JTextField enterotasa;
    private javax.swing.JTextField enterotasa1;
    private javax.swing.JTextField enterotasa2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField mes1;
    private javax.swing.JTextField mes3;
    private javax.swing.JTextField tasa;
    private javax.swing.JTextField tasa1;
    private javax.swing.JTextField tasa2;
    private javax.swing.JTextField tasa3;
    private javax.swing.JTextField tiempo;
    private javax.swing.JTextField tiempo1;
    private javax.swing.JTextField tiempo2;
    private javax.swing.JTextField tiempo3;
    private javax.swing.JTextField valorfinal;
    private javax.swing.JTextField valorfinal1;
    private javax.swing.JTextField valorfinal2;
    private javax.swing.JTextField valorfinal3;
    private javax.swing.JTextField valorinicial;
    private javax.swing.JTextField valorinicial1;
    private javax.swing.JTextField valorinicial2;
    private javax.swing.JTextField valorinicial3;
    // End of variables declaration//GEN-END:variables
public void limpiar(){
        enterotasa.setText("");
        valorfinal.setText("");
        valorinicial.setText("");
        tiempo.setText("");
        tasa.setText("");
        año.setText("");
        mes.setText("");
        dias.setText("");     
}

public void limpiar1(){
        enterotasa1.setText("");
        valorfinal1.setText("");
        valorinicial1.setText("");
        tiempo1.setText("");
        tasa1.setText("");
        año1.setText("");
        mes1.setText("");
        dias1.setText("");     
}

public void limpiar2(){
        enterotasa2.setText("");
        valorfinal2.setText("");
        valorinicial2.setText("");
        tiempo2.setText("");
        tasa2.setText("");   
}

public void limpiar3(){
        valorfinal3.setText("");
        valorinicial3.setText("");
        tiempo3.setText("");
        tasa3.setText("");
        año3.setText("");
        mes3.setText("");
        dias3.setText("");    
}
}
