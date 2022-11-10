package src.practice.conditions;

public class ArmstrongNumber{

    public static void main(String[] args) {
        
        var number = 371;
        var counter = 0;

        while (number > 0){

            var remainder = number % 10;

            System.out.println(remainder);

            counter++;
            number /= 10;

        }

        System.out.println();
        System.out.println(counter);

    }

}