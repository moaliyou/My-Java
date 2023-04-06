package src.practice.functions;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.println("A program to find out if the given number is prime or not.\n");

        System.out.print("Enter a number: ");
        int number = inputValue.nextInt();

        if (isPrimeNumber(number)) {
            System.out.printf("%d is prime number.\n", number);
            return;
        }

        System.out.printf("%d is not prime number.\n", number);

    }

    /**
     * @Description: A method checks if the given number is prime number
     *
     * @param number THe value to be checked
     * @return TRUE if given number is prime, otherwise FALSE
     */
    static boolean isNumberPrime(int number) {

        if (number < 2)
            return false;

        for (int counter = 2; counter < number; counter++)
            if (number % counter == 0)
                return false;

        return true;

    }

    static boolean isPrimeNumber(int number) {

        if (number <= 1)
            return false;

        if (number < 4)
            return true;

        if ((number % 2 == 0) || (number % 3 == 0))
            return false;

        for (int counter = 5; counter <= Math.sqrt(number); counter+=6)
            if ((number % counter == 0) || (number % (counter + 2) == 0))
                return false;

        return true;
    }

}
