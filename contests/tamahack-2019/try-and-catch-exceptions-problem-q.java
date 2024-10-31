import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int T = inp.nextInt();
        for (int j = 0; j < T; j++) {
            int PR = inp.nextInt();
            int LZ = inp.nextInt();
            int strongest = 0;
            boolean PRwins = true;
            for (int i = 0; i < PR; i++) {
                int temp = inp.nextInt();
                if (strongest < temp) {
                    strongest = temp;
                }
            }
            for (int i = 0; i < LZ; i++) {
                int temp = inp.nextInt();
                if (strongest < temp) {
                    strongest = temp;
                    PRwins = false;
                }
            }
            if (PRwins) {
                System.out.println("Power Rangers");
            } else {
                System.out.println("Lord Zedd");
            }

        }
    }
}