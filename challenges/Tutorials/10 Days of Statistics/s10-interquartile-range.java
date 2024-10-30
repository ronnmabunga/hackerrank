import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        LinkedList<Float> medianer = new LinkedList();
        LinkedList<Float> X = new LinkedList();
        LinkedList<Integer> F = new LinkedList();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            X.add(Float.parseFloat(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            F.add(Integer.parseInt(st.nextToken()));
        Integer freq;
        for (Integer i = 0; i < n; i++) {
            freq = F.get(i);
            for (Integer j = 0; j < freq; j++)
                medianer.add(X.get(i));
        }
        n = medianer.size();

        Collections.sort(medianer);
        Integer median = (int) Math
                .floor((n % 2 == 0) ? ((medianer.get(n / 2) + medianer.get(n / 2 - 1)) / 2f) : (medianer.get(n / 2)));
        LinkedList<Float> q1er = new LinkedList();
        LinkedList<Float> q3er = new LinkedList();
        if (n % 2 == 1) {
            medianer.remove(median);
            n--;
            for (int i = 0; i < n / 2; i++)
                q1er.add(medianer.get(i));
            for (int i = n / 2 + 1; i <= n; i++)
                q3er.add(medianer.get(i));
        } else {
            for (int i = 0; i < n / 2; i++)
                q1er.add(medianer.get(i));
            for (int i = n / 2; i < n; i++)
                q3er.add(medianer.get(i));
        }
        int m = n / 2;
        Float q1 = ((m % 2 == 0) ? ((q1er.get(m / 2) + q1er.get(m / 2 - 1)) / 2f) : (q1er.get(m / 2)));
        Float q3 = ((m % 2 == 0) ? ((q3er.get(m / 2) + q3er.get(m / 2 - 1)) / 2f) : (q3er.get(m / 2)));
        System.out.printf("%.1f\n", (q3 - q1));
    }
}
