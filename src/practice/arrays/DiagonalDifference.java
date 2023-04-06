package src.practice.arrays;

import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(7, 8, 7));

        printEqualDiagonalValues(arr);
//        System.out.println(diagonalDifference(arr));
    }

    private static void printEqualDiagonalValues(List<List<Integer>> arr) {
        List<Integer> equalDiagonalValues = new ArrayList<>();
        int counter = arr.size() - 1;

        for (int row = 0; row < arr.size(); row++) {
            for (int col = 0; col < arr.get(row).size(); col++) {
                if (row == col) {
                    if (Objects.equals(arr.get(row).get(row), arr.get(row).get(counter)))
                        System.out.println(arr.get(row).get(counter));
                }
            }
            counter--;
        }
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int ltr = 0;
        int rtl = 0;
        int difference;
        int counter = arr.size() - 1;

        for (int row = 0; row < arr.size(); row++) {
            for (int col = 0; col < arr.get(row).size(); col++) {
                if (row == col) {
                    ltr += arr.get(row).get(row);
                    rtl += arr.get(row).get(counter);
                }
            }
            counter--;
        }
        difference = ltr - rtl;
        return (difference < 0) ? (difference * -1) : difference;
    }

}
