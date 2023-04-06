package src.lessons.conditions;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        int sumOfNegativeNumbers = 0;
        int sumOfPositiveEvenNumbers = 0;
        int sumOfPositiveOddNumbers = 0;

        System.out.printf("Enter an integer number: ");
        int num = inputValue.nextInt();

        while (num != 0) {

            System.out.printf("Enter another integer number: ");
            num = inputValue.nextInt();

            if (num < 0)
                sumOfNegativeNumbers += num;

            else if (num % 2 == 0)
                sumOfPositiveEvenNumbers += num;
                
            else
                sumOfPositiveOddNumbers += num;

        }

    }

}
