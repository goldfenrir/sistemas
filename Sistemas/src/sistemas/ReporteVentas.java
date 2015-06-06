/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author alulab14
 */
public class ReporteVentas extends javax.swing.JFrame {
    private String pathPie="src\\img\\PieChart.jpg";
     private String pathBar="src\\img\\BarChart.jpg";
      private String pathDisp="src\\img\\DispChart.jpg";
    private String pathAct="";
    private boolean first=true;
    MyTableModel ventasModel;
    /**
     * Creates new form Template
     */
    public ReporteVentas() {
        this.setTitle("Reporte de ventas");
        ventasModel = new MyTableModel();
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_SP.png"));
        setIconImage(icon);
        
	//jTable1.setModel(ventasModel);
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        comboAgrupar = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnExp = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 700, 10));

        jLabel1.setText("Fecha Inicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setText("Fecha Fin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setText("Tipo de gráfico");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Circular", "Barras" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, 20));

        jLabel4.setText("Ordenar por:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Fecha");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Nombre de producto");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel5.setText("Agrupar por:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        comboAgrupar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "Marca", "Producto", "Campaña" }));
        comboAgrupar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAgruparActionPerformed(evt);
            }
        });
        jPanel1.add(comboAgrupar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 160, -1));

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, -1));

        jLabel6.setText("Unidades");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("UNIDADES");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("USD MILES");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setToolTipText("");

        jTable1.setModel(ventasModel);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 420, 270));

        btnExp.setText("Exportar");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });
        jPanel1.add(btnExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, -1, -1));

        jCheckBox3.setText("Excel (.xlsx)");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jCheckBox1.setText("PDF(Gráfico)");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
	class MyTableModel extends AbstractTableModel{
		//ArrayList<Product> productsLst = SalesManager.queryAllProducts(); 
		ArrayList<String>  titles=new ArrayList<String>()  ;
		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return titles.size();
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			//eturn productsLst.size();
                        return 0;
		}

		@Override
		public Object getValueAt(int row, int col) {
			String value = "";
			switch(col){
				//case 0:  value = "" + productsLst.get(row).getId(); break;
				//case 1:  value = productsLst.get(row).getName(); break;
				//case 2:  value = "" + productsLst.get(row).getPrice(); break;
				//case 3:  value = "" + productsLst.get(row).getStock(); break;	
                          
			}
			return value;
		}
		
		public String getColumnName(int col){
			return titles.get(col);
		}
		
	}
    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
       if (first){
           JOptionPane.showMessageDialog(new JFrame(), "Cree los datos a exportar");
           return;
       }
        if (!jCheckBox3.isSelected() && !jCheckBox1.isSelected()){
           JOptionPane.showMessageDialog(new JFrame(), "Seleccione algún formato de salida");
           return;
       }
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
                           Utils.writeXLSXFile(jTable1,pathSave+"\\reporteVenta.xlsx");
                           Utils.imageToPDF(ImageIO.read(new File(pathAct)),pathSave+"\\grafico.pdf");
                       }else if(jCheckBox3.isSelected()){
                           Utils.writeXLSXFile(jTable1,pathSave+"\\reporteVenta.xlsx");
                       }else if(jCheckBox1.isSelected()){
                           Utils.imageToPDF(ImageIO.read(new File(pathAct)),pathSave+"\\grafico.pdf");
                       }



                } catch (IOException ex) {
                    Logger.getLogger(ReporteVentas.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
       
    }//GEN-LAST:event_btnExpActionPerformed

    private void comboAgruparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAgruparActionPerformed
        // TODO add your handling code here:
        if(comboAgrupar.getSelectedIndex()==0){//Por mes
            ventasModel.titles.add("Código");
            ventasModel.titles.add("Nombre de mes");
            ventasModel.titles.add("Total");
        }
        else if(comboAgrupar.getSelectedIndex()==1){// Por marca
            ventasModel.titles.clear();
            ventasModel.titles.add("Marca");
            int mesIni =jDateChooser1.getDate().getMonth();
            int anoIni= jDateChooser1.getDate().getYear();
            int mesFin =jDateChooser2.getDate().getMonth();
            int anoFin =jDateChooser2.getDate().getYear();
            System.out.println(mesIni);
            System.out.println(anoIni);
            System.out.println(mesFin);
            System.out.println(anoFin);
            int cantMeses=mesFin-mesIni;
            
            if(anoIni<anoFin) cantMeses+= ((anoFin-anoIni)*12);       
            for(int i=mesIni;i<mesIni+cantMeses;i++){
                ventasModel.titles.add(toMonth(i,anoIni));
                System.out.println(toMonth(i,anoIni));
            }
                  
        }  
        ventasModel.fireTableChanged(null);   
    }//GEN-LAST:event_comboAgruparActionPerformed
    private String toMonth(int i,int anho){
        int year=(i-1)/12+1+anho-100;
        int month=(i-1)%12 + 1;
        if(month==1) return "Ene"+year;
        if(month==2) return "Feb"+year;
        if(month==3) return "Mar"+year;
        if(month==4) return "Abr"+year;
        if(month==5) return "May"+year;
        if(month==6) return "Jun"+year;
        if(month==7) return "Jul"+year;
        if(month==8) return "Ago"+year;
        if(month==9) return "Set"+year;
        if(month==10) return "Oct"+year;
        if(month==11) return "Nov"+year;
         return "Dec"+year;
        
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sel=(String)(jComboBox1.getSelectedItem());
        JFreeChart chart=null;
        if (sel.compareTo("Circular")==0){
            chart =Utils.JTableToPieChart(jTable1,"Gráfico Circular",0);
            try{
                final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
                final File file1=new File(pathPie); 
                pathAct=pathPie;
                ChartUtilities.saveChartAsJPEG(file1, chart, 600, 400);             
           }catch(Exception e){

           }
           
        }else if (sel.compareTo("Barras")==0){
           // JOptionPane.showMessageDialog(new JFrame(), "Barras");
            chart =Utils.JTableToBarChart(jTable1,"Gráfico Barras",0);
            try{
                final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
                final File file1=new File(pathBar); 
                pathAct=pathBar;
                ChartUtilities.saveChartAsJPEG(file1, chart, 600, 400);             
           }catch(Exception e){

           }
        }
        if (first){
          panelC=new ChartPanel(chart); 
         
         panelC.setDomainZoomable(true);
         panelC.setVisible(true);
         jPanel1.add(panelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 340, 260));     
         this.pack(); 
         this.repaint(); 
         first=false;
        }else{
            panelC.setChart(chart);
            this.pack(); 
            this.repaint();   
        }
         
       
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
            java.util.logging.Logger.getLogger(ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteVentas().setVisible(true);
            }
        });
    }
    
    public javax.swing.JPanel getPanel(){
        return jPanel1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox comboAgrupar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    ChartPanel panelC;
}
