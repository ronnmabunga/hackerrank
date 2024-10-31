import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        LinkedList<Integer> nums = new LinkedList();
        LinkedList<String> strs = new LinkedList();
        Integer label;
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            nums.add(Integer.parseInt(st.nextToken()));
            strs.add(st.nextToken());
        }
        br.close();
        for (int i = 1; i <= n; i++) {
            String sol = "";
            for (int j = 0; j < r; j++) {
                if (i % nums.get(j) == 0) {
                    sol += strs.get(j);
                }
            }
            if (sol.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(sol);
            }
        }

    }
}
