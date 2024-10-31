import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] pos = new String[8];
        for (int i = 0; i < 8; i++) {
            pos[i] = inp.nextLine();
        }
        if (valid(pos)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    static boolean valid(String[] pos) {
        int xs = 0;
        Boolean[][] posVal = new Boolean[8][8];
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                posVal[y][x] = true;
            }
        }
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (pos[y].charAt(x) == 'x') {
                    xs++;
                    if (!posVal[y][x])
                        return false;
                    for (int yy = 0; yy < 8; yy++) {
                        for (int xx = 0; xx < 8; xx++) {
                            if (!(xx == x && yy == y)) {
                                if (xx == x || yy == y || (xx - x) == (yy - y) || (xx - x) == (y - yy)) {
                                    posVal[yy][xx] = false;
                                    if (pos[yy].charAt(xx) == 'x') {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                    posVal[y][x] = false;
                }
            }
        }
        if (xs > 0) {
            return true;
        } else {
            return false;
        }
    }
}