package LogicExercises;

public class LogicExercises {
    /**
     *   codingbat.com/java
     *   When squirrels get together for a party, they like to have cigars.
     *   A squirrel party is successful when the number of cigars is between
     *   40 and 60, inclusive. Unless it is the weekend, in which case there
     *   is no upper bound on the number of cigars. Return true if the
     *   party with the given values is successful, or false otherwise.
     *
     *       cigarParty(30, false) → false
     *       cigarParty(50, false) → true
     *       cigarParty(70, true) → true
     */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (40 <= cigars && cigars <= 60) ||
                (isWeekend && cigars >= 40);
    }
    /**
     You are driving a little too fast, and a police officer stops you.
     Fill in function below to compute the result, encoded as an int
     value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is
     60 or less, the result is 0. If speed is between 61 and 80 inclusive,
     the result is 1. If speed is 81 or more, the result is 2.
     Unless it is your birthday -- on that day, your speed can be
     5 higher in all cases.

     caughtSpeeding(60, false) → 0
     caughtSpeeding(65, false) → 1
     caughtSpeeding(65, true) → 0
     */

    public static int caughtSpeeding(int speed, boolean
            isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        } else { // it is your birthday
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        }
    }


    /**
     * Return true if d1, d2, d3 are in either ascending or descending order.
     * Otherwise, return false
     */

    public static boolean ordered(int d1, int d2, int d3) {
        return false; // fill in function body
    }

    /**
     * The number 6 is a truly great number. Given two int values,
     * a and b, return true if either one is 6. Or if their sum or
     * difference is 6. Note: the function Math.abs(num) computes the
     * absolute value of a number.
     */

    public static boolean love6(int a, int b) {
        return false; // fill in function body
    }

    public static void main(String[] args) {
        // write some tests for your functions
        System.out.println(!cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
        System.out.println(!cigarParty(70, false));
        System.out.println(!cigarParty(30, true));

        // test caughtSpeeding
        System.out.println(caughtSpeeding(50, false) == 0);
        System.out.println(caughtSpeeding(75, false) == 1);
        System.out.println(caughtSpeeding(85, false) == 2);
        // test the corner cases of 60, 80
        System.out.println(caughtSpeeding(60, false) == 0);

        // test caughtSpeeding when it is birthday
        System.out.println(caughtSpeeding(61, true) == 0);
        System.out.println(caughtSpeeding(81, true) == 1);
        System.out.println(caughtSpeeding(90, true) == 2);
        // corner cases
        System.out.println(caughtSpeeding(65, true) == 0);
        System.out.println(caughtSpeeding(85, true) == 1);
        System.out.println(caughtSpeeding(90,true) == 2);
    }
}

