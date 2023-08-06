package src.challenges.codewars.arrays;

public class Stringy {

    public static void main(String[] args) {
        System.out.println(stringy(12));
    }

    public static String stringy(int size) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int index = 0; index < size; index++) {

            if ((index % 2) != 1) {
                stringBuilder.append(1);
            } else {
                stringBuilder.append(0);
            }

        }

        return stringBuilder.toString();

    }

}
