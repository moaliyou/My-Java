package src.practice.exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Double> listOfNumbers = new ArrayList<>();
        double num = 0;

        try {

            System.out.print("Enter a number: ");
            num = input.nextDouble();

        } catch (InputMismatchException mismatchException) {
            System.out.println("Please enter number not text.");
        }

        listOfNumbers.add(num);

        System.out.println(listOfNumbers);

    }

}
