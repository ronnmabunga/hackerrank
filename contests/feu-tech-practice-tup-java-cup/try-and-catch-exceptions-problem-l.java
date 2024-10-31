import java.util.*;
import java.math.*;

class Solution {

    public static void main(String[] args) {
        Map<Integer, BigInteger> F = new HashMap();
        Scanner inp = new Scanner(System.in);
        Integer N = inp.nextInt();
        System.out.println(factMinusfact(2 * N, N).divide(fact(N, F)));
        inp.close();
    }

    static BigInteger fact(Integer n, Map<Integer, BigInteger> F) {
        if (F.containsKey(n)) {
            return F.get(n);
        }
        if (n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(fact(n - 1, F));
    }

    static BigInteger factMinusfact(Integer b, Integer a) {
        if (b == a) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(b).multiply(factMinusfact(b - 1, a));
    }
}