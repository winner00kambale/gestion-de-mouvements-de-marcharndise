package principale;

import dialogues.frm_destination;
import dialogues.frm_user;
import frm_secondaires.DashBorad;
import frm_secondaires.frm_client;
import frm_secondaires.frm_depot;
import frm_secondaires.frm_marcharndise;
import frm_secondaires.frm_payement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import traitements.cls_impression;
import traitements.cls_traitement;

public class home extends javax.swing.JFrame {

    traitements.cls_traitement t = new cls_traitement();
    traitements.cls_impression i = new cls_impression();
    public home() {
        initComponents();
        t.appel(new DashBorad(), pan);
        setIconImage();
        t.heureDate(heure);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cls_myBouton1 = new traitements.cls_myBouton();
        cls_myBouton2 = new traitements.cls_myBouton();
        jMenu3 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cls_myBouton3 = new traitements.cls_myBouton();
        cls_myBouton4 = new traitements.cls_myBouton();
        cls_myBouton5 = new traitements.cls_myBouton();
        cls_myBouton6 = new traitements.cls_myBouton();
        jLabel1 = new javax.swing.JLabel();
        cls_myBouton7 = new traitements.cls_myBouton();
        jLabel2 = new javax.swing.JLabel();
        texte = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        pan = new RoundedPanel(50, Color.WHITE);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(41, 55, 72));

        jPanel1.setBackground(new java.awt.Color(41, 55, 72));

        cls_myBouton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_user_group_man_man_32.png"))); // NOI18N
        cls_myBouton3.setText("Reception");
        cls_myBouton3.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        cls_myBouton3.setRadius(20);
        cls_myBouton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton3ActionPerformed(evt);
            }
        });

        cls_myBouton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_send_comment_32.png"))); // NOI18N
        cls_myBouton4.setText("Expédition");
        cls_myBouton4.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        cls_myBouton4.setRadius(20);
        cls_myBouton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton4ActionPerformed(evt);
            }
        });

        cls_myBouton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_money_bag_32.png"))); // NOI18N
        cls_myBouton5.setText("Payement");
        cls_myBouton5.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        cls_myBouton5.setRadius(20);
        cls_myBouton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton5ActionPerformed(evt);
            }
        });

        cls_myBouton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_home_32.png"))); // NOI18N
        cls_myBouton6.setText("DashBoard");
        cls_myBouton6.setFont(new java.awt.Font("Century", 0, 16)); // NOI18N
        cls_myBouton6.setRadius(20);
        cls_myBouton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton6ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/avtar-21.png"))); // NOI18N

        cls_myBouton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_send_comment_32.png"))); // NOI18N
        cls_myBouton7.setText("Dépot");
        cls_myBouton7.setFont(new java.awt.Font("Century", 0, 20)); // NOI18N
        cls_myBouton7.setRadius(20);
        cls_myBouton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls_myBouton7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sécurisée par le compte :");

        texte.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        texte.setForeground(new java.awt.Color(255, 51, 51));
        texte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        texte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Male_User_32.png"))); // NOI18N
        texte.setText("Winnner");
        texte.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        texte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        texte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texteMouseClicked(evt);
            }
        });

        heure.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        heure.setForeground(new java.awt.Color(255, 255, 255));
        heure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heureMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cls_myBouton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cls_myBouton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cls_myBouton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cls_myBouton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addComponent(cls_myBouton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(texte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(heure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(cls_myBouton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cls_myBouton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cls_myBouton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cls_myBouton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cls_myBouton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pan.setBackground(new java.awt.Color(41, 55, 72));
        pan.setLayout(new javax.swing.BoxLayout(pan, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu4.setText("Menus");
        jMenu4.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jMenuItem1.setText("Destination");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Paramettres");
        jMenu6.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Male_User_32.png"))); // NOI18N
        jMenuItem2.setText("Utilisateurs");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuBar1.add(jMenu6);

        jMenu2.setText("Fichier");
        jMenu2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N

        jMenuItem3.setText("Registre de Marchandise");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cls_myBouton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton3ActionPerformed
        t.appel(new frm_client(), pan);        // TODO add your handling code here:
    }//GEN-LAST:event_cls_myBouton3ActionPerformed

    private void cls_myBouton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton4ActionPerformed
        t.appel(new frm_marcharndise(), pan);
    }//GEN-LAST:event_cls_myBouton4ActionPerformed

    private void cls_myBouton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton5ActionPerformed
        t.appel(new frm_payement(), pan);
    }//GEN-LAST:event_cls_myBouton5ActionPerformed

    private void cls_myBouton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton6ActionPerformed
        t.appel(new DashBorad(), pan);
    }//GEN-LAST:event_cls_myBouton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new frm_destination(this, true).show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cls_myBouton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls_myBouton7ActionPerformed
        t.appel(new frm_depot(), pan);
    }//GEN-LAST:event_cls_myBouton7ActionPerformed

    private void texteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texteMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment vous deconnecter???", "deconnexion", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            Login l= new Login();
            l.show();
            this.dispose();
        }
    }//GEN-LAST:event_texteMouseClicked

    private void heureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heureMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_heureMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new frm_user(this, true).show();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        try {
            i.print("select * from affMarchandise", "C:\\CheminJava\\Registre_marchandise.Jrxml");
        } catch (Exception e) {
            System.out.println("desolee !!!");
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8_hospital_64.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private traitements.cls_myBouton cls_myBouton1;
    private traitements.cls_myBouton cls_myBouton2;
    private traitements.cls_myBouton cls_myBouton3;
    private traitements.cls_myBouton cls_myBouton4;
    private traitements.cls_myBouton cls_myBouton5;
    private traitements.cls_myBouton cls_myBouton6;
    private traitements.cls_myBouton cls_myBouton7;
    private javax.swing.JLabel heure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pan;
    public static javax.swing.JLabel texte;
    // End of variables declaration//GEN-END:variables
class RoundedPanel extends JPanel {

        private Color BorderColor;
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
            // BorderColor=new java.awt.Color(0,120,215);
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
