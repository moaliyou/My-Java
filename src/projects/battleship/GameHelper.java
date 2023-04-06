package src.projects.battleship;

import java.util.Random;
import java.util.Scanner;

public class GameHelper {

    public static String getUserInput(String promptMessage) {
        System.out.print(promptMessage + ": ");
        Scanner inputValue = new Scanner(System.in);
        return inputValue.nextLine();
    }

    public static int getRandomNumber(int rangeBound) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(rangeBound);
    }

    public static int getRandomNumber(int rangeLowBound, int rangeHighBound) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(rangeLowBound, rangeHighBound);
    }

}
