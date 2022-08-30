package principale;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltext = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chek = new javax.swing.JCheckBox();
        cls_myBouton1 = new traitements.cls_myBouton();
        exit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(41, 55, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 0, -1, 293));

        user.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(153, 153, 153));
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setText("Votre email");
        user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 280, 33));

        pass.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(153, 153, 153));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setText("jPassword");
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passMouseExited(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 280, 35));

        jLabel1.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 100, 30));

        jLabel7.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("en utilisant votre compte");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 190, 25));

        jLabel9.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Connectez Vous");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 130, 25));

        jLabel2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel2.setText("PassWord");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 130, 25));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/log.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        lbltext.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        lbltext.setForeground(new java.awt.Color(255, 0, 0));
        lbltext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 320, 20));

        jLabel8.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel8.setText("Adresse Mail");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 130, 25));

        chek.setBackground(new java.awt.Color(255, 255, 255));
        chek.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        chek.setText("Visualiser");
        chek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekActionPerformed(evt);
            }
        });
        jPanel2.add(chek, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 90, -1));

        cls_myBouton1.setText("Connexion");
        cls_myBouton1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        cls_myBouton1.setRadius(20);
        jPanel2.add(cls_myBouton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 140, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, -1, 300));

        exit.setBackground(new java.awt.Color(41, 55, 72));

        jLabel4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        user.setText("");
    }//GEN-LAST:event_userMouseClicked

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        lbltext.setText("Entrer votre Adresse Mail");
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        lbltext.setText("");
    }//GEN-LAST:event_userMouseExited

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        pass.setText("");
    }//GEN-LAST:event_passMouseClicked

    private void passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseEntered
        lbltext.setText("Entrer votre PassWord");
    }//GEN-LAST:event_passMouseEntered

    private void passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseExited
        lbltext.setText("");
    }//GEN-LAST:event_passMouseExited

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            us.user(user, pass, this);
        }
    }//GEN-LAST:event_passKeyPressed

    private void chekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekActionPerformed
        if (chek.isSelected()) {
            pass.setEchoChar((char) 0);
        } else {
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_chekActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        exit.setBackground(Color.red);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        exit.setBackground(new Color(41, 55, 72));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chek;
    private traitements.cls_myBouton cls_myBouton1;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel lbltext;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
