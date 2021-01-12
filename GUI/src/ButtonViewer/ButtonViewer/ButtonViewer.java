package ButtonViewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonViewer {
//    private static final int FRAME_WIDTH = 550;
//    private static final int FRAME_HEIGHT = 200;
//
//    private static final int BOX1_X = 10;
//    private static final int BOX1_Y = 10;
//    private static final int BOX2_X = 170;
//    private static final int BOX2_Y = 10;
//
//    private static final int BOX_WIDTH = 200;
//    private static final int BOX_HEIGHT = 50;

    public static void main(String[] args) {

        //JButton button1 = new JButton("Click me 1!");

        JPanel panel = new JPanel();
        //panel.add(button1);
        panel.setBackground(Color.black);
        panel.setBounds(10,10,50,10);



//        JButton button2 = new JButton("Click me 2!");
//        button2.setBounds(box2);
//        frame.add(button2);

        JFrame frame = new JFrame();
        frame.setTitle("Count click");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(panel);


//        ActionListener listener = new ClickListener();
//        button1.addActionListener(listener);
    }
}
