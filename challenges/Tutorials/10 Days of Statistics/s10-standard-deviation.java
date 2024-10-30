import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> X = new LinkedList();
        Integer total = 0;
        while (st.hasMoreTokens()) {
            Integer x = Integer.parseInt(st.nextToken());
            total += x;
            X.add(x);
        }
        Float mean = ((float) total / (float) n);
        Double var = 0.0;
        for (int x : X) {
            var += Math.pow(Math.abs(mean - x), 2);
        }
        Double sdev = Math.sqrt(var / n);
        System.out.printf("%.1f\n", sdev);
    }
}
