package src.practice.functions;

public class MyMath {

    public static void main(String[] args) {

        int num1 = 44, num2 = 12;

        // calling the sumOf() method
        // to calculate the total
        // of the given numbers
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sumOf(num1, num2));

        // calling the productOf method
        // to calculate the product of
        // the given two numbers
        System.out.println("The product of " + num1 + " and " + num2 + " is " + productOf(num1, num2));

    }

    /**
     * A method that sums/adds 2 numbers given by the user
     *
     * @param num1
     * @param num2
     * @return The sum/total of the two given numbers
     */
    static int sumOf(int num1, int num2) {
        return (num1 + num2);
    }

    /**
     * A method that multiplies 2 numbers
     *
     * @param num1
     * @param num2
     * @return The product of the given 2 numbers
     */
    static int productOf(int num1, int num2) {
        return (num1 * num2);
    }

}
