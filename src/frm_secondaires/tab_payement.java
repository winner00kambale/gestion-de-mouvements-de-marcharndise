package frm_secondaires;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import traitements.cls_impression;
import traitements.cls_traitement;

public class tab_payement extends javax.swing.JPanel {

    traitements.cls_traitement t = new cls_traitement();

    public tab_payement() {
        initComponents();
        txtclient.setEnabled(false);
        t.affichager(tclient, "select id,nom,postnom,prenom from tclient order by id desc");
        t.chargerBox("designation", "designation", "tdestination order by id desc", cbdestination);
        t.affichager(tmarcharndise, "select * from affMarchandise order by id desc");
        expedition.setEnabled(false);
        designation.setEnabled(false);
        id.setVisible(false);
        mod.setEnabled(false);
        lblid.setVisible(false);
        t.chargerBox("id", "id", "tmarchadise order by id desc", expedition);
        t.affichager(texpedition, "select  m.id,m.designation,m.quantite,m.typemarchandise types,c.nom+'  '+c.postnom+'  '+c.prenom clients from \n"
                + "tmarchadise m inner join tclient c on c.id=m.refcli where m.id not in (select ref_exp from tpayement) order by m.id desc");
        t.affichager(tpayement, "select * from tpayement");
        t.chargerBox("designation", "designation", "ttytpe", txttype);
        t.label(mouvemente, "MAX(noms_client)", "maximum", "affMarchandise where datejour=FORMAT(GETDATE(),'yyyy-MM-dd')");
        t.label(moins, "MIN(noms_client)", "min", "affMarchandise where datejour=FORMAT(GETDATE(),'yyyy-MM-dd')");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new RoundedPanel(50, Color.WHITE);
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdesignation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtclient = new javax.swing.JTextField();
        cbdestination = new javax.swing.JComboBox<>();
        txtquantite1 = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        txttype = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tclient = new javax.swing.JTable();
        recherche = new org.jdesktop.swingx.JXSearchField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tmarcharndise = new javax.swing.JTable();
        add = new traitements.cls_myBouton();
        mod = new traitements.cls_myBouton();
        moins = new javax.swing.JLabel();
        mouvemente = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        expedition = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        libele = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        montant = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cls_myBouton1 = new traitements.cls_myBouton();
        cls_myBouton2 = new traitements.cls_myBouton();
        cls_myBouton3 = new traitements.cls_myBouton();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        texpedition = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tpayement = new javax.swing.JTable();
        id = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(41, 55, 72));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nom du client");

        jLabel4.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Quantite / Kg");

        txtdesignation.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtdesignation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtdesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesignationActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Type marcharndise");

        jLabel6.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Destination");

        jLabel7.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Designation");

        txtclient.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtclient.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclientActionPerformed(evt);
            }
        });

        cbdestination.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cbdestination.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txtquantite1.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtquantite1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtquantite1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantite1ActionPerformed(evt);
            }
        });
        txtquantite1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtquantite1KeyTyped(evt);
            }
        });

        txttype.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtclient, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtquantite1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbdestination, 0, 271, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txttype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(txtclient, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(txtdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtquantite1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addComponent(cbdestination, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 310));

        jLabel16.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel16.setText("EXPEDITION  DES  MARCHANDISES");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 37));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file-d-attente-de-café-les-gens-attendent-le-restaurant-alimentaire-la-rue-nourriture-hommes-et-femmes-bar-à-salades-ont-besoin-172866152_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 260));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selectionner le client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 0, 18))); // NOI18N

        tclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tclientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tclient);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 490, -1));

        recherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercheKeyReleased(evt);
            }
        });
        jPanel1.add(recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 210, -1));

        tmarcharndise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tmarcharndise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmarcharndiseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tmarcharndise);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 660, 250));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_approval_32.png"))); // NOI18N
        add.setText("Enregistrer");
        add.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        add.setRadius(20);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 260, -1, 40));

        mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_update_32.png"))); // NOI18N
        mod.setText("Modifier");
        mod.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        mod.setRadius(20);
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        jPanel1.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 150, 40));

        moins.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        moins.setForeground(new java.awt.Color(255, 51, 51));
        moins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moins.setText("Client moins Mouvementé ");
        jPanel1.add(moins, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 170, -1));

        mouvemente.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        mouvemente.setForeground(new java.awt.Color(255, 51, 51));
        mouvemente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mouvemente.setText("Client plus Mouvementé ");
        jPanel1.add(mouvemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 160, -1));

        jLabel18.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Client plus Mouvementé ");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 160, -1));

        jLabel15.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Client moins Mouvementé ");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 170, -1));

        jTabbedPane1.addTab("Expedition", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel17.setText("PAYEMENTS");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 37));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_money_bag_32_1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 50, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        expedition.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        expedition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        expedition.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                expeditionItemStateChanged(evt);
            }
        });
        expedition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expeditionMouseClicked(evt);
            }
        });
        expedition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expeditionActionPerformed(evt);
            }
        });
        expedition.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                expeditionPropertyChange(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Ref Expedition");

        jLabel9.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Libele");

        libele.setColumns(20);
        libele.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        libele.setRows(5);
        jScrollPane3.setViewportView(libele);

        jLabel10.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Designantion");

        designation.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        designation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        designation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationActionPerformed(evt);
            }
        });

        montant.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        montant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        montant.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        montant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montantActionPerformed(evt);
            }
        });
        montant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montantKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("PU/ Kg en USD");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(designation)
                    .addComponent(montant)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(expedition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expedition, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 330));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cls_myBouton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_update_32.png"))); // NOI18N
        cls_myBouton1.setText("Modifier");
        cls_myBouton1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cls_myBouton1.setRadius(20);
        cls_myBouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton1ActionPerformed(evt);
            }
        });

        cls_myBouton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_approval_32.png"))); // NOI18N
        cls_myBouton2.setText("Enregistrer");
        cls_myBouton2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cls_myBouton2.setRadius(20);
        cls_myBouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton2ActionPerformed(evt);
            }
        });

        cls_myBouton3.setText("Print_Facture");
        cls_myBouton3.setRadius(20);
        cls_myBouton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cls_myBouton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cls_myBouton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cls_myBouton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cls_myBouton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cls_myBouton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cls_myBouton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ezgif-2-6d0b072c3d3f.gif"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 470, 80));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expedition Non Payées ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 0, 16))); // NOI18N

        texpedition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        texpedition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texpeditionMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(texpedition);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 86, -1, -1));

        tpayement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tpayement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpayementMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tpayement);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 950, 150));
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 62, 23));

        jTabbedPane1.addTab("Payement", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tclientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tclientMouseClicked
        t.selectCli(tclient, txtclient);
    }//GEN-LAST:event_tclientMouseClicked

    private void rechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercheKeyReleased
        t.affichager(tclient, "select id,nom,postnom,prenom from tclient where nom like '%" + recherche.getText() + "%' or postnom like '%" + recherche.getText() + "%' or prenom like '%" + recherche.getText() + "%' order by id desc ");        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheKeyReleased

    private void txtdesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesignationActionPerformed

    private void txtclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclientActionPerformed

    private void txtquantite1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantite1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantite1ActionPerformed

    private void txtquantite1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquantite1KeyTyped
        char t = evt.getKeyChar();
        if (!(Character.isDigit(t) || (t == KeyEvent.VK_BACK_SPACE) || (t == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtquantite1KeyTyped

    private void tmarcharndiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmarcharndiseMouseClicked
        t.selectExpedition(tmarcharndise, lblid, txtclient, txtdesignation, txtquantite1, txttype, cbdestination);
        add.setEnabled(false);
        mod.setEnabled(true);
    }//GEN-LAST:event_tmarcharndiseMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       if (txtclient.getText().isEmpty() || txtdesignation.getText().isEmpty() || txtquantite1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires");
        } else {
            t.addExpedidion(lblid, txtclient, txtdesignation, txtquantite1, txttype, cbdestination);
            t.affichager(tmarcharndise, "select * from affMarchandise order by id desc");
            t.label(mouvemente, "MAX(noms_client)", "maximum", "affMarchandise where datejour=FORMAT(GETDATE(),'yyyy-MM-dd')");
            t.label(moins, "MIN(noms_client)", "min", "affMarchandise where datejour=FORMAT(GETDATE(),'yyyy-MM-dd')");
            txtclient.setText("");
            txtdesignation.setText("");
            txtquantite1.setText("");
            lblid.setText("");
        }
    }//GEN-LAST:event_addActionPerformed

    private void expeditionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_expeditionItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_expeditionItemStateChanged

    private void expeditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expeditionMouseClicked
        //t.affichager(texpedition, "select  m.id,m.designation,m.quantite,m.typemarchandise types,c.nom+'  '+c.postnom+'  '+c.prenom clients from tmarchadise m inner join tclient c on c.id=m.refcli where m.id='" + expedition.getSelectedItem().toString() + "'");
    }//GEN-LAST:event_expeditionMouseClicked

    private void expeditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expeditionActionPerformed
        // t.affichager(texpedition, "select  m.id,m.designation,m.quantite,m.typemarchandise types,c.nom+'  '+c.postnom+'  '+c.prenom clients from tmarchadise m inner join tclient c on c.id=m.refcli where m.id='" + expedition.getSelectedItem().toString() + "'");
    }//GEN-LAST:event_expeditionActionPerformed

    private void expeditionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_expeditionPropertyChange
        //t.affichager(texpedition, "select  m.id,m.designation,m.quantite,m.typemarchandise types,c.nom+'  '+c.postnom+'  '+c.prenom clients from tmarchadise m inner join tclient c on c.id=m.refcli where m.id='" + expedition.getSelectedItem().toString() + "'");
    }//GEN-LAST:event_expeditionPropertyChange

    private void designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationActionPerformed

    private void montantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montantActionPerformed

    private void montantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montantKeyTyped
        char t = evt.getKeyChar();
        if (!(Character.isDigit(t) || (t == KeyEvent.VK_BACK_SPACE) || (t == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_montantKeyTyped

    private void cls_myBouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton1ActionPerformed
        if (libele.getText().isEmpty() || designation.getText().isEmpty() || montant.getText().isEmpty() || id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires !!!");
        } else {
            t.insertPayement(id, expedition, libele, designation, montant);
            t.affichager(tpayement, "select * from tpayement");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_cls_myBouton1ActionPerformed

    private void cls_myBouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton2ActionPerformed
        if (libele.getText().isEmpty() || designation.getText().isEmpty() || montant.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires !!!");
        } else {
            t.insertPayement(id, expedition, libele, designation, montant);
            t.affichager(tpayement, "select * from tpayement");
            t.affichager(texpedition, "select  m.id,m.designation,m.quantite,m.typemarchandise types,c.nom+'  '+c.postnom+'  '+c.prenom clients from \n"
                    + "tmarchadise m inner join tclient c on c.id=m.refcli where m.id not in (select ref_exp from tpayement) order by m.id desc");
        }

    }//GEN-LAST:event_cls_myBouton2ActionPerformed

    private void cls_myBouton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton3ActionPerformed
        traitements.cls_impression i = new cls_impression();
        if (id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veillez selectionner svp !!!");
        } else {
            try {
                i.print("select * from facture where id= '" + id.getText() + "'", "C:\\CheminJava\\Facture_marchandise.Jrxml");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_cls_myBouton3ActionPerformed

    private void texpeditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texpeditionMouseClicked
        t.selectExpedition(texpedition, expedition, designation);        // TODO add your handling code here:
    }//GEN-LAST:event_texpeditionMouseClicked

    private void tpayementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpayementMouseClicked
        t.selectPayement(tpayement, id, expedition, designation, libele, montant);        // TODO add your handling code here:
    }//GEN-LAST:event_tpayementMouseClicked

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        if (lblid.getText().isEmpty() || txtclient.getText().isEmpty() || txtdesignation.getText().isEmpty() || txtquantite1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires");
        } else {
            t.addExpedidion(lblid, txtclient, txtdesignation, txtquantite1, txttype, cbdestination);
            t.affichager(tmarcharndise, "select * from affMarchandise order by id desc");
            t.label(mouvemente, "MAX(noms_client)", "maximum", "affMarchandise where datejour=FORMAT(GETDATE(),'yyyy-MM-dd')");
            t.label(moins, "MIN(noms_client)", "min", "affMarchandise where datejour=FORMAT(GETDATE(),'yyyy-MM-dd')");
            txtclient.setText("");
            txtdesignation.setText("");
            txtquantite1.setText("");
            lblid.setText("");
            mod.setEnabled(false);
            add.setEnabled(true);
        }
    }//GEN-LAST:event_modActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private traitements.cls_myBouton add;
    private javax.swing.JComboBox<String> cbdestination;
    private traitements.cls_myBouton cls_myBouton1;
    private traitements.cls_myBouton cls_myBouton2;
    private traitements.cls_myBouton cls_myBouton3;
    private javax.swing.JTextField designation;
    private javax.swing.JComboBox<String> expedition;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextArea libele;
    private traitements.cls_myBouton mod;
    private javax.swing.JLabel moins;
    private javax.swing.JTextField montant;
    private javax.swing.JLabel mouvemente;
    private org.jdesktop.swingx.JXSearchField recherche;
    private javax.swing.JTable tclient;
    private javax.swing.JTable texpedition;
    private javax.swing.JTable tmarcharndise;
    private javax.swing.JTable tpayement;
    private javax.swing.JTextField txtclient;
    private javax.swing.JTextField txtdesignation;
    private javax.swing.JTextField txtquantite1;
    private javax.swing.JComboBox<String> txttype;
    // End of variables declaration//GEN-END:variables
class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            //graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint border
        }
    }
}
