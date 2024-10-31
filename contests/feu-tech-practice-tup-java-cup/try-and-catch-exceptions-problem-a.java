import java.util.*;
import java.math.*;

class Solution {

    public static void main(String[] args) {
        Map<BigInteger, Integer> V = new HashMap();
        Scanner inp = new Scanner(System.in);
        Integer T = inp.nextInt();
        Integer[] N = new Integer[T];
        for (int i = 0; i < T; i++) {
            N[i] = collatz(inp.nextBigInteger(), 0, V);
        }
        for (int i = 0; i < T; i++) {
            System.out.println(N[i]);
        }
        inp.close();
    }

    static Integer collatz(BigInteger i, Integer odds, Map<BigInteger, Integer> V) {
        if (i.compareTo(BigInteger.ONE) == 0) {
            return 1;
        }
        if (V.containsKey(i)) {
            return V.get(i);
        }
        if (i.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0)) == 0) {
            V.put(i, collatz(i.divide(BigInteger.valueOf(2)), odds, V));
            return V.get(i);
        } else {
            V.put(i, collatz(i.multiply((BigInteger.valueOf(3))).add(BigInteger.ONE), odds, V) + 1);
            return V.get(i);
        }
    }
}