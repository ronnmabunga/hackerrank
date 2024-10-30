import java.io.*;

class Solution {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
        int l = s.length();
        if (isPal(s))
            return -1;
        for (int i = 0; i < l / 2 + 1; i++) {
            if (s.charAt(i) != s.charAt(l - 1 - i)) {
                if (isPal(s.substring(0, i) + s.substring(i + 1, l)))
                    return i;
                if (isPal(s.substring(0, l - 1 - i) + s.substring(l - i, l)))
                    return l - 1 - i;
            }
            // System.out.println(n);
        }
        return -1;
    }

    static boolean isPal(String s) {
        String t = new StringBuilder(s).reverse().toString();
        return s.equals(t);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        int[] results = new int[q];
        String s = new String();
        for (int qItr = 0; qItr < q; qItr++) {
            s = br.readLine();
            results[qItr] = palindromeIndex(s);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        for (int qItr = 0; qItr < q; qItr++) {
            bw.write(String.valueOf(results[qItr]));
            bw.newLine();
        }
        bw.close();
    }
}
