package src.practice.conditions;

public class HighestCommonFactor{

    public static void main(String[] args) {
        
        var numOne = 50;
        var numTwo = 65;

        System.out.printf("The highest common factor is %d \n", getGreatestCommonDivisorOf(numOne, numTwo));


    }

    private static int getGreatestCommonDivisorOf(int numOne, int numTwo){

        var highestCommonFactor = 1;

        for (int i = 1; i <= Math.min(numOne, numTwo); i++) {
            if (numOne % i == 0 && numTwo % i == 0) {
                highestCommonFactor = i;
            }
        }

        return highestCommonFactor;

    }

    private static int getHighestCommonFactorOf(int numOne, int numTwo) {

        var highestCommonFactor = 1;

        if (numOne == numTwo) {
            return numOne;
        }

        if (numOne == 0) {
            return numTwo;
        }

        if (numTwo == 0) {
            return numOne;
        }

        for (int i = 1; i < numTwo; i++){

            if ((numOne % i == 0) && (numTwo % i == 0)) {
                highestCommonFactor = Math.max(i, highestCommonFactor);
            }

        }

        return highestCommonFactor;
    }

}