import java.io.*;
import java.util.*;

class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if (s.charAt(8) == 'P') {
            int hr = (int) (s.charAt(0) - '0') * 10 + (int) (s.charAt(1) - '0');
            return hr == 12 ? s.substring(0, 8) : (12 + hr) + s.substring(2, 8);
        } else {
            int hr = (int) (s.charAt(0) - '0') * 10 + (int) (s.charAt(1) - '0');
            return hr == 12 ? "00" + s.substring(2, 8) : s.substring(0, 8);
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
