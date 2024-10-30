import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Float> medianer = new LinkedList();
        while (st.hasMoreTokens())
            medianer.add(Float.parseFloat(st.nextToken()));
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
        // System.out.println(q1er);
        // System.out.println(medianer);
        // System.out.println(q3er);
        Integer q1 = (int) Math
                .floor((m % 2 == 0) ? ((q1er.get(m / 2) + q1er.get(m / 2 - 1)) / 2f) : (q1er.get(m / 2)));
        Integer q3 = (int) Math
                .floor((m % 2 == 0) ? ((q3er.get(m / 2) + q3er.get(m / 2 - 1)) / 2f) : (q3er.get(m / 2)));
        System.out.printf("%d\n", q1);
        System.out.printf("%d\n", median);
        System.out.printf("%d\n", q3);
    }
}
