package Cryptography;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

public class Encryption {
    public static String E(String m, int key, boolean enc) {
        String c = "";
        SecureRandom rng = null;
        try {
            rng = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: no random number generator.");
            System.exit(1);
        }
        rng.setSeed(key);
        final int alpha_length = '~' - ' ' + 1;
        final char base_char = ' ';

        for (int i = 0; i < m.length(); i++) {
            char clr_ch = m.charAt(i);
            int clr_ch_pos = clr_ch - base_char;
            int r = rng.nextInt();
            if (!enc) r = -r;
            int c_ch_pos =
                    Math.floorMod(clr_ch_pos + r, alpha_length);
            char c_ch = (char) (c_ch_pos + base_char);
            c = c + c_ch;  // TODO use a StringBuilder
        }
        return c;
    }

    public static void main(String[] args) {
//        System.out.println(E("attackatdawn", 10).equals("kddkmukdnkgx"));
//        System.out.println(E("attackatdawn", 0).equals( "attackatdawn"));
//
//        String t = "attack";
//        String u = E(t, 10);
//        System.out.println(E(u, -10));

        System.out.println(E("Attack! at dawn :-)", 42, true));
        System.out.println(E(">*;R@&b6|K iwI5h[dW", 42, false));
    }
}
