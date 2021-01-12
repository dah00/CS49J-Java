package sec1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E10_18Frame extends JFrame{

    JFrame frame;
    JButton button1;
    JButton button2;
    JLabel label1;
    JLabel label2;

    private int count1;
    private int count2;

    public E10_18Frame(){
        JButton button1 = new JButton("Click me 1");
        button1.addActionListener(new addNumber1());
        button1.setFocusable(false);                // Removes the small frame of the text
        button1.setBounds(20, 10, 100, 30);

        label1 = new JLabel("Number of clicks: 0");
        label1.setBounds(20, 50, 130, 30);

        JButton button2 = new JButton("Click me 2");
        button2.addActionListener(new addNumber2());
        button2.setFocusable(false);                // Removes the small frame of the text
        button2.setBounds(160, 10, 100, 30);

        label2 = new JLabel("Number of clicks: 0");
        label2.setBounds(160, 50, 130, 30);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 150);
        frame.setTitle("Test");
        frame.setVisible(true);

        frame.add(button1);
        frame.add(label1);
        frame.add(button2);
        frame.add(label2);
    }


    class addNumber1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            count1++;
            label1.setText("Number of clicks: " + count1);
        }
    }

    class addNumber2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            count2++;
            label2.setText("Number of clicks: " + count2);
        }
    }

}
