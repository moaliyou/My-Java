package src.challenges.leetcode.arrays;

import java.util.Arrays;

public class PangramStringChecker {

    public static void main(String[] args) {

        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));

    }

    public static boolean checkIfPangram(String sentence) {
        int rangeOfLowercaseLetters = (97 + 26);
        int charactersLength = 26;
        int countCharactersFound = 0;

        for (int i = 97; i < rangeOfLowercaseLetters; i++)
            if (sentence.contains(String.valueOf((char)i)))
                countCharactersFound++;

        return countCharactersFound == charactersLength;
    }

}
