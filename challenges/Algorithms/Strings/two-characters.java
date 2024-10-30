import java.io.*;
import java.util.*;

class Solution {
    static String src;

    // Complete the alternate function below.
    static int alternate(String s) {
        src = s;
        HashSet<Character> set = new HashSet();
        char[] chs = s.toCharArray();
        for (char ch : chs) {
            set.add((Character) ch);
        }
        LinkedList<Character> chars = new LinkedList(set);
        int temp, max = 0;
        for (int i = 0; i < chars.size() - 1; i++) {
            for (int j = i + 1; j < chars.size(); j++) {
                temp = counter(chars.get(i), chars.get(j));
                if (max < temp)
                    max = temp;
            }
        }
        return max;
    }

    static int counter(char a, char b) {
        int h = 0;
        char last = 'f';
        char[] x = src.toCharArray();
        for (char y : x) {
            if (y == a || y == b) {
                if (y == last)
                    return 0;
                else {
                    h++;
                    if (y == a)
                        last = a;
                    else
                        last = b;
                }

            }
        }
        return h;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
