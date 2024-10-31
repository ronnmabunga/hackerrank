import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] L = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            L[i] = inp.nextInt();
            B[i] = inp.nextInt();
        }
        int maxSide;
        int maxPosSide;
        int cuts;
        int length;
        for (int i = 0; i < n; i++) {
            maxSide = 1;
            maxPosSide = 1;
            while (true) {
                if (maxSide > L[i] || maxSide > B[i]) {
                    break;
                } else {
                    maxSide++;
                    if (L[i] % maxSide == 0 && B[i] % maxSide == 0) {
                        maxPosSide = maxSide;
                    }
                }
            }
            cuts = (B[i] / maxPosSide * L[i] / maxPosSide);
            System.out.println("" + cuts);
        }
    }
}