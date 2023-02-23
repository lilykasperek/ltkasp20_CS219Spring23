package ExamStudy;

import java.util.Scanner;

public class ExamStudySolutions {
    public static double volume(double r, double h) {
        return (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
    }
    public static double getValidDouble(Scanner s, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (s.hasNextDouble()) {
                double d = s.nextDouble();
                if (d < 0)
                    System.out.printf("Error: number should be positive. You entered %f\n",d);
                else
                    return d;
            }
            else {
                String tok = s.next();
                System.out.printf("Error: expected a number. You entered %s\n",tok);
            }
        }
    }

    public static int getPositiveInt() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive integer: ");
            if (s.hasNextInt()) {
                int x = s.nextInt();
                if (x > 0)      // make sure x is positive
                    return x;
                else
                    System.out.printf(
                            "Error: enter a positive integer, you entered \"%d\".\n",
                            x);
            }
            else {
                System.out.printf("Error: enter a positive integer, you entered\"%s\".\n", s.nextLine());
            }
        } // while
    } // getPositiveInt
    public static int countBetween(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (2 < digit && digit < 7)
                count++;
            n = n / 10;
        }
        return count;
    }

    public static double c2f(double c) {
        return 9.0/5.0 * c + 32;
    }
    // Essentially the same function we wrote in class
// for validating inputs. We don’t need to check a valid
// range because temperatures can be positive or negative.
    public static double getValidTemp(Scanner kbd) {
        double c = -1;
        while (true) {
            System.out.print("Enter a temperature in celsius: ");
            if (kbd.hasNextDouble()) {
                c = kbd.nextDouble();
                return c;
            }
            else {
                String str = kbd.next();
                System.out.printf("Error: you entered: \"%s\"\n", str);
            }
        } // while
    }  // getValidTemp

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = getValidDouble(s, "Radius:");
        double h = getValidDouble(s, "Height: ");
        System.out.printf("The volume of your cone is %.2f", volume(r, h));

        System.out.println(countBetween(getPositiveInt()));

        double c = getValidTemp(s);
        System.out.printf("%.1f\u00B0C converts to %.1f\u00B0F \n",
                c, c2f(c));
    }
}
