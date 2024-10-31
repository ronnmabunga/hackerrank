import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x == 0) {
            System.out.println("No");
        } else {
            while (x > 1) {
                if (x % 2 == 0) {
                    x /= 2;
                } else {
                    System.out.println("No");
                    break;
                }
            }
            if (x == 1) {
                System.out.println("Yes");
            }
        }

    }
}