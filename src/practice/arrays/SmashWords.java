package src.practice.arrays;

public class SmashWords {

    public static void main(String[] args) {
        System.out.println(smash(new String[]{}));
    }

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        if (words == null || words.length == 0)
            return "";

        return String.join(" ", words);

    }

}
