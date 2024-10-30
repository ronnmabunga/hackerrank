import java.io.*;
import java.util.*;

class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long tail = n % s.length();
        // System.out.println("n: " + n + "%s.length(): " + s.length() + "=tail: " +
        // tail);
        int tailcount = count(s.substring(0, (int) tail));
        return tailcount + n / s.length() * count(s);
    }

    static int count(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                cnt++;
        }
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
