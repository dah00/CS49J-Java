package sec3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private static JLabel initialLabel;
    private static JLabel annual_InterestLabel;
    private static JLabel number_of_yearLabel;

    private static JTextArea balanceLabel;

    private static JTextField initialText;
    private static JTextField annual_InterestText;
    private static JTextField number_of_yearText;

    private static JButton calculateButton;

    MyFrame(){
        JPanel panel = new JPanel();

        this.setSize(500,340);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);

        panel.setLayout(null);

        // ------------- the initial amount of savings account -----------------
        // ******* Label ********
        initialLabel = new JLabel("Initial amount of a savings account");
        initialLabel.setBounds(10, 10,210,25);
        panel.add(initialLabel);

        // ******* TextField ******9
        initialText = new JTextField();
        initialText.setBounds(250,10,200,25);
        panel.add(initialText);
        //--------------------------------------------------------------------


        // ---------------- THe annual interest rate -------------------------
        // ******* Label ********
        annual_InterestLabel = new JLabel("Annual interest rate");
        annual_InterestLabel.setBounds(10, 70,210,25);
        panel.add(annual_InterestLabel);

        // ******* TextField ******9
        annual_InterestText = new JTextField();
        annual_InterestText.setBounds(250,70,200,25);
        panel.add(annual_InterestText);
        //--------------------------------------------------------------------


        // ----------------------- The number of year -----------------------
        // ******* Label ********
        number_of_yearLabel = new JLabel("Number of years");
        number_of_yearLabel.setBounds(10, 130,210,25);
        panel.add(number_of_yearLabel);

        // ******* TextField ******9
        number_of_yearText = new JTextField();
        number_of_yearText.setBounds(250,130,200,25);
        panel.add(number_of_yearText);
        //--------------------------------------------------------------------


        // -------------------- Calculate button -------------------------
        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 190, 90,25 );
        calculateButton.addActionListener(this);
        panel.add(calculateButton);
        // -------------------------------------------------------------

        // ------ The balance of savings after the end of each year ------
        balanceLabel = new JTextArea();
        balanceLabel.setBounds(250,190,200,100);
        panel.add(balanceLabel);
        // ---------------------------------------------------------------

        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        int initial_amount = Integer.parseInt(initialText.getText());
        int interest_rate = Integer.parseInt(annual_InterestText.getText());
        int number_of_year = Integer.parseInt(number_of_yearText.getText());
        int balance = initial_amount;

        String text = "";

        for (int count = 1; count<=number_of_year; count++){
            balance += (balance * interest_rate/100);
            text += ("$" + balance + " after " + count + " year.\n");
        }

        balanceLabel.setText(text);
    }
}
