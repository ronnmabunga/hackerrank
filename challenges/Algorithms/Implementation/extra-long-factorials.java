import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static BigInteger [] facs = new BigInteger[101];
    static {
        facs[0] = BigInteger.ONE;
        for(int i = 1; i < 101; i ++){
            facs[i] = facs[i-1].multiply(BigInteger.valueOf(i));
        }
    }

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        System.out.println(facs[n].toString());

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
