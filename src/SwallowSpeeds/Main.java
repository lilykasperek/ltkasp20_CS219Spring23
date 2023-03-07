package SwallowSpeeds;
import Utility.Util;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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

    // loadSpeeds returns the array that was
    // constructed from the file of doubles
    public static double[] loadSpeeds(Scanner s) {
        // define an array of doubles
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
        }

    }

} // end of class main
