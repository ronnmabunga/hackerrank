import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        inp.nextInt();
        inp.nextLine();
        LinkedList<String> strs = new LinkedList();
        while (inp.hasNext()) {
            strs.add(inp.nextLine());
        }
        for (String str : strs) {
            process(str);
        }
    }

    static void process(String str) {
        int sl = str.length();
        int skip = (int) Math.sqrt((double) sl);
        ArrayList<String> strs = new ArrayList();
        for (int i = 0; i < skip; i++) {
            strs.add("");
        }
        for (int i = 0; i < sl; i++) {
            strs.set(i % skip, (strs.get(i % skip) + str.charAt(i)));
        }
        for (int i = skip - 1; i >= 0; i--) {
            System.out.print(strs.get(i));
        }
        System.out.println("");
    }
}