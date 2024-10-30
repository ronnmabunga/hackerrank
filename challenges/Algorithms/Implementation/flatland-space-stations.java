import java.io.*;
import java.util.*;

class Solution {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int maxdist = 0;
        int curmindist = c.length;
        int temp;
        Set<Integer> d = new HashSet();
        for (int cs : c)
            d.add(cs);
        for (int i = 0; i < n; i++) {
            if (d.contains(i)) {
                curmindist = 0;
                continue;
            }
            curmindist = n;
            for (int j : c) {
                temp = Math.abs(i - j);
                if (temp < curmindist)
                    curmindist = temp;
            }
            if (maxdist < curmindist)
                maxdist = curmindist;
        }
        return maxdist;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
