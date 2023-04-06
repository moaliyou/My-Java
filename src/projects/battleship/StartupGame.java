package src.projects.battleship;

import java.util.ArrayList;
import java.util.Arrays;

public class StartupGame {

    public static void main(String[] args) {

        Startup startup = new Startup();

        String result;
        int numOfGuess = 0;
        boolean isAlive = true;

        startup.setLocationCells(new ArrayList<>(Arrays.asList("A1", "B1", "C1")));

        while (isAlive) {

            String userGuess = GameHelper.getUserInput("Enter a number");

            result = startup.checkYourself(userGuess);

            numOfGuess++;

            if (result.equalsIgnoreCase("kill")) {
                System.out.println("You took " + numOfGuess + " guesses");
                isAlive = false;
            }

        }

    }

}
