package sec3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarFrame extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;

    private CarComponent component;

    class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            component.moveCarBy(1,1);
        }
    }

    public CarFrame(){
        component = new CarComponent();
        add(component);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        ActionListener listener = new TimerListener();

        final int DELAY = 50;
        Timer time = new Timer(DELAY, listener);
        time.start();
    }
}
