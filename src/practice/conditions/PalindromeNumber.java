package src.practice.conditions;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("To check if it's palindrome.");
        System.out.print("Enter a number: ");
        var number = scanner.nextInt();

        scanner.close();

        if (isPalindrome(number)){
            System.out.printf("%d is palindrome number.\n", number);
            return;
        }

        System.out.printf("%d isn't palindrome number.\n", number);

    }

    private static boolean isPalindrome(int number){
        return getReversedNum(number) == number;
    }

    private static int getReversedNum(int number){

        // Creating 2 variables
        // "remainder" holds the digits
        // every step/iteration
        // While "reversedNum" holds
        // the result of the reversed numbers
        var remainder = 0;
        var reversedNum = 0;

        // iterating through
        // the passed number
        // to reverse it
        while (number > 0){

            remainder = number % 10;

            reversedNum = reversedNum * 10 + remainder;

            number /= 10;

        }

        return reversedNum;

    }

}
