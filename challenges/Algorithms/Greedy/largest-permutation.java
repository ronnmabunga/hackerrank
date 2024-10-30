import java.io.*;
import java.util.*;

class Solution {

    // Complete the largestPermutation function below.
    static int[] largestPermutation(int k, int[] a, int[] id, int n) {

        for (int i = 0; i < k && i < n; i++) {
            if (a[i] == n - i) {
                k++;
                continue;
            } else {
                a[id[n - i]] = a[i];
                id[a[i]] = id[n - i];
                a[i] = n - i;
                id[n - i] = i;
            }
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];
        int[] arr2 = new int[n + 1];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            arr2[arrItem] = i;
        }

        int[] result = largestPermutation(k, arr, arr2, n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
