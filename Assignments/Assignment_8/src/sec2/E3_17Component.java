package sec2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class E3_17Component extends JComponent {
    public void paintComponent (Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0,getWidth(), getHeight());
        g2.drawOval(0,0, getWidth(), getHeight());
        g2.setColor(Color.green);
        g2.fill(ellipse);

    }
}
