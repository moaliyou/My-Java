package src.practice.conditions;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(getReverseOf("fur"));
    }

    public static String getReverseOf(String text){

        String reversedText = "";

        for (int index = text.length() - 1; index >= 0; index--) {

            reversedText += text.charAt(index);

        }

        return reversedText;

    }

}
