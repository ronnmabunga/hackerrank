import java.util.*;

class Solution {

    public static void insertionSort(int[] A) {
        // 4 1 3 5 6 2
        for (int i = 1; i < A.length; i++) {
            int value = A[i]; // 1
            int j = i - 1; // 0
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        insertionSort(ar);
        in.close();
    }
}
