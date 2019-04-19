package Formularios;

import Clases.PeriodoTiempo;
import Clases.Tasa;

public class Periodo extends javax.swing.JPanel {
    PeriodoTiempo p=new PeriodoTiempo();
    Tasa t=new Tasa();
    public Periodo() {
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        TextCapital = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tasa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        BtnInicio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        enterotasa = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 435));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Capital:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 98, 50, 30));
        add(TextCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 102, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tasa de Interes:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 128, 110, 30));

        tasa.setEditable(false);
        add(tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 128, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Monto:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 158, 50, 30));
        add(TextMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 157, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("RESULTADO POR NUMERO DE MESES");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 216, 250, 20));
        add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 206, 160, 30));

        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Ejecutar.png"))); // NOI18N
        BtnInicio.setText("CALCULAR");
        BtnInicio.setBorderPainted(false);
        BtnInicio.setContentAreaFilled(false);
        BtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnInicio.setIconTextGap(-4);
        BtnInicio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });
        add(BtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 105, 93));

        jPanel1.setBackground(new java.awt.Color(1, 198, 83));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel1.setText("PERIODO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        BtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenIcon/Limpiar.png"))); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setBorderPainted(false);
        BtnLimpiar.setContentAreaFilled(false);
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLimpiar.setIconTextGap(-4);
        BtnLimpiar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 137, 94));

        enterotasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterotasaKeyReleased(evt);
            }
        });
        add(enterotasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 50, -1));

        jLabel47.setText("Numero entero");
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
      resultado.setText(""+p.CalcularTiempo(Double.parseDouble(TextCapital.getText()),Double.parseDouble(tasa.getText()),Double.parseDouble(TextMonto.getText())));
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
       TextCapital.setText("");
       TextMonto.setText("");
       tasa.setText("");
       resultado.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void enterotasaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterotasaKeyReleased
        if(enterotasa.getText().equals("")){
            tasa.setText("");
        }else
        {
            t.Tasa(Double.parseDouble(enterotasa.getText()));
            tasa.setText(String.valueOf(t.getResultado()));
        }
    }//GEN-LAST:event_enterotasaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JTextField TextCapital;
    private javax.swing.JTextField TextMonto;
    private javax.swing.JTextField enterotasa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField tasa;
    // End of variables declaration//GEN-END:variables
}
