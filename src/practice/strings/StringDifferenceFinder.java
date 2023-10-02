package src.practice.strings;

public class StringDifferenceFinder {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "asbcd";


        System.out.println(findTheDifference(s, t));
    }

    private static char findTheDifference(String text, String generatedText) {
        char letter = 0;

        for (char letterInS: text.toCharArray()) {
            letter ^= letterInS;
        }

        for (char letterInT: generatedText.toCharArray()) {
            letter ^= letterInT;
        }

        return letter;
    }

}
