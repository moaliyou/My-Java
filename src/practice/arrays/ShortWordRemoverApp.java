package src.practice.arrays;

import src.practice.arrays.helpers.WordHelperClass;

import java.util.ArrayList;

public class ShortWordRemoverApp {

    public static void main(String[] args) {

        ArrayList<String> listOfWords = new ArrayList<>();

        int numOfWords = WordHelperClass.getUserInput("How many words do you want to enter?");

        for (int steps = 0; steps < numOfWords; steps++) {
            listOfWords.add(WordHelperClass.getUserWordInput("Enter a word:"));
        }

        int shortWordsLength = WordHelperClass.getUserInput("Enter length of short words:");

        ShortWordRemover wordRemover = new ShortWordRemover(listOfWords, shortWordsLength);

        System.out.println("Origin List: " + wordRemover.getListOfWords());
        System.out.println("New List: " + wordRemover.removeShortWords());


    }

}
