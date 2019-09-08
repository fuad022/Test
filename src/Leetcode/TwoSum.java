package Leetcode;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            int x = target - nums[i];
//            for (int j = i; j < nums.length; j++) {
//                if (i != j && x == nums[j]) {
//                    nums = new int[]{i, j};
//                }
//            }
//        }
//        return nums;

        int[] result = new int[]{};
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (x == nums[j]) {
                    result = new int[]{i, j};
//                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {-1, -2, -3, -4, -5};
//        int[] nums = {2, 7, 11, 15};
//        int[] nums = {-3, 4, 3, 90};
        int[] nums = {2, 5, 5, 15};
//        int target = -8;
//        int target = 9;
//        int target = 0;
        int target = 10;

        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
