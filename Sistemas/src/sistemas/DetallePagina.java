/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import Model.*;
import SalesBusinessModel.SalesManager;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alulab14
 */
public class DetallePagina extends javax.swing.JFrame {
    private BuscaProd appBus;
    private ArrayList<Integer> productList=new  ArrayList<Integer>();
    private ArrayList<Integer> nivel=new  ArrayList<Integer>();
    private int idCamp=1; // dia de la madre
    private JFrame parent = null;
    /**
     * Creates new form Template
     */
    public DetallePagina() {
        appBus = new BuscaProd();
        appBus.setParent(this);
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_SP.png"));
        setIconImage(icon);
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
        jPanel2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        text_cant = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_prods = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 700, 10));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 700, 10));

        jLabel6.setText("Número de página:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setText("3");
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 50, -1));

        jLabel7.setText("<html>Cantidad de productos<br /> en la página:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        text_cant.setEditable(false);
        text_cant.setText("0");
        text_cant.setName("text_cant"); // NOI18N
        jPanel2.add(text_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 50, -1));

        jLabel1.setText("<html>Porcentaje disponible <br />del total de la pagina");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jTextField15.setEditable(false);
        jTextField15.setText("85%");
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 50, -1));

        jButton1.setLabel("Agregar producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jButton2.setLabel("Retirar producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        table_prods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Nivel Exp.", "Discover"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_prods);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 640, 90));

        jLabel2.setText("Lista de Productos:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jButton3.setText("Agregar Pagina");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BuscaProd prod = new BuscaProd();
        //prod.setVisible(true);
        appBus.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table_prods.getModel();
        int i=table_prods.getSelectedRow();
        model.removeRow(i);
        productList.remove(i);
        text_cant.setText(""+productList.size());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<productList.size();i++){
            DefaultTableModel model = (DefaultTableModel) table_prods.getModel();
            //String num = (String)model.getValueAt(i,2);
            //num.replaceAll("\\s", "");
            //int niv=Integer.parseInt(num);
            nivel.add((Integer)model.getValueAt(i,2));
        }
        SalesManager.AddPagina(1, 2, 1, productList,nivel);
        if(parent!= null){
            //System.out.println("bla2");
            MantenerCatalogo m= (MantenerCatalogo) parent;
            m.setCant(Integer.parseInt(text_cant.getText()));
        }
        //JOptionPane.showMessageDialog(null," Se agrego correctamente la pagina");
        
    }//GEN-LAST:event_jButton3ActionPerformed
public void setParent(JFrame parent){
    this.parent = parent;
}

public JFrame getParent(){
    return parent;
}
    public javax.swing.JPanel getPanel(){
        return jPanel1;
    }
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
            java.util.logging.Logger.getLogger(DetallePagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallePagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallePagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallePagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallePagina().setVisible(true);
            }
        });
    }
    
    public void setProd(int cod,String nombre){

        DefaultTableModel model = (DefaultTableModel) table_prods.getModel();
        model.addRow(new Object[]{cod, nombre});
        productList.add(cod);
        text_cant.setText(""+productList.size());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable table_prods;
    private javax.swing.JTextField text_cant;
    // End of variables declaration//GEN-END:variables
}
