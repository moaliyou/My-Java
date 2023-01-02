package src.lessons.conditions;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.print("Soo geli qiimaha: $");
        int qiimaha = inputValue.nextInt();

        if ((qiimaha > 800) && (qiimaha <= 1_500))
            System.out.println("Discount waa 10%");
        else if ((qiimaha > 1_500) && (qiimaha <= 2_500))
            System.out.println("Discount waa 15%");
        else if ((qiimaha > 2_500) && (qiimaha <= 5_000))
            System.out.println("Discount waa 20%");
        else if ((qiimaha > 5_000))
            System.out.println("Discount waa 30%");
        else
            System.out.println("No discount");
    }

}
