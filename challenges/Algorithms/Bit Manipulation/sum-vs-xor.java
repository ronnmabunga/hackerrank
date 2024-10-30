import java.io.*;

class Solution {

    // Complete the sumXor function below.
    static long sumXor(long n) {
        long i = 1;
        while (n != 0) {
            if ((n & 1) != 1) {
                i <<= 1;
            }
            n >>= 1;
        }
        return i;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = sumXor(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
