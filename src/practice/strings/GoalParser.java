package src.practice.strings;

public class GoalParser {

    public static void main(String[] args) {

        String text = "(al)G(al)()()G";
        String firstPattern = text.replace("()", "o");
        String resultText = firstPattern.replace("(al)", "al");

        System.out.println(resultText);


    }

}
