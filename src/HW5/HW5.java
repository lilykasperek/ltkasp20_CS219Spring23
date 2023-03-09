package HW5;

public class HW5 {

        public static boolean isDoubloon(String s) {

            s = s.toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count ++;
                    }
                }
                if (count != 2) {
                    return false;
                }
            }
            return true;
        }

        public static boolean canSpell(String word, String tiles) {

            tiles = tiles.toLowerCase();
            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++) {
                if (tiles.indexOf(word.charAt(i)) != -1) {
                    tiles = tiles.substring(0, tiles.indexOf(word.charAt(i)))
                            + tiles.substring(tiles.indexOf(word.charAt(i)) + 1);
                } else {
                    return false;
                }
            }
            return true;
            }

        public static void main(String[] args) {

            System.out.println(isDoubloon("Abba"));
            System.out.println(isDoubloon("appeases"));
            System.out.println(isDoubloon("esophagographers"));

            // Negative tests
            System.out.println(!isDoubloon("esophagographer"));
            System.out.println(!isDoubloon("bananab"));
            System.out.println(!isDoubloon("applesauce"));

            // Student: add more test cases including negative tests.
            // All tests should print true if the test passes.
            System.out.println(canSpell("boot", "axobasrto"));
            System.out.println(canSpell("BoOt", "axObasrTo" ));
            System.out.println(canSpell("jib", "quijibo"));
            System.out.println(canSpell("JiB", "qujIbo"));
            System.out.println(canSpell("sheep", "sheepish"));

            System.out.println(!canSpell("hippo", "haxobapsrito"));
            System.out.println(!canSpell("keys", "kenmoley"));
            System.out.println(!canSpell("sheep", "shep"));
        } // main
    } // class

