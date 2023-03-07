package Utility;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Util {
    /**
     *
     * @param C - initial investment
     * @param r - yearly rate (0.1 is 1%)
     * @param t - number of years
     * @param n - number of times to compound per year
     * @return The final value of the investment
     */
    public static double investment(double C, double r, double t, int n) {
        return C * Math.pow(1 + r / n, t * n);
    }

    public static double f2c(double f) {
        return 5.0/9.0 * (f - 32);
    }

    /**
     *
     * @param t - temperature in F
     * @param V - wind velocity in mph
     * @return - windchill in F
     */
    public static double windchill(double t, double V) {
        return (35.74 + 0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(V, 0.16);
    }

    public static Scanner openSite(String path) {
        try {
            URL url = new URL(path);
            Scanner site = new Scanner(url.openConnection().getInputStream());
            return site;
        } catch (MalformedURLException e) {
            System.out.println("Error: malformed URL");

            // null is the empty object
            return null;
            // throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error: cannot access site");
            return null;
            // throw new RuntimeException(e);
        }
    } // end of open site

} // end of class
