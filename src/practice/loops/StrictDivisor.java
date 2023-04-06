package src.practice.loops;

import java.util.Scanner;

public class StrictDivisor {

    public static void main(String[] args) {

        var num = getUserInput();

        System.out.println("The sum of strict divisors: " + getSumOfStrictDivisors(num));

    }

    private static int getUserInput() {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Enter a positive number" + ": ");
        return inputValue.nextInt();
    }

    private static int getSumOfStrictDivisors(int num) {

        var sumOfStrictDivisors = 0;

        for (int divisor = 1; divisor <= (num / 2); divisor++) {

            if (num % divisor == 0)
                sumOfStrictDivisors += divisor;
        }

        return sumOfStrictDivisors;
    }

}
