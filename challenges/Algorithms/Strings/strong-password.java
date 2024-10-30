import java.io.*;
import java.util.*;

class Solution {
    final static String A = "0123456789";
    final static String B = "abcdefghijklmnopqrstuvwxyz";
    final static String C = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String D = "!@#$%^&*()-+";

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        char[] s = password.toCharArray();
        for (char ch : s) {
            if (A.contains(ch + ""))
                a = true;
            if (B.contains(ch + ""))
                b = true;
            if (C.contains(ch + ""))
                c = true;
            if (D.contains(ch + ""))
                d = true;
        }
        int total = (a ? 0 : 1) + (b ? 0 : 1) + (c ? 0 : 1) + (d ? 0 : 1);
        return (total + n < 6) ? 6 - n : total;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
