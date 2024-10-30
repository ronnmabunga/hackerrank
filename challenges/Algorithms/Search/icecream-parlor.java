import java.io.*;
import java.util.*;

class Solution {

    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, LinkedList<Integer> arr) {
        LinkedList<Integer> arrcopy = (LinkedList<Integer>) arr.clone();
        Collections.sort(arr);
        int cheap = 0;
        int pricey = arr.size() - 1;
        int sum = arr.get(cheap) + arr.get(pricey);
        while (sum != m) {
            if (sum > m)
                pricey--;
            else
                cheap++;
            sum = arr.get(cheap) + arr.get(pricey);
        }
        int cheapval = arr.get(cheap);
        int priceyval = arr.get(pricey);
        int[] indexes = new int[2];
        indexes[0] = arrcopy.indexOf(cheapval) + 1;
        if (cheapval == priceyval) {
            arrcopy.remove(indexes[0]);
            indexes[1] = arrcopy.indexOf(cheapval) + 2;
        } else {
            indexes[1] = arrcopy.lastIndexOf(priceyval) + 1;
        }
        if (indexes[0] > indexes[1]) {
            indexes[1] = indexes[0] + indexes[1];
            indexes[0] = indexes[1] - indexes[0];
            indexes[1] = indexes[1] - indexes[0];
        }
        return indexes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int m = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            LinkedList<Integer> arr = new LinkedList();

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr.add(arrItem);
            }

            int[] result = icecreamParlor(m, arr);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
