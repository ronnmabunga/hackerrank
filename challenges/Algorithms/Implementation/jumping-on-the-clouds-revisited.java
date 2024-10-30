import java.io.*;
import java.util.*;

class Solution {

    // Complete the jumpingOnClouds function below.
    // 0 0 1 0 0 1 1 0
    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        for (int i = k; i % c.length != 0; i = i + k) {
            e = e - (c[i % c.length] == 1 ? 3 : 1);
        }
        e = e - (c[0] == 1 ? 3 : 1);
        return e;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
