package ButtonViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener{
    private int count1;

    public void actionPerformed (ActionEvent event){
        count1++;
        System.out.println("I was clicked.");
    }
}
