
//Complete this code or write your own from scratch
import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> pb = new HashMap();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            Integer phone = in.nextInt();
            pb.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (pb.containsKey(s))
                System.out.println(s + "=" + pb.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
