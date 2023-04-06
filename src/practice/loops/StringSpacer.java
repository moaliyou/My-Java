package src.practice.loops;

public class StringSpacer {

    public static void main(String[] args) {
        System.out.println(addSpace("Some text"));
    }

    private static String addSpace(String text) {

        StringBuilder textWithSpace = new StringBuilder();

        for (int index = 0; index < text.length(); index++) {

            textWithSpace.append(text.charAt(index)).append(" ");

        }

        return textWithSpace.toString();

    }

}
