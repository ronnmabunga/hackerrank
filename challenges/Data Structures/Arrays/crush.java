import java.io.*;

class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 1];
        int l = queries.length;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            long k = queries[i][2];
            arr[a - 1] += k;
            arr[b] -= k;
        }
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = br.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        br.close();
    }
}
