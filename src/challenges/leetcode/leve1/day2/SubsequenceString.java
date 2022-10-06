package src.challenges.leetcode.leve1.day2;

public class SubsequenceString {

    public static void main(String[] args) {
        System.out.println(isSubsequence("ab", "baab"));
    }

    static boolean isSubsequence(String s, String t) {
        StringBuilder subString = new StringBuilder();

        for (int index = 0; index < t.length(); index++) {

            if (s.contains(String.valueOf(t.charAt(index)))){
                subString.append(t.charAt(index));
            }

        }

        return s.equalsIgnoreCase(String.valueOf(subString));

    }

}
