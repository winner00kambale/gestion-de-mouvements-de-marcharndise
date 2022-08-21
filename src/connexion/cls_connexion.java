
package connexion;

import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;



public class cls_connexion {
   
    public static String getconnexion(){
            String chemin = "C:\\CheminJava\\chemin_produit.txt";
            String text = "";
            try {
                text = new String(Files.readAllBytes(Paths.get(chemin)));
//            JOptionPane.showMessageDialog(null, "succes");
            } catch (Exception e) {
                 e.printStackTrace();
            }
            return text;
        }
        public static void main(String[] args) {
        getconnexion();
    }
    
}
