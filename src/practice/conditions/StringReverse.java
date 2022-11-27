package src.practice.conditions;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(getReverseOf("fur"));
    }

    public static String getReverseOf(String text){

        String reversed_text = "";

        for (int index = text.length() - 1; index >= 0; index--) {

            reversed_text += text.charAt(index);

        }

        return reversed_text;

    }

}
