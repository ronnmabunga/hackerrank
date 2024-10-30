import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER k
     * 2. INTEGER_ARRAY s
     */

    static boolean[][] canExistTogether;

    public static int nonDivisibleSubset(int k, List<Integer> nums) {
        // Write your code here
        Map<Integer, Integer> count = new HashMap();
        for (int i = 0; i < k; i++)
            count.put(i, 0);
        for (Integer num : nums) {
            count.put(num % k, count.get(num % k) + 1);
        }
        Integer total = count.get(0) == 0 ? 0 : 1;
        if (k % 2 == 0) {
            total += count.get(k / 2) == 0 ? 0 : 1;
            for (int i = 1; k / 2 - i > 0; i++)
                total += count.get(k / 2 + i) > count.get(k / 2 - i) ? count.get(k / 2 + i) : count.get(k / 2 - i);
        } else {
            for (int i = 0; k / 2 - i > 0; i++)
                total += count.get((k + 1) / 2 + i) > count.get(k / 2 - i) ? count.get((k + 1) / 2 + i)
                        : count.get(k / 2 - i);
        }
        return total;
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
