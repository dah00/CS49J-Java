package TwoRectangle;

import javax.swing.*;

public class RectangleViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Two Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoRectangle component = new TwoRectangle();
        frame.add(component);

        frame.setVisible(true);
    }
}
