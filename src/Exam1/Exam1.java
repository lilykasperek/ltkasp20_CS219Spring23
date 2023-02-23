package Exam1;

import java.util.Scanner;

public class Exam1 {

    public static void stars(int n) {
        // iterates when i < n
        for (int i = 0; i < n; i ++) {
            // prints out star each time condition is satisfied
            // since we start at 0 it has to be i < n and not i <= n
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTriangle(int n) {
        // iterates when i <= n
        for (int i = 0; i <= n; i ++) {
            // prints stars i times
            // so when i is 0, we print one star
            // when i is 1, we print two stars and so on
            stars(i);
        }
        System.out.println();
    }

    public static int getValidInteger() {
        Scanner kbd = new Scanner(System.in);
        boolean flag = true;

        int x = 0;

        while (flag) {
            System.out.print("Enter an integer: ");

            if (kbd.hasNextInt()) {
                x = kbd.nextInt();
                if (x < 0) {
                    System.out.printf("Error: integer should be greater than zero. " +
                            "You entered \"%d\".\n", x);
                } else {
                    flag = false;
                }
            } else {
                System.out.printf("Error: integer expected. You entered \"%s\".\n", kbd.nextLine());
            }
        }
        // return correct value
        return x;
    }

    public static void main(String[] args) {
        int n = getValidInteger();
        printTriangle(n);
    }
}
