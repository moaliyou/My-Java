package src.challenges.hackerrank.basics;

import java.util.Scanner;

public class JavaDataTypes {

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int query = inputValue.nextInt();

        for (int i = 0; i < query; i++) {
            try {
                long n = inputValue.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) System.out.println("* int");
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(inputValue.next() + " can't be fitted anywhere.");
            }

        }

        inputValue.close();

    }

}
