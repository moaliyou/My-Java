package src.lessons.conditions;

import java.util.Scanner;

/*
 * STEP 1: START
 * STEP 2: READ num
 * STEP 3: SET sum to 0
 * STEP 4: WHILE num > 0
	STEP 4.1: ADD sum by num * num
	STEP 4.2: READ num
 * STEP 5: Print value of sum
 * STEP 6: END
 */

public class SumSquareNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter integer number: ");
        int num = scan.nextInt();

        int sum = 0;

        while (num > 0){
            sum += num * num;
            System.out.print("Enter integer number: ");
            num = scan.nextInt();
        }

        System.out.println(sum);

        scan.close();

    }
    
}
