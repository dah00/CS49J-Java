package sec1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    JMenuBar menuBar;

    JMenu menu;

    JMenuItem more;
    JMenuItem fewer;

    Random random;

    private List<MyComponent> rectangles;
    private int numberOfRectangle;

    MyFrame(){
        setTitle("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        rectangles = new ArrayList<>();

        // -------------- displays a number of rectangles -------------------
        // displays 10 - 25 rectangles on the frame
        random = new Random();
        // Generate a random number of Rectangle
        numberOfRectangle = random.nextInt((10-5+1)+5);

        for (int count = 0; count<=numberOfRectangle; count++){
            MyComponent box = new MyComponent();
            rectangles.add(box);
            add(rectangles.get(count));
            setVisible(true);
        }

        // ----------------

        menuBar = new JMenuBar();

        menu = new JMenu("Menu");

        more = new JMenuItem("More");
        fewer = new JMenuItem("Fewer");

        more.addActionListener(this);
        fewer.addActionListener(this);

        menu.add(more);
        menu.add(fewer);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == more) {
            numberOfRectangle *=2;

            for (int count = rectangles.size()-1; count <= numberOfRectangle; count++) {
                MyComponent box = new MyComponent();
                rectangles.add(box);
                add(rectangles.get(rectangles.size()-1));
                setVisible(true);
                repaint();
            }
        }
        else if (e.getSource() == fewer){

            numberOfRectangle = numberOfRectangle/2;


            for (int count = rectangles.size()-1; count>numberOfRectangle; count--){
                MyComponent box = rectangles.get(rectangles.size()-1);
                rectangles.remove(box);
                remove(rectangles.get(rectangles.size()-1));
                setVisible(true);
                repaint();
            }
        }


    }
}
