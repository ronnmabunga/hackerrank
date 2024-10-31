import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {

        // Don't forget to write your name and student ID as a comment:
        // Ronn Michael I. Mabunga 201720045
        // Use standard I/O to get values and print the answer.

        // Enter code here:
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer row = Integer.parseInt(st.nextToken());
        Integer col = Integer.parseInt(st.nextToken());
        Integer spaceNumCount = Integer.parseInt(st.nextToken());
        Integer[] spaceNum = new Integer[spaceNumCount];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < spaceNumCount; i++) {
            spaceNum[i] = Integer.parseInt(st.nextToken());
        }
        char[][] cryptMess = new char[row][col];
        for (int i = 0; i < row; i++) {
            cryptMess[i] = br.readLine().toCharArray();
        }
        char[] cM = new char[row * col];
        int minx = 0;
        int miny = 0;
        int maxx = col - 1;
        int maxy = row - 1;
        int d = 0;
        int i = 0;
        int x = 0;
        int y = 0;
        while (true) {
            try {
                if (d == 0) {
                    if (x >= maxx) {
                        d = (d + 1) % 4;
                        miny++;
                    } else {
                        // System.out.println(i +" " +cryptMess[y][x]);
                        cM[i++] = cryptMess[y][x];
                        x++;
                    }
                } else if (d == 1) {
                    if (y >= maxy) {
                        d = (d + 1) % 4;
                        maxx--;
                    } else {
                        // System.out.println(i +" " +cryptMess[y][x]);
                        cM[i++] = cryptMess[y][x];
                        y++;
                    }
                } else if (d == 2) {
                    if (x <= minx) {
                        d = (d + 1) % 4;
                        maxy--;
                    } else {
                        // System.out.println(i +" " +cryptMess[y][x]);
                        cM[i++] = cryptMess[y][x];
                        x--;
                    }
                } else if (d == 3) {
                    if (y <= miny) {
                        d = (d + 1) % 4;
                        minx++;
                    } else {
                        // System.out.println(i +" " +cryptMess[y][x]);
                        cM[i++] = cryptMess[y][x];
                        y--;
                    }
                }
                if (maxy < miny && maxx < minx) {
                    break;
                }
            } catch (Exception e) {
                break;
            }
        }
        int p = 0;
        int indexToAdd = 0;
        while (true) {
            try {
                System.out.print(cM[p]);
                p += spaceNum[indexToAdd] + 1;
                indexToAdd = (indexToAdd + 1) % spaceNumCount;
            } catch (Exception e) {
                break;
            }
        }
    }
}