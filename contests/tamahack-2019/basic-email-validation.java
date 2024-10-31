import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
        int periodCnt = 0;
        int atCnt = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '@') {
                atCnt++;
            }
            if (input.charAt(i) == '.') {
                periodCnt++;
            }
        }
        if (atCnt != 1) {
            System.out.println("Invalid");
        } else if (periodCnt < 1) {
            System.out.println("Invalid");
        } else if (input.indexOf('@') == 0) {
            System.out.println("Invalid");
        } else if (input.indexOf('@') > input.lastIndexOf('.')) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}
