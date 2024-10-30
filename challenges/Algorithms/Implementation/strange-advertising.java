import java.io.*;
import java.util.*;

class Solution {
    static int[] recipients = new int[50];
    static int[] likes = new int[50];
    static {
        recipients[0] = 5;
        likes[0] = 2;
        recipients[1] = 6;
        likes[1] = 5;
        for (int i = 2; i < 50; i++) {
            recipients[i] = 3 * (likes[i - 1] - likes[i - 2]);
            // System.out.print("R: " + recipients[i] + " ");
            likes[i] = likes[i - 1] + recipients[i] / 2;
            // System.out.println("L: " + likes[i]);
        }
    }

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        return likes[n - 1];

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
