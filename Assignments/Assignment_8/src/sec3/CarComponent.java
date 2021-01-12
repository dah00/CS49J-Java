package sec3;

import javax.swing.*;
import java.awt.*;


public class CarComponent extends JComponent{
    private Car car;

    public CarComponent(){
        car = new Car(0,0);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

//        int x = getWidth() - 60;
//        int y = getHeight() - 30;


        car.draw(g2);

    }


    public void moveCarBy(int dx, int dy){
        car.translate(dx,dy);
        repaint();
    }




}
