import java.math.BigDecimal;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        BigDecimal[] sBD = new BigDecimal[n];
        int[] order = new int[n];
        for (int i = 0; i < sBD.length; i++) {
            sBD[i] = new BigDecimal(s[i]);
            order[i] = i;
        }
        BigDecimal temp;
        String tempS;
        int tempI;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // System.out.println("Compare "+ s[i] + " to " + s[j]);
                if (sBD[i].compareTo(sBD[j]) == 0) {
                    if (order[i] > order[j]) {
                        temp = sBD[i];
                        sBD[i] = sBD[j];
                        sBD[j] = temp;
                        tempS = s[i];
                        s[i] = s[j];
                        s[j] = tempS;
                        tempI = order[i];
                        order[i] = order[j];
                        order[j] = tempI;
                    }
                } else if (sBD[i].compareTo(sBD[j]) < 0) {
                    temp = sBD[i];
                    sBD[i] = sBD[j];
                    sBD[j] = temp;
                    tempS = s[i];
                    s[i] = s[j];
                    s[j] = tempS;
                    tempI = order[i];
                    order[i] = order[j];
                    order[j] = tempI;
                    // System.out.println("i is less than j");
                } else {
                    // System.out.println("i is greater than or equal to j");
                }
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}