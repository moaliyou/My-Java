package src.challenges;

public class StringSearch {

    public static void main(String[] args) {
        System.out.println("Mahmoud");
    }

    static int searchCharacterOf(String text, char targetCharacter){

        int sizeOfText = text.length();

        if (sizeOfText == 0)
            return -1;

        for (int index = 0; index < sizeOfText; index++) {

            if (text.charAt(index) == targetCharacter)
                return index;
        }

        return -1;

    }

}