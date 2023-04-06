package src.challenges.leetcode.arrays;

import java.util.Arrays;

public class ArrayShuffler {

    public static void main(String[] args) {
        System.out.println("Case 1: " + Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3)));
        System.out.println("Case 2: " + Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));
        System.out.println("Case 3: " + Arrays.toString(shuffle(new int[]{1,1,2,2}, 2)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledNums = new int[2 * n];
        int trackerIndex = 0;

        for (int index = 0; index < n; index++) {
            shuffledNums[trackerIndex++] = nums[index];
            shuffledNums[trackerIndex++] = nums[index + n];
        }

        return shuffledNums;

    }

}
