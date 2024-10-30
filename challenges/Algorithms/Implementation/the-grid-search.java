import java.io.*;
import java.util.*;

class Solution {

    static String[] pattern;
    static String[] grid;

    // Complete the gridSearch function below.
    static String gridSearch(String[] G, String[] P) {
        pattern = P;
        grid = G;
        // Loops through the grid's vertical
        for (int i = 0; i <= G.length - P.length; i++) {
            // Loops through the grid's horizontal
            for (int j = 0; j <= G[i].length() - P[0].length(); j++) {
                if (findPattern(i, j))
                    return "YES";
            }
        }
        return "NO";
    }

    static boolean findPattern(int r, int c) {
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length(); j++) {
                if (grid[r + i].charAt(c + j) != pattern[i].charAt(j))
                    return false;
            }
        }
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
