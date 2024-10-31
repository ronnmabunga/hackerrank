import java.util.*;

class Solution {
    static String solution = "";
    static Integer maxSwag = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList();
        ArrayList<String> t = new ArrayList();
        ArrayList<String[]> s = new ArrayList();
        ArrayList<Integer[]> p = new ArrayList();
        int cnt = 0;
        int temph;
        int templ;
        while (in.hasNext()) {
            templ = in.nextInt();
            l.add(templ);
            temph = in.nextInt();
            if (temph == 0 && templ == 0) {
                break;
            }
            in.nextLine();
            t.add(in.nextLine());
            s.add(new String[temph]);
            p.add(new Integer[temph]);
            for (int i = 0; i < temph; i++) {
                s.get(cnt)[i] = in.next();
                p.get(cnt)[i] = in.nextInt();
            }
            cnt++;
        }
        Integer Lc;
        String Tc;
        String Sc[];
        Integer Pc[];
        for (int i = 0; i < cnt; i++) {
            Lc = l.get(i);
            Tc = t.get(i);
            Sc = s.get(i);
            Pc = p.get(i);
            // System.out.println("Lc: "+Lc);
            // System.out.println("Tc: "+Tc);

            compute(Lc - Tc.length(), Sc, Pc, 0, "", 0);
            System.out.println(Tc + solution);
            maxSwag = 0;
            solution = "";
            // System.out.println(maxSwag);
        }
    }

    public static void compute(Integer limit, String Sc[], Integer Pc[], int index, String prevComb, int prevSwag) {
        if (index >= Sc.length) {
            return;
        }
        // System.out.println("Debug: Limit = "+limit);
        // System.out.println("Debug: prevComb = "+prevComb);
        // System.out.println("Debug: prevSwag = "+prevSwag);
        // System.out.println("Debug: "+Sc[index]);
        int newLimit = limit - 1 - Sc[index].length();
        if (newLimit >= 0) {
            int curSwag = prevSwag + Pc[index];
            String curComb = prevComb + " " + Sc[index];
            if (curSwag > maxSwag) {
                maxSwag = curSwag;
                solution = curComb;
            } else if (curSwag == maxSwag) {
                if (solution.length() < curComb.length()) {
                    solution = curComb;
                }
            }
            compute(newLimit, Sc, Pc, (index + 1), curComb, curSwag);
            compute(limit, Sc, Pc, (index + 1), prevComb, prevSwag);
        } else {
            compute(limit, Sc, Pc, (index + 1), prevComb, prevSwag);
        }
    }
}