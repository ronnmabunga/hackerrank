import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int S = inp.nextInt();
        Double value;
        Double sum = 0.0;
        try {
            for (int i = 0; i < S; i++) {
                value = inp.nextDouble();
                if (value <= 0.0) {
                    throw new Exception();
                }
                sum += value;
            }
            if (sum == (double) ((S - 2) * 180.0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            System.out.println("No");
        }
    }
}