import java.io.*;
import java.util.*;

class Solution {

    static HashMap<Long, Long> combiMap = new HashMap();
    static HashMap<Long, Long> factMap = new HashMap();

    // Complete the sherlockAndAnagrams function below.
    static long sherlockAndAnagrams(String s) {
        char[] str = s.toCharArray();
        int sl = str.length;
        HashMap<String, Long> counter = new HashMap();
        for (int i = 0; i < sl; i++) {
            LinkedList<Character> sets = new LinkedList();
            for (int j = i; j < sl; j++) {
                sets.add(str[j]);
                Collections.sort(sets);
                String setString = sets.toString();
                counter.put(setString, counter.containsKey(setString) ? counter.get(setString) + 1 : 1);
            }
        }
        long count = 0;
        // System.out.println(counter);
        for (String keyStr : counter.keySet()) {
            count += combinations(counter.get(keyStr));
        }
        return count;
    }

    static long combinations(Long n) {
        return n * (n - 1l) / 2l;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            Long result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
