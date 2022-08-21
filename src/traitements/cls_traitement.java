
package traitements;

import frm_secondaires.frm_client;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import secondaires.pan_agent;


public class cls_traitement {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public void appel(JPanel p,JPanel pan){
        pan.removeAll();
        pan.add(p);
        pan.repaint();
        pan.revalidate();
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
    public void affichager(JTable table,String rqt){
        try {
            con=DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps=con.prepareStatement(rqt);
            rs=ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erruer de chargement" +e);
        }
    }
    public void saveClient(JLabel id,JTextField nom,JTextField post,JTextField prenom,JComboBox genre,JTextField adresse,JTextField tel){
        try {
            con=DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            ps=con.prepareStatement("exec sp_client ?,?,?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, nom.getText());
            ps.setString(3, post.getText());
            ps.setString(4, prenom.getText());
            ps.setString(5, genre.getSelectedItem().toString());
            ps.setString(6, adresse.getText());
            ps.setString(7, tel.getText());
            ps.setBytes(8, frm_client.img12);
            ps.execute();
            JOptionPane.showMessageDialog(null, "ok");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "non" +e);
        }
    }
}
