package src.lessons.conditions;

public class NumberFormatting {

    public static void main(String[] args) {

        String num = "4789239", formattedNum = "";
        int counter = num.length() - 1;

        for (int index = 0; index < num.length(); index++) {
            formattedNum += num.charAt(index);
            if (counter % 3 == 0 && counter != 0) {
                formattedNum += ".";
            }
            counter--;
        }

        System.out.println(formattedNum);

    }

}
