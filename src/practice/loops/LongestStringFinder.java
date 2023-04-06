package src.practice.loops;

public class LongestStringFinder {

    public static void main(String[] args) {

        String[] listOfWords = {"hello", "Mohamed", "foo", "bar", "Maxamuud", "Abdalla"};

        System.out.println(getLongestString(listOfWords));

    }

    /**
     * Returns the longest string in an array of strings.
     * If the input array is null or empty, returns null.
     *
     * @param listOfWords the input array of strings
     * @return the longest string in the input array, or null if the array is empty or null
     */
    private static String getLongestString(String[] listOfWords) {

        // We don't need to iterate
        // over the list if it's empty
        if (listOfWords == null || listOfWords.length == 0)
            return null;

        // At this time we assume
        // the 1st word's position
        // is the longest one
        int longestWordPosition = 0;

        // We'll keep track the length
        // of the longest word
        // if we need it later
        int lengthLongestWord = 0;

        // To get or return the longest word
        // we've to iterate over the list
        for (int wordPosition = 0; wordPosition < listOfWords.length; wordPosition++) {

            // Updating the value of
            // the longest word length and position
            // if a new longest word found
            if (listOfWords[wordPosition] != null && listOfWords[wordPosition].length() > lengthLongestWord) {

                lengthLongestWord = listOfWords[wordPosition].length();

                longestWordPosition = wordPosition;

            }

        }

        // Value/Longest word
        return listOfWords[longestWordPosition];


    }

}
