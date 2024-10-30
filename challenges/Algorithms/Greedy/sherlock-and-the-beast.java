import java.io.*;
import java.util.stream.*;

class Solution {

    // Complete the decentNumber function below.
    static void decentNumber(int n) {
        if (n < 3) {
            System.out.println(-1);
            return;
        }
        int a = n / 3;
        int t = n % 3;
        while (a > 0 && t % 5 != 0) {
            a--;
            t += 3;
        }
        if (t % 5 != 0) {
            System.out.println(-1);
            return;
        } else {
            printer(t / 5, a);
        }

    }

    static void printer(int threes, int fives) {
        for (int i = 0; i < fives; i++) {
            System.out.print(555);
        }
        for (int i = 0; i < threes; i++) {
            System.out.print(33333);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                decentNumber(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
