import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        Map<Integer, Integer> freq = new HashMap();
        for (int i = 0; i < N; i++) {
            int num = inp.nextInt();
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        int Q = inp.nextInt();
        Integer[] Qs = new Integer[Q];
        for (int i = 0; i < Q; i++) {
            Qs[i] = inp.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            if (freq.containsKey(Qs[i])) {
                System.out.println(freq.get(Qs[i]));
            } else {
                System.out.println("NOT PRESENT");
            }
        }

    }
}