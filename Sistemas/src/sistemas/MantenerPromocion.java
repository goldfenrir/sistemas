/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author alulab14
 */
public class MantenerPromocion extends javax.swing.JFrame {
    JOptionPane jop = new JOptionPane();
    /**
     * Creates new form Template
     */
    public MantenerPromocion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        promnxntab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        promdsctotab = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        panelInfo = new javax.swing.JPanel();
        montotab = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        txtStock = new java.awt.TextField();
        txtDescrip = new java.awt.TextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 700, 10));

        promnxntab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cantidad de productos a pagar");
        promnxntab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel2.setText("Cantidad de productos llevados");
        promnxntab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));
        promnxntab.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));
        promnxntab.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jLabel3.setText("Información del producto");
        promnxntab.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel4.setText("Codigo");
        promnxntab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel5.setText("Nombre");
        promnxntab.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 165, -1, -1));

        jLabel6.setText("Precio base");
        promnxntab.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel7.setText("Marca");
        promnxntab.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel8.setText("Stock");
        promnxntab.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 165, -1, -1));

        jLabel9.setText("Tipo de producto");
        promnxntab.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jTextField1.setText("101");
        promnxntab.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 40, -1));
        promnxntab.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 110, -1));

        jTextField3.setText("75.70");
        promnxntab.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 50, -1));

        jTextField4.setText("Esika");
        promnxntab.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 80, -1));

        jTextField5.setText("500");
        promnxntab.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 50, -1));

        jTextField6.setText("Labial");
        promnxntab.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 100, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        promnxntab.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 60, -1));

        jTabbedPane1.addTab("NXN", promnxntab);

        promdsctotab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Porcentaje de descuento");
        promdsctotab.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, -1, -1));
        promdsctotab.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 39, 70, -1));

        jRadioButton3.setText("Producto específico");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        promdsctotab.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel11.setText("Aplicar a:");
        promdsctotab.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, -1, -1));

        jRadioButton4.setText("Tipo de Producto");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        promdsctotab.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        panelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        promdsctotab.add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 590, 110));

        jTabbedPane1.addTab("Descuento", promdsctotab);

        montotab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Monto Adicional:");
        montotab.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        montotab.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, -1));

        jLabel13.setText("Por la compra del producto:");
        montotab.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel14.setText("Codigo");
        montotab.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel15.setText("Nombre");
        montotab.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel16.setText("Marca");
        montotab.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        montotab.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, -1));
        montotab.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 110, -1));
        montotab.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, -1));

        jLabel17.setText("Se lleva los productos");
        montotab.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        montotab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 250, 90));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        montotab.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.interiorBackground"));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        montotab.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jTabbedPane1.addTab("Monto Adicional", montotab);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Tipo de promoción", "Stock"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 580, 200));

        jTabbedPane1.addTab("Promociones Activas", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 650, 290));

        label1.setText("Código de la promoción");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 84, -1, -1));

        label2.setText("Fecha de creación");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        label3.setText("Descripción");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 207, -1, -1));

        label4.setText("Estado");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        label5.setText("Stock");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        textField1.setEditable(false);
        textField1.setName(""); // NOI18N
        textField1.setText("15");
        jPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 84, 50, -1));

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 60, -1));
        jPanel1.add(txtDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 207, 160, 50));

        jRadioButton1.setText("Activo");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jRadioButton2.setText("Inactivo");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));
        jPanel1.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        //jRadioButton3.setEnabled(false);
        jRadioButton3.setSelected(false);
        panelInfo.removeAll();
            codlabel = new java.awt.Label();
        descripcionlabel = new java.awt.Label();
        codlabel.setText("Codigo");
        descripcionlabel.setText("Descripcion");
        txtCod1 = new java.awt.TextField();
        txtDescrip1 = new java.awt.TextField();
        nombrelabel = new java.awt.Label();
        nombrelabel.setText("nombre");
        txtNombre1 = new java.awt.TextField();
        panelInfo.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, -1));
        panelInfo.add(nombrelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        panelInfo.add(codlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        panelInfo.add(descripcionlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        panelInfo.add(txtCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));
        panelInfo.add(txtDescrip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 150, 100));
        pack();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jRadioButton4.setSelected(false);
        panelInfo.removeAll();
        codlabel = new java.awt.Label();
        nombrelabel = new java.awt.Label();
        codlabel.setText("Codigo");
        codlabel.setVisible(true);
        preciolabel = new java.awt.Label();
        preciolabel.setText("Precio Base");
        stocklabel =  new java.awt.Label();
        stocklabel.setText("stock ");
        panelInfo.add(codlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        panelInfo.add(preciolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        panelInfo.add(stocklabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));
        //codlabel.setLocation(110, 50);
        nombrelabel.setText("nombre");
        panelInfo.add(nombrelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        txtCod1 = new java.awt.TextField();
        panelInfo.add(txtCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 80, -1));
        txtNombre1 = new java.awt.TextField();
        panelInfo.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, -1));
        txtStock = new java.awt.TextField();
        txtPrecioBase1 = new java.awt.TextField();
        panelInfo.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 50, -1));
        panelInfo.add(txtPrecioBase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 70, -1));

        pack();
       // nombrelabel.setLocale(Locale.UK);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
            jRadioButton2.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MantenerPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenerPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenerPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenerPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenerPromocion().setVisible(true);
            }
        });
    }
    
    public javax.swing.JPanel getPanel(){
        return jPanel1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JPanel montotab;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel promdsctotab;
    private javax.swing.JPanel promnxntab;
    private java.awt.TextField textField1;
    private java.awt.TextField txtDescrip;
    private java.awt.TextField txtStock;
    // End of variables declaration//GEN-END:variables
    private java.awt.Label codlabel;
    private java.awt.Label nombrelabel;
    private java.awt.Label preciolabel;
    private java.awt.Label descripcionlabel;
    private java.awt.Label stocklabel;
    private java.awt.TextField txtStock1;
    private java.awt.TextField txtPrecioBase1;
    private java.awt.TextField txtCod1;
    private java.awt.TextField txtDescrip1;
    private java.awt.TextField txtNombre1;
}
