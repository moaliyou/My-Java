package src.challenges.leetcode.arrays;

import java.util.Arrays;

public class SmallerNumberCounter {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{6, 5, 4, 8})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7, 7, 7, 7})));

    }

    public static int[] listOfSmallerNumbersThanCurrent(int[] nums) {

        // To ensure that we've enough space
        // to count the frequency of each element
        // in the input array
        int maximumNumber = 0;
        for (int num : nums) {
            if (num > maximumNumber) {
                maximumNumber = num;
            }
        }

        // To keep track of how many times
        // each number appears in `nums`
        int[] counts = new int[maximumNumber + 1];
        for (int num : nums) {
            counts[num]++;
        }

        // Calculating the sum of frequencies
        // of all numbers less than the current number
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = 0; j < nums[i]; j++) {
                sum += counts[j];
            }

            result[i] = sum;
        }

        return result;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int lengthOfNums = nums.length;
        int[] countOfSmallerNumbers = new int[lengthOfNums];

        for (int i = 0; i < lengthOfNums; i++) {

            for (int j = 0; j < lengthOfNums; j++) {

                if ((j != i) && (nums[j] < nums[i])) {
                    countOfSmallerNumbers[i] += 1;
                }

            }

        }

        return countOfSmallerNumbers;

    }

}
