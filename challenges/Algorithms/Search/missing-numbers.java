import java.io.*;
import java.util.*;

class Solution {

    // Complete the missingNumbers function below.
    static LinkedList<Integer> missingNumbers(LinkedList<Integer> arr, LinkedList<Integer> brr) {
        for (Integer a : arr)
            brr.remove(a);
        HashSet<Integer> set = new HashSet();
        set.addAll(brr);
        brr.clear();
        brr.addAll(set);
        Collections.sort(brr);
        return brr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        LinkedList<Integer> arr = new LinkedList();

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        LinkedList<Integer> brr = new LinkedList();

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr.add(brrItem);
        }

        LinkedList<Integer> result = missingNumbers(arr, brr);

        for (Integer i : result) {
            bufferedWriter.write(String.valueOf(i));
            bufferedWriter.write(" ");
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
