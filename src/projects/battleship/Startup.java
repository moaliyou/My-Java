package src.projects.battleship;

import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;

    public String checkYourself(String userInput) {

        String result = "miss";
        int indexOfLocationCell = this.locationCells.indexOf(userInput);

        if (indexOfLocationCell >= 0) {
            this.locationCells.remove(userInput);

            if (locationCells.isEmpty())
                result = "Kill";
            else
                result = "Hit";

        }

        System.out.println(result);

        return result;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

}
