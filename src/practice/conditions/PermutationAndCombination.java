package src.practice.conditions;

public class PermutationAndCombination {

    public static void main(String[] args) {

        System.out.println(getPermutationOf(8, 4));

        System.out.println(getCombinationOf(8, 4));

    }

    private static int getCombinationOf(int number, int r) {
        return getFactorialOf(number) / (getFactorialOf(number - r) * getFactorialOf(r));
    }

    private static int getPermutationOf(int number, int r){

        return getFactorialOf(number) / getFactorialOf(number - r);

    }

    private static int getFactorialOf(int number){

        var factorialResult = 1;

        for (int position = 2; position <= number; position++) {
            factorialResult *= position;
        }

        return factorialResult;

    }

}
