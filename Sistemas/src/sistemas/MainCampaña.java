/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.DesertBlue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author alulab14
 */
public class MainCampaña extends javax.swing.JFrame {

    /**
     * Creates new form Template
     */
    public MainCampaña() {
        
        initComponents();
        modificar();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_SP.png"));
        setIconImage(icon);
        
        panelStack.push(jPanel1);
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
                if(ValorVentana==1){//1 es combos
                    comb.agregarCombo();
                    
                    
                }
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
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

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
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //javax.swing.UIManager.put("OptionPane.font", new FontUIResource(new Font("Verdana", Font.PLAIN, 11))); 
                JOptionPane.showMessageDialog(new JFrame("Información"), info);
            }
        });
        
        regresar = new javax.swing.JButton();
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        regresar.setFocusable(false);
        regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        regresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar99.add(regresar);
        
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorVentana=0;//Para que el valor regresos a cero y se descative la botoneria
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_objetivos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_externos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_reuniones = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_diagnosticos = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jButton10 = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        jButton4 = new javax.swing.JButton();
        jToolBar5 = new javax.swing.JToolBar();
        jButton6 = new javax.swing.JButton();
        jToolBar6 = new javax.swing.JToolBar();
        jButton9 = new javax.swing.JButton();
        jToolBar8 = new javax.swing.JToolBar();
        jButton7 = new javax.swing.JButton();
        jToolBar10 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jToolBar12 = new javax.swing.JToolBar();
        jButton11 = new javax.swing.JButton();
        jToolBar17 = new javax.swing.JToolBar();
        jButton8 = new javax.swing.JButton();
        jToolBar18 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jToolBar19 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);
        jPanel2.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Superplanit");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 200, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la campaña"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Código");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setText("35");
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, -1));

        jTextField2.setEditable(false);
        jTextField2.setText("Campaña 5");
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 130, -1));

        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, -1));

        jLabel4.setText("Fecha inicio ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 60, -1));

        jTextField3.setEditable(false);
        jTextField3.setText("Día de la madre");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, -1));

        jLabel5.setText("Fecha fin");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, -1));

        jTextField4.setEditable(false);
        jTextField4.setText("31/05/2015");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 130, -1));

        jLabel6.setText("Temática");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jTextField5.setEditable(false);
        jTextField5.setText("01/05/2015");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 290, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Objetivos de la campaña"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        table_objetivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Incremento respecto a campaña", "Campaña 2", "10", "Porcentaje"},
                {"Por producto", "Labial rojo intenso", "500", "Unidades"},
                {"Por producto", "Desodorante limon", "3000", "Dólares"},
                {" Por marca", "Esika", "1200", "Unidades"},
                {"Incremento respecto a campaña", "Campaña 3", "2000", "Dólares"},
                {"Por tipo de producto", "Labiales", "350", "Unidades"},
                {" Por marca", "L'bel", "1200", "Dólares"}
            },
            new String [] {
                "Tipo", "Objeto tipo", "Valor", "Unidad "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_objetivos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(table_objetivos);

        jPanel4.add(jScrollPane1);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 500, 160));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Objetivos externos"));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        table_externos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Obtener el 95% de tareas a tiempo"},
                {"2", "Incrementar la fidelidad de nuestros clientes"},
                {"3", "Mantener el primer puesto en productos de belleza"}
            },
            new String [] {
                "Id", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_externos.setPreferredSize(new java.awt.Dimension(200, 48));
        jScrollPane4.setViewportView(table_externos);

        jPanel5.add(jScrollPane4);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 330, 100));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Reuniones"));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        table_reuniones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"50", "Workshop", "22/03/2014"},
                {"51", "Feedback workshop", "23/03/2014"},
                {"52", "presentación pxp", "24/03/2014"},
                {"53", "feedback pxp", "25/03/2014"},
                {"54", "presentación publicidad", "26/03/2014"},
                {"55", "revisión bocetos 1", "29/03/2014"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Tema", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_reuniones);

        jPanel6.add(jScrollPane2);

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 270, 210));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Diágnosticos"));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        table_diagnosticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"25", "15/06/2014", "5"},
                {"26", "16/06/2014", "3"},
                {"27", "16/06/2014", "6"},
                {"28", "17/06/2014", "1"},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Fecha de Registro", "Puntuación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_diagnosticos);

        jPanel7.add(jScrollPane3);

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 250, 110));

        jTabbedPane1.addTab("Campaña", jPanel2);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/goal.gif"))); // NOI18N
        jButton2.setText("Objetivos");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/graph.png"))); // NOI18N
        jButton10.setText("Proyección");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton10);

        jToolBar4.setFloatable(false);
        jToolBar4.setRollover(true);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_SP.png"))); // NOI18N
        jButton4.setText("Campaña");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar4.add(jButton4);

        jToolBar5.setFloatable(false);
        jToolBar5.setRollover(true);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book.png"))); // NOI18N
        jButton6.setText("Catalogo");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar5.add(jButton6);

        jToolBar6.setFloatable(false);
        jToolBar6.setRollover(true);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/direction.png"))); // NOI18N
        jButton9.setText("Lineamientos");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar6.add(jButton9);

        jToolBar8.setFloatable(false);
        jToolBar8.setRollover(true);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo.png"))); // NOI18N
        jButton7.setText("Combos");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar8.add(jButton7);

        jToolBar10.setFloatable(false);
        jToolBar10.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guarantee.png"))); // NOI18N
        jButton1.setText("Acuerdos");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar10.add(jButton1);

        jToolBar12.setFloatable(false);
        jToolBar12.setRollover(true);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report.png"))); // NOI18N
        jButton11.setText("Reporte Venta");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jToolBar12.add(jButton11);

        jToolBar17.setFloatable(false);
        jToolBar17.setRollover(true);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/offer.png"))); // NOI18N
        jButton8.setText("Promociones");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar17.add(jButton8);

        jToolBar18.setFloatable(false);
        jToolBar18.setRollover(true);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_prod.png"))); // NOI18N
        jButton3.setText("Buscar Producto");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar18.add(jButton3);

        jToolBar19.setFloatable(false);
        jToolBar19.setRollover(true);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Medic.png"))); // NOI18N
        jButton5.setText("Diagnóstico");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar19.add(jButton5);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jToolBar19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jToolBar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(199, 199, 199)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToolBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToolBar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jToolBar18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(191, 191, 191)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToolBar12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToolBar10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))))
                    .addComponent(jToolBar18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToolBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Panel Control", jPanel8);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        barra("-Mejora de la alineación de objetivos: Comunique los objetivos estratégicos y tácticos de la organización y proporcione mayor visibilidad a lo largo y a lo ancho de la empresa.\n" +
"-Incremento de la responsabilidad: Asigne a los empleados objetivos concretos, articulados con claridad y visibles para los demás.\n" +
"-Seguimiento de los objetivos: A fin de poder tomar medidas con rapidez, concéntrese en áreas específicas en las que su empresa corre el riesgo de no alcanzar los objetivos.\n" +
"-Fomento de la participación de los empleados: Comunique a los empleados con mayor claridad de qué manera su trabajo diario contribuye a la consecución de los objetivos a largo plazo de la empresa y, en consecuencia, al éxito de la misma.");
        objetivos.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(objetivos.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(objetivos.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
		
    }//GEN-LAST:event_jButton2ActionPerformed
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(new JFrame(),"¿Está seguro?");
			if (res == JOptionPane.OK_OPTION) {
				
			}
    }   
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       //proyecciones
        barra("");
        proy.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(proy.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(proy.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        barra("");
        cat.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(cat.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(cat.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton4ActionPerformed
    public void enlace(){
        barra();
        cat.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(cat.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(cat.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();        
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
//        barra();
//        cat.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
//        getContentPane().add(cat.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
//        pack();
//        panelStack.push(cat.getPanel());
//        getContentPane().removeAll();
//        pack();
//        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
//        pack();
        MantCats m= new MantCats(this);
        m.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //Mantener combos
        barra();
        ValorVentana=1;
        comb.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(comb.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(comb.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        // mantener promocion
        barra("");
        prom.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(prom.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(prom.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        barra("");
        rep.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));
        getContentPane().add(rep.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));
        pack();
        panelStack.push(rep.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));        
        pack();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         barra("");
        buscaProd.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(buscaProd.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(buscaProd.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         barra("");
        diagnostico.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(diagnostico.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(diagnostico.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         barra("");
        acuerdos.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(acuerdos.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(acuerdos.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
		
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         barra("");
        lineamientos.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(lineamientos.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(lineamientos.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
        pack();
		
    }//GEN-LAST:event_jButton9ActionPerformed

    public void agregarPaginaCatalogo(){
        barra("");
        detPag.getPanel().add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(detPag.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        panelStack.push(detPag.getPanel());
        getContentPane().removeAll();
        pack();
        getContentPane().add(panelStack.peek(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));        
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
            java.util.logging.Logger.getLogger(MainCampaña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainCampaña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainCampaña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainCampaña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainCampaña().setVisible(true);
            }
        });
    }
     private void regresarActionPerformed(java.awt.event.ActionEvent evt) { 
        
        getContentPane().removeAll();
        pack();
        panelStack.pop();
        barra("");
        
        javax.swing.JPanel pn = panelStack.peek();
        pn.add(jToolBar99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));
        getContentPane().add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
        pack();
        jToolBar99.setVisible(false);
    }
     private void modificar(){
         table_objetivos.getColumn("Objeto tipo").setMinWidth(130);
         table_objetivos.getColumn("Objeto tipo").setMaxWidth(130);
         table_objetivos.getColumn("Tipo").setMinWidth(190);
         table_objetivos.getColumn("Tipo").setMaxWidth(190);
         table_externos.getColumn("Id").setMinWidth(30);
         table_externos.getColumn("Id").setMaxWidth(30);
         table_reuniones.getColumn("Id").setMaxWidth(30);
         table_reuniones.getColumn("Id").setMinWidth(30);    
         table_reuniones.getColumn("Tema").setMaxWidth(130);
         table_reuniones.getColumn("Tema").setMinWidth(130);   
         table_diagnosticos.getColumn("Id").setMaxWidth(30);
         table_diagnosticos.getColumn("Id").setMinWidth(30);
         table_diagnosticos.getColumn("Puntuación").setMaxWidth(80);
         table_diagnosticos.getColumn("Puntuación").setMinWidth(80);
         table_diagnosticos.getColumn("Fecha de Registro").setMaxWidth(120);
         table_diagnosticos.getColumn("Fecha de Registro").setMinWidth(120);
         
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar10;
    private javax.swing.JToolBar jToolBar12;
    private javax.swing.JToolBar jToolBar17;
    private javax.swing.JToolBar jToolBar18;
    private javax.swing.JToolBar jToolBar19;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JToolBar jToolBar8;
    private javax.swing.JTable table_diagnosticos;
    private javax.swing.JTable table_externos;
    private javax.swing.JTable table_objetivos;
    private javax.swing.JTable table_reuniones;
    // End of variables declaration//GEN-END:variables
     private javax.swing.JButton regresar;
    private Stack <javax.swing.JPanel> panelStack = new Stack<javax.swing.JPanel>();
    private MantenerCatalogo cat = new MantenerCatalogo(this);
    private MantenerPromocion prom = new MantenerPromocion();
    private MantenerCombos comb = new MantenerCombos();
    private DetallePagina detPag = new DetallePagina();
    private BuscaProd buscaProd=new BuscaProd();
    private Diagnostico diagnostico=new Diagnostico();
    private GenerarAcuerdos acuerdos=new GenerarAcuerdos();
    private ObtenerLineamientos lineamientos=new ObtenerLineamientos();
    private MantenerObjetivos objetivos=new MantenerObjetivos();
    
    private javax.swing.JToolBar jToolBar99;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnInfo1;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnAdd;
    private ReporteVentas rep = new ReporteVentas();
    private Proyecciones proy = new Proyecciones();

    private int ValorVentana=0;//Cer4o no referencia a ninguna ventana
}
