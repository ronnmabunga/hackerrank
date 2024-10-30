import java.io.*;
import java.util.*;

class Solution {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, Integer[] arr) {
        Set<Integer> nums = new HashSet();
        Map<Integer, Integer> numscnt = new HashMap();
        nums.addAll(Arrays.asList(arr));
        for (Integer num : arr) {
            if (numscnt.containsKey(num))
                numscnt.put(num, numscnt.get(num) + 1);
            else
                numscnt.put(num, 1);
        }
        int cnt = 0;
        for (Integer num : nums) {
            // System.out.println(num + " " + nums.contains(num+d) + " " +
            // nums.contains(num+2*d));

            if (nums.contains(num + d) && nums.contains(num + 2 * d)) {
                // System.out.println("Set contains it: ");
                // System.out.println("set contains " + numscnt.get(num) + " of " + num);
                // System.out.println("set contains " + numscnt.get(num+d) + " of " + (num+d));
                // System.out.println("set contains " + numscnt.get(num+2*d) + " of " +
                // (num+2*d));
                cnt += numscnt.get(num) * numscnt.get(num + d) * numscnt.get(num + 2 * d);

            } else
                continue;
        }
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        Integer[] arr = new Integer[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
