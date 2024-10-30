import java.io.*;
import java.util.*;

class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String a, String b) {
        LinkedList<Character> alist = new LinkedList();
        LinkedList<Character> blist = new LinkedList();
        for (char ch : a.toCharArray())
            alist.add((Character) ch);
        for (char ch : b.toCharArray()) {
            if (!alist.remove((Character) ch))
                blist.add((Character) ch);
        }
        return blist.size() + alist.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
