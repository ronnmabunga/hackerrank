import java.io.*;
import java.util.*;

class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashSet<Character> set1 = new HashSet();
        for (char c : s1.toCharArray()) {
            set1.add((Character) c);
        }
        for (char c : s2.toCharArray()) {
            if (set1.remove((Character) c))
                return "YES";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
