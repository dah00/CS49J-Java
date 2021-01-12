package sec1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E10_18Solution {
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Click me!");
        JButton button2 = new JButton("Click me!");
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);

        /**         * An action listener that prints a message.        */
        class ClickListener implements ActionListener {
            private int n = 0;

            public void actionPerformed(ActionEvent event) {
                n++;
                System.out.println("I was clicked " + n + " times!");
            }
        }
        button1.addActionListener(new ClickListener());
        button2.addActionListener(new ClickListener());
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
