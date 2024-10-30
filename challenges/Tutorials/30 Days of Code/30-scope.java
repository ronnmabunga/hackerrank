import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    // Add your code here
    void computeDifference() {
        maximumDifference = Integer.MIN_VALUE;
        int temp;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                temp = Math.abs(elements[i] - elements[j]);
                if (temp > maximumDifference) {
                    maximumDifference = temp;
                }
            }
        }
    }
} // End of Difference class

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}