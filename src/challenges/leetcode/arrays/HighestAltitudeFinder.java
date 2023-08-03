package src.challenges.leetcode.arrays;

import java.util.Arrays;

public class HighestAltitudeFinder {

    public static void main(String[] args) {

        System.out.println(largestAltitude(new int[] {-4,-3,-2,-1,4,3,2}));

    }

    private static int largestAltitude(int[] gain) {
        int largestAltitude = 0;
        int altitude = 0;

        for (int i : gain) {

            altitude = (altitude + i);

            if (altitude > largestAltitude)
                largestAltitude = altitude;

        }


        return largestAltitude;
    }

}
