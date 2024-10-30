import java.math.*;
import java.util.*;

class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = new BigInteger(scanner.nextLine());
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        System.out.println(count(n.toString(2)));
    }

    static int count(String n) {
        int max = 0;
        int cnt = 0;
        int l = n.length();
        for (int i = 0; i < l; i++) {
            if (n.charAt(i) == '1') {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                }
            } else {
                if (cnt > max) {
                    max = cnt;
                }
                cnt = 0;
            }
        }
        return max;
    }

}
