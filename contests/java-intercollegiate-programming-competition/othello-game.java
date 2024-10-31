import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] input = new String[8];
        for (int i = 0; i < 8; i++) {
            input[i] = inp.nextLine();
        }
        int Bs = 0;
        int Ws = 0;
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (input[y].charAt(x) == 'B') {
                    Bs++;
                }
                if (input[y].charAt(x) == 'W') {
                    Ws++;
                }
            }
        }
        if (Bs == Ws) {
            System.out.println("Tie game.");
        } else if (Bs > Ws) {
            System.out.println("Black wins.");
        } else {
            System.out.println("White wins.");
        }
    }
}