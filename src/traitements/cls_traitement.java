package traitements;

import frm_secondaires.frm_client;
import static frm_secondaires.frm_client.photo;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.JXLabel;
import org.jdesktop.swingx.JXPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import principale.Login;
import principale.home;
import static principale.home.texte;


public class cls_traitement {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void appel(JPanel p, JPanel pan) {
        pan.removeAll();
        pan.add(p);
        pan.repaint();
        pan.revalidate();
    }

    public ImageIcon retourner(String a, byte[] b) {
        ImageIcon img = null;
        if (a != null) {
            img = new ImageIcon(a);
        } else {
            img = new ImageIcon(b);
        }
        Image i = img.getImage().getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
        img = new ImageIcon(i);
        return img;
    }

    public void photo(JLabel PHOTO, JLabel chemin) {

        try {
            JFileChooser h = new JFileChooser();
            h.showOpenDialog(null);
            File f = h.getSelectedFile();
            String s = f.getAbsolutePath();
            chemin.setText(s);
            ImageIcon i = new ImageIcon(s);
            Rectangle re = PHOTO.getBounds();
            Image img = i.getImage().getScaledInstance(PHOTO.getWidth(), PHOTO.getHeight(), Image.SCALE_DEFAULT);
            i = new ImageIcon(img);
            PHOTO.setIcon(i);
            File t = new File(s);
            FileInputStream v = new FileInputStream(t);
            ByteArrayOutputStream o = new ByteArrayOutputStream();
            byte[] x = new byte[1024];
            for (int d; (d = v.read(x)) != -1;) {
                o.write(x, 0, d);
                frm_client.img12 = o.toByteArray();
            }
        } catch (Exception e) {
        }
    }
    public void label(JLabel lbl,String col1,String col2,String table){
        try {
            con=DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps=con.prepareStatement("select "+col1+" as "+col2+" from "+table+"");
            rs=ps.executeQuery();
            while(rs.next()){
                lbl.setText(rs.getString(col2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur" +e);
        }
    }

    public void affichager(JTable table, String rqt) {
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement(rqt);
            rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erruer de chargement" + e);
        }
    }

    public void chargerBox(String col1, String col2, String table, JComboBox c) {
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select " + col1 + " as " + col2 + "  from " + table + "");
            rs = ps.executeQuery();
            while (rs.next()) {
                c.addItem(rs.getString(col2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur" + e);
        }
    }
    public void fonction_H_F_Statistique(JXPanel Panel, JXLabel exp, JXLabel pa) {
        try {

            DefaultPieDataset dod = new DefaultPieDataset();
            dod.setValue("Expedition", Integer.parseInt(exp.getText()));
            dod.setValue("Payement", Integer.parseInt(pa.getText()));
            JFreeChart jc = ChartFactory.createPieChart3D("Statistique D'expedition et Payement", dod, true, true, false);
            ChartPanel chartPanel = new ChartPanel(jc);
            Panel.removeAll();
            Panel.add(chartPanel);
            chartPanel.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur ");
        }

    }

    public void saveClient(JLabel id, JTextField nom, JTextField post, JTextField prenom, JComboBox genre, JTextField adresse, JTextField tel) {
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("exec sp_client ?,?,?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, nom.getText());
            ps.setString(3, post.getText());
            ps.setString(4, prenom.getText());
            ps.setString(5, genre.getSelectedItem().toString());
            ps.setString(6, adresse.getText());
            ps.setString(7, tel.getText());
            ps.setBytes(8, frm_client.img12);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Operation reussi avec succes");
            id.setText("");
            nom.setText("");
            post.setText("");
            prenom.setText("");
            adresse.setText("");
            tel.setText("");
            photo.setIcon(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }
    }

    public void selectClient(JTable tab, JLabel id, JTextField nom, JTextField post, JTextField prenom, JComboBox genre, JTextField adresse, JTextField tel, JLabel photo) {
        try {
            int sel = tab.getSelectedRow();
            String model = tab.getModel().getValueAt(sel, 0).toString();
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select * from tclient where id ='" + model + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                id.setText(rs.getString(1));
                nom.setText(rs.getString(2));
                post.setText(rs.getString(3));
                prenom.setText(rs.getString(4));
                genre.setSelectedItem(rs.getString(5));
                adresse.setText(rs.getString(6));
                tel.setText(rs.getString(7));
                photo.setIcon(retourner(null, rs.getBytes(8)));
            }
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }

    public void selectCli(JTable tab, JTextField nom) {
        try {
            int sel = tab.getSelectedRow();
            String model = tab.getModel().getValueAt(sel, 0).toString();
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select nom+'   '+postnom+'   '+prenom cli from tclient where id ='" + model + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                nom.setText(rs.getString("cli"));
            }
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }

    public void addExpedidion(JLabel id, JTextField client, JTextField designation, JTextField qt, JComboBox type, JComboBox destin) {
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("exec sp_marchandise ?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, designation.getText());
            ps.setString(3, qt.getText());
            ps.setString(4, type.getSelectedItem().toString());
            ps.setString(5, client.getText());
            ps.setString(6, destin.getSelectedItem().toString());
            ps.execute();
            JOptionPane.showMessageDialog(null, "succes");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur" + e);
        }
    }

    public void modExpedidion(JLabel id, JTextField client, JTextField designation, JTextField qt, JTextField type, JComboBox destin) {
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("exec mod_marchandise ?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, designation.getText());
            ps.setString(3, qt.getText());
            ps.setString(4, type.getText());
            ps.setString(5, client.getText());
            ps.setString(6, destin.getSelectedItem().toString());
            ps.execute();
            JOptionPane.showMessageDialog(null, "succes");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur" + e);
        }
    }

    public void selectExpedition(JTable tab, JLabel id, JTextField client, JTextField designation, JTextField qt, JComboBox type, JComboBox destin) {
        try {
            int sel = tab.getSelectedRow();
            String model = tab.getModel().getValueAt(sel, 0).toString();
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select * from affMarchandise where id ='" + model + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                id.setText(rs.getString("id"));
                client.setText(rs.getString("noms_client"));
                designation.setText(rs.getString("designation"));
                qt.setText(rs.getString("quantite"));
                type.setSelectedItem(rs.getString("typemarchandise"));
                destin.setSelectedItem(rs.getString("destination"));
            }
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }

    public void insererDestination(JLabel id, JTextField des) {
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("exec sp_destination ?,?");
            ps.setString(1, id.getText());
            ps.setString(2, des.getText().trim());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Mise a jour effectuee");
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }
     public void insererType(JLabel id, JTextField des) {
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("exec sp_type ?,?");
            ps.setString(1, id.getText());
            ps.setString(2, des.getText().trim());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Mise a jour effectuee");
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }

    public void selectionDestination(JTable tab, JLabel id, JTextField des) {
        try {
            int sel = tab.getSelectedRow();
            String model = tab.getModel().getValueAt(sel, 0).toString();
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select * from tdestination where id ='" + model + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                id.setText(rs.getString(1));
                des.setText(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }
    public void selectionType(JTable tab, JLabel id, JTextField des) {
        try {
            int sel = tab.getSelectedRow();
            String model = tab.getModel().getValueAt(sel, 0).toString();
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select * from ttytpe where id ='" + model + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                id.setText(rs.getString(1));
                des.setText(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }

    public void selectionMarcharndise(JTable tab, JTextField id, JTextField design, JTextField type, JTextField qt) {
        try {
            int sel = tab.getSelectedRow();
            String model = tab.getModel().getValueAt(sel, 0).toString();
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select m.id,m.designation,m.typemarchandise,m.quantite,ds.designation destination \n"
                    + "from tdepot d  right join tmarchadise m  on d.ref_marchan=m.id inner join tdestination\n"
                    + "ds on ds.id=m.refdestination where m.id not in (select tdepot.ref_marchan from tdepot) and m.id ='" + model + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                id.setText(rs.getString("id"));
                design.setText(rs.getString("designation"));
                type.setText(rs.getString("typemarchandise"));
                qt.setText(rs.getString("quantite"));
            }

        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }

    public void insertDepot(JTextField ref, JTextField design, JTextField qt) {
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("exec sp_depot ?,?,?");
            ps.setString(1, design.getText().trim());
            ps.setString(3, qt.getText());
            ps.setString(2, ref.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Insertion reussi");
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }

    public void selectExpedition(JTable tab, JComboBox ref, JTextField design) {
        try {
            int sel = tab.getSelectedRow();
            String model = tab.getModel().getValueAt(sel, 0).toString();
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select  m.id,m.designation,m.quantite,m.typemarchandise types,c.nom+'  '+c.postnom+'  '+c.prenom clients from \n"
                    + "tmarchadise m inner join tclient c on c.id=m.refcli where m.id ='" + model + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                ref.setSelectedItem(rs.getString("id"));
                design.setText(rs.getString("designation"));
            }
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }
    public void insertPayement(JLabel id,JComboBox ref,JTextArea Libelle,JTextField design,JTextField monatnt){
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("exec sp_payement ?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, Libelle.getText().trim());
            ps.setString(3, monatnt.getText());
            ps.setString(4, design.getText().trim());
            ps.setString(5, ref.getSelectedItem().toString());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Operation reussi avec succes");
            id.setText("");
            Libelle.setText("");
            monatnt.setText("");
            design.setText("");
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }
    public void selectPayement(JTable tab,JLabel id, JComboBox ref, JTextField design,JTextArea libelle,JTextField montant) {
        try {
            int sel = tab.getSelectedRow();
            String model = tab.getModel().getValueAt(sel, 0).toString();
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select * from tpayement where id ='" + model + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                id.setText(rs.getString("id"));
                ref.setSelectedItem(rs.getString("ref_exp"));
                design.setText(rs.getString("designation"));
                libelle.setText(rs.getString("libelle"));
                montant.setText(rs.getString("montant"));
            }
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }
    public void user(JTextField nom, JPasswordField pass, JFrame frm_connexion) {
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select * from tuser where email='" + nom.getText() + "'  and passwords ='" + pass.getText() + "'");
            rs = ps.executeQuery();
            if(rs.next()){
                if("Admin".equalsIgnoreCase(rs.getString("niveau"))){
                     home h = new home();
                    frm_connexion.hide();
                    h.show();
                    texte.setText(rs.getString("email"));
                }else if("Utilisateur".equalsIgnoreCase(rs.getString("niveau"))){
                    home h = new home();
                    frm_connexion.hide();
                    h.show();
                    texte.setText(rs.getString("email"));
                    h.users.setEnabled(false);
                    h.destination.setEnabled(false);
                    h.type.setEnabled(false);
                }
            }else{
                Login.lbltext.setText("Vérifier votre Email et PassWord");
            }
        } catch (Exception e) {
        }
    }
    public void insertUser(JLabel id,JTextField mail,JTextField pass,JComboBox niveau){
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("exec sp_user ?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, mail.getText().trim());
            ps.setString(3, pass.getText().trim());
            ps.setString(4, niveau.getSelectedItem().toString());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Operation reussi avec succes");
            id.setText("");
            mail.setText("");
            pass.setText("");
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }
    
    public void selectUser(JTable tab,JLabel id,JTextField mail,JTextField pass,JComboBox niveau){
        try {
            int sel = tab.getSelectedRow();
            String model = tab.getModel().getValueAt(sel, 0).toString();
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("select * from tuser where id ='" + model + "' ");
            rs = ps.executeQuery();
            while(rs.next()){
                id.setText(rs.getString("id"));
                mail.setText(rs.getString("email"));
                pass.setText(rs.getString("passwords"));
                niveau.setSelectedItem(rs.getString("niveau"));
            }
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }
    public void delete(JLabel id){
        try {
            con = DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps = con.prepareStatement("delete from tuser where id=?");
            ps.setString(1, id.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Supprimer avec succes");
        } catch (Exception e) {
            System.out.println("erreur" + e);
        }
    }
    
    public void heureDate(JLabel l) {
        try {
            Thread clock = new Thread() {
                public void run() {
                    for (;;) {
                        Calendar cal = new GregorianCalendar();
                        int seconde = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int heure = cal.get(Calendar.HOUR_OF_DAY);
                        int jour = cal.get(Calendar.DAY_OF_MONTH);
                        int mois = cal.get(Calendar.MONTH);
                        int annee = cal.get(Calendar.YEAR);
                        l.setText(" Il est  " + heure + "h" + (minute) + " min " + seconde + " sec ");
//                        l2.setText("Goma   Le " + jour + "/" + (mois+1) + "/" + annee);
                        try {
                            sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            };
            clock.start();
        } catch (Exception e) {
        }
    }

}
