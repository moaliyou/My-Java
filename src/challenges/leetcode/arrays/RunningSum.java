package src.challenges.leetcode.arrays;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {

        System.out.println("Example 1: " + Arrays.toString(runningSum(new int[]{1,2,3,4})));
        System.out.println("Example 2: " + Arrays.toString(runningSum(new int[]{1,1,1,1,1})));
        System.out.println("Example 3: " + Arrays.toString(runningSum(new int[]{3,1,2,10,1})));

    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;

    }

}
