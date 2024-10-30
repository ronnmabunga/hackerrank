import java.util.*;

class Solution {
    static List<Long> kaprekars = new LinkedList();
    static {
        for (long i = 1; i < 100000; i++) {

            long square = i * i;
            String ssquare = square + "";
            String r = ssquare.substring(ssquare.length() - (i + "").length(), ssquare.length());
            String l = ssquare.substring(0, ssquare.length() - (i + "").length());
            long rn = r.equals("") ? 0 : Long.parseLong(r);
            long ln = l.equals("") ? 0 : Long.parseLong(l);
            if (i == (rn + ln))
                kaprekars.add(i);
        }

    }

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
        String n = "";
        for (Long k : kaprekars) {
            if (k >= p) {
                if (k <= q)
                    n = n + k + " ";
                else
                    break;
            }
        }
        if (n.equals(""))
            System.out.println("INVALID RANGE");
        else
            System.out.println(n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
