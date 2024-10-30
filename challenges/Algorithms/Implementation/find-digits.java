import java.io.*;
import java.util.*;

class Solution {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        String s = n + "";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') != 0 && n % (s.charAt(i) - '0') == 0) {
                c++;
            }
        }
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
