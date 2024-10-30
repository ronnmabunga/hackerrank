import java.io.*;
import java.util.*;

class Solution {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        char[] ss = s.toCharArray();
        int cnt = 0;
        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
            cnt--;
        for (char c : ss) {
            if (c >= 'A' && c <= 'Z')
                cnt++;
        }
        return cnt + 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
