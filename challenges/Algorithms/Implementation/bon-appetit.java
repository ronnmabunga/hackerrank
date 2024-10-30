import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        for (Integer bil : bill) {
            total += bil;
        }
        total -= bill.get(k);
        if (total / 2 < b)
            System.out.println(b - total / 2);
        else
            System.out.println("Bon Appetit");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
