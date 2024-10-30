import java.io.*;
import java.util.*;

class Solution {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
        int l = grid.length;
        char[][] map = new char[l][l];
        int k = 0;
        for (String s : grid)
            map[k++] = s.toCharArray();
        for (int i = 1; i < l - 1; i++) {
            for (int j = 1; j < l - 1; j++) {
                if (map[i][j] > map[i][j + 1] &&
                        map[i][j] > map[i][j - 1] &&
                        map[i][j] > map[i + 1][j] &&
                        map[i][j] > map[i - 1][j]) {
                    map[i][j] = 'X';
                }
            }
        }
        String[] result = new String[l];
        for (int i = 0; i < l; i++) {
            result[i] = new String(map[i]);
        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
