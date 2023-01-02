package src.lessons.conditions;

public class Parentheses {
    
    public static void main(String[] args) {

        String str = "((()()()()(((())";
        
        int openParentheses = 0, closeParentheses = 0;
        int maxLength = 0;

        for (int index = 0; index < str.length(); index++) {

            if (str.charAt(index) == '(') {
                openParentheses++;
            } else {
                closeParentheses++;
            }

            if (openParentheses == closeParentheses) {
                maxLength = Math.max(maxLength, 2 * openParentheses);
            } else if (openParentheses > closeParentheses) {
                openParentheses = closeParentheses = 0;
            }

        }

        openParentheses = closeParentheses = 0;

        for (int index = str.length() - 1; index >= 0 ; index--) {

            if (str.charAt(index) == '(') {
                openParentheses++;
            } else {
                closeParentheses++;
            }

            if (openParentheses == closeParentheses) {
                maxLength = Math.max(maxLength, 2 * closeParentheses);
            } else if (openParentheses > closeParentheses) {
                openParentheses = closeParentheses = 0;
            }

        }

        System.out.println(maxLength);


    }

}
