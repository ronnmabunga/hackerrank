import java.io.*;
import java.util.*;

class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        HashSet<Character> gems = new HashSet();
        HashSet<Character> temp = new HashSet();
        for (char c : arr[0].toCharArray()) {
            gems.add((Character) c);
        }
        boolean first = true;
        for (String s : arr) {
            if (first) {
                first = false;
                continue;
            }
            temp.clear();
            for (char c : s.toCharArray()) {
                temp.add((Character) c);
            }
            gems.retainAll(temp);
        }
        return gems.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
