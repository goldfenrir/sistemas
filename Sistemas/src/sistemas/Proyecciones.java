/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

/**
 *
 * @author alulab14
 */
public class Proyecciones extends javax.swing.JFrame {

    /**
     * Creates new form Template
     */
    public Proyecciones() {
        initComponents();
        initComponents2();
    }

    /**kkk
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents2(){
        cmbMarca.setVisible(false);
        cmbTipoP.setVisible(false);
        txtCodP.setVisible(false);
        jLabel4.setVisible(false);
         jLabel3.setVisible(false);       
         jLabel2.setVisible(false);       
                
        MyItemListener actionListener = new MyItemListener();
        jComboBox1.addItemListener(actionListener);
    }
    
    
    class MyItemListener implements ItemListener {
  // This method is called only if a new item has been selected.
        public void itemStateChanged(ItemEvent evt) {
          JComboBox cb = (JComboBox) evt.getSource();

          Object item = evt.getItem();

          if (evt.getStateChange() == ItemEvent.SELECTED) {
              cmbMarca.setVisible(false);
                cmbTipoP.setVisible(false);
                txtCodP.setVisible(false);
                jLabel4.setVisible(false);
                 jLabel3.setVisible(false);       
                 jLabel2.setVisible(false);  
            if (((String)item).compareTo("Proyectar por marca")==0){
                cmbMarca.setVisible(true);
                jLabel3.setVisible(true);
            }else if (((String)item).compareTo("Proyectar por tipo de producto")==0){
                 jLabel4.setVisible(true);
                 cmbTipoP.setVisible(true);
            }else if(((String)item).compareTo("Proyectar por producto")==0){
                jLabel2.setVisible(true);
                txtCodP.setText("                                               ");
                txtCodP.selectAll();
                txtCodP.setVisible(true);
            }else if(((String)item).compareTo("Proyectar todos")==0){
               
            }
            
          } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            // Item is no longer selected
          }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox();
        jToolBar1 = new javax.swing.JToolBar();
        btnSave = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmbTipoP = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtCodP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtGen = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L'bel", "Esika", "Cy°Zone" }));
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jToolBar1.setRollover(true);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_1.png"))); // NOI18N
        btnSave.setToolTipText("");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSave);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_1.png"))); // NOI18N
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAdd);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_1.png"))); // NOI18N
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDelete);

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help_1.png"))); // NOI18N
        btnHelp.setFocusable(false);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHelp);

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        btnInfo.setFocusable(false);
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnInfo);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 498, 10));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Proyectar todos", "Proyectar por marca", "Proyectar por tipo de producto", "Proyectar por producto" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel1.setText("Tipo de proyección:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        cmbTipoP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Labial", "Perfumes", "Cremas", "Sombras", "Desmaquilladoras", "Ropa", "Delineadores", "Rimel", "Desarodorantes", "Shampoo", "Accesorios", "Otros" }));
        jPanel1.add(cmbTipoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, 20));

        jLabel2.setText("Código");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        txtCodP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodPMouseClicked(evt);
            }
        });
        txtCodP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 74, -1));

        jLabel4.setText("Tipo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel5.setText("Proyectar por:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Unidades");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("USD MILES");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jPanel2.setLayout(new java.awt.GridLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "USD", "523.3", "570.8", "600.8", "630.5", "653", "670", "600", "30.5"},
                {"02", "USD", "12", "20.2", "30.2", "40.8", "20", "15", "15", "3"},
                {"03", "USD", "50", "60", "30", "40", "35", "32", "30", "10"},
                {"04", "USD", "50", "110", "12", "45", "65", "60", "45", "8"}
            },
            new String [] {
                "Código", "Unidades", "Ene-2015", "Feb-2015", "Mar-2015", "Abr-2015", "May-2015", "Jun-2015", "Promedio", "Desviación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 490, 200));

        txtGen.setText("Generar");
        jPanel1.add(txtGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, 40));

        btnExp.setText("Exportar");
        jPanel1.add(btnExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, -1, -1));

        jCheckBox1.setText("PDF");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proyVen.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 470, 220));

        jCheckBox3.setText("Excel (.xls)");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCodPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPActionPerformed
        // TODO add your handling code here:
        txtCodP.setText("");
    }//GEN-LAST:event_txtCodPActionPerformed

    private void txtCodPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodPMouseClicked
        // TODO add your handling code here:
        txtCodP.setText("");
    }//GEN-LAST:event_txtCodPMouseClicked

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
            java.util.logging.Logger.getLogger(Proyecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecciones().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cmbMarca;
    private javax.swing.JComboBox cmbTipoP;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtCodP;
    private javax.swing.JButton txtGen;
    // End of variables declaration//GEN-END:variables
}