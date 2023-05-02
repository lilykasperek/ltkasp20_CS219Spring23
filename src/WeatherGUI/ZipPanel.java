package WeatherGUI;

import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZipPanel extends JPanel implements ActionListener {

    ZipCodeDB db;
    JTextField field;
    JTextArea output;

        public ZipPanel(ZipCodeDB db, JTextArea output) {
            this.db = db;
            this.output = output;
            JLabel label = new JLabel("ZipCode");
            label.setFont(new Font("Arial", Font.BOLD, 15));
            add(label); // call add in the base class

            this.field = new JTextField(10);
            add(field);
            setBorder(new LineBorder(Color.gray, 3, true));

            JButton submit = new JButton("Submit");
            submit.setBackground(Color.GREEN);
            submit.addActionListener(this);
            add(submit);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
            ZipCode zc = db.findByZip(field.getText());
            output.setText(zc.toString());
    }
}
