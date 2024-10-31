import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] names = new String[n];
        Double[] x = new Double[n];
        Double[] y = new Double[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            names[i] = st.nextToken();
            x[i] = Double.parseDouble(st.nextToken());
            y[i] = Double.parseDouble(st.nextToken());
        }
        br.close();
        SortedSet<Integer> vio = new TreeSet();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // System.out.println(i + " " + j);
                if (Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2)) < 3.0) {
                    vio.add(i);
                    vio.add(j);
                }
            }
        }
        Iterator<Integer> it = vio.iterator();
        LinkedList<String> ns = new LinkedList();
        while (it.hasNext()) {
            ns.add(names[it.next()]);
        }
        Collections.sort(ns);
        for (String nss : ns) {
            System.out.println(nss);
        }
        if (ns.isEmpty()) {
            System.out.println("Social distancing was followed.");
        }
    }
}
