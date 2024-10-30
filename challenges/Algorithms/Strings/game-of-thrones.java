import java.io.*;
import java.util.*;

class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        LinkedList<Character> ch = new LinkedList();
        for (char c : s.toCharArray()) {
            if (!ch.remove((Character) c))
                ch.add((Character) c);
        }
        return (ch.size() < 2) ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
