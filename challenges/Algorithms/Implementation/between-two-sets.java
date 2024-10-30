import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY a
     * 2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Integer lcdA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcdA = lcd(lcdA, a.get(i));
        }
        int temp = lcdA;
        int cnt = 0;
        while (temp <= 100) {
            cnt++;
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i) % temp != 0) {
                    cnt--;
                    break;
                }
            }
            temp += lcdA;
        }
        return cnt;
    }

    public static Integer gcd(Integer a, Integer b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static Integer lcd(Integer a, Integer b) {
        return a * b / gcd(a, b);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
