package src.practice.exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Double> listOfNumbers = new ArrayList<>();

        while (true) {

            System.out.print("Enter a number: ");
            String inputValue = input.nextLine();

            if (inputValue.equalsIgnoreCase("done"))
                break;

            try {

                double number = Double.parseDouble(input.nextLine());

                listOfNumbers.add(number);

            } catch (InputMismatchException mismatchException) {
                System.out.println("Please enter number not text.");
            }
        }

        System.out.println(listOfNumbers);

    }

}
