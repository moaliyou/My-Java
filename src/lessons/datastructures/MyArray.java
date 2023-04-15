package src.lessons.datastructures;

import java.util.Arrays;

final class pair {

    private final long maximumValue;
    private final long minimumValue;

    public pair(long minimumValue, long maximumValue) {
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
    }

    @Override
    public String toString() {
        return "min = " + minimumValue +
                ", max =" + maximumValue;
    }
}

public class MyArray {

    public static void main(String[] args) {

        // To output the list
        // we've to initialize it
        long[] elementsList = {2, 34, 5, 6, 23, 43, 1, 9};

        // To traverse `elementsList`
        // it takes O(n) time complexity
//        showElements(elementsList);

        System.out.println(getMinMax(elementsList, elementsList.length).toString());

    }

    protected static pair getMinMax(long[] a, long n) {

        Arrays.sort(a);

        return new pair(a[0], a[(int) (n - 1)]);
    }

    protected static void showElements(int[] elementsList) {

        for (int element : elementsList)
            System.out.println(element);

    }

}
