package src.practice.functions;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.println("A program to find if a person can eligible to vote.\n");

        System.out.print("Enter your age: ");
        int personAge = inputValue.nextInt();

        // it's not eligible to vote
        // since the person is under 18
        if (!isEligibleToVote(personAge)) {
            System.out.println("Sorry :(, you're not eligible to vote.\nPlease come back when you reach 18.");
            return;
        }

        System.out.println("You're eligible to vote :)");

    }

    /**
     * A method to find out if he/she is eligible to vote
     *
     * @param personAge
     * @return if persongAge is greater than or equal to 18
     */
    static boolean isEligibleToVote(int personAge) {
        return personAge >= 18;
    }

}
