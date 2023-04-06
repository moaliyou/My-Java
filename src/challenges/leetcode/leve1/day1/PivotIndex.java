package src.challenges.leetcode.leve1.day1;

public class PivotIndex {

    public static void main(String[] args) {

        System.out.println(findPivotIndex(new int[]{2, 1, -1}));

    }

    static int findPivotIndex(int[] nums) {

        int sum = 0;
        for(int value : nums){
            sum = sum + value;
        }

        int start = 0;
        for(int index=0; index<nums.length; index++){

            sum = sum - nums[index];
            if(start == sum){
                return index;
            }
            start = start + nums[index];
        }
        return -1;
    }

}
