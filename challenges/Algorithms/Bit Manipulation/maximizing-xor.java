import java.io.*;
import java.util.*;

class Solution {

    // Complete the maximizingXor function below.
    static int maximizingXor(int l, int r) {
        Integer max = Integer.MIN_VALUE;
        for (int i = l; i < r; i++) {
            for (int j = i + 1; j <= r; j++) {
                if (max < (j ^ i)) {
                    max = j ^ i;
                }
            }
        }
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = maximizingXor(l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
