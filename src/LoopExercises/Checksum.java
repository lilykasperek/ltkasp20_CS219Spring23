package LoopExercises;

public class Checksum {
    public static int checksum(int n) {
        int sum = 0;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum % 10;
    }

    public static void main(String[] args) {
        System.out.println(checksum(5739) == 4);
        System.out.println(checksum(9) == 9);
        System.out.println(checksum(1234) != 10);
    }
}
