package frm_secondaires;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import traitements.cls_impression;
import traitements.cls_traitement;

public class frm_depot extends javax.swing.JPanel {

    traitements.cls_traitement t = new cls_traitement();

    public frm_depot() {
        initComponents();
        txtreference1.setEnabled(false);
        txtdesignation1.setEnabled(false);
        txttype.setEnabled(false);
        txtquntite1.setEnabled(false);
        t.affichager(tmarchandise, "select m.id,m.designation,m.typemarchandise,m.quantite,ds.designation destination \n"
                + "from tdepot d  right join tmarchadise m  on d.ref_marchan=m.id inner join tdestination\n"
                + "ds on ds.id=m.refdestination where m.id not in (select tdepot.ref_marchan from tdepot) order by m.id desc");
        t.affichager(tdepot, "select m.id,m.designation,m.typemarchandise,m.quantite,ds.designation destination,c.nom+'  '+c.prenom Noms_client,d.date_depot\n"
                + "from tdepot d  left join tmarchadise m  on d.ref_marchan=m.id inner join tdestination\n"
                + "ds on ds.id=m.refdestination inner join tclient c on c.id=m.refcli");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundedPanel(50, Color.WHITE);
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmarchandise = new javax.swing.JTable();
        recherche = new org.jdesktop.swingx.JXSearchField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdepot = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtreference1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdesignation1 = new javax.swing.JTextField();
        txttype = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtquntite1 = new javax.swing.JTextField();
        Quantite = new javax.swing.JLabel();
        cls_myBouton1 = new traitements.cls_myBouton();
        cls_myBouton2 = new traitements.cls_myBouton();

        jPanel1.setBackground(new java.awt.Color(41, 55, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel16.setText("DEPOT DE LA MARCHANDISE");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 31, 233, 37));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selectionner la Marchandise à mettre au dépot", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 0, 18))); // NOI18N

        tmarchandise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tmarchandise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmarchandiseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tmarchandise);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 111, 490, 240));

        recherche.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        recherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercheKeyReleased(evt);
            }
        });
        jPanel1.add(recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 74, 233, -1));

        tdepot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tdepot);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 358, 959, 230));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Reference");

        txtreference1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        txtreference1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtreference1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtreference1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreference1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Designation");

        txtdesignation1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        txtdesignation1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdesignation1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtdesignation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesignation1ActionPerformed(evt);
            }
        });

        txttype.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        txttype.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttype.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Type Marchandise");

        txtquntite1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        txtquntite1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtquntite1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtquntite1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquntite1ActionPerformed(evt);
            }
        });

        Quantite.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        Quantite.setForeground(new java.awt.Color(51, 51, 51));
        Quantite.setText("Quantite /Kg ou Carton");

        cls_myBouton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_approval_32.png"))); // NOI18N
        cls_myBouton1.setText("Enregistrer");
        cls_myBouton1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cls_myBouton1.setRadius(20);
        cls_myBouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton1ActionPerformed(evt);
            }
        });

        cls_myBouton2.setText("Imprimer Rapport");
        cls_myBouton2.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cls_myBouton2.setRadius(20);
        cls_myBouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cls_myBouton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(cls_myBouton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 118, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdesignation1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttype, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtreference1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Quantite, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtquntite1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 40, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Quantite))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtreference1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtquntite1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdesignation1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cls_myBouton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cls_myBouton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 460, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tmarchandiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmarchandiseMouseClicked
        t.selectionMarcharndise(tmarchandise, txtreference1, txtdesignation1, txttype, txtquntite1);
    }//GEN-LAST:event_tmarchandiseMouseClicked

    private void txtreference1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreference1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreference1ActionPerformed

    private void txtdesignation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesignation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesignation1ActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtquntite1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquntite1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquntite1ActionPerformed

    private void cls_myBouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton1ActionPerformed
        if (txtreference1.getText().isEmpty() || txtdesignation1.getText().isEmpty() || txtquntite1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tous les champs sont obligatoires");
        } else {

            t.insertDepot(txtreference1, txtdesignation1, txtquntite1);
            t.affichager(tmarchandise, "select m.id,m.designation,m.typemarchandise,m.quantite,ds.designation destination \n"
                    + "from tdepot d  right join tmarchadise m  on d.ref_marchan=m.id inner join tdestination\n"
                    + "ds on ds.id=m.refdestination where m.id not in (select tdepot.ref_marchan from tdepot) order by m.id desc");
            t.affichager(tdepot, "select m.id,m.designation,m.typemarchandise,m.quantite,ds.designation destination,c.nom+'  '+c.prenom Noms_client,d.date_depot\n"
                    + "from tdepot d  left join tmarchadise m  on d.ref_marchan=m.id inner join tdestination\n"
                    + "ds on ds.id=m.refdestination inner join tclient c on c.id=m.refcli");
            txtreference1.setText("");
            txtdesignation1.setText("");
            txtquntite1.setText("");
            txttype.setText("");
        }
    }//GEN-LAST:event_cls_myBouton1ActionPerformed

    private void rechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercheKeyReleased
        t.affichager(tmarchandise, "select m.id,m.designation,m.typemarchandise,m.quantite,ds.designation destination \n"
                + "from tdepot d  right join tmarchadise m  on d.ref_marchan=m.id inner join tdestination\n"
                + "ds on ds.id=m.refdestination where m.id not in (select tdepot.ref_marchan from tdepot) and m.designation like '%" + recherche.getText() + "%' order by m.id desc");
    }//GEN-LAST:event_rechercheKeyReleased

    private void cls_myBouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton2ActionPerformed
        traitements.cls_impression i =new cls_impression();
        try {
            i.print("select * from affDepot", "C:\\CheminJava\\BonEntre.Jrxml");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cls_myBouton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Quantite;
    private traitements.cls_myBouton cls_myBouton1;
    private traitements.cls_myBouton cls_myBouton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXSearchField recherche;
    private javax.swing.JTable tdepot;
    private javax.swing.JTable tmarchandise;
    private javax.swing.JTextField txtdesignation1;
    private javax.swing.JTextField txtquntite1;
    private javax.swing.JTextField txtreference1;
    private javax.swing.JTextField txttype;
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
