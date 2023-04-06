package src.practice.functions;

import java.util.InputMismatchException;

public class MyMath {

    public static void main(String[] args) {

        int num1 = 44, num2 = 12;

        // calling the sumOf() method
        // to calculate the total
        // of the given numbers
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sumOf(num1, num2));

        // calling the productOf method
        // to calculate the product of
        // the given two numbers
        System.out.println("The product of " + num1 + " and " + num2 + " is " + productOf(num1, num2));

        System.out.println(isNumberPalindrome(55));

    }

    /**
     * A method that sums/adds 2 numbers given by the user
     *
     * @param num1 it holds the value of the 1st given number
     * @param num2 it holds the value of the 2nd given number
     * @return The sum/total of the two given numbers
     */
    static int sumOf(int num1, int num2) {
        return (num1 + num2);
    }

    /**
     * A method that multiplies 2 numbers
     *
     * @param num1 it holds the value of the 1st given number
     * @param num2 it holds the value of the 2nd given number
     * @return The product of the given 2 numbers
     */
    static int productOf(int num1, int num2) {
        return (num1 * num2);
    }

    static int getFactorialOf(int number) {
        if (number < 0)
            throw new InputMismatchException("number must be greater than or equal to 0.");

        if (number == 0 || number == 1)
            return 1;

        int factorialNumber = 1;

        for (int counter = 2; counter <= number; counter++)
            factorialNumber *= counter;

        return factorialNumber;
    }

    static boolean isNumberPalindrome(int num) {

        int copyOfNum = num, reversedNum = 0;

        while (num > 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder ;
            num /= 10;
        }

        return copyOfNum == reversedNum;

    }

}
