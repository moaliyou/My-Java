package src.challenges.codewars.strings;

public class VowelRemover {

    public static void main(String[] args) {
        System.out.println(removeAllVowels("This website is for losers LOL!"));
    }

    private static String removeVowel(String text) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : text.toCharArray())
            if (!isVowel(ch))
                stringBuilder.append(ch);

        return stringBuilder.toString();

    }

    /**
     * Removes all vowels from the given text.
     * This method takes a string input 'text' and returns a new string with all the vowels (both lowercase and uppercase)
     * removed. Vowels are the letters 'a', 'e', 'i', 'o', and 'u' (both uppercase and lowercase). The method uses the
     * regular expression "[aeiouAEIOU]" to match all occurrences of vowels and then replaces them with an empty string, effectively
     * removing them from the text. If the 'text' parameter is null, the method will return an empty string.
     *
     * @param text The input text from which vowels are to be removed.
     * @return A new string with all vowels removed from the original text or an empty string if the 'text' is null.
     *
     * @example
     * String text = "Hello, Java!";
     * String result = removeAllVowels(text);
     * // The 'result' will be "Hll, Jv!"
     *
     * <p>
     * String nullText = null;
     * String result = removeAllVowels(nullText);
     * // The 'result' will be ""
     * @see java.lang.String#replaceAll(String, String)
     */
    private static String removeAllVowels(String text) {
        if (text == null)
            return "";

        return text.replaceAll("[aeiouAEIOU]", "");
    }

    private static boolean isVowel(char character) {
        return (character == 'a' || character == 'e' ||
                character == 'i' || character == 'o' ||
                character == 'u' || character == 'A' ||
                character == 'E' || character == 'I' ||
                character == 'O' || character == 'U');
    }

}
