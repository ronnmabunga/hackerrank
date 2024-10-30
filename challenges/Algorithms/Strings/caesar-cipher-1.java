import java.io.*;
import java.util.*;

class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        char[] t = s.toCharArray();
        String str = "";
        for (char c : t)
            str = str + ((c >= 'a' && c <= 'z') ? ((char) ((c - 'a' + k) % 26 + 'a'))
                    : ((c >= 'A' && c <= 'Z') ? ((char) ((c - 'A' + k) % 26 + 'A')) : c));
        return str;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
