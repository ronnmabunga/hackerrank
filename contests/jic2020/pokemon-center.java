import java.io.*;
import java.util.*;

class APokemonCenter {
    static Scanner inp;
    // static BufferedReader br;
    static Integer[][] l;
    static StringTokenizer st;
    static int n, x, y, z;

    public static void main(String[] args) throws IOException {
        inp = new Scanner(System.in);
        n = inp.nextInt();
        l = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(l[i], -1);
        }
        while (inp.hasNext()) {
            x = inp.nextInt() - 1;
            y = inp.nextInt() - 1;
            z = inp.nextInt();
            l[x][y] = z;
            l[y][x] = z;
        }
        for (int i = 0; i < n; i++) {
            l[i][i] = 0;
        }
        for (int zz = 0; zz < n; zz++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (l[i][j] != 0 && l[i][j] != -1) {
                        for (int k = 0; k < n; k++) {
                            if (k == i) {
                                continue;
                            } else if (l[k][j] != 0 && l[k][j] != -1) {
                                if (l[i][k] == -1 || l[i][k] > (l[i][j] + l[k][j])) {
                                    l[i][k] = l[i][j] + l[k][j];
                                }
                            }
                        }
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (l[i][j] > max) {
                    max = l[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
// 6
// 1 2 3
// 2 3 4
// 2 6 2
// 6 4 6
// 6 5 5

// 1 2 3 4 5 6
// 1 0 3 x x x x
// 2 3 0 4 x x 2
// 3 x 4 0 x x x
// 4 x x x 0 x 6
// 5 x x x x 0 5
// 6 x 2 x 6 5 0