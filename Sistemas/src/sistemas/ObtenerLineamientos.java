/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author alulab14
 */
public class ObtenerLineamientos extends javax.swing.JFrame {
    JOptionPane jop = new JOptionPane();
    /**
     * Creates new form Template
     */
    public ObtenerLineamientos() {
        initComponents();
    }
public javax.swing.JPanel getPanel(){
        return jPanel1;
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
        buttGroup_Marca = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        rbutt_esika = new javax.swing.JRadioButton();
        rbutt_lebel = new javax.swing.JRadioButton();
        rbutt_cyzone = new javax.swing.JRadioButton();
        lblProd = new javax.swing.JLabel();
        cmbProd = new javax.swing.JComboBox();
        cmbTipoP = new javax.swing.JComboBox();
        lblTipo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 700, 10));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));

        buttGroup_Marca.add(rbutt_esika);
        rbutt_esika.setText("Esika");
        jPanel2.add(rbutt_esika);

        buttGroup_Marca.add(rbutt_lebel);
        rbutt_lebel.setText("L'bel");
        rbutt_lebel.setToolTipText("");
        jPanel2.add(rbutt_lebel);

        buttGroup_Marca.add(rbutt_cyzone);
        rbutt_cyzone.setText("Cy°Zone");
        rbutt_cyzone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutt_cyzoneActionPerformed(evt);
            }
        });
        jPanel2.add(rbutt_cyzone);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 220, -1));

        lblProd.setText("Producto");
        jPanel1.add(lblProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        cmbProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Labial rojo intenso", "Esmalte color piel", "Risadores extra large", "Sombras negras intensas" }));
        jPanel1.add(cmbProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 190, -1));

        cmbTipoP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Labial", "Perfumes", "Cremas", "Sombras", "Desmaquilladoras", "Ropa", "Delineadores", "Rimel", "Desodorantes", "Shampoo", "Accesorios", "Otros" }));
        jPanel1.add(cmbTipoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 190, 20));

        lblTipo.setText("Tipo producto");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lineamientos por producto"));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Colonia antonio banderas",  new Integer(10),  new Integer(200)},
                { new Integer(2), "Labial carmin",  new Integer(25),  new Integer(150)},
                { new Integer(3), "Desodorante ranpolla",  new Integer(15),  new Integer(160)},
                { new Integer(4), "Sombra tono obscuro",  new Integer(30), null}
            },
            new String [] {
                "Id", "Nombre", "% máximo desc", "Stock máximo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 430, 150));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_1.png"))); // NOI18N
        jButton1.setToolTipText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lineamientos por tipo"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Maquillaje",  new Integer(12),  new Integer(10)},
                {"Perfume",  new Integer(8),  new Integer(15)},
                {"Ropa",  new Integer(10),  new Integer(25)},
                {"Desodorante",  new Integer(6),  new Integer(20)},
                {"Sombras",  new Integer(15),  new Integer(25)}
            },
            new String [] {
                "Nombre tipo", "N° máximo de descuentos", "% máximo de descuentos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 420, 150));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_1.png"))); // NOI18N
        jButton2.setToolTipText("Buscar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbutt_cyzoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutt_cyzoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbutt_cyzoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame frames = new JFrame("Error message");
        jop.showMessageDialog(frames,"Obtienendo accesos al sistema branding","",JOptionPane.INFORMATION_MESSAGE);// TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ObtenerLineamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObtenerLineamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObtenerLineamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObtenerLineamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObtenerLineamientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttGroup_Marca;
    private javax.swing.JComboBox cmbProd;
    private javax.swing.JComboBox cmbTipoP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblProd;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JRadioButton rbutt_cyzone;
    private javax.swing.JRadioButton rbutt_esika;
    private javax.swing.JRadioButton rbutt_lebel;
    // End of variables declaration//GEN-END:variables
}
