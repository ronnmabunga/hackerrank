import java.io.*;

class Solution {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        String t;
        do {
            t = s;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s = s.replaceAll("" + ch + ch, "");
            }
        } while (!t.equals(s));
        if (s.equals(""))
            return "Empty String";
        else
            return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
