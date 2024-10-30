import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ad = Integer.parseInt(st.nextToken());
        int am = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int cd = Integer.parseInt(st.nextToken());
        int cm = Integer.parseInt(st.nextToken());
        int cy = Integer.parseInt(st.nextToken());
        if (ay > cy) {
            System.out.println(10000);
        } else if (ay == cy) {
            if (am > cm) {
                System.out.println(500 * (am - cm));
            } else if (am == cm) {
                if (ad > cd) {
                    System.out.println(15 * (ad - cd));
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }

    }
}
