import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        String half;
        if (word.length() % 2 == 0) {
            half = word.substring(0, word.length() / 2) + "*";
        } else {
            half = word.substring(0, (word.length() + 1) / 2) + "~";
        }
        System.out.println(isPal(word) ? half : word);
    }

    static boolean isPal(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}