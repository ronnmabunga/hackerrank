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
        Set keys = freq.keySet();
        ArrayList<Integer> arr = new ArrayList();
        arr.addAll(keys);
        Collections.sort(arr);
        // System.out.println(arr);
        // System.out.println(freq);
        Integer total = 0;
        int killerbullets = freq.get(arr.get(arr.size() - 1));
        // System.out.println(killerbullets);
        total += killerbullets * arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            if (killerbullets <= freq.get(arr.get(i))) {
                total += (freq.get(arr.get(i)) - killerbullets) * arr.get(i);
                killerbullets = freq.get(arr.get(i));
            }

            // System.out.println("tot" + total);
            // System.out.println("kb" + killerbullets);
            // int freqdiff = (freq.get(arr.get(i)) - freq.get(arr.get(i+1)));
            // total += (freqdiff>0?freqdiff:0) * arr.get(i);
            // killerbullets += (freq.get(arr.get(i)));
        }
        System.out.println(total);
    }
}