import java.io.*;
import java.util.*;

class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        int l = s.length();
        for (int i = 0; i < l / 2 + 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != Math.abs(s.charAt(l - 2 - i) - s.charAt(l - 1 - i)))
                return "Not Funny";
        }
        return "Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
