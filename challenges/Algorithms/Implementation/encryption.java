import java.io.*;
import java.util.*;

class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        s = s.replaceAll("\\s", "");
        String n = "";
        int l = (int) Math.floor(Math.sqrt(s.length()));
        int h = (int) Math.ceil(Math.sqrt(s.length()));
        if (l * h < s.length())
            l = h;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                try {
                    n = n + s.charAt(i + j * h);
                } catch (StringIndexOutOfBoundsException e) {
                }
                // System.out.println(n);
            }
            n = n + " ";
        }
        return n;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
