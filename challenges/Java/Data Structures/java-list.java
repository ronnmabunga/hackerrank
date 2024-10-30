import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        List<Integer> L = new LinkedList();
        int N = inp.nextInt();
        for (int i = 0; i < N; i++) {
            L.add(inp.nextInt());
        }
        int Q = inp.nextInt();
        for (int i = 0; i < Q; i++) {
            inp.nextLine();
            String Qs = inp.nextLine();
            if (Qs.equals("Insert")) {
                L.add(inp.nextInt(), inp.nextInt());
            } else if (Qs.equals("Delete")) {
                L.remove(inp.nextInt());
            }
        }
        System.out.println(L.toString().replace("[", "").replace("]", "").replace(",", ""));
        inp.close();
    }
}
