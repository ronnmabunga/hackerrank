import java.io.*;
import java.util.*;

class Solution {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String str) {
        int i = 0;
        for (char ch : str.toCharArray()) {
            try {
                if ("hackerrank".charAt(i) == ch)
                    i++;
            } catch (Exception e) {
                break;
            }
        }
        return (i == "hackerrank".length()) ? "YES" : "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}