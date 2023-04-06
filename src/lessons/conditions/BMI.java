package src.lessons.conditions;

import java.util.Scanner;

public class BMI {
    
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.print("Soo geli dhirirkaaga (meter): ");
        double personHeight = inputValue.nextDouble();

        System.out.print("Soo geli culeyskaaga: ");
        double personWeight = inputValue.nextDouble();

        double bmiResult = personWeight / Math.pow(personHeight, 2);

        boolean normal = (bmiResult > 18.4) && (bmiResult < 26);
        boolean overweight = (bmiResult > 25) && (bmiResult < 31);

        if (normal) {
            System.out.printf("Your BMI is %.2f and you're (Normal)", bmiResult);
            return;
        }

        if (overweight) {
            System.out.printf("Your BMI is %.2f and you're (Overweight)", bmiResult);
        } else {
            System.out.printf("Your BMI is %.2f and you're (Obese)", bmiResult);
        }

        
        
    }

}
