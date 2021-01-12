package sec2;

import javax.swing.*;

public class E3_17 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setTitle("Ellipse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        E3_17Component component = new E3_17Component();
        frame.add(component);
    }
}
