import java.util.*;
import java.math.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.println(a.add(b).toString());
        System.out.println(a.multiply(b).toString());
        in.close();
    }
}
