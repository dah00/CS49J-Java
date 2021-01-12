package sec1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    private int count = 0;

    public GUI(){
        frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 70, 70));
        panel.setLayout(new GridLayout(2,5));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
