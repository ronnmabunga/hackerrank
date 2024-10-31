import java.util.*;
import java.math.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Integer T = inp.nextInt();
        Integer sizeint;
        BigInteger mins, size;
        for (int i = 0; i < T; i++) {
            sizeint = inp.nextInt();
            size = BigInteger.valueOf(sizeint);
            mins = inp.nextBigInteger();
            for (int j = 1; j < sizeint; j++) {
                mins = mins.min(inp.nextBigInteger());
            }
            System.out.println(mins.multiply(size.subtract(BigInteger.ONE)).toString());
        }
    }
}