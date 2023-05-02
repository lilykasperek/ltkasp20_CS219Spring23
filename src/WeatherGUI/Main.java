package WeatherGUI;

import GUI.MainPanel;
import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // load ZipCode database
        ZipCodeDB db = new ZipCodeDB();
        db.load();

        JFrame frame = new JFrame("CS219 Weather App");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new WeatherPanel(db));
        frame.setVisible(true);
    }
}
