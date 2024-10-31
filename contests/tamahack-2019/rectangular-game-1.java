import java.util.*;
import java.math.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        for (int i = 0; i < N; i++) {
            int T = inp.nextInt();
            BigInteger leastX = inp.nextBigInteger();
            BigInteger leastY = inp.nextBigInteger();
            for (int j = 1; j < T; j++) {
                BigInteger currX = inp.nextBigInteger();
                if (leastX.compareTo(currX) > 0) {
                    leastX = currX;
                }
                BigInteger currY = inp.nextBigInteger();
                if (leastY.compareTo(currY) > 0) {
                    leastY = currY;
                }
            }
            System.out.println(leastX.multiply(leastY).toString());
        }
    }
}