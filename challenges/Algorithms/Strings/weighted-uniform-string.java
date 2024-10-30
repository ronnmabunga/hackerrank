import java.io.*;
import java.util.*;

class Solution {
    static HashSet<Integer> hs = new HashSet();

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
        weights(s);
        System.out.println(hs);
        String[] res = new String[queries.length];
        for (int i = 0; i < queries.length; i++)
            res[i] = (hs.contains(queries[i])) ? "Yes" : "No";
        return res;
    }

    static void weights(String s) {
        int[] ws = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            ws[i] = 1 + (int) (s.charAt(i) - 'a');
        int total;
        for (int i = 0; i < s.length(); i++) {
            total = ws[i];
            hs.add(total);
            try {
                while (ws[i + 1] == ws[i]) {
                    total += ws[i++];
                    hs.add(total);
                }
            } catch (Exception e) {
                break;
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

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
