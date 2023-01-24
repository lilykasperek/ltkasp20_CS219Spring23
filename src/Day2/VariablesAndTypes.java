package Day2;

public class VariablesAndTypes {
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

    // main is the name of a function
    // void is the return type
    public static void main(String[] args) {
        // cast the double 1e9 to an integer
        System.out.println(investment(1, 1.0, 1, (int) 1e9));
        System.out.println(investment(1, 1.0, 1, (int) 1e12));
        System.out.println(f2c(212));

        int x = 7;
        System.out.println(x*x);
        x = 8;

        float e = 2.7182F;  // don't use floats
        double pi = 3.14159;  // double precision

        // double electron_mass =
        // .0000000000000000000000000000009109383105;
        final double electron_mass = 9.109e-31;
        // electron_mass = 78; error

        // Avagadro's number
        final double avagadros_number = 6.022140857e23;
    }
}
