package src.lessons.conditions;

public class FriendsDay {

    public static void main(String[] args) {
        System.out.println(daysToGoOut(31));
    }

    private static int daysToGoOut(int month) {
        int allowedDays = 0;

        for (int day = 1; day < month + 1; day++) {
            if (day % 2 == 0)
                allowedDays++;
        }

        return allowedDays;
    }

}
