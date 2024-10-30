import java.util.*;

class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int pos = 0, zer = 0, min = 0;
        for (int a : arr) {
            if (a > 0)
                pos++;
            else if (a == 0)
                zer++;
            else
                min++;
        }
        System.out.format("%.6f%n", ((double) pos / (double) arr.length));
        System.out.format("%.6f%n", ((double) min / (double) arr.length));
        System.out.format("%.6f%n", ((double) zer / (double) arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
