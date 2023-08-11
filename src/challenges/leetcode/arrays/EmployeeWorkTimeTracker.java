package src.challenges.leetcode.arrays;

public class EmployeeWorkTimeTracker {

    public static void main(String[] args) {

        int[] hours = {0,1,2,3,4};
        int target = 2;

        System.out.println(numberOfEmployeesWhoMetTarget(new int[] {0,1,2,3,4}, 5));

    }

    private static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        // number of employees worked
        int lengthOfHours = hours.length;

        // To keep track of employees
        // who met target hours
        int targetTracker = 0;

        for (int hour : hours) {

            // incrementing `targetTracker`
            // if we met the target
            if (hour >= target)
                targetTracker++;

        }

        return targetTracker;

    }

}
