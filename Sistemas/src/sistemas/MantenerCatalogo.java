/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import Model.Catalogo;
import SalesBusinessModel.SalesManager;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alulab14
 */
public class MantenerCatalogo extends javax.swing.JFrame {

    private DetallePagina appDet;
    JOptionPane jop = new JOptionPane();
    ArrayList<Integer> colores= new ArrayList<Integer>();
    ArrayList<Integer> paginas= new ArrayList<Integer>();
    /**
     * Creates new form Template
     */
    public MantenerCatalogo(MainCampaña p) {
        appDet = new DetallePagina();
        appDet.setParent(this);
        prin = p;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        text_paginas = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_paginas = new javax.swing.JTable();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        but_colors = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_colors = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 700, 10));

        jLabel1.setText("<html>Codigo del catálogo ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, -1));

        jLabel2.setText("Fecha de lanzamiento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel3.setText("Cantidad total de páginas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel5.setText("Temática");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setText("23");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 110, -1));

        text_paginas.setEditable(false);
        text_paginas.setText("0");
        jPanel1.add(text_paginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 40, -1));

        jTextField4.setEditable(false);
        jTextField4.setText("Día de la Madre");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 100, -1));

        jLabel6.setText("Lista de páginas del catálogo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        table_paginas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº pag", "Cantidad de Productos", "Fecha última modificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_paginas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        table_paginas.setMinimumSize(new java.awt.Dimension(100, 200));
        table_paginas.getTableHeader().setResizingAllowed(false);
        jScrollPane2.setViewportView(table_paginas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 580, 250));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, -1));

        jLabel7.setText("Código de la campaña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setText("12");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, -1));

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jButton3.setText("-");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jButton4.setText("M");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Colores"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        but_colors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rojo", "Verde", "Amarillo", "Marrón", "Azul", "Violeta", "Naranja", "Blanco", "Negro" }));
        but_colors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_colorsActionPerformed(evt);
            }
        });
        jPanel2.add(but_colors, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 90, -1));

        jButton5.setText("Eliminar color");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        table_colors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_colors);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 270, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 310, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 770, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_colorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_colorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_but_colorsActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(paginas.size()==0){
            int dia= fecha.getDate().getDate();
            int mes= fecha.getDate().getMonth()+1;
            int anho=fecha.getDate().getYear()+1900;
                DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(
                FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
            String fecha=""+dia+"."+mes+"."+anho;
            //LocalDate ld=LocalDate.parse(fecha, germanFormatter);
            int cant=Integer.parseInt(text_paginas.getText());
            
            Catalogo c= new Catalogo(1,1,null,cant);
            SalesManager.addCatalogo(c);
            for(int i=0;i<colores.size();i++){
                SalesManager.AddColors(2,1, colores.get(i));
            }
        }
        paginas.add(0);
        prin.agregarPaginaCatalogo();

        //appBus.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int ind=but_colors.getSelectedIndex();
        String a=but_colors.getItemAt(ind).toString();
        DefaultTableModel model = (DefaultTableModel) table_colors.getModel();
        model.addRow(new Object[]{""+ind, a});
        colores.add(ind+1);
        //table_colors.
        //table_colors.getModel().
        //table_colors.add((Component)a);
        //table_colors.
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table_colors.getModel();
        int i=table_colors.getSelectedRow();
        model.removeRow(i);
        colores.remove(i);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MantenerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenerCatalogo(prin).setVisible(true);
            }
        });
    }
    
    public javax.swing.JPanel getPanel(){
        return jPanel1;
    }
    
    public void setCant(int cant){
        paginas.set(paginas.size()-1, cant);
        DefaultTableModel model = (DefaultTableModel) table_paginas.getModel();
        model.addRow(new Object[]{""+paginas.size(), cant,LocalDate.now()});
        model.fireTableChanged(null);
        int pags=Integer.parseInt(text_paginas.getText())+1;
        text_paginas.setText(""+pags);
        prin.desapilar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox but_colors;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable table_colors;
    private javax.swing.JTable table_paginas;
    private javax.swing.JTextField text_paginas;
    // End of variables declaration//GEN-END:variables
    private static MainCampaña prin;
}
