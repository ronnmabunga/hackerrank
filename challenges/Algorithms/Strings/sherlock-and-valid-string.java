import java.io.*;
import java.util.*;

class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        HashMap<Character, Integer> h = new HashMap();
        for (char c : s.toCharArray()) {
            Character ch = (Character) c;
            h.put(ch, (h.containsKey(ch) ? h.get(ch) + 1 : 1));
        }
        System.out.println(h);
        HashMap<Integer, Integer> e = new HashMap();
        for (Map.Entry entry : h.entrySet()) {
            Integer num = (Integer) entry.getValue();
            e.put(num, (e.containsKey(num) ? e.get(num) + 1 : 1));
        }
        System.out.println(e);
        if (e.size() == 1)
            return "YES";
        if (e.size() == 2) {
            // max2->2 min1->1
            LinkedList<Integer> keysE = new LinkedList(e.keySet());
            int min = keysE.get(0) < keysE.get(1) ? keysE.get(0) : keysE.get(1);
            int max = keysE.get(0) > keysE.get(1) ? keysE.get(0) : keysE.get(1);
            System.out.println("max: " + max + " min: " + min);
            if (e.get(min) == 1)
                return "YES";
            if (keysE.get(0) == keysE.get(1) && keysE.get(0) == 1)
                return "YES";
            if (max - min != 1)
                return "NO";
            System.out.println("e.get(max)" + e.get(max));
            if (e.get(max) != 1)
                return "NO";
            return "YES";
        }
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
