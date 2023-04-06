package src.practice.conditions;

public class LeapYear {

    public static void main(String[] args) {

        int num = Integer.valueOf(System.console().readLine("Enter a positive number: "));

        if (num % 400 == 0) {

            System.out.println("It's a leap year.");

        } else if (num % 400 != 0 && num % 100 == 0) {

            System.out.println("It isn't a leap year.");

        } else if ((num % 400 != 0) && (num % 100 != 0) && (num % 4 == 0)) {

            System.out.println("It's a leap year.");

        } else {

            System.out.println("It isn't a leap year.");

        }

    }

}