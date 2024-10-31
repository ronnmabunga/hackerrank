import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Double n = inp.nextDouble();
        if (n >= 0.0 && n <= 7.4) {
            System.out.println("None");
        }
        if (n >= 7.5 && n <= 15.0) {
            System.out.println("Yellow");
        }
        if (n >= 15.1 && n <= 30.0) {
            System.out.println("Orange");
        }
        if (n >= 30.1 && n <= 500.0) {
            System.out.println("Red");
        }
    }
}