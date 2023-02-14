package Chapter6;

public class StringPlay {

    public static boolean isDoubloon(String s) {

       for (int i = 0; i < s.length(); i++) {
           for (int j = 0; j < s.length(); j++){
               // TODO finish as a study problem
           }
       }
       return true;
    }

    // return true if characters in s are
    // in alphabetical order
    public static boolean isAbecedarian(String s) {

        s = s.toLowerCase();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    public static int countVowels(String s) {

        s = s.toLowerCase();
        int count = 0;

        // Python for i in range(len(s)):
        for (int i = 0; i < s.length(); i ++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                count ++;
            }
        }
        return count;
    } // countVowels

    public static void main(String[] args) {
        String s = "Hello";
        String t = "Hippopotomonstrosesquippedaliophobia";

        String u = "😍😎😜👌🐱‍🐉(●'◡'●)";

        // functions vs methods
        // a method is a kind of function but is called
        // on an object.
        // s is a string object. s is an instance
        // of String.
        System.out.println(s.length());
        System.out.println(t.length());
        System.out.println(u.length());
        System.out.println(u);

        // python: get the character at index 7 in t:
        // t[7]
        System.out.println(t.charAt(7));

        // python: t[len(t) - 1]
        System.out.println(t.charAt(t.length() - 1));
        System.out.println(t.toUpperCase());
        System.out.println(countVowels(s));
        System.out.println(countVowels(t));

        // every character in "every" language
        // is assigned a unique integer by the
        // Unicode Consortium

        // cast (convert) 'a' to an integer
        System.out.println((int) 'a');
        System.out.println((int) 'A');
        System.out.println((int) '❤');

        System.out.println(isAbecedarian("biopsy"));

        // negative test
        System.out.println(!isAbecedarian("applesauce"));

        System.out.println(isAbecedarian("BIOpsy"));
    }
}
