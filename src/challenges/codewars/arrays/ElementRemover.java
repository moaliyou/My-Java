package src.challenges.codewars.arrays;

import java.util.Arrays;

public class ElementRemover {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        removeEveryOther(
                                new Object[] { "Hello", "Goodbye", "Hello Again" }
                        )
                )
        );
    }

    public static Object[] removeEveryOther(Object[] arr) {

        if (arr.length < 1)
            return arr;

        Object[] result = new Object[(arr.length + 1) / 2];
        int counter = 0;

        for (int index = 0; index < arr.length; index++) {

            if ((index % 2) != 1) {
                result[counter] = arr[index];
                counter++;
            }

        }

        return result;
    }

}
