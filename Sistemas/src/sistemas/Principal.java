/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

/**
 *
 * @author alulab14
 */

import java.util.Stack;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Template
     */
    public Principal() {
        initComponents();
        barra();
        jPanel1.add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        //panelStack.p
        panelStack.push(jPanel1);
        //pack();
        
    }
    
    public void barra(){
        jToolBar99 = new javax.swing.JToolBar();
        btnSave = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInfo1 = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jToolBar99.setRollover(true);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-32.png"))); // NOI18N
        btnSave.setToolTipText("Guardar");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //btnSaveActionPerformed(evt);
            }
        });
        jToolBar99.add(btnSave);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blank-file-32.png"))); // NOI18N
        btnAdd.setToolTipText("Nuevo");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar99.add(btnAdd);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x-mark-3-32.png"))); // NOI18N
        btnDelete.setToolTipText("Eliminar");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar99.add(btnDelete);

        btnInfo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer-32.png"))); // NOI18N
        btnInfo1.setToolTipText("Imprimir");
        btnInfo1.setFocusable(false);
        btnInfo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar99.add(btnInfo1);

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help-32.png"))); // NOI18N
        btnHelp.setToolTipText("Ayuda");
        btnHelp.setFocusable(false);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar99.add(btnHelp);

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info-3-32.png"))); // NOI18N
        btnInfo.setToolTipText("Información");
        btnInfo.setFocusable(false);
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar99.add(btnInfo);
        
        regresar = new javax.swing.JButton();
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        regresar.setFocusable(false);
        regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        regresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar99.add(regresar);
        
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        //return jToolBar1;
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 700, 10));

        jButton1.setText("Mantener Catalogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jButton2.setText("Mantener Combos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jButton3.setText("Mantener Promocion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jButton4.setText("Generar Reporte Ventas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jButton5.setText("Generar Proyecciones");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // boton manter catalogo
        barra();
        cat.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(cat.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(cat.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Mantener combos
        barra();
        comb.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(comb.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(comb.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // mantener promocion
        barra();
        prom.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(prom.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(prom.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Reporte ventas
        barra();
        rep.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(rep.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(rep.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //proyecciones
        barra();
        proy.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(proy.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(proy.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) { 
        
        getContentPane().removeAll();
        pack();
        panelStack.pop();
        barra();
        
        javax.swing.JPanel pn = panelStack.peek();
        pn.add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JButton regresar;
    private Stack <javax.swing.JPanel> panelStack = new Stack<javax.swing.JPanel>();
    private MantenerCatalogo cat = new MantenerCatalogo(new MainCampaña());
    private MantenerPromocion prom = new MantenerPromocion();
    private MantenerCombos comb = new MantenerCombos();
    private javax.swing.JToolBar jToolBar99;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnInfo1;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnAdd;
    private ReporteVentas rep = new ReporteVentas();
    private Proyecciones proy = new Proyecciones();
}
