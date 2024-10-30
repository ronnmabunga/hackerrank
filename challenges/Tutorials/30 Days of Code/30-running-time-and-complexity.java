import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        LinkedList<Boolean> results = new LinkedList();
        for (int i = 0; i < n; i++) {
            results.add(primeCheck(Integer.parseInt(br.readLine())));
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Iterator i = results.iterator();
        while (i.hasNext()) {
            if ((Boolean) i.next()) {
                bw.write("Prime");
            } else {
                bw.write("Not prime");
            }
            bw.newLine();
        }
        bw.close();
    }

    static Boolean primeCheck(Integer n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
