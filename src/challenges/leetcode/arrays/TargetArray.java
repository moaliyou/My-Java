package src.challenges.leetcode.arrays;

import java.util.Arrays;

/**
 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
 * <p>
 *     Initially target array is empty.
 *     From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 *     Repeat the previous step until there are no elements to read in nums and index.
 * <p>
 * Return the target array.
 * <p>
 * It is guaranteed that the insertion operations will be valid.
 */
public class TargetArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};

        System.out.println(
                Arrays.toString(
                        createTargetArray(
                                nums,
                                index
                        )
                )
        );

    }

    private static void insertElementAt(int arr[], int position, int value) {
        int counterLength = arr.length;

        for (int i = counterLength - 1; i > position; i--)
            arr[i] = arr[i - 1];

        arr[position] = value;

    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        int lengthOfNums = nums.length;
        int[] target = new int[lengthOfNums];

        for (int i = 0; i < lengthOfNums; i++) {

            int valueOfNums = nums[i];
            int valueOfIndex = index[i];

            insertElementAt(target, valueOfIndex, valueOfNums);

        }

        return target;
    }

}
