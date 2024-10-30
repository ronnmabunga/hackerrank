import java.io.*;
import java.util.*;

class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int shorterlength = s.length() > t.length() ? t.length() : s.length();
        int firstdifference = 0;
        boolean found = false;
        for (int i = 0; i < shorterlength; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                firstdifference = i;
                found = true;
                break;
            }
        }
        if (found) {
            if (s.length() + t.length() - 2 * firstdifference > k)
                return "No";
            else {
                if (Math.abs(s.length() + t.length() - 2 * firstdifference - k) % 2 == 1) {
                    if (k >= s.length() + t.length())
                        return "Yes";
                    else
                        return "No";
                } else
                    return "Yes";
            }
        } else {
            if (Math.abs(s.length() - t.length()) > k)
                return "No";
            else {
                if (Math.abs(s.length() + t.length() - 2 * firstdifference - k) % 2 == 1) {
                    if (k >= s.length() + t.length())
                        return "Yes";
                    else
                        return "No";
                } else
                    return "Yes";
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
