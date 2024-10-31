import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     * 1. INTEGER T
     * 2. STRING_ARRAY suffix
     * 3. INTEGER_ARRAY query
     */

    public static void solve(int T, List<String> suffix, List<Integer> query) {
        // Don't forget to comment your student number and name
        // 201720045 Ronn Michael I. Mabunga
        // Enter code here - use standard I/O to print your answer:
        for (int i = 0; i < suffix.size(); i++) {
            String s = suffix.get(i);
            Integer q = query.get(i);
            List<String> suffs = new ArrayList();

            for (int j = 0; j < s.length(); j++) {
                suffs.add(s.substring(j, s.length()));
            }
            System.out.print(suffs.get(0) + " ");
            Collections.sort(suffs);
            String nm1 = "";
            String nm2 = "";
            String suff = suffs.get(q);
            String temp;
            for (char ch : suff.toCharArray()) {
                temp = nm2;
                nm2 = nm2 + ch + nm2;
            }
            System.out.println(nm2);
        }
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> suffix = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        List<Integer> query = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.solve(T, suffix, query);

        bufferedReader.close();
    }
}