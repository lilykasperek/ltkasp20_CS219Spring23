package LoopExercises;

public class MoreLoopExercises {

    public static boolean isVowel(char ch) {
        return "aeiouyAEIOUY".indexOf(ch) > -1;
                // ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
                // ch == 'u' || ch == 'y';
    }

    /*
     * You are given two strings - pattern and source.
     * The first string pattern contains only the symbols
     * 0 and 1, and the second string source contains
     * only lowercase English letters. Let's say that
     * pattern matches a substring of source if the
     * following three conditions are met:
     *
     *   1) they have equal length
     *
     *   2) for each 0 in pattern the corresponding
     *      letter in the substring is a vowel
     *
     *   3) for each 1 in pattern the corresponding
     *      letter is a consonant.
     *
     * Your task is to calculate the number of substrings of
     * source that match pattern.
     *
     * Example
     *
     * For pattern = "010" and source = "amazing", the function should
     * return 2.
     *
     * "010" matches "ama", because both 0s match a,
     *       which is a vowel, and 1 match m, which is a consonant;
     *
     * "010" doesn't "maz", because the first 0 corresponds to an m,
     *       which is a consonant, not a vowel;
     *
     * "010" matches "azi", because the first 0 matches an a (vowel),
     * 1 matches z (consonant), and the second 0 matches i (vowel);
     *
     * "010" doesn't match "zin", because the first 0 corresponds
     * to a consonant (z);
     *
     * "010" doesn't match "ing", because the second 0 corresponds
     * to the letter g, which is a consonant.
     *
     * So, there are only 2 matches.
     *
     * For pattern = "110" and source = "programming", the function
     * should return 3.
     */
    public static int match(String patt, String src) {

        int cnt = 0;

        // for each character in the source string
        for (int i = 0; i <= src.length() - patt.length(); i ++) {

            int j = 0;
            boolean flag = true;
            // go through all characters in patt until the end or we don't match
            while (j < patt.length() && flag) {
                char patt_ch = patt.charAt(j);
                char src_ch = src.charAt(i + j);

                // check if vowel/consonant
                if (isVowel(src_ch) && patt_ch == '0' || !isVowel(src_ch) && patt_ch == '1') {
                    j++;
                }
                else {
                    flag = false;
                }
            } // end of while loop

            if (flag) cnt++;

        } // end of for loop

        return cnt;

    } // end of function match

    /*
     * count7s  returns the number of times the digit 7 appears in
     * the parameter n.
     *
     * count7s(1727337) = 3
     * count7s(1234) = 0
     * count7s(777777) = 6
     *
     * Question: Does the function work if n is negative?
     */
    public static int count7s(int n) {

        int count = 0;

        while (n > 0) {

            if (n % 10 == 7) {
                count ++;
            }
           n = n / 10;
        }
        return count;
    }

    /*
     *  If we list all the natural numbers below 10 that are multiples
     *  of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     *  Find the sum of all the multiples of 3 or 5 below 1000.
     *
     *  https://projecteuler.net/problem=1
     *
     *  n should be non-negative
     *  sum3or5(10) = 23
     *  sum3or5(1000) = 233168
     */
    public static int sum3or5(int n) {

        // assign variable to store sum of multiples of 3 and 5
        int sum = 0;

        // start at 0, loop while i < input, increment i + 1
        for (int i = 0; i < n; i++) {

            // if n % 3 or n % 5 = 0, we know the values are multiples or 3 or 5
            if (i % 3 == 0 || i % 5 == 0) {
                // we need to store and add these values
                sum += i;
            }
        }
        // need to return sum
        return sum;
    } // Time spent: 20 minutes

    /*
     * Return the first factor of n greater than 1
     * and less than n. If no factors return -1.
     * Notice that this function uses longs and not ints.
     *
     *  factor(25) =
     *  factor(59953793) == 7727
     *  factor(1531482031) == -1
     *  factor(7304692485435694493L) == -1;
     *
     * Question: Notice the letter L on the end of the largest integer above?
     *           Any guess of what it means or why it is there?  What happens if you
     *           remove it?
     */
    public static long factor(long n) {
        return -1; // shut up error message
    }

    /*
     * Write a function stars(n) that will print n asterisks
     * on the console window.
     *
     * stars(5) will print *****
     *
     * Question: Why is this a void function?
     */
    public static void stars(int n) {
        // iterates when i < n
        for (int i = 0; i < n; i ++) {
            // prints out star each time condition is satisfied
            // since we start at 0 it has to be i < n and not i <= n
             System.out.print("*");
        }
        System.out.println();

        // Time spent: 5 minutes
    }

    /*
     * Write a function triangle that takes an integer n and will print
     * a right triangle of n rows where the first row has 1 asterisk
     * and the nth row has n asterisks, For example,
     *
     * triangle(5) will print
     *
     *         *
     *         **
     *         ***
     *         ****
     *         *****
     *
     *  Hint: use the function stars you defined above.
     */
    public static void triangle(int n) {
        // iterates when i <= n
        for (int i = 0; i <= n; i ++) {
            // prints stars i times
            // so when i is 0, we print one star
            // when i is 1, we print two stars and so on
            stars(i);
        }
        System.out.println();
    } // Time spent: 5 minutes

    /*
     *  Fizz Buzz
     *
     *  Write a function fizzbuzz that takes an integer n and
     *  prints out the integers from 1 to n. If the number is
     *  divisible by 3 print "fizz" instead of the number. If
     *  the number is divisible by 5 then print "buzz" instead
     *  of the number. And if it is divisible by 3 and 5 it prints "fizz buzz".
     *
     *  For example, calling fizzbuzz(16) would print
     *  1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizz buzz 16
     *
     *  Instead of commas you can print each entry on its own line.
     *
     *  https://en.wikipedia.org/wiki/Fizz_buzz
     *
     */
    public static void fizzbuzz(int n) {
        // fill in code
    }

    /*
     * A palindrome number is an integer n that, when you reverse the digits,
     * gives you n back. For example 121, 11, 2, 1221, 12321, 123321 are
     * all palindrome numbers.  The integer 1234 is not a palindrome integer.
     *
     * Write a boolean function isPalindrome that returns true of the integer
     * n passed to it is a palindrome integer, otherwise it returns false.
     *
     */
    public static boolean isPalindrome(int n) {
        return false; // shut up error message
    }

    /*
     * This function is similar to the triangle function; but a little trickier.
     *
     * Write a function named staircase that takes an integer n, and produces the triangle
     * pattern below. For example calling staircase(5) would print
     *
     *        *
     *       **
     *      ***
     *     ****
     *    *****
     *
     * In general, there are n rows of asterisks where the last row has n asterisks.
     */
    public static void staircase(int n) {
        for (int i = n; i <= 0; i --) {
            }
        System.out.println();
    }

    /*
     *   perfect number
     *
     *   A perfect number is a number that is equal to the sum of its divisors that
     *   are less than the number. For example, 6 is a perfect number
     *   because 6 = 1 + 2 + 3 and 1,2,3 are the divisors.
     *
     *   28 is also a perfect number because 28 = 1 + 2 + 4 + 7 + 14 and 1,2,4,7,14 are the only
     *   divisors of 28.
     *
     *   Write a function named perfect that takes an integer n and returns true if n
     *   is a perfect number, and false if it is not.
     *
     *   perfect(28) == true
     *   perfect(496) == true
     *   perfect(99) == false
     */
    public static boolean perfect(int n) {
        return false;   // shut up error message
    }

    /*
     *   Find perfect numbers
     *
     *   Write a function findPerfect that searches for more perfect numbers.
     *   Check numbers all the way up to 2147483647
     *
     *   Question: What is special about the number 2147483647?
     */
    public static void findPerfect() {
        // fill in code here
    }

    /*
     * Thoroughly test all of your functions above.
     */
    public static void main(String[] args) {
        System.out.println(sum3or5(10) == 23);
        System.out.println(sum3or5(1000) == 233168);
        stars(5);
        triangle(5);
        staircase(5);
    }
}
