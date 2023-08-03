package src.challenges.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingItemsCounter {

    public static void main(String[] args) {

        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","phone"),
                Arrays.asList("phone","gold","iphone")
        );

        String ruleKey = "type", ruleValue = "phone";

        System.out.println(countMatches(items, ruleKey, ruleValue));

    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        int ruleKeyIndex = getRuleKeyIndex(ruleKey);

        for (List<String> item : items) {

            if (ruleValue.equals(item.get(ruleKeyIndex))) {
                counter++;
            }

        }

        return counter;
    }

    private static int getRuleKeyIndex(String ruleKey) {

        if (ruleKey.equals("type"))
            return 0;
        else if (ruleKey.equals("color"))
            return 1;

        return 2;

    }

}
