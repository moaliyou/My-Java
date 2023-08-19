package src.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrayOperations {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 12};
        int lengthOfArray = arr.length;
        int positionToInsert = 4;
        int value = 10;

        insertElement(arr, lengthOfArray, positionToInsert, value);

        System.out.println(Arrays.toString(arr));

    }


    private static void insertElement(
            int[] arr,
            int lengthOfArray,
            int positionToInsert,
            int value
    ) {

        for (int i = (lengthOfArray - 1); i > positionToInsert; i--)
            arr[i + 1] = arr[i];

        arr[positionToInsert] = value;

    }

}
