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
public class MantenerObjetivosF extends javax.swing.JFrame {
    JOptionPane jop = new JOptionPane();
    /**
     * Creates new form Template
     */
    public MantenerObjetivosF() {
        initComponents();
        visibleItems();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_valor = new javax.swing.JTextField();
        combo_tipo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        text_idCampaña = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        text_tematica = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        text_nombre1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        lblProd = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox();
        cmbTipoP = new javax.swing.JComboBox();
        lblCamp = new javax.swing.JLabel();
        cmbCamp = new javax.swing.JComboBox();
        lblMarca = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        text_prod = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        text_id1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        combo_tipo1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        text_valor1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        text_valor2 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        text_idCampaña1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        text_tematica1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        text_nombre2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnSave = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 700, 10));

        jPanel3.setPreferredSize(new java.awt.Dimension(675, 620));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Id");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 39, 32));

        jLabel2.setText("Tipo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        text_id.setEditable(false);
        jPanel3.add(text_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 190, -1));

        jLabel3.setText("Unidad medida");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setText("Valor");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        text_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_valorKeyTyped(evt);
            }
        });
        jPanel3.add(text_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, -1));

        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Incremento respecto a campaña", "Por producto", "Por tipo de producto", "Por marca" }));
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });
        jPanel3.add(combo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de campaña"));

        jLabel5.setText("IdCampaña");

        text_idCampaña.setEditable(false);
        text_idCampaña.setText("23");
        text_idCampaña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_idCampañaActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre");

        text_tematica.setEditable(false);
        text_tematica.setText("Día de la madre");
        text_tematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tematicaActionPerformed(evt);
            }
        });

        jLabel7.setText("Temática");

        text_nombre1.setEditable(false);
        text_nombre1.setText("Campaña 5");
        text_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombre1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(text_idCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_nombre1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(49, 49, 49)
                        .addComponent(text_tematica)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(text_idCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(text_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(text_tematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Porcentaje", "Unidades", "Reales", "Dólares" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, -1));

        lblProd.setText("Producto");
        jPanel3.add(lblProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L'bel", "Esika", "Cy°Zone" }));
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });
        jPanel3.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, -1));

        cmbTipoP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Labial", "Perfumes", "Cremas", "Sombras", "Desmaquilladoras", "Ropa", "Delineadores", "Rimel", "Desodorantes", "Shampoo", "Accesorios", "Otros" }));
        jPanel3.add(cmbTipoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, 20));

        lblCamp.setText("Campaña");
        jPanel3.add(lblCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        cmbCamp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Campaña 12 (diciembre)", "Campaña 1 (enero)", "Campaña 2 (febrero)", "Campaña 3 (marzo)", "Campaña 4 (abril)", " " }));
        jPanel3.add(cmbCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, -1));

        lblMarca.setText("Marca");
        jPanel3.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 73, -1));

        lblTipo.setText("Tipo producto");
        jPanel3.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Objetivos"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Tipo", "Objeto tipo", "Unidad medida", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 590, 210));
        jPanel3.add(text_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, -1));

        jTabbedPane1.addTab("Objetivos", jPanel3);
        jPanel3.getAccessibleContext().setAccessibleName("");

        jPanel5.setMaximumSize(new java.awt.Dimension(2147483647, 214748697));
        jPanel5.setMinimumSize(new java.awt.Dimension(640, 660));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Id");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 39, 32));
        jPanel5.add(text_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 190, -1));

        jLabel9.setText("Tipo");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        combo_tipo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Incremento respecto a campaña", "Por producto", "Por tipo de producto", "Por marca" }));
        combo_tipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipo1ActionPerformed(evt);
            }
        });
        jPanel5.add(combo_tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 190, -1));

        jLabel10.setText("Unidad medida");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Porcentaje", "Unidades", "Reales", "Dólares" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, -1));

        jLabel11.setText("Valor máximo");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 90, -1));

        text_valor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_valor1KeyTyped(evt);
            }
        });
        jPanel5.add(text_valor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 190, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Objetivos"));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Tipo", "Objeto tipo", "Unidad medida", "Valor", "IdCampaña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel6.add(jScrollPane2);

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 590, 210));

        jLabel12.setText("Valor mínimo");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 90, -1));

        text_valor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_valor2KeyTyped(evt);
            }
        });
        jPanel5.add(text_valor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 190, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de campaña"));

        jLabel13.setText("IdCampaña");

        text_idCampaña1.setText("23");
        text_idCampaña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_idCampaña1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Nombre");

        text_tematica1.setText("Día de la madre");
        text_tematica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tematica1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Temática");

        text_nombre2.setText("Campaña 5");
        text_nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombre2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(text_idCampaña1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_nombre2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(49, 49, 49)
                        .addComponent(text_tematica1)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(text_idCampaña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(text_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(text_tematica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_1.png"))); // NOI18N
        jButton1.setToolTipText("Buscar");
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 90, -1));

        jTabbedPane1.addTab("Buscar", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 710, 620));
        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        jToolBar1.setRollover(true);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-32.png"))); // NOI18N
        btnSave.setToolTipText("Guardar");
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
        btnAdd.setToolTipText("Nuevo");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAdd);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x-mark-3-32.png"))); // NOI18N
        btnDelete.setToolTipText("Eliminar");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDelete);

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help-32.png"))); // NOI18N
        btnHelp.setToolTipText("Ayuda");
        btnHelp.setFocusable(false);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHelp);

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info-3-32.png"))); // NOI18N
        btnInfo.setToolTipText("Información");
        btnInfo.setFocusable(false);
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnInfo);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_valorKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JFrame frame = new JFrame("Error message");
            jop.showMessageDialog(null,"Está ingresando letras","Error de input",JOptionPane.ERROR_MESSAGE);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_text_valorKeyTyped

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        lblCamp.setVisible(false);
        cmbCamp.setVisible(false);
        lblProd.setVisible(false);
        
        lblTipo.setVisible(false);
        cmbTipoP.setVisible(false);
        lblMarca.setVisible(false);
        cmbMarca.setVisible(false);
        if(combo_tipo.getSelectedItem().toString().compareTo("Incremento respecto a campaña")==0){
            lblCamp.setVisible(true);
            cmbCamp.setVisible(true);
        }
        else if(combo_tipo.getSelectedItem().toString().compareTo("Por producto")==0){
            lblProd.setVisible(true);
            BuscaProd appBus= new BuscaProd();
            appBus.setVisible(true);
        }
        else if(combo_tipo.getSelectedItem().toString().compareTo("Por tipo de producto")==0){
            lblTipo.setVisible(true);
            cmbTipoP.setVisible(true);
        }
        else if(combo_tipo.getSelectedItem().toString().compareTo("Por marca")==0){
            lblMarca.setVisible(true);
            cmbMarca.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipoActionPerformed

    private void text_idCampañaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_idCampañaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_idCampañaActionPerformed

    private void text_tematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tematicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tematicaActionPerformed

    private void text_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombre1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void combo_tipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipo1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void text_valor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_valor1KeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JFrame frame = new JFrame("Error message");
            jop.showMessageDialog(null,"Está ingresando letras","Error de input",JOptionPane.ERROR_MESSAGE);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_text_valor1KeyTyped

    private void text_valor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_valor2KeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JFrame frame = new JFrame("Error message");
            jop.showMessageDialog(null,"Está ingresando letras","Error de input",JOptionPane.ERROR_MESSAGE);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_text_valor2KeyTyped

    private void text_idCampaña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_idCampaña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_idCampaña1ActionPerformed

    private void text_tematica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tematica1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tematica1ActionPerformed

    private void text_nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombre2ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public void visibleItems(){
            lblCamp.setVisible(false);
            cmbCamp.setVisible(false);
            lblProd.setVisible(false);
            
            lblTipo.setVisible(false);
            cmbTipoP.setVisible(false);   
            lblMarca.setVisible(false);
            cmbMarca.setVisible(false);            
    }
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
            java.util.logging.Logger.getLogger(MantenerObjetivosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenerObjetivosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenerObjetivosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenerObjetivosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenerObjetivosF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbCamp;
    private javax.swing.JComboBox cmbMarca;
    private javax.swing.JComboBox cmbTipoP;
    private javax.swing.JComboBox combo_tipo;
    private javax.swing.JComboBox combo_tipo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCamp;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblProd;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField text_id1;
    private javax.swing.JTextField text_idCampaña;
    private javax.swing.JTextField text_idCampaña1;
    private javax.swing.JTextField text_nombre1;
    private javax.swing.JTextField text_nombre2;
    private javax.swing.JTextField text_prod;
    private javax.swing.JTextField text_tematica;
    private javax.swing.JTextField text_tematica1;
    private javax.swing.JTextField text_valor;
    private javax.swing.JTextField text_valor1;
    private javax.swing.JTextField text_valor2;
    // End of variables declaration//GEN-END:variables
}
