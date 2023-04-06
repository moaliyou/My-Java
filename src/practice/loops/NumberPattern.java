package src.practice.loops;

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {

        generateTriangleNumberPattern(new Scanner(System.in).nextInt());

    }

    private static void generateTriangleNumberPattern(int num) {

        if (num < 0) {
            System.out.println("Please enter positive number.");
            return;
        }

        for (int rowSteps = 1; rowSteps <= num; rowSteps++) {

            for (int colSteps = 1; colSteps <= rowSteps; colSteps++) {
                System.out.print(rowSteps);
            }

            System.out.println();

        }

    }

}
