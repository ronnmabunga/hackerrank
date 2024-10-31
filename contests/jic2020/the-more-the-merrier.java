import java.io.*;
import java.util.*;

class Solution {
    static Scanner inp;
    static int num, curr;
    static Integer maxVal, maxKey, maxCount;

    public static void main(String[] args) throws IOException {
        inp = new Scanner(System.in);
        maxVal = Integer.MIN_VALUE;
        maxCount = 0;
        HashMap<Integer, Integer> merry = new HashMap();
        while (inp.hasNext()) {
            num = inp.nextInt();
            if (merry.containsKey(num)) {
                curr = merry.get(num) + 1;
                if (curr == maxVal) {
                    maxCount++;
                } else if (curr > maxVal) {
                    maxVal = curr;
                    maxCount = 1;
                    maxKey = num;
                }
                merry.put(num, curr);
            } else {
                merry.put(num, 1);
                if (1 == maxVal) {
                    maxCount++;
                } else if (1 > maxVal) {
                    maxVal = 1;
                    maxCount = 1;
                    maxKey = num;
                }
            }
        }
        if (maxCount == 1 && maxVal > 1) {
            System.out.println(maxKey + " is Merrier");
        } else if (maxCount == 1 && maxVal == 1) {
            System.out.println("No More No Merrier");
        } else if (maxCount > 1 && maxVal > 1) {
            System.out.println("The More The Merrier");
        } else {
            System.out.println("No More No Merrier");
        }

    }
}