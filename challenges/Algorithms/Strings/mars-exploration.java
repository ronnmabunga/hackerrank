import java.io.*;
import java.util.*;

class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        int i = 0;
        int c = 0;
        while (i < s.length()) {
            c += ((s.charAt(i) != 'S') ? 1 : 0) + ((s.charAt(i + 1) != 'O') ? 1 : 0)
                    + ((s.charAt(i + 2) != 'S') ? 1 : 0);
            i += 3;
        }
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
