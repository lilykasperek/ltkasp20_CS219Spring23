package WeatherGUI;

import ZipCodes.ZipCodeDB;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class WeatherPanel extends JPanel  {

    public WeatherPanel(ZipCodeDB db) {
        JLabel header = new JLabel("CS219 Weather App");
        header.setFont(new Font("Algerian", Font.BOLD, 40));
        header.setBorder(new EtchedBorder(BevelBorder.RAISED));
        add(header);

        JTextArea output = new JTextArea(4,20);
        output.setFont(new Font("Arial", Font.PLAIN, 20));
        output.setBorder(new TitledBorder(new LineBorder(Color.pink, 4), "Weather Data"));
        JPanel zp = new ZipPanel(db, output);
        add(zp);
        add(output);
    }
}
