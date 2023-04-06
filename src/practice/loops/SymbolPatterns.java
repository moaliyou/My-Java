package src.practice.loops;

public class SymbolPatterns {

    public static void main(String[] args) {
        generateRectanglePattern(8, "*");
    }

    private static void generatePatternWithLeftSpace(int num, String symbol) {

        if (num < 0) {
            System.out.println("Please enter positive number.");
            return;
        }

        if (symbol.isBlank() || symbol.isEmpty()) {
            System.out.println("Please enter a symbol");
            return;
        }

        for (int rowSteps = 1; rowSteps <= num; rowSteps++) {

            for (int spaceSteps = num; spaceSteps > rowSteps; spaceSteps--)
                System.out.print(" ");

            for (int patternSteps = 1; patternSteps <= rowSteps; patternSteps++)
                System.out.print(symbol);

            System.out.println();

        }

    }

    private static void generateRectanglePattern(int num, String symbol) {

        if (num < 1) {
            System.out.println("Please enter positive number greater than zero.");
            return;
        }

        if (symbol.isEmpty() || symbol.isBlank()) {
            System.out.println("Please enter symbol to generate the pattern.");
            return;
        }

        for (int row = 0; row < num; row++) {

            for (int col = 0; col < num; col++)
                System.out.print(symbol);

            System.out.println();

        }

    }

}
