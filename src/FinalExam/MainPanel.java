package FinalExam;

import Utility.Util;
import ZipCodes.ZipCode;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    JTextArea input, output;
    public MainPanel() {
        // create header
        JLabel header = new JLabel("Final Exam Part 2");
        header.setFont(new Font("Arial", Font.BOLD, 40));
        add(header);

        // add input panel
        JPanel input_panel = new JPanel();
        add(input_panel);

        // input text area
        JTextArea input = new JTextArea(10, 60);
        input_panel.add(input);

        // add output panel
        JPanel output_panel = new JPanel();
        add(output_panel);

        // output text area
        JTextArea output = new JTextArea(10, 60);
        output_panel.add(output);

        // borders
        setBorder(new LineBorder(Color.gray, 3, true));
        input_panel.setBorder(new TitledBorder("Input"));
        output_panel.setBorder(new TitledBorder("Output"));

        // make stats button
        JButton stats = new JButton("Stats");

        // add action listener to button
        stats.addActionListener(e -> output.setText(input.getText().toUpperCase()));
        //stats.addActionListener(e -> {
            //output.setText(Math.min(input.getText());
        //};

        // add button to frame
        add(stats);



    } // end of MainPanel
    private class UpperButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            // didn't have time to get actual stats so only have toUpperCase working
            String s = input.getText().toUpperCase();
            output.setText(s);

            // trying to figure out how to get stats button to work:

            // need to put values from input.getText() into an array
            //String[] values = input.getText();
            //int[] values = input.getText();
            // trying to put values from string into array
            // creates primitive array of length s
            //int[] values = new int[s.length()];

            // get stats
            // built-in function for max and min
            //output.setText(Math.max(values).toString());
            //output.setText(Math.min(values).toString());
            // find mean and median of an array from util my arrays
           // output.setText(Utility.MyArrays.mean(input.getText()).toString());
           // output.setText(Utility.MyArrays.median(input.getText()).toString());

            // knew i should set output text to string
            // need to print in output:
            // sout("median = " + output.getText()); etc.


        }
    }


}
