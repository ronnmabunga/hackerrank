import java.io.*;
import java.util.*;

class Solution {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
        int[] capacities = new int[container.length];
        int[] quantities = new int[container.length];
        for (int i = 0; i < container.length; i++) {
            for (int j = 0; j < container.length; j++) {
                capacities[i] += container[i][j];
                quantities[j] += container[i][j];
            }
        }
        Arrays.sort(capacities);
        Arrays.sort(quantities);
        for (int i = 0; i < container.length; i++) {
            if (quantities[i] > capacities[i])
                return "Impossible";
        }
        return "Possible";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
