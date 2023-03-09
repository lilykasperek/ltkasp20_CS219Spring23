package PassByValueExplanation;

import java.util.Arrays;

public class Main {
    public static void f(int x, int [] values) {
        x = 99; // x does NOT get copied back to y
        values[2] = -23;
    }

    public static void main(String[] args) {
        int y = 1;
        int [] vec = new int [] {1, 2, 3, 4};
        f(y, vec);  // y gets copied to x
        System.out.println(y);
        System.out.println(Arrays.toString(vec));
    }

}
