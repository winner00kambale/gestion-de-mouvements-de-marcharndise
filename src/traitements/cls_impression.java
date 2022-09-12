
package traitements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class cls_impression {

    private static int _confi() {
        int x = JOptionPane.showConfirmDialog(null, "Voulez vous Visualiser ?","Impression",JOptionPane.YES_NO_OPTION);
        return x;
    }
     static Connection con;
     
    public static void print(String requete, String cheminJasper) throws SQLException {
        int y = 2;
        try {
            con=DriverManager.getConnection(connexion.cls_connexion.getconnexion());
            JasperDesign g = JRXmlLoader.load(cheminJasper);
            JRDesignQuery gn = new JRDesignQuery();
            gn.setText(requete);
            g.setQuery(gn);
            HashMap n = new HashMap();
            JasperReport f1 = JasperCompileManager.compileReport(g);
            JasperPrint a = JasperFillManager.fillReport(f1, null, con );
            if (_confi() == 1) {
                if (y == 2) {
                    JasperPrintManager.printReport(a, true);
                } else if (y == 2) {
                    JasperPrintManager.printReport(a, false);
                }
            } else {
                JasperViewer.viewReport(a, false);
            }
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
