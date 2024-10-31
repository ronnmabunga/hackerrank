import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static void solve(List<Integer> numbers) {
        // Don't forget to enter your name and student ID:

        // Use standard output to print the answer. Enter code here:
        int[] a = new int[31];
        int j = numbers.get(0);
        for (Integer i : numbers) {
            a[i]++;
            if (a[i] > a[j]) {
                j = i;
            }
        }
        System.out.println(j);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.solve(numbers);

        bufferedReader.close();
    }
}