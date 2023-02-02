package HW2;

import java.util.Scanner;

public class DayOfWeek{
    /**
     *
     * @param m - month
     * @param d - day
     * @param y - year
     * @return - the integer that represents the day of the week
     */

    public static int dayofweek(int m, int d, int y){

        // perform computation
        int y0 =  y - (14 - m)/12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = m + 12 * ((14 - m) / 12) - 2;

        int d0 = (d + x + 31 * m0 / 12) % 7;

        return d0;
    }

    public static void main(String[] args){

        // read the month, day, year from the user
        Scanner kbd = new Scanner(System.in);

        // prompt user to enter three integers
        System.out.print("Enter a month (as an integer): ");
        int month = kbd.nextInt();

        System.out.print("Enter a day (as an integer): ");
        int day = kbd.nextInt();

        System.out.print("Enter a year (as an integer): ");
        int year = kbd.nextInt();

        // call dayofweek function and print result
        System.out.println(dayofweek(month, day, year));
    }
}