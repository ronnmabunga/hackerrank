import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        String[] sets = new String[N];
        inp.nextLine();
        for (int i = 0; i < N; i++) {
            sets[i] = inp.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String[] snums = sets[i].split(" ");
            Integer[] nums = new Integer[snums.length - 1];
            System.out.print("Denominations:");
            for (int j = 1; j < snums.length; j++) {
                nums[j - 1] = (Integer.parseInt(snums[j]));
                System.out.print(" " + nums[j - 1]);
            }
            System.out.println("");
            nums = sort(nums);
            boolean good = true;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j + 1] < nums[j] * 2) {
                    good = false;
                    break;
                }
            }
            System.out.println((good ? "Good" : "Bad") + " coin denominations!");
            System.out.println("");
        }
    }

    static Integer[] sort(Integer[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int k = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = k;
                }
            }
        }
        return nums;
    }
}