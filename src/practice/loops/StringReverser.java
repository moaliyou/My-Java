package src.practice.loops;

public class StringReverser {

    public static void main(String[] args) {

        String text = "some text";

        StringBuilder textBuilder = new StringBuilder(text);

        System.out.println("Using String Builder: " + textBuilder.reverse());
        System.out.println("Using method: " + getReversedText(text));

        for (int index = text.length() - 1; index >= 0; index--)
            System.out.print(text.charAt(index));

    }

    public static String getReversedText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

}
