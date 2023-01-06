package src.practice.functions;

import java.util.Scanner;

public class EvenOddFinder {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.println("A program to find out whether a given number is even or odd.\n");

        System.out.print("Enter an integer number: ");
        int givenNumber = inputValue.nextInt();

        if (!isEven(givenNumber)) {
            System.out.printf("%d is odd number.\n", givenNumber);
            return;
        }

        System.out.printf("%d is even number", givenNumber);

    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
