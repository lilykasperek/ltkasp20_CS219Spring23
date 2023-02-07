package LoopExercises;

import Utility.Util;

import java.util.Scanner;

public class ValidateInput {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.print("Enter a temp in F: ");

            // check if the user is going to enter a double
            if (kbd.hasNextDouble()) {
                double f = kbd.nextDouble();
                double c = Util.f2c(f);
                System.out.printf("%.1f\n", c);
                flag = false;
            } else {
                System.out.println("Error: invalid value, enter a decimal number.");
                System.out.printf("You entered \"%s\".\n", kbd.nextLine());
            }
        } // closing brace for while
    }
}
