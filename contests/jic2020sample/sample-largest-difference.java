import java.util.*;

class Solution {
    static LinkedList<Integer> nums;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nums = new LinkedList();
        while (scan.hasNext()) {
            nums.add(scan.nextInt());
        }
        System.out.println(Collections.max(nums) + " " + Collections.min(nums));
    }
}