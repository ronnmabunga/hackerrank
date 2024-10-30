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
        HashMap<Integer, Integer> counter = new HashMap();
        LinkedList<Integer> medianer = new LinkedList();
        Integer total = 0;
        Integer maxCounter = null;
        Integer mode = 0;
        while (st.hasMoreTokens()) {
            Integer x = Integer.parseInt(st.nextToken());
            total += x;
            counter.put(x, (counter.containsKey(x)) ? counter.get(x) + 1 : 1);
            medianer.add(x);
            if (maxCounter == null) {
                maxCounter = 1;
                mode = x;
            } else if (counter.get(x) > maxCounter) {
                maxCounter = counter.get(x);
                mode = x;
            } else if (counter.get(x) == maxCounter) {
                if (mode > x)
                    mode = x;
            }

        }
        Float mean = ((float) total / (float) n);
        Collections.sort(medianer);
        Float median = ((n % 2 == 0) ? (((float) medianer.get(n / 2) + (float) medianer.get(n / 2 - 1)) / 2f)
                : ((float) medianer.get(n / 2)));
        System.out.printf("%.1f\n", mean);
        System.out.printf("%.1f\n", median);
        System.out.println(mode);
    }
}
