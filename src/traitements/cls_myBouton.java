
package traitements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;


public class cls_myBouton extends JButton{
     public cls_myBouton() {
        //initialisation des couleurs
        setColor(Color.WHITE);
        colorOver=new Color(0,120,215);
        collorclic=new Color(152, 184, 144);
        collorboder=new Color(30, 136, 56);
        color=new Color(0,51,51);
        
        setContentAreaFilled(false);
        //add event mousse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e); //To change body of generated methods, choose Tools | Templates.
                setBackground(colorOver);
                over=true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); //To change body of generated methods, choose Tools | Templates.
          setBackground(Color.WHITE);
                over=false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e); //To change body of generated methods, choose Tools | Templates.
           setBackground(collorclic);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e); //To change body of generated methods, choose Tools | Templates.
            if(over){
                setBackground(colorOver);
            }else{
                setBackground(color);
            }
            }
            
            
            
});
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getCollorclic() {
        return collorclic;
    }

    public void setCollorclic(Color collorclic) {
        this.collorclic = collorclic;
    }

    public Color getCollorboder() {
        return collorboder;
    }

    public void setCollorboder(Color collorboder) {
        this.collorboder = collorboder;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }
    
    private boolean over;
    private Color color;
    private Color collorclic;
    private Color collorboder;
    private int radius = 0;
    private Color colorOver;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //paint border
        g2.setColor(collorboder);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth()-4, getHeight()-4, radius, radius);
        //boder set 2 pix
        
        super.paintComponent(g); 
    }
    
}
