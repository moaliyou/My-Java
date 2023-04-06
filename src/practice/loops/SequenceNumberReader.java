package src.practice.loops;

import java.util.Scanner;

public class SequenceNumberReader {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        int sumOfNumbers = 0;

        while (sumOfNumbers <= 100) {

            System.out.print("Enter an integer number: ");
            sumOfNumbers += inputValue.nextInt();

        }

        System.out.println("Done!");

    }

}
