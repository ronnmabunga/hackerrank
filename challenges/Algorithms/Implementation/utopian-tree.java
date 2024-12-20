import java.io.*;
import java.util.*;

class Solution {
    static int[] hts = new int[60];
    static {
        hts[0] = 1;
        for (int i = 1; i < 59; i++) {
            hts[i] = hts[i - 1] * 2;
            i++;
            hts[i] = hts[i - 1] + 1;
        }
    }

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        return hts[n];

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
