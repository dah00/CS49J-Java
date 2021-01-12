package sec2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MyFrame extends JFrame implements ChangeListener {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 600;

    JSlider slider;

    JPanel panelSlider;
    JPanel panelRectangle;

    JMenu menu;

    JMenuItem more;
    JMenuItem fewer;

    private List<MyComponent> rectangles;
    private int numberOfRectangle;

    MyFrame(){
        setTitle("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        rectangles = new ArrayList<>();

        panelSlider = new JPanel();
        panelSlider.setBounds(0,0,FRAME_WIDTH, 50);

        panelRectangle = new JPanel();
        panelRectangle.setBounds(0,50,FRAME_WIDTH,FRAME_HEIGHT-50);

        // -------------- displays a number of rectangles -------------------
        numberOfRectangle = 15;
        for (int count = 0; count<numberOfRectangle; count++){
            MyComponent box = new MyComponent();
            rectangles.add(box);
            add(rectangles.get(count));
            setVisible(true);
        }


        // ----------------

        slider = new JSlider(0,30,15);
        slider.setPreferredSize(new Dimension(250,50));
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(5);

        slider.setPaintLabels(true);




        //panel.setBounds(0,0,100,50);
        add(panelSlider);


        menu = new JMenu("Menu");

        more = new JMenuItem("More");
        fewer = new JMenuItem("Fewer");


        menu.add(more);
        menu.add(fewer);

        //menuBar.add(menu);

        panelSlider.add(slider);

        setVisible(true);
    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == more){
//            numberOfRectangle += numberOfRectangle/2;
//
//            for (int count = rectangles.size(); count<=numberOfRectangle; count++){
//                MyComponent box = new MyComponent();
//                rectangles.add(box);
//                add(rectangles.get(count));
//                setVisible(true);
//                repaint();
//            }
//        }
//        else if (e.getSource() == fewer){
//            numberOfRectangle -= numberOfRectangle/8;
//            removeAll();
//            repaint();
////            for (int count = rectangles.size()-1; count>=numberOfRectangle; count--){
////                MyComponent box = rectangles.get(count);
////                rectangles.remove(box);
////                remove(box);
////                //setVisible(true);
////                repaint();
////            }
////            for (MyComponent rectangle: rectangles){
////                add(rectangle);
////                setVisible(true);
////            }
//
//        }
//    }

    @Override
    public void stateChanged(ChangeEvent e) {
        numberOfRectangle = slider.getValue();

    }
}
