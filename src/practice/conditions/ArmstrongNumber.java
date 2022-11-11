package src.practice.conditions;

public class ArmstrongNumber{

    public static void main(String[] args) {
        
        var number = 54748;

        System.out.println(isArmstrong(number));

    }

    private static boolean isArmstrong(int number){
        return getArmstrongNumber(number) == number;
    }

    private static int getArmstrongNumber(int number){

        var digitsOfNumber = getNumberOfDigits(number);
        var resultOfArmstrongNumber = 0;

        while (number > 0){

            // getting each digit's value
            // to calculate the formula
            // of armstrong number
            var remainder = number % 10;

            resultOfArmstrongNumber += Math.pow(remainder, digitsOfNumber);

            number /= 10;
        }

        return resultOfArmstrongNumber;

    }

    private static int getNumberOfDigits(int number){
        var numberOfDigits = 0;

        while (number > 0){

            numberOfDigits++;
            number /= 10;

        }

        return numberOfDigits;

    }

}