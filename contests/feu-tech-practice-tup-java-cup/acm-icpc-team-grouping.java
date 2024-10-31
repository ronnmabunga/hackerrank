import java.util.*;
import java.math.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int M = inp.nextInt();
        inp.nextLine();
        BigInteger[] know = new BigInteger[N];
        int max = 0;
        int or;
        int count = 0;
        for (int i = 0; i < N; i++) {
            know[i] = new BigInteger(inp.nextLine(), 2);
            // System.out.println(know[i]+ ": " + Integer.toBinaryString(know[i]));
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                or = cntOnes((know[i].or(know[j])).toString(2));
                if (or > max) {
                    max = or;
                    count = 1;
                } else if (or == max) {
                    count++;
                }
            }
        }
        System.out.println(max);
        System.out.println(count);
    }

    static int cntOnes(String x) {
        // System.out.println(x);
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '1')
                count++;
        }
        return count;
    }
}