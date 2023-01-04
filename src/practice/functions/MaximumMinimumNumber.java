package src.practice.functions;

import java.util.Scanner;

public class MaximumMinimumNumber {

    static int findMaximumNumber(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    static int findMinimumNumber(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = inputValue.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = inputValue.nextInt();

        System.out.print("Enter 3rd number: ");
        int num3 = inputValue.nextInt();

        System.out.println();

        System.out.printf("Maximum number is %d\n", findMaximumNumber(num1, num2, num3));
        System.out.printf("Minimum number is %d\n", findMinimumNumber(num1, num2, num3));

    }

}
