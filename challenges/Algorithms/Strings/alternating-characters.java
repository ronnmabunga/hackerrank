import java.io.*;
import java.util.*;

class Solution {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        char last = s.charAt(0);
        boolean first = true;
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (first) {
                first = false;
                continue;
            }
            if (last == ch)
                count++;
            last = ch;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
