package src.practice.arrays;

import java.util.Arrays;
import java.util.List;

public class MixedSum {

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(5,"5")));
        System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
        System.out.println(sum(Arrays.asList()));
    }

    /*
     * Assume input will be only of Integer o String type
     */
    private static int sum(List<?> mixed) {

        if (mixed == null || mixed.size() == 0)
            return 0;

        int sum = 0;

        for (Object o : mixed) {

            sum += Integer.parseInt(o.toString());

        }

        return sum;
    }

}
