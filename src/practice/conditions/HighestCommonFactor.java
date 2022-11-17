package src.practice.conditions;

public class HighestCommonFactor{

    public static void main(String[] args) {
        
        var numOne = 1;
        var numTwo = 10;
        // var highestCommonFactor = 1;

        // for (int i = 1; i < numOne; i++){

        //     if ((numOne % i == 0) && (numTwo % i == 0)) {
        //         if (highestCommonFactor < i) {
        //             highestCommonFactor = i;
        //         }
        //     }

        // }

        System.out.println(getHighestCommonFactorOf(numOne, numTwo));


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