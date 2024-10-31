import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        List<Integer> seeds = new ArrayList();
        inp.nextInt();
        while (inp.hasNext()) {
            seeds.add(inp.nextInt());
        }
        Collections.sort(seeds);
        for (int i = 0; i < seeds.size(); i++) {
            // System.out.print(seeds.get(i) + " to ");
            seeds.set(i, seeds.get(i) + seeds.size() - i);
            // System.out.print(seeds.get(i) + ", ");
        }
        System.out.println(Collections.max(seeds) + 1);
    }
}