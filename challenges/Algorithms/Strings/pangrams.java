import java.io.*;
import java.util.*;

class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        HashSet<Character> alphabet = new HashSet();
        for (Character ch = 'A'; ch <= 'Z'; ch++)
            alphabet.add(ch);
        for (char ch : s.toUpperCase().toCharArray())
            alphabet.remove(ch);
        return ((alphabet.size() == 0) ? "pangram" : "not pangram");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
