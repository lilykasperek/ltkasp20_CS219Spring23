package Exam2;

import Utility.Util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static Utility.Util.openSite;

public class Exam2Study {

    public static boolean hasDuplicate(String[] aos) {
        for (int i = 0; i < aos.length; i++)
            for (int j = i+1; j < aos.length; j++)
            //if (aos[i].toLowerCase().equals(aos[j].toLowerCase()))
                if (aos[i].equalsIgnoreCase(aos[j]))
                    return true;
        return false;
    }

    public static boolean anagram(String s, String t) {
        // make char arrays
        char[] ch_s = s.toCharArray();
        char[] ch_t = t.toCharArray();

        // if length not the same, return false
        if (ch_s.length != ch_t.length) {
            return false;
        }

        // sort arrays
        Arrays.sort(ch_s);
        Arrays.sort(ch_t);

        // if sorted arrays are equal, return true
        return Arrays.equals(ch_s, ch_t);
    }

    // Exercise 7.5 Write a method named areFactors that takes an integer n
    // and an array of integers, and returns true if the numbers in the array are all
    // factors of n (which is to say that n is divisible by all of them).

    public static boolean areFactors(int n, int[] arr) {
        // for (int i = 0; i < arr.length; i++)
        for (int j : arr)
            if (j % n != 0)
                return false;
        return true;
    }

    // Exercise 8.5 Write a recursive method called power that takes a double x
    //and an integer n and returns x^n

    public static double power(double x, int n) {
        // base case
        if (n == 0)
            return 1;
        else
            return power(x, n-1)*x;
    }

    public static int whatDoIdo(String s) {
        int p = 1;
        int r = 0;
        for(int i = s.length() - 1; i > -1; i--) {
            r = r + (s.charAt(i) - '0')*p;
            p = p * 2;
        }
        return r;
    }

    public static void f(int n, int [] arr1, int [] arr2) {
        arr1[3] = n;
        n = arr2[4];
        arr2[n] = 8;
    }

    public static void searchFile(String [] words) {

        for (String w : words)
            if (w.length() == 5 && w.charAt(0) == 't' &&
                    w.charAt(4) == 'r') {
                String middle = w.substring(1, 4);
                    if (middle.indexOf('s') > -1) {
                        System.out.println(w);
                    }
            }
    }

    public static String [] load_palindrome(String path, int n) {
        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            String word = s.nextLine();
            if (word.charAt(0) == word.charAt(4) &&
            word.charAt(1) == word.charAt(3)) {
                words[i++] = word;
            }
        }
        return words;
    }

    public static int index_min(int[] array) {

        int index_min = 0;
        for (int i = 0; i< array.length; i++) {
            if (array[index_min]>array[i]) {
                return i;
            }
        }
        return index_min;
    }


    public static String jumble(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    public static void main(String[] args) {

        System.out.println("Exercise 7.5 tests");
        int[] arr = new int[] {3, 6, 9, 12, 15};
        System.out.println(areFactors(3, arr));
        System.out.println(!areFactors(6, arr));

        System.out.println("Study Guide #30 test");
        String[] aos = new String[] {"Harry", "Mary", "Larry", "Gerry", "Terry", "larry"};
        System.out.println(hasDuplicate(aos));

        System.out.println("Exercise 8.5 test");
        System.out.println(power(2.0, 2) == 4.0);

        System.out.println(Integer.toBinaryString(56));
        System.out.println(Integer.toBinaryString(413));

        System.out.println(Math.floorDiv(-24, 5));
        System.out.println(Math.floorMod(-33, 6));

        System.out.println("Problem 2 and 1");
        String s = "bumfuzzle";
        int key1 = s.indexOf('u');
        int key2 = s.indexOf('z');
        System.out.println(s.substring(key1, key2+1));

        String t = "bamboozled";
        String yx = "bazooka";
        int target = t.indexOf('z');
        int target2 = yx.indexOf('z');
        System.out.println(t.substring(0, target));
        System.out.println(yx.substring(0, target2));

        System.out.println(-23%10);
        System.out.println(23%10);

        System.out.println(Math.floorDiv(-17, 3));
        System.out.println(Math.floorMod(-17, 3));

        System.out.println(Integer.toBinaryString(47));

        System.out.println(whatDoIdo("101110"));

        int [] vec = {9, 8, 7, 6, 5, 4};
        int x = 2;
        f(x, vec, vec);
        System.out.printf("%d %s\n", x, Arrays.toString(vec));

        String [] words = Util.load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);

        String [] words_2 = Util.load_words("http://10.60.15.25/~ehar/cs219/words-big.txt",
                645289);



        searchFile(words);
        searchFile(words_2);


        System.out.println("choose a random word from the list");
        Random rng = new Random();
        String answer = words[rng.nextInt(2309)];
        // System.out.println(answer);

        String jumble = jumble(answer);
        System.out.println(jumble);

        Scanner kbd = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            if (kbd.hasNextLine()) {
                String next = kbd.next();
                if (next.equals(answer)) {
                    System.out.println("Correct");
                    flag = false;
                } else {
                    System.out.println("try again");
                }
            }
        }

        String[] palindromes = load_palindrome("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                9);

        for (int i = 0; i < palindromes.length; i++)  {
            System.out.println(palindromes[8-i]);
        }

        int index_max = 0;
        for (int i = 0; i< words.length; i++){
            if (words[i].compareTo(words[index_max]) > 0)
                index_max = i;
        }
        //return index_max;

        int[] test = new int[]{4, 5, 1, 6, 8, 10};
        System.out.println(index_min(test));


        Scanner scan = Util.openSite("http://10.60.15.25/~ehar/cs219/words-big.txt");
        ArrayList<String> words_long = new ArrayList<>();
        while (scan.hasNextLine())
            words_long.add(scan.nextLine().strip().toLowerCase());

        System.out.println(words_long.size());

        String[] new_words_long = words_long.toArray(new String[625289]);

        searchFile(new_words_long);

        System.out.println(anagram("listen", "silent"));
    }

}
