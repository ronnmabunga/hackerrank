import java.math.*;
import java.util.*;

class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        int l = s.length();
        if (l == 1) {
            System.out.println("NO");
            return;
        }
        for (int i = 1; i <= l / 2; i++) {
            if (checkSeparation(s, i)) {
                System.out.println("YES " + s.substring(0, i));
                return;
            }
        }
        System.out.println("NO");
    }

    static boolean checkSeparation(String s, Integer i) {
        try {
            BigInteger curr = (new BigInteger(s.substring(0, i))).add(BigInteger.ONE);
            s = s.substring(i, s.length());
            while (!s.equals("")) {
                // System.out.println(curr + " " + s);
                String t = "" + curr.toString();
                if (s.indexOf(t) != 0) {
                    return false;
                } else {
                    curr = curr.add(BigInteger.ONE);
                    s = s.substring(t.length(), s.length());
                }
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
