import java.io.*;
import java.util.*;

class Solution {
    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int c = 0;
        for (int a = i; a <= j; a++) {
            if (beautyValue(a) % k == 0)
                c++;
        }
        return c;
    }

    static int beautyValue(int i) {
        return Math.abs(reverse(i) - i);
    }

    static int reverse(int i) {
        char[] chs = (i + "").toCharArray();
        String s = "";
        for (char ch : chs) {
            s = ch + s;
        }
        return Integer.parseInt(s);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
