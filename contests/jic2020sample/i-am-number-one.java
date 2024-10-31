import java.util.*;

class Solution {
    static char[] input;
    static int count;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            input = scan.nextLine().toCharArray();
            count = 0;
            for (char c : input) {
                if (c == '1') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}