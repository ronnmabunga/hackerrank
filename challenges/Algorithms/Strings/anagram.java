import java.io.*;
import java.util.*;

class Solution {

    // Complete the anagram function below.
    static int anagram(String s) {
        int l = s.length();
        if (l % 2 == 1)
            return -1;
        String a = s.substring(0, l / 2);
        String b = s.substring(l / 2, l);
        LinkedList<Character> alist = new LinkedList();
        LinkedList<Character> blist = new LinkedList();
        for (char ch : a.toCharArray())
            alist.add((Character) ch);
        for (char ch : b.toCharArray()) {
            if (alist.remove((Character) ch))
                blist.add((Character) ch);
        }
        return alist.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
