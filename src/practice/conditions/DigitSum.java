package src.practice.conditions;

public class DigitSum {

    public static void main(String[] args) {

        System.out.println("\nThis program will calculate the digit sum of the given number.\n");

        int num = Integer.valueOf(System.console().readLine("Enter an integer number: "));
        int sum = 0, copyOfNum = num;

        while (num > 0) {

            int remainder = num % 10;

            sum += remainder;

            num /= 10;

        }

        System.out.printf("The digit(s) sum of %d is %d\n", copyOfNum, sum);

    }

}
