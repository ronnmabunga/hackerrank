import java.io.*;
import java.util.*;

class Solution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        LinkedList<Integer> s = new LinkedList();
        int t = 0;
        for (int i = 0; i < contests.length; i++) {
            if (contests[i][1] == 1) {
                s.add(contests[i][0]);
            } else {
                t += contests[i][0];
            }
        }
        Collections.sort(s);
        System.out.println(t);
        System.out.println(s);
        int ss = s.size();
        if (k <= ss) {
            for (int i = 0; i < ss - k; i++) {
                t -= s.get(i);
            }
            for (int i = ss - k; i < ss; i++) {
                t += s.get(i);
            }
        } else {
            for (int i = 0; i < ss; i++) {
                t += s.get(i);
            }
        }
        return t;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
