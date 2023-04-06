package src.challenges.codewars.fundamentals;

public class PassengerSpaceTracker {

    public static void main(String[] args) {
        System.out.println("Should return 0 -> " + calculatePassengerCapacityShortage(10, 5, 5));
        System.out.println("Should return 10 -> " + calculatePassengerCapacityShortage(100, 60, 50));
        System.out.println("Should return 0 -> " + calculatePassengerCapacityShortage(20, 5, 5));
        System.out.println("Should return 0 -> " + calculatePassengerCapacityShortage(45, 15, 10));
    }

    private static int calculatePassengerCapacityShortage(int cap, int on, int wait) {
        int sumOfOnAndWaitPassengers = (on + wait);
        return (sumOfOnAndWaitPassengers > cap) ? (sumOfOnAndWaitPassengers - cap) : 0;
    }

}
