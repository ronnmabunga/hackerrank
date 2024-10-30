import java.io.*;
import java.util.*;

class Solution {

    // Complete the runningTime function below.
    static int runningTime(int[] A) {
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            int value = A[i]; // 1
            int j = i - 1; // 0
            while (j >= 0 && A[j] > value) {
                count++;
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
