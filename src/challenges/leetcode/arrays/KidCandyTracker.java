package src.challenges.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidCandyTracker {

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 8, 7}, 1));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int maximumCandy = 0;

        for (int candy : candies) {
            if (candy > maximumCandy)
                maximumCandy = candy;
        }

        for (int candy : candies)
            result.add((candy + extraCandies) >= maximumCandy);

        return result;

    }

}
