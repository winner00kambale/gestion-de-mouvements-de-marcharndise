package principale;

import dialogues.frm_destination;
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
import javax.swing.JPanel;
import traitements.cls_traitement;

public class home extends javax.swing.JFrame {

    traitements.cls_traitement t = new cls_traitement();

    public home() {
        initComponents();
        t.appel(new DashBorad(), pan);
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
        pan = new RoundedPanel(50, Color.WHITE);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cls_myBouton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cls_myBouton4, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(cls_myBouton5, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(cls_myBouton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addComponent(cls_myBouton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
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
                .addGap(208, 208, 208))
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
        jMenuBar1.add(jMenu6);

        jMenu2.setText("Fichier");
        jMenu2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private traitements.cls_myBouton cls_myBouton1;
    private traitements.cls_myBouton cls_myBouton2;
    private traitements.cls_myBouton cls_myBouton3;
    private traitements.cls_myBouton cls_myBouton4;
    private traitements.cls_myBouton cls_myBouton5;
    private traitements.cls_myBouton cls_myBouton6;
    private traitements.cls_myBouton cls_myBouton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pan;
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
