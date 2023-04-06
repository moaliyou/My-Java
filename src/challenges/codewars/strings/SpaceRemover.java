package src.challenges.codewars.strings;

public class SpaceRemover {

    public static void main(String[] args) {

        String text = "This text is awesome";

        text = removeSpace(text);

        System.out.println(text);
    }

    private static String removeSpace(String text) {
        return text.replace(" ", "");
    }

}
