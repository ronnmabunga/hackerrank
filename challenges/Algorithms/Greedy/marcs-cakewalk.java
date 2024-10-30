import java.io.*;
import java.util.*;

class Solution {
    static long[] twos = new long[41];
    static {
        twos[0] = 1;
        for (int i = 1; i < 41; i++) {
            twos[i] = twos[i - 1] * 2l;
        }
    }

    // Complete the marcsCakewalk function below.
    static long marcsCakewalk(int[] calorie) {
        Arrays.sort(calorie);
        long total = 0l;
        int j = 0;
        for (int i = calorie.length - 1; i > -1; i--) {
            total += twos[i] * calorie[j++];
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
