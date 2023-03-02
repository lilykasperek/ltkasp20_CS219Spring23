package Cryptography;

import java.util.Random;

public class ModularPlay {

    public static void main(String[] args) {
        System.out.println(-2 % 12 == -2);
        System.out.println(-2 / 12 == 0);
        System.out.println(Math.floorMod(-2, 12) == 10);
        System.out.println(Math.floorDiv(-2, 12) == -1);

        // not suitable for cryptography
        Random rng = new Random();
        rng.setSeed(23);
        for (int i = 0; i < 5; i++) {
            System.out.println(rng.nextInt() % 26);
        }
    }

}
