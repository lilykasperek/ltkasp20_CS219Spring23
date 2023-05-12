package FinalExam;

import GUI.MainPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // create JFrame
        JFrame frame = new JFrame("Final Exam Part 2");
        frame.setSize(700, 600);
        // close on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add MainPanel to Jframe
        frame.add(new FinalExam.MainPanel());
        // set frame to visible
        frame.setVisible(true);
    }
}
