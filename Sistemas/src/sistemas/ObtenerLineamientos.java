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
public class ObtenerLineamientos extends javax.swing.JFrame {

    /**
     * Creates new form Template
     */
    public ObtenerLineamientos() {
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
        jToolBar1 = new javax.swing.JToolBar();
        btnSave = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInfo1 = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-32.png"))); // NOI18N
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

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blank-file-32.png"))); // NOI18N
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAdd);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x-mark-3-32.png"))); // NOI18N
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDelete);

        btnInfo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer-32.png"))); // NOI18N
        btnInfo1.setFocusable(false);
        btnInfo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnInfo1);

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help-32.png"))); // NOI18N
        btnHelp.setFocusable(false);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHelp);

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info-3-32.png"))); // NOI18N
        btnInfo.setFocusable(false);
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnInfo);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 700, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInfo1;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
