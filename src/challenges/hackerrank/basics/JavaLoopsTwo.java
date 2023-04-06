package src.challenges.hackerrank.basics;

import java.util.Scanner;

public class JavaLoopsTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int q = input.nextInt();

        while (q-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            int result = a;
            for (int i = 0; i < n; i++) {
                System.out.printf("%d ", result);
                result += (int) Math.pow(2, i) * b;
            }

        }

        input.close();



    }

}
