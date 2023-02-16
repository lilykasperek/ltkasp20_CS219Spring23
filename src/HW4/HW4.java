package HW4;

import Utility.Util;

import java.util.Scanner;

public class HW4 {

    public static double getValidInvestment() {
        // read initial investment
        Scanner kbd = new Scanner(System.in);
        boolean flag = true;

        // initialize inv
        double inv = 0;
        while (flag) {
            // prompt for initial investment
            System.out.print("Enter an initial investment: ");

            if (kbd.hasNextDouble()) {
                inv = kbd.nextDouble();
                if (inv < 0) {
                    System.out.printf("Error: initial investment should be greater than zero. " +
                            "You entered \"%.2f\".\n", inv);
                } else {
                    flag = false;
                }
            } else {
                System.out.printf("Error: integer expected. You entered \"%s\".\n", kbd.nextLine());
            }
        }
        // return correct value
        return inv;
    }

    public static double getValidInterestRate () {
        Scanner kbd = new Scanner(System.in);
        boolean flag = true;

        // initialize rate
        double rate = 0;
        while (flag) {

            // prompt for interest rate
            System.out.print("Enter an interest rate: ");

            if (kbd.hasNextDouble()) {
                rate = kbd.nextDouble();
                if (rate < 0) {
                    System.out.printf("Error: initial investment should be greater than zero. " +
                            "You entered \"%.2f\".\n", rate);
                } else {
                    flag = false;
                }
            } else {
                System.out.printf("Error: integer expected. You entered \"%s\".\n", kbd.nextLine());
            }
        }
        // return correct value
        return rate;
    }

    public static double getValidNumberOfYears() {
        Scanner kbd = new Scanner(System.in);
        boolean flag = true;

        // initialize year
        double year = 0;
        while (flag) {

            // prompt for number of years
            System.out.print("Enter a number of years: ");

            if (kbd.hasNextDouble()) {
                year = kbd.nextDouble();
                if (year < 0) {
                    System.out.printf("Error: initial investment should be greater than zero. " +
                                    "You entered \"%.2f\".\n", year);
                } else {
                    flag = false;
                }
            } else {
                System.out.printf("Error: integer expected. You entered \"%s\".\n", kbd.nextLine());
            }
        }
        // return correct value
        return year;
    }

    public static double getValidCompound() {
        Scanner kbd = new Scanner(System.in);
        boolean flag = true;

        // initialize compound
        double compound = 0;
        while (flag) {

            // prompt for number of times to compound
            System.out.print("Enter the number of times compounded per year: ");

            if (kbd.hasNextDouble()) {
                compound = kbd.nextDouble();
                if (compound < 0) {
                    System.out.printf("Error: initial investment should be greater than zero. " +
                            "You entered \"%.2f\".\n", compound);
                } else {
                    flag = false;
                }
            } else {
                System.out.printf("Error: integer expected. You entered \"%s\".\n", kbd.nextLine());
            }
        }
        // return correct value
        return compound;
    }

    public static void main(String[] args) {
        // assign values to variables to pass to investment function
        double C = getValidInvestment();
        double r = getValidInterestRate();
        double t = getValidNumberOfYears();
        int n = (int) getValidCompound();
        // print final value of the investment
        System.out.println("The final value of the investment is " +
                Util.investment(C, r, t, n));
    }
}
