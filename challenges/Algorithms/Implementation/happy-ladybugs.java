import java.io.*;
import java.util.*;

class Solution {

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {
        // if(b.equals("_"))
        // return "YES";
        if (b.length() < 2)
            return "NO";
        if (checkIfAlreadyHappy(b))
            return "YES";
        Map<Character, Integer> histogram = new HashMap();
        for (char a : b.toCharArray())
            histogram.put((Character) a, (histogram.containsKey((Character) a)) ? histogram.get((Character) a) + 1 : 1);
        System.out.println(histogram.toString());
        if (!histogram.containsKey('_'))
            return "NO";
        else if (histogram.keySet().size() == 1)
            return "YES";
        for (Character a : histogram.keySet()) {
            if (a != '_') {
                if (histogram.get(a) == 1)
                    return "NO";
            }
        }
        return "YES";
    }

    static boolean checkIfAlreadyHappy(String b) {
        char[] bb = b.toCharArray();
        if (bb[0] != bb[1] || bb[bb.length - 1] != bb[bb.length - 2])
            return false;
        for (int i = 1; i < bb.length - 1; i++) {
            if (!(bb[i] == bb[i - 1] || bb[i] == bb[i + 1]))
                return false;
        }
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
