package src.lessons.conditions;

import java.time.YearMonth;
import java.util.Scanner;

public class DaysOfMonth {
    
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Soo geli sanadka: ");
        int year = inputValue.nextInt();

        System.out.print("Soo geli bisha: ");
        int month = inputValue.nextInt();

        printDaysOf(year, month);
    }

    private static void printDaysOf(int year, int month) {
        if (!(month > 12)) {
            System.out.printf("Bisha %daad waxay ka kooban tahay %d maalmood.\n", month, YearMonth.of(year, month).lengthOfMonth());
            return;
        }
        System.out.printf("%d bil ma jirto marka fadlan soo geli taariikh sax ah.", month);
    }

}
