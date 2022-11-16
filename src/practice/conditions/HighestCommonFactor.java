package src.practice.conditions;

public class HighestCommonFactor{

    public static void main(String[] args) {
        
        var numOne = 9;
        var numTwo = 21;
        var highestCommonFactor = 1;

        for (int i = 1; i < numOne; i++){

            if ((numOne % i == 0) && (numTwo % i == 0)) {
                if (highestCommonFactor < i) {
                    highestCommonFactor = i;
                }
            }

        }

        System.out.println(highestCommonFactor);


    }

}