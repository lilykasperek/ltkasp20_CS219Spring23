package HW3;

// These problems are taken from Nick Parlante's codingbat.com/java.

import java.sql.SQLOutput;

public class HW3 {

    /**
     * codingbat.com/java
     * When squirrels get together for a party, they like to have cigars.
     * A squirrel party is successful when the number of cigars is between
     * 40 and 60, inclusive. Unless it is the weekend, in which case there
     * is no upper bound on the number of cigars. Return true if the
     * party with the given values is successful, or false otherwise.
     * <p>
     * cigarParty(30, false) → false
     * cigarParty(50, false) → true
     * cigarParty(70, true) → true
     */

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        // fill in function body
        return (40 <= cigars && cigars <= 60) ||
                (isWeekend && cigars >= 40);
    }

    /**
     * You are driving a little too fast, and a police officer stops you.
     * Fill in function below to compute the result, encoded as an int
     * value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is
     * 60 or less, the result is 0. If speed is between 61 and 80 inclusive,
     * the result is 1. If speed is 81 or more, the result is 2.
     * Unless it is your birthday -- on that day, your speed can be
     * 5 higher in all cases.
     * <p>
     * caughtSpeeding(60, false) → 0
     * caughtSpeeding(65, false) → 1
     * caughtSpeeding(65, true) → 0
     */

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        // fill in function body
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
     * Otherwise return false
     */
    public static boolean ordered(int d1, int d2, int d3) {
        // fill in function body
        return d3 > d2 && d2 > d1 || d1 > d2 && d2 > d3;
    }

    /**
     * The number 6 is a truly great number. Given two int values,
     * a and b, return true if either one is 6. Or if their sum or
     * difference is 6. Note: the function Math.abs(num) computes the
     * absolute value of a number.
     */
    public static boolean love6(int a, int b) {
        // fill in function body
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }

    /**
     * You have a lottery ticket with integers a, b, and c, each of which is
     * 0, 1, or 2. If they are all 2, your winnings are $10. Otherwise, if
     * they are all the same, your winnings are $5. Otherwise, so long as both
     * b and c are different from a, the result is $1. Otherwise the result is $0.
     *
     * redTicket(2, 2, 2) → 10
     * redTicket(2, 2, 1) → 0
     * redTicket(0, 0, 0) → 5
     */
    public static int redTicket(int a, int b, int c) {
        // fill in function body
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        else if (a == b && b != 2 && b == c) {
            return 5;
        }
        else if (b != a && c != a) {
            return 1;
        }
        else {
            return 0;
        }
    }

    /**
     * You have a blue lottery ticket, with ints a, b, and c on it.
     * This makes three pairs, which we'll call ab, bc, and ac. Consider the
     * sum of the numbers in each pair. If any pair sums to exactly 10,
     * the result is 10. Otherwise, if the ab sum is exactly 10 more than either
     * bc or ac sums, the result is 5. Otherwise, the result is 0.
     *
     *  blueTicket(9, 1, 0) → 10
     *  blueTicket(9, 2, 0) → 0
     *  blueTicket(6, 1, 4) → 10
     */
    public static int blueTicket(int a, int b, int c) {
        // fill in function body

        // assign values to variables
        int ab = (a + b);
        int bc = (b + c);
        int ac = (a + c);

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }
        else if (ab == (bc + 10) || ab == (ac + 10)) {
            return 5;
        }
        else {
            return 0;
        }
    }

    /**
     * Given two ints, each in the range 10..99, return true if there is a
     * digit that appears in both numbers, such as the 2 in 12 and 23.
     * Reminder: n/10, gives the left digit while the % "mod" n%10 gives
     * the right digit.
     *
     *
     *  commonDigit(12, 23) → true
     *  commonDigit(12, 43) → false
     *  commonDigit(12, 44) → false
     */
    public static boolean commonDigit(int x, int y) {
        // fill in function body
        return x / 10 == y / 10 || x / 10 == y % 10 || x % 10 == y % 10 || x % 10 == y / 10;
    }

    public static void main(String[] args) {
        // write some tests for your functions
        // test cigarParty
        System.out.println("cigarParty tests:");
        System.out.println(!cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
        System.out.println(!cigarParty(70, false));

        // test caughtSpeeding
        System.out.println("caughtSpeeding tests:");
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

        // write ordered tests
        System.out.println("ordered tests:");
        System.out.println(ordered(1,2,3));
        System.out.println(ordered(3,2,1));
        System.out.println(!ordered(9,1,8));
        System.out.println(ordered(10, 9, 8));
        System.out.println(!ordered(0,0,0));

        // write out love6 tests
        System.out.println("love6 tests:");
        System.out.println(love6(1,5));
        System.out.println(love6(3,3));
        System.out.println(love6(12, 18));
        System.out.println(!love6(-18, 12));

        // write out redTicket tests
        System.out.println("redTicket tests:");
        System.out.println(redTicket(2, 2, 2) == 10); // → 10
        System.out.println(redTicket(2, 2, 1) == 0); // → 0
        System.out.println(redTicket(0, 0, 0) == 5); // → 5
        System.out.println(redTicket(1, 1, 1) == 5); // → 5
        System.out.println(redTicket(1, 2, 0) == 1); // → 1

        // write out blueTicket tests
        System.out.println("blueTicket tests:");
        System.out.println(blueTicket(9, 1, 0) == 10); // → 10
        System.out.println(blueTicket(9, 2, 0) == 0); // → 0
        System.out.println(blueTicket(6, 1, 4) == 10); // → 10
        System.out.println(blueTicket(5, 5, 0) == 10); // → 10
        System.out.println(blueTicket(25, 25, 15) == 5); // → 5

        // write out commonDigit tests
        System.out.println("commonDigit tests:");
        System.out.println(commonDigit(12, 23)); // → true
        System.out.println(!commonDigit(12, 43)); // → true
        System.out.println(!commonDigit(12, 44)); // → true
        System.out.println(commonDigit(22, 22)); // → true
        System.out.println(commonDigit(19, 99)); // → true;
    }

}  // class LogicExercises
