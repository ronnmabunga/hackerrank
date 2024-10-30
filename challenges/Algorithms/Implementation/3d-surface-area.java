import java.io.*;
import java.util.*;

class Solution {

    // Complete the surfaceArea function below.
    static int surfaceArea(int[][] A) {
        // for(int i = 0; i < A.length; i ++){
        // for(int j = 0; j < A[i].length; j ++){
        // System.out.print(A[i][j] + " ");
        // }
        // System.out.println();
        // }
        int L = A.length; // System.out.println("L:" + L);
        int W = A[0].length; // System.out.println("W:" + W);
        int a, b, c, d, e;
        int topNbot = L * W * 2;
        int total = 0;
        if (W == 1 && L == 1) {
            return topNbot + 4 * A[0][0];
        } else if (W == 1 && L >= 2) {
            // North Corner
            c = A[0][0];
            e = A[1][0];
            total += 3 * c + (e > c ? 0 : c - e);
            // South Corner
            a = A[L - 2][0];
            c = A[L - 1][0];
            total += 3 * c + (a > c ? 0 : c - a);
            for (int i = 1; i < L - 1; i++) {
                // Side
                a = A[i - 1][0];
                c = A[i][0];
                e = A[i + 1][0];
                total += 2 * c + (a > c ? 0 : c - a) + (e > c ? 0 : c - e);
            }
            return topNbot + total;
        } else if (L == 1 && W >= 2) {
            // West Corner
            c = A[0][0];
            d = A[0][1];
            total += 3 * c + (d > c ? 0 : c - d);
            // East Corner
            b = A[0][W - 2];
            c = A[0][W - 1];
            total += 3 * c + (b > c ? 0 : c - b);
            for (int j = 1; j < W - 1; j++) {
                // Side
                b = A[0][j - 1];
                c = A[0][j];
                d = A[0][j + 1];
                total += 2 * c + (b > c ? 0 : c - b) + (d > c ? 0 : c - d);
            }
            return topNbot + total;
        }
        /*
         * else if(W==2 && L>2){
         * for(int i = 1; i < L-1; i ++){
         * //West Side
         * a = A[i-1][0]; c = A[i][0]; d = A[i][1]; e = A[i+1][0];
         * total += c+(a>c?0:c-a)+(d>c?0:c-d)+(e>c?0:c-e);
         * //East Side
         * a = A[i-1][W-1]; b = A[i][W-2]; c = A[i][W-1]; e = A[i+1][W-1];
         * total += c+(a>c?0:c-a)+(b>c?0:c-b)+(e>c?0:c-e);
         * }
         * return topNbot + total;
         * }else if(L==2 && W>2){
         * for(int j = 1; j < W-1; j ++){
         * //North Side
         * b = A[0][j-1]; c = A[0][j]; d = A[0][j+1]; e = A[1][j];
         * total += c+(b>c?0:c-b)+(d>c?0:c-d)+(e>c?0:c-e);
         * //South Side
         * a = A[L-2][j]; b = A[L-1][j-1]; c = A[L-1][j]; d = A[L-1][j+1];
         * total += c+(a>c?0:c-a)+(b>c?0:c-b)+(d>c?0:c-d);
         * }
         * return topNbot + total;
         * }
         */
        // Centers
        for (int i = 1; i < L - 1; i++) {
            for (int j = 1; j < W - 1; j++) {
                a = A[i - 1][j];
                b = A[i][j - 1];
                c = A[i][j];
                d = A[i][j + 1];
                e = A[i + 1][j];
                total += (a > c ? 0 : c - a) + (b > c ? 0 : c - b) + (d > c ? 0 : c - d) + (e > c ? 0 : c - e);
            }
        }
        for (int j = 1; j < W - 1; j++) {
            // North Side
            b = A[0][j - 1];
            c = A[0][j];
            d = A[0][j + 1];
            e = A[1][j];
            total += c + (b > c ? 0 : c - b) + (d > c ? 0 : c - d) + (e > c ? 0 : c - e);
            // South Side
            a = A[L - 2][j];
            b = A[L - 1][j - 1];
            c = A[L - 1][j];
            d = A[L - 1][j + 1];
            total += c + (a > c ? 0 : c - a) + (b > c ? 0 : c - b) + (d > c ? 0 : c - d);
        }
        for (int i = 1; i < L - 1; i++) {
            // West Side
            a = A[i - 1][0];
            c = A[i][0];
            d = A[i][1];
            e = A[i + 1][0];
            total += c + (a > c ? 0 : c - a) + (d > c ? 0 : c - d) + (e > c ? 0 : c - e);
            // East Side
            a = A[i - 1][W - 1];
            b = A[i][W - 2];
            c = A[i][W - 1];
            e = A[i + 1][W - 1];
            total += c + (a > c ? 0 : c - a) + (b > c ? 0 : c - b) + (e > c ? 0 : c - e);
        }
        // NorthWest Corner
        c = A[0][0];
        d = A[0][1];
        e = A[1][0];
        total += 2 * c + (d > c ? 0 : c - d) + (e > c ? 0 : c - e);
        // NorthEast Corner
        b = A[0][W - 2];
        c = A[0][W - 1];
        e = A[1][W - 1];
        total += 2 * c + (b > c ? 0 : c - b) + (e > c ? 0 : c - e);
        // SouthWest Corner
        a = A[L - 2][0];
        c = A[L - 1][0];
        d = A[L - 1][1];
        total += 2 * c + (a > c ? 0 : c - a) + (d > c ? 0 : c - d);
        // SouthEast Corner
        a = A[L - 2][W - 1];
        b = A[L - 1][W - 2];
        c = A[L - 1][W - 1];
        total += 2 * c + (a > c ? 0 : c - a) + (b > c ? 0 : c - b);
        return total + topNbot;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] HW = scanner.nextLine().split(" ");

        int H = Integer.parseInt(HW[0]);

        int W = Integer.parseInt(HW[1]);

        int[][] A = new int[H][W];

        for (int i = 0; i < H; i++) {
            String[] ARowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < W; j++) {
                int AItem = Integer.parseInt(ARowItems[j]);
                A[i][j] = AItem;
            }
        }

        int result = surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
