package sec2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyComponent extends JComponent {

    private static final int MAX_BOX = 500;

    private static final int BOX_WIDTH = 50;
    private static final int BOX_HEIGHT = 50;

    private Rectangle box;
    
    // Constructor
    // Generate a rectangle at a random position
    MyComponent(){
        Random random_x = new Random();
        Random random_y = new Random();
        int box_x = random_x.nextInt((MAX_BOX-0+1)+0);
        int box_y = random_y.nextInt((MAX_BOX-200+1)+200);

        box = new Rectangle(box_x, box_y, BOX_WIDTH, BOX_HEIGHT);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }


}
