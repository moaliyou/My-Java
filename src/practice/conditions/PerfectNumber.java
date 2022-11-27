package src.practice.conditions;

public class PerfectNumber {

    public static void main(String[] args) {
        
        // To get the perfect number
        // we're asking the user to
        // input positive/whole number
        int num = Integer.valueOf(System.console().readLine("Enter a positive number: "));

        // Here we'll store
        // the sum of the 
        // positive divisors
        // of the given number 'num'
        int sum = 0;

        // To find the perfect number
        // we've to check if the
        // given number is 
        // positive or not
        if (num < 1) {
            
            System.out.println("To get the perfect number please enter a positive number.");
            return;

        }

        // Getting all positive divisors
        // of 'num' to calculate their sum
        for (int counter = 1; counter < num; counter++) {
            
            // Before we calculate
            // the sum we've to
            // get the divisors
            if (num % counter == 0)

                // summing the positive
                // divisors of 'num'
                sum += counter;                   

        }

        // Perfect Number is a
        // positive integer that
        // is equal to the sum of
        // its positive divisors
        if (sum == num) {

            System.out.printf("%d is perfect number. \n", num);
            return;

        }

        System.out.printf("%d isn't perfect number. \n", num);



    }

}
