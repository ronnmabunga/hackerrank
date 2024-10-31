import java.io.*;
import java.util.*;
import java.math.*;

class OhMy {
    static Scanner inp;
    static final BigInteger FIVE = BigInteger.valueOf(5);

    public static void main(String[] args) throws IOException {
        inp = new Scanner(System.in);
        while (inp.hasNext()) {
            zeroes(inp.nextBigInteger());
        }
    }

    static void zeroes(BigInteger x) {
        System.out.print(x.toString() + " ");
        BigInteger zeroes = BigInteger.ZERO;
        while (x.compareTo(FIVE) >= 0) {
            zeroes = zeroes.add(x.divide(FIVE));
            x = x.divide(FIVE);
        }
        System.out.println(zeroes.toString());
    }
}