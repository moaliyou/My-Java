package src.challenges.leetcode.leve1.day2;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {

        String s = "badc", t = "baba";

        System.out.println(isIsomorphic(s, t));

    }

    static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> firstMap = new HashMap<>();
        HashMap<Character, Character> secondMap = new HashMap<>();

        for (int index = 0; index < s.length(); index++) {

            if ((firstMap.containsKey(s.charAt(index)) && firstMap.get(s.charAt(index)) != t.charAt(index)) ||
                    (secondMap.containsKey(t.charAt(index)) && secondMap.get(t.charAt(index)) != s.charAt(index)))
                return false;

            firstMap.put(s.charAt(index), t.charAt(index));
            secondMap.put(t.charAt(index), s.charAt(index));

        }

        return  true;
    }

}
