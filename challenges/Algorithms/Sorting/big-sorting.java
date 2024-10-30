import java.io.*;
import java.util.*;

class Solution {
    static class NumStringComparator implements Comparator<String> {
        public int compare(String a, String b) {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<String> unsorted = new LinkedList();
        for (int i = 0; i < n; i++) {
            unsorted.add(br.readLine());
        }
        br.close();
        Comparator<String> c = new NumStringComparator();
        Collections.sort(unsorted, c);
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        for (String s : unsorted) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
