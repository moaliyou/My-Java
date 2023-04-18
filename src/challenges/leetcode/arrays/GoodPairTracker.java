package src.challenges.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class GoodPairTracker {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1,1,3};

        HashMap<Integer, Integer> mapNumOfGoodPairs = new HashMap<>();

        int numOfGoodPairs = 0;

        for(int num : nums) {

            int numCount = mapNumOfGoodPairs.getOrDefault(num,0);

            numOfGoodPairs += numCount;

            mapNumOfGoodPairs.put(num, numCount + 1);

        }

        System.out.println(numOfGoodPairs);

    }

}
