package Recursion;

public class Examples {

    public static int sod(int n) {
        if (n == 0)
            return 0;
        else
            return sod(n/10) + n % 10;
    }

    public static long pow(int x, int y) {
        if (y == 0)
            return 1;
        else
            return pow(x, y-1)*x;
    }

    public static void main(String[] args) {

        System.out.println(sod(45913) == 22);

        System.out.println(pow(2, 2) == 4);
        System.out.println(pow(2, 0) == 1);
        System.out.println(pow(1, 1) == 1);
        System.out.println(pow(10, 63));
    }
}
