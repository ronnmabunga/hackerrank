import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        ArrayList<ArrayList<Integer>> outerArr = new ArrayList();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            m = in.nextInt();
            ArrayList<Integer> innerArr = new ArrayList();
            for (int j = 0; j < m; j++) {
                innerArr.add(in.nextInt());
            }
            outerArr.add(innerArr);
        }
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                System.out.println(outerArr.get(in.nextInt() - 1).get(in.nextInt() - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}
