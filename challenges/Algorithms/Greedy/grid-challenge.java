import java.io.*;
import java.util.*;

class Solution {

    // Complete the gridChallenge function below.
    static String gridChallenge(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > grid[i + 1][j]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String gridItem = scanner.nextLine();
            char[][] grid = new char[n][gridItem.length()];
            grid[0] = gridItem.toCharArray();
            for (int i = 1; i < n; i++) {
                gridItem = scanner.nextLine();
                grid[i] = gridItem.toCharArray();
            }

            String result = gridChallenge(grid);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
