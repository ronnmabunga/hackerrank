import java.util.*;

class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        boolean done = false;
        int temp = arr[arr.length - 1];
        int j = arr.length - 2;
        do {
            try {
                if (temp < arr[j])
                    arr[j + 1] = arr[j];
                else {
                    arr[j + 1] = temp;
                    done = true;
                }
                j--;
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            } catch (Exception e) {
                arr[j + 1] = temp;
                done = true;
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        } while (!done);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
