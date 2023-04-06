package src.challenges.leetcode.arrays;

import java.util.Arrays;

public class PermutationArrayBuilder {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
    }

    public static int[] buildArray(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] += (nums[nums[i]] % nums.length) * nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] /= nums.length;
        }

        return nums;

    }

}
