package src.practice.loops;

import java.util.Scanner;

public class MaximumMinimumFinder {

    public static void main(String[] args) {

        int maximumNumber = Integer.MIN_VALUE;
        int minimumNumber = Integer.MAX_VALUE;
        int num = getPositiveIntegerInput();

        // We've to display error message
        // telling the user that the given
        // number is invalid to handle negative error
        if (!(num >= 0)) {
            System.out.println(num + " is not a positive number.");
            return;
        }

        while (isNonNegative(num)) {

            maximumNumber = Math.max(num, maximumNumber);
            minimumNumber = Math.min(num, minimumNumber);

            num = getPositiveIntegerInput();

        }

        System.out.println("Maximum number -> " + maximumNumber);
        System.out.println("Minimum number -> " + minimumNumber);

    }

    /**
     * Returns true if the given number greater than or equal to 0
     *
     * @param num the given number by the user input
     * @return true if the given number is positive, otherwise false
     */
    private static boolean isNonNegative(int num) {
        return num >= 0;
    }

    /**
     * Returns the given number of the user input.
     *
     * @return the given number by the user
     */
    private static int getPositiveIntegerInput() {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        return inputValue.nextInt();
    }

}
