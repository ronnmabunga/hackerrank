import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] X = new Integer[n];
        Integer total = 0;
        for (int i = 0; i < n; i++) {
            X[i] = Integer.parseInt(st.nextToken());

        }
        st = new StringTokenizer(br.readLine());
        Integer totalW = 0;
        Integer[] W = new Integer[n];
        for (int i = 0; i < n; i++) {
            W[i] = Integer.parseInt(st.nextToken());
            totalW += W[i];
            total += X[i] * W[i];
        }
        System.out.printf("%.1f\n", (float) total / (float) totalW);
    }
}
