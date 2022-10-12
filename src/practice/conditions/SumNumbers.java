package src.practice.conditions;

import java.util.ArrayList;
import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> listOfNumbers = new ArrayList<>();

        System.out.println("To quit the program type/enter zero(0).\n");

        System.out.print("Enter number: ");
        double number = input.nextDouble();

        while (number != 0){

            listOfNumbers.add(number);

            System.out.print("Enter another number: ");
            number = input.nextDouble();

        }

        System.out.printf("\nTotal sum of %d is %.2f", listOfNumbers.size(), sumOf(listOfNumbers));


    }

    private static double sumOf(ArrayList<Double> listOfNumbers) {

        double sum_of_numbers = 0;

        for (double number : listOfNumbers){
            sum_of_numbers += number;
        }

        return sum_of_numbers;
    }

}
