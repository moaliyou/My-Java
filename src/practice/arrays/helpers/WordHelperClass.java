package src.practice.arrays.helpers;

import java.util.Scanner;

public class WordHelperClass {

    public static int getUserInput(String promptMessage) {
        System.out.print(promptMessage + " ");
        Scanner inputValue = new Scanner(System.in);
        return inputValue.nextInt();
    }

    public static String getUserWordInput(String promptMessage) {
        Scanner inputValue = new Scanner(System.in);
        return inputValue.nextLine();
    }

}
