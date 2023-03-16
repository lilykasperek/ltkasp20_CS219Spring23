package SwallowSpeeds;
import Utility.MyArrays;
import Utility.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    /**
     *
     * @param s - properly constructed scanner and
     *          in particular, not null
     */
    public static void show(Scanner s){
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
    }

    public static ArrayList<Double> loadSpeeds1(Scanner s) {
        ArrayList<Double> speeds = new ArrayList<>();

        while (s.hasNextLine()) {
            String line = s.nextLine();
            if ((line.indexOf('#') == -1) && !line.isBlank()) {
                // the add function in an array list
                // adds the item to the end of the array list
                speeds.add(Double.parseDouble(line));
            }
        }
        return speeds;

    }

    // loadSpeeds returns the array that was
    // constructed from the file of doubles
    public static double[] loadSpeeds(Scanner s) {
        // define an array of doubles
        // primitive array, have to know exactly
        // how many items when we declare it
        double [] speeds = new double[18];
        int i = 0;

        while (s.hasNextLine()) {
            String line = s.nextLine();
            if ((line.indexOf('#') == -1) && !line.isBlank()) {
                speeds[i] = Double.parseDouble(line);
                i ++;
            }
        }
        return speeds;
    } // end of loadSpeeds

    public static void main(String[] args) {
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";
        Scanner s = Util.openSite(path);
        if (s != null) {
            // show(s);
            double [] vec = loadSpeeds(s);
            System.out.println(Arrays.toString(vec));
            MyArrays.printDoubles(vec);
            System.out.println(MyArrays.mean(vec));
            System.out.println(MyArrays.mean(
                    // array literal syntax
                    new double [] {1.0, 2.0, 3.0, 4.0}
            ) == 2.5);
            System.out.println(MyArrays.max(
                    new double [] {1.0, 2.0, 3.0, 4.0}
            ) == 4.0);
            System.out.println(MyArrays.min(
                    new double [] {1.0, 2.0, 3.0, 4.0}
            ) == 1.0);

            System.out.println(MyArrays.median(vec));
            MyArrays.printDoubles(vec);

            // use new version of loadSpeeds using ArrayList
            Scanner s1 = Util.openSite(path);
            ArrayList<Double> speeds = loadSpeeds1(s1);
            System.out.println("DEBUG " + speeds.size());
            MyArrays.printDoubles(speeds);
        }

    }

} // end of class main
