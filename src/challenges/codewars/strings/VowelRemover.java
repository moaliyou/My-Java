package src.challenges.codewars.strings;

public class VowelRemover {

    public static void main(String[] args) {
        System.out.println(removeVowel("Today we try a new format"));
    }

    private static String removeVowel(String text) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : text.toCharArray())
            if (!isVowel(ch))
                stringBuilder.append(ch);

        return stringBuilder.toString();

    }

    private static boolean isVowel(char character) {
        return (character == 'a' || character == 'e' ||
                character == 'i' || character == 'o' ||
                character == 'u' || character == 'A' ||
                character == 'E' || character == 'I' ||
                character == 'O' || character == 'U');
    }

}
