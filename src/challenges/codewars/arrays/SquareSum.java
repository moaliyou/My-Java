package src.challenges.codewars.arrays;

public class SquareSum {

    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {1,2,2}));
        System.out.println(squareSum(new int[] {1,2}));
        System.out.println(squareSum(new int[] {5,-3,4}));
        System.out.println(squareSum(new int[] {}));
    }

    public static int squareSum(int[] n) {
        int sum = 0;

        if (n.length == 0)
            return 0;

        for (int i : n) {
            sum += Math.pow(i, 2);
        }

        return sum;
    }

}
