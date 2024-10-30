import java.io.*;

class Solution {
    final static Double E = 2.71828;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double ave = Double.parseDouble(br.readLine());
        Integer k = Integer.parseInt(br.readLine());
        System.out.format("%.3f", poisson(ave, k));
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
