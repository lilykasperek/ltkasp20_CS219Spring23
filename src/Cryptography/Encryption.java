package Cryptography;

import java.util.Objects;

public class Encryption {
    public static String E(String m, int key) {
        String c = "";

        for (int i = 0; i < m.length(); i++) {
            char clr_ch = m.charAt(i);
            int clr_ch_pos = clr_ch - 'a';
            int c_ch_pos = Math.floorMod(clr_ch_pos + key, 26);
            char c_ch = (char)(c_ch_pos + 'a');
            c = c + c_ch; // TODO use a StringBuilder
        }
        return c;
    }


    public static void main(String[] args) {
        System.out.println(E("attackatdawn", 10).equals("kddkmukdnkgx"));
        System.out.println(E("attackatdawn", 0).equals( "attackatdawn"));

        String t = "attack";
        String u = E(t, 10);
        System.out.println(E(u, -10));
    }
}
