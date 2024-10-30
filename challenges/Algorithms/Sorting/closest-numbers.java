import java.io.*;
import java.util.*;

class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        LinkedList<Integer> pairs = new LinkedList();
        Arrays.sort(arr);
        int temp;
        int minDist = arr[1] - arr[0];
        pairs.add(arr[0]);
        pairs.add(arr[1]);
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i + 1] - arr[i];
            if (temp < minDist) {
                minDist = temp;
                pairs.clear();
                pairs.add(arr[i]);
                pairs.add(arr[i + 1]);
            } else if (temp == minDist) {
                pairs.add(arr[i]);
                pairs.add(arr[i + 1]);
            }
        }
        int j = 0;
        int[] p = new int[pairs.size()];
        for (Integer f : pairs)
            p[j++] = f;
        return p;
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

        int[] result = closestNumbers(arr);

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
