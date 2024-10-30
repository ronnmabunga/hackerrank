import java.io.*;
import java.util.*;

class Solution {
    final static Double E = 2.71828;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Double ave = Double.parseDouble(st.nextToken());
        Double ave2 = Double.parseDouble(st.nextToken());
        System.out.format("%.3f\n", (160.0 + 40.0 * (ave + ave * ave)));
        System.out.format("%.3f\n", (128.0 + 40.0 * (ave2 + ave2 * ave2)));
    }

    static Double poisson(Double ave, Integer k) {
        return (Math.pow(ave, k) * Math.pow(E, -1 * ave))
                / Double.valueOf(fac(k));
    }

    static Integer fac(Integer n) {
        if (n < 2) {
            return 1;
        }
        return n * fac(n - 1);
    }
}
