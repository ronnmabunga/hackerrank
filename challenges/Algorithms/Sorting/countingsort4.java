import java.io.*;
import java.util.*;

class Solution {

    // Complete the countSort function below.
    static void countSort(List<List<String>> arr, int n) throws IOException {
        LinkedList<String>[] map = new LinkedList[100];
        for (int i = 0; i < 100; i++)
            map[i] = new LinkedList();
        for (int i = 0; i < n / 2; i++)
            map[Integer.parseInt(arr.get(i).get(0))].add("-");
        for (int i = n / 2; i < n; i++)
            map[Integer.parseInt(arr.get(i).get(0))].add(arr.get(i).get(1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        for (LinkedList<String> m : map) {
            for (String s : m) {
                bw.write(s);
                bw.write(" ");
            }
        }
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")));
        }

        countSort(arr, n);

        bufferedReader.close();
    }
}
