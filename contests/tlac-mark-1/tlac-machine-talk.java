import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        bufferedReader.close();
        String s = "";
        while (st.hasMoreTokens()) {
            s += (char) Integer.parseInt(st.nextToken(), 2);
        }
        System.out.println(s);

    }
}