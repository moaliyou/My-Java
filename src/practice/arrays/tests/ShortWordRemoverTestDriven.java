package src.practice.arrays.tests;

import src.practice.arrays.ShortWordRemover;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortWordRemoverTestDriven {

    public static void main(String[] args) {

        ArrayList<String> listOfWords = new ArrayList<>(
                Arrays.asList(
                        "Cambe", "Liin", "Moos", "Qare",
                        "Karooto", "Basal", "Isbaandhees", "Batiiq",
                        "Qajaar", "Cananaas", "Tufaax", "Canuuni"
                )
        );

        int lengthOfShortWords = 7;

        ShortWordRemover remover = new ShortWordRemover(listOfWords, lengthOfShortWords);

        System.out.println(remover.removeShortWords());

    }

}
