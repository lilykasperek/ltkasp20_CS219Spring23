package GUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CS219 Fancy App");
        frame.setSize(1100, 800);
        // don't set the layout, let the top level
        // JPanel do it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MainPanel());
        frame.setVisible(true);
    }
}
