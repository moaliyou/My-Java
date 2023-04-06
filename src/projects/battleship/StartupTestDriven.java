package src.projects.battleship;

import java.util.ArrayList;
import java.util.Arrays;

public class StartupTestDriven {

    public static void main(String[] args) {
        Startup startup = new Startup();

        startup.setLocationCells(new ArrayList<>(Arrays.asList("A1", "B1", "C1")));
        String userGuess = "A2";


        String result = startup.checkYourself(userGuess);

        if (!result.equalsIgnoreCase("hit")) {
            System.out.println("failed");
            return;
        }

        System.out.println("passed");

    }

}
