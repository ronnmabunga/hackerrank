import java.util.*;
import java.math.*;

class Solution {
    static BigInteger BIFIVE = BigInteger.valueOf(5);

    public static void main(String args[]) throws Exception {
        // INPUT
        ArrayList<BigInteger> nums = new ArrayList();
        Scanner inp = new Scanner(System.in);
        int i = 0;
        while (inp.hasNext()) {
            nums.add(inp.nextBigInteger());
        }
        // OUTPUT
        for (BigInteger num : nums) {
            System.out.println(num.toString() + " " + countTrailZero(num).toString()); // USES A SOLVER FXN
        }
        inp.close();
    }

    // SOLVER FXN
    static BigInteger countTrailZero(BigInteger inp) {
        BigInteger fives = BigInteger.ZERO;
        while (inp.compareTo(BIFIVE) >= 0) {
            fives = fives.add(inp.divide(BIFIVE));
            inp = inp.divide(BIFIVE);
        }
        return fives;
    }
}