package src.challenges.leetcode.arrays;

import java.util.Arrays;

public class ArrayConcatenation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,3})));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);

        return ans;
    }

}
