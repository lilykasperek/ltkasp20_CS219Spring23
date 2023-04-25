package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    JTextArea input, output;

    public static void main(String[] args) {
        Main m = new Main();
        m.go();
    }

    private void go() {
        JFrame frame = new JFrame("CS219 Text Processor");
        frame.setSize(1100, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // header
        JLabel header = new JLabel("CS219 Text Processor");
        // header font
        header.setFont(new Font("Chiller", Font.BOLD, 30));

        // background of header
        header.setBackground(Color.RED);
        header.setOpaque(true);

        // add header
        frame.add(header);

        // combine label/text area to JPanel
        JPanel input_panel = new JPanel();

        // input label
        JLabel input_label = new JLabel("Input");
        input_panel.add(input_label);

        // make input text area for user to type in
        input = new JTextArea(10, 60);
        input.setFont(new Font("Arial", Font.PLAIN, 20));
        input_panel.add(input);

        // add input panel to frame
        frame.add(input_panel);

        // output panel
        JPanel output_panel = new JPanel();

        // output label
        JLabel output_label = new JLabel("Output");
        output_panel.add(output_label);

        // make output area
        output = new JTextArea(10, 60);
        output.setFont(new Font("Arial", Font.PLAIN, 20));
        output_panel.add(output);

        // add output panel to frame
        frame.add(output_panel);

        // add button to frame
        JButton submit = new JButton("Submit");
        submit.addActionListener(this);
        frame.add(submit);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = input.getText().toUpperCase();
        output.setText(s);
    }
}
