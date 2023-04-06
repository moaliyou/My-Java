package src.practice.arrays;

import java.util.ArrayList;

public class ShortWordRemover {

    private final ArrayList<String> listOfWords;
    private final int shortWordsLength;

    public ShortWordRemover(ArrayList<String> listOfWords, int shortWordsLength) {
        this.listOfWords = listOfWords;
        this.shortWordsLength = shortWordsLength;
    }

    public ArrayList<String> getListOfWords() {
        return listOfWords;
    }

    public ArrayList<String> removeShortWords() {

        ArrayList<String> copyOfListOfWords = new ArrayList<>(listOfWords);

        copyOfListOfWords.removeIf(word -> word.length() < shortWordsLength);

        return copyOfListOfWords;

    }

}
