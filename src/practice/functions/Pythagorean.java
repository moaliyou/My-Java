package src.practice.functions;

public class Pythagorean {

    public static void main(String[] args) {
        System.out.println(isTriplet(3, 2, 5));
    }

    private static boolean isTriplet(int num1, int num2, int num3) {
        // To check if the given numbers
        // is a pythagorean triplet
        // we're summing the square
        // of 'num1' and 'num2'
        var squareSum = (int) (Math.pow(num1, 2) + Math.pow(num2, 2));

        return squareSum == (int) Math.pow(num3, 2);
    }

}
