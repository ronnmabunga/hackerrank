import java.io.*;
import java.util.*;

class Solution {
    static Scanner inp;
    static BufferedReader br;
    static Integer x, y, z;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        inp = new Scanner(System.in);
        x = inp.nextInt();
        y = inp.nextInt();
        z = inp.nextInt();
        Integer mindistx = 0;
        Integer mindisty = 0;
        Integer distancesq;
        Integer mindistancesq = Integer.MAX_VALUE;
        for (int i = 0; i < z; i++) {
            Integer xi = inp.nextInt();
            Integer yi = inp.nextInt();
            Integer ximx = Math.abs(xi - x);
            Integer yimy = Math.abs(yi - y);
            distancesq = ximx * ximx + yimy * yimy;
            if (distancesq < mindistancesq) {
                mindistx = xi;
                mindisty = yi;
                mindistancesq = distancesq;
            }
        }
        System.out.println(mindistx + " " + mindisty);
    }
}
