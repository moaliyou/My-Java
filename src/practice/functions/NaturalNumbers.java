package src.practice.functions;

public class NaturalNumbers {

    public static void main(String[] args) {
        System.out.println("Using loop: " + findSumOf(5));
        System.out.println("Using efficient formula: " + findSum(5));
    }

    public static int findSumOf(int num) {
        var sum = 0;

        for (int counter = 1; counter < num + 1; counter++) sum += counter;

        return sum;

    }

    // An efficient formula
    // (n * (n + 1)) / 2
    public static int findSum(int num) {
        return (num * (num + 1)) / 2;
    }

}
