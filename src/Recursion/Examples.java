package Recursion;

import Utility.Util;

import java.util.ArrayList;
import java.util.Scanner;

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

    // study: modify to be more general to count the
    // number of times the digit d appears in n

    public static int count7s(int n) {
        if (n == 0)
            return 0;
        else if (n % 10 == 7) {
            return 1 + count7s(n / 10);
        }
        else
            return count7s(n / 10);

    }

    public static String reverse(String s) {
        if (s.isEmpty())
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }

    // return a copy of s with all of the spaces removed
    // removeSpaces("able was I") is "ablewasI"

    // Study problem: draw the run-time stack/call stack
    // of removeSpaces("able was I")
    public static String removeSpaces(String s) {
        if (s.isEmpty())
            return "";
        else if(s.charAt(0) != ' ')
            return s.charAt(0) + removeSpaces(s.substring(1));
        else
            return removeSpaces(s.substring(1));

    }

    public static String toBinary(int n) {
        if (n == 0)
            return "0";
        else
            return toBinary(n / 2) + (n % 2);
    }

    // swap items at indexes i and j
    public static void swap(ArrayList<String> arr, int i, int j) {
        String t = arr.get(j);
        arr.set(j, arr.get(i));
        arr.set(i, t);
    }

    // void because arrays are "pass by reference"

    // reverse the array list arr between the region
    // left and right (inclusive).
    // 0 <= left < arr.size()
    // 0 <= right < arr.size()
    public static void reverse(ArrayList<String> arr, int left, int right) {
        if (left < right) {
            swap(arr, left, right);
            reverse(arr, left + 1, right - 1);
        }

    }

    public static int bsearch(ArrayList<String> arr, String key, int left, int right) {
        if (left > right)
            return -1;

        int mid = (left + right) / 2;

        if (arr.get(mid).equals(key))
            return mid;
        else if (arr.get(mid).compareTo(key) < 0)
            return bsearch(arr, key, mid + 1, right);
        else
            return bsearch(arr, key, left, mid - 1);
    }

    public static void main(String[] args) {

        System.out.println(count7s(0) == 0);
        System.out.println(count7s(70773) == 3);
        System.out.println(count7s(773772) == 4);

        System.out.println(sod(45913) == 22);

        System.out.println(pow(2, 2) == 4);
        System.out.println(pow(2, 0) == 1);
        System.out.println(pow(1, 1) == 1);
        System.out.println(pow(10, 63));

        System.out.println(reverse("abcde").equals("edcba"));

        System.out.println(removeSpaces("").equals(""));
        System.out.println(removeSpaces("a bc").equals("abc"));

        System.out.println(toBinary(31));
        System.out.println(toBinary(417997));

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Mango");

        //System.out.println(bsearch(fruit, "Apple", 0, fruit.size()-1));

        reverse(fruit, 0, fruit.size() - 1);
        System.out.println(fruit);

        // test binary search on a large list of words
        Scanner s = Util.openSite("http://10.60.15.25/~ehar/cs219/words-big.txt");
        ArrayList<String> words = new ArrayList<>();
        while (s.hasNextLine())
            words.add(s.nextLine().strip().toLowerCase());

        System.out.println(words.size());

        System.out.println(bsearch(words, "abib", 0, words.size()-1));
    }
}

