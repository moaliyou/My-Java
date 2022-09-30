package src.challenges.leetcode.leve1.day1;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(runningSum(new int[]{3,1,2,10,1})));

    }

    /*
    tani waxay u egtahay mid soo optimal ah
     */
    public static int[] runningSum1(int[] nums) {

        int sum = 0;

        for (int index = 0; index < nums.length; index++) {

            sum += nums[index];
            nums[index] = sum;

        }

        return nums;

    }

    public static int[] runningSum(int[] nums) {

        int size_of_nums = nums.length;

        for (int steps = 1; steps < size_of_nums; steps++) {

            for (int index = steps; index < steps + 1; index++) {

                nums[index] += nums[index - 1];

            }

        }

        return nums;

    }

}
