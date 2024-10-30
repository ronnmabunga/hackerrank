import java.io.*;
import java.util.*;

class Solution {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int[] left = new int[arr.length];
        int l = 0, e = 0, r = 0;
        int[] equal = new int[arr.length];
        int[] right = new int[arr.length];
        int p = arr[0];
        for (int a : arr) {
            if (a == p)
                equal[e++] = a;
            else if (a > p)
                right[r++] = a;
            else
                left[l++] = a;
        }
        // print(left);
        // print(equal);
        // print(right);
        for (int i = 0; i < e; i++)
            left[l++] = equal[i];
        // print(left);
        for (int i = 0; i < r; i++)
            left[l++] = right[i];
        // print(left);
        return left;
    }

    static void print(int[] a) {
        for (int aa : a)
            System.out.print(a + " ");
        System.out.println();
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

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
