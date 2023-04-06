package src.practice.conditions;

public class LeastCommonMultiple {
    
    public static void main(String[] args) {

        int num1 = 78;
        int num2 = 65;
        
        int lcm = getLeastCommonMultipleOf(num1, num2);

        System.out.printf("The LCM of %d and %d is %d \n", num1, num2, lcm);

    }

    private static int getLeastCommonMultipleOf(int num1, int num2){
        return (num1 * num2) / getGreatestCommonDivisorOf(num1, num2);
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

}
