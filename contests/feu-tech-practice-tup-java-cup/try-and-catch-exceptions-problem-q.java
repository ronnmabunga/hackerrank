import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean powerWins;
        int max, N, M, num;
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            powerWins = true;
            max = Integer.MIN_VALUE;
            N = in.nextInt();
            M = in.nextInt();
            for (int j = 0; j < N; j++) {
                num = in.nextInt();
                if (num > max) {
                    max = num;
                }
            }
            for (int j = 0; j < M; j++) {
                if (in.nextInt() > max) {
                    powerWins = false;
                }
            }
            if (powerWins) {
                System.out.println("Power Rangers");
            } else {
                System.out.println("Lord Zedd");
            }
        }
    }
}