/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import DAO.SQLServerDAOProduct;
import SalesBusinessModel.SalesManager;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;

/**
 *
 * @author alulab14
 */
public class Proyecciones extends javax.swing.JFrame {

    /**
     * Creates new form Template
     */
    private String pathAct="";
     private String pathLinearChart="src\\img\\LinearChart.jpg";
     private BuscaProd appBus;
    public Proyecciones() {
        appBus = new BuscaProd();
        appBus.setParent(this);
        salesModel = new MyTableModel();
        futureSales = new MyTableModel();
        initComponents();
        initComponents2();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_SP.png"));
        setIconImage(icon);
    }

    /**kkk
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents2(){
        cmbMarca.setVisible(false);
        cmbTipoP.setVisible(false);
        getTxtCodP().setVisible(false);
        jLabel4.setVisible(false);
         jLabel3.setVisible(false);       
         jLabel2.setVisible(false);       
                
        MyItemListener actionListener = new MyItemListener();
        jComboBox1.addItemListener(actionListener);
    }

    /**
     * @return the txtCodP
     */
    public javax.swing.JTextField getTxtCodP() {
        return txtCodP;
    }

    /**
     * @param txtCodP the txtCodP to set
     */
    public void setTxtCodP(javax.swing.JTextField txtCodP) {
        this.txtCodP = txtCodP;
    }
    
    
    class MyItemListener implements ItemListener {
  // This method is called only if a new item has been selected.
        public void itemStateChanged(ItemEvent evt) {
          JComboBox cb = (JComboBox) evt.getSource();

          Object item = evt.getItem();

          if (evt.getStateChange() == ItemEvent.SELECTED) {
              cmbMarca.setVisible(false);
                cmbTipoP.setVisible(false);
                getTxtCodP().setVisible(false);
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
                    getTxtCodP().setText("");
                    getTxtCodP().selectAll();
                    getTxtCodP().setEditable(false);
                    getTxtCodP().setVisible(true);
                //BuscaProd appBus= new BuscaProd();
                //appBus.setParent(this);
                appBus.setVisible(true);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtGen = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
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

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Valores Actuales");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 30));

        jLabel7.setText("Valores Futuros");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 170));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 250, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 510, 200));

        txtGen.setText("Generar");
        txtGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenActionPerformed(evt);
            }
        });
        jPanel1.add(txtGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, 40));

        btnExp.setText("Exportar");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });
        jPanel1.add(btnExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, -1, -1));

        jCheckBox1.setText("PDF");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, 20));

        jCheckBox3.setText("Excel (.xls)");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
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

    private void txtCodPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPActionPerformed
        // TODO add your handling code here:
        getTxtCodP().setText("");
    }//GEN-LAST:event_txtCodPActionPerformed

    private void txtCodPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodPMouseClicked
        // TODO add your handling code here:
        getTxtCodP().setText("");
    }//GEN-LAST:event_txtCodPMouseClicked

    private void txtGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenActionPerformed
        //se generó
        int type = 1;
        ArrayList<String> fechas2 = new ArrayList<String>();
        ArrayList<String> fechasFuturas = new ArrayList<String>();
        LocalDate dia = LocalDate.now();
        if (jRadioButton1.isSelected())
            type = 1;
        if (jRadioButton2.isSelected())
            type = 2;
        for(int i = 0; i<15;i++){
            String fecha = "" + (i+1) + "-" + dia.getMonthValue() + "-" + dia.getYear();
            String fecha2 = "" + (i+15) + "-" + dia.getMonthValue() + "-" + dia.getYear();
            fechasFuturas.add(fecha2);
            fechas2.add(fecha);
        }
        salesModel.fechas = fechas2;
        futureSales.fechas  = fechasFuturas;
        if(jComboBox1.getSelectedIndex() == 3){
            int idprod = Integer.parseInt(txtCodP.getText());
            System.out.println("" + idprod + " " + dia.getMonthValue());
            salesModel.cants = SalesManager.queryDailySalesByProduct(idprod, 
                   dia.getMonthValue(), dia.getYear(), type);
            
        }
        if(jComboBox1.getSelectedIndex() == 2){
            String tipoProd = (String)cmbTipoP.getSelectedItem();
            //query por tipo prod;
            salesModel.cants = SalesManager.queryDailySalesByProdType(cmbTipoP.getSelectedIndex(), dia.getMonthValue(), dia.getYear(), type);
        }
        if(jComboBox1.getSelectedIndex() == 1){
            //por marca
            int ind = cmbMarca.getSelectedIndex();
            String brand = "";
            switch(ind){
                case 0 : brand = "lbel";break;
                case 1 : brand = "esika"; break;
                case 2 : brand  = "cyzone"; break;
            }
            salesModel.cants = SalesManager.queryDailySalesByBrand(brand, dia.getMonthValue(), dia.getYear(), type);   
        }
        else {
            salesModel.cants = SalesManager.queryAllDailySales(dia.getMonthValue(), dia.getYear(), type);
        }
        jTable1.setModel(salesModel);
        salesModel.fireTableChanged(null);
        double pend, constant;
        pend = Utils.getM(salesModel.cants);
        constant = Utils.getConstant(salesModel.cants, pend);
        ArrayList<Double> listaFut = Utils.generarValoresFuturos(constant, pend);
        futureSales.cants = new ArrayList<Object>();
        for(int i = 0; i<listaFut.size(); i++)
            futureSales.cants.add((Object)listaFut.get(i));
        jTable2.setModel(futureSales);
        futureSales.fireTableChanged(null);
        JFreeChart chart = Utils.JTableToLinearChart(jTable1, constant, pend, type);
        try{
                final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
                final File file1=new File(pathLinearChart);
                pathAct=pathLinearChart;
                ChartUtilities.saveChartAsJPEG(file1, chart, 600, 400);
            }catch(Exception e){

            }
        panelC=new ChartPanel(chart);

            //panelC.setDomainZoomable(true);
            panelC.setVisible(true);
            panelC.setPreferredSize(new Dimension(300,100));
            jPanel1.add(panelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 350, 200));
            pack();
            jPanel1.revalidate();
            pack();
    }//GEN-LAST:event_txtGenActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        String pathSave=null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int userSelection = fileChooser.showSaveDialog(this);
        File fileToSave=null;
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            pathSave=fileToSave.getAbsolutePath();
        }else if (userSelection == JFileChooser.CANCEL_OPTION){
            pathSave=null;
        }

        if (pathSave!=null){
            try {
                // TODO add your handling code here:
                //   Utils.writeToExcell(jTable1,Paths.get("C:\\Temp"));
                //jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seasonalpie.gif"))); // NOI18N
                if (jCheckBox3.isSelected() && jCheckBox1.isSelected()){
                    Utils.writeXLSXFile(jTable1,pathSave+"\\proyeccionMes.xlsx");
                    Utils.imageToPDF(ImageIO.read(new File(pathAct)),pathSave+"\\graficoProyeccion.pdf");
                }else if(jCheckBox3.isSelected()){
                    Utils.writeXLSXFile(jTable1,pathSave+"\\proyeccionMes.xlsx");
                }else if(jCheckBox1.isSelected()){
                    Utils.imageToPDF(ImageIO.read(new File(pathAct)),pathSave+"\\graficoProyeccion.pdf");
                }

            } catch (IOException ex) {
                Logger.getLogger(ReporteVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnExpActionPerformed

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
    
    public void setCod(String codigo){
        txtCodP.setText(codigo);
        
    }
    
    class MyTableModel extends AbstractTableModel{
            ArrayList<String> fechas;
             ArrayList<Object> cants;
             ArrayList<Double> subs=new ArrayList<Double>();
		//ArrayList<Product> productsLst = SalesManager.queryAllProducts(); 
		String[]  titles= {"Fecha", "Unidad", "Cantidad"} ;
		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return titles.length;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			//eturn productsLst.size();
                        return fechas.size();
		}

		@Override
		public Object getValueAt(int row, int col) {
			String value = "";
                        if(col == 0){
                            value  = fechas.get(row);
                            return value;
                        }
                        if(col == 1){
                            if(jRadioButton1.isSelected())
                                value ="unidades";
                            else
                                value = "USD miles";
                            return value;
                        }
			if(col == 2 && row < cants.size()){
                            if(cants.get(row) instanceof Integer){
                                int num = (Integer)cants.get(row);
                                value = "" + num;
                                return value;
                            }
                            if(cants.get(row) instanceof Double){
                                double num = (Double)cants.get(row);
                                value = "" +num;
                                return value;
                            }
                        }
			return value;
		}
		
		public String getColumnName(int col){
			return titles[col];
		}
		
	} 
    
    public javax.swing.JPanel getPanel(){
        return jPanel1;
    }
    
    private ChartPanel panelC;
    private MyTableModel salesModel;
    private MyTableModel futureSales;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExp;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCodP;
    private javax.swing.JButton txtGen;
    // End of variables declaration//GEN-END:variables
}
