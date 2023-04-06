package src.challenges.leetcode.arrays;

public class CustomerWealthCalculator {

    public static void main(String[] args) {
        System.out.println("Case (1): " + maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        System.out.println("Case (2): " + maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
        System.out.println("Case (3): " + maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}}));
    }

    public static int maximumWealth(int[][] accounts) {

        int wealthOfRichestCustomer = Integer.MIN_VALUE;

        if (accounts.length >= 1) {

            for (int[] customer : accounts) {

                int totalAmountOfMoney = 0;

                for (int account : customer)
                    totalAmountOfMoney += account;

                wealthOfRichestCustomer = Math.max(wealthOfRichestCustomer, totalAmountOfMoney);

            }

        }

        return wealthOfRichestCustomer;

    }

}
