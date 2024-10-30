import java.io.*;
import java.util.*;

class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int maxCount = 0;
        int maxValue = 0;
        int count;
        for (int i = 0; i < topic.length - 1; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                count = counter(topic[i], topic[j]);
                if (count == maxValue) {
                    maxCount++;
                } else if (count > maxValue) {
                    maxCount = 1;
                    maxValue = count;
                }
            }
        }
        return new int[] { maxValue, maxCount };
    }

    static int counter(String a, String b) {
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1' || b.charAt(i) == '1')
                cnt++;
        }
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

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
