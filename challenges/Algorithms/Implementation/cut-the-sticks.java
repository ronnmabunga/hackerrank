import java.io.*;
import java.util.*;

class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        int cut = arr[0];
        List<Integer> nums = new LinkedList();
        nums.add(arr.length);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - cut > 0) {
                cut = arr[i];
                nums.add(arr.length - i);
            }
        }
        return nums.stream().mapToInt(i -> i).toArray();

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

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
