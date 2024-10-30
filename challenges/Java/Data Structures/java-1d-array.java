import java.util.*;

class Solution {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        boolean visitable[] = new boolean[n];
        visitable[0] = true;
        boolean haschanges = false;
        while (true) {
            for (int i = 0; i < n; i++) {
                if (visitable[i]) {
                    if (i + leap >= n || i + 1 >= n)
                        return true;
                    if (i + leap < n && game[i + leap] == 0 && !visitable[i + leap]) {
                        visitable[i + leap] = true;
                        haschanges = true;
                    }
                    if (i + 1 < n && game[i + 1] == 0 && !visitable[i + 1]) {
                        visitable[i + 1] = true;
                        haschanges = true;
                    }
                    if (i > 0 && game[i - 1] == 0 && !visitable[i - 1]) {
                        visitable[i - 1] = true;
                        haschanges = true;
                    }
                }
            }
            if (haschanges)
                haschanges = false;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
