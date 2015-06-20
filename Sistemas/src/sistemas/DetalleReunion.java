/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import Model.Acuerdo;
import Model.Reunion;
import SalesBusinessModel.SalesManager;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;


import javax.swing.table.AbstractTableModel;

/**
 *
 * @author goldfenrir
 */
public class DetalleReunion extends javax.swing.JFrame {

    /**
     * Creates new form DetalleReunion
     */
    public DetalleReunion(JTable reuniones) {
        initComponents();
        reu=reuniones;
        initComponents2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAddAcu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtIdReu = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextTema = new javax.swing.JTextArea();
        txtIdAcuerdo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnOK = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        cmbArea = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("IdReunion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, -1));

        jLabel2.setText("Fecha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));

        jLabel3.setText("Tema");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        jLabel4.setText("Área Participante");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        jLabel5.setText("Campaña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        btnAddAcu.setText("Agregar Acuerdo");
        btnAddAcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAcuActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddAcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel6.setText("IdAcuerdo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 80, -1));

        jLabel7.setText("Descripción");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 80, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 630, 220));

        txtIdReu.setEditable(false);
        txtIdReu.setEnabled(false);
        jPanel1.add(txtIdReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 170, -1));
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 170, -1));

        jTextTema.setColumns(20);
        jTextTema.setRows(5);
        jScrollPane2.setViewportView(jTextTema);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, -1));

        txtIdAcuerdo.setEditable(false);
        txtIdAcuerdo.setEnabled(false);
        jPanel1.add(txtIdAcuerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 170, -1));

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane3.setViewportView(txtDesc);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel1.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 100, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Campaña día de la madre", "Campaña Fiestas Patrias", "Campaña Inicio de Primavera" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));

        cmbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Branding", "Princing", "Portafolio" }));
        jPanel1.add(cmbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAcuActionPerformed
        int aux=Integer.parseInt(txtIdAcuerdo.getText())+1;    
        txtIdAcuerdo.setText(""+aux);
        Acuerdo acu=new Acuerdo();
        acu.setIdAcuerdo(aux);
        acu.setDescripcion(txtDesc.getText());
        model.acuerdosLst.add(acu);
        
        model.fireTableDataChanged();
        txtDesc.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_btnAddAcuActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        
        Reunion reunion=new Reunion();
        reunion.setIdReunion(Integer.parseInt(txtIdReu.getText()));
        reunion.setAcuerdos(model.acuerdosLst);
        reunion.setAreaInvolucrada(cmbArea.getSelectedItem().toString());
        reunion.setCampanha(1);
        reunion.setDuracion("2 días");
        Date dat=jDateChooser.getDate();
        LocalDate localDate = LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(dat) );
        reunion.setFecha(localDate);
        reunion.setTema(jTextTema.getText());
        GenerarAcuerdos.addReu(reunion);
        int idR=Integer.parseInt(txtIdReu.getText())+1;
        txtIdReu.setText(""+idR);
        jTextTema.setText("");
        this.setVisible(false);
        SalesManager.addReunion(reunion);
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleReunion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleReunion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleReunion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleReunion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleReunion(null).setVisible(true);
            }
        });
    }
    public void setValues(Reunion r){
        txtIdAcuerdo.setText(""+r.getIdReunion());
        
        Date date = Date.from(r.getFecha().atStartOfDay(ZoneId.systemDefault()).toInstant());
        jDateChooser.setDate(date);
        
        
        jTextTema.setText(r.getTema());
        model.acuerdosLst=r.getAcuerdos();
        model.fireTableDataChanged();
        txtIdAcuerdo.setText(""+SalesManager.lastAcu());
        
    }
    class MyTableModel extends AbstractTableModel{
                public ArrayList<Acuerdo> acuerdosLst = null; //SalesManager.queryAllProducts(); 
                public MyTableModel(){
                    Reunion reu=SalesManager.queryReunionById(Integer.parseInt(txtIdReu.getText()));
                   
                    if (reu!= null){
                        acuerdosLst =reu.getAcuerdos();
                    }else{
                        acuerdosLst=new ArrayList<>();
                    }
                }
		
		String [] titles = {"Código", "Descripción"};
		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 2;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return acuerdosLst.size();
		}

		@Override
		public Object getValueAt(int row, int col) {
			String value = "";
			switch(col){
				case 0:  value = "" + acuerdosLst.get(row).getIdAcuerdo(); break;
				case 1:  value = acuerdosLst.get(row).getDescripcion(); break;			
			}
			return value;
		}
		
		public String getColumnName(int col){
			return titles[col];
		}
		
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAcu;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox cmbArea;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextTema;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtIdAcuerdo;
    private javax.swing.JTextField txtIdReu;
    // End of variables declaration//GEN-END:variables
    private MyTableModel model;
    private JTable reu;

    private void initComponents2() {
        
        txtIdReu.setText(""+SalesManager.lastReu());
        txtIdAcuerdo.setText(""+SalesManager.lastAcu());
        model=new MyTableModel();
        jTable1.setModel(model);
    }
}
