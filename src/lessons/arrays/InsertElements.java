package src.lessons.arrays;

import java.util.Arrays;

public class InsertElements {

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
