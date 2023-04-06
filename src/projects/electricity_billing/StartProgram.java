package src.projects.electricity_billing;

import java.util.Scanner;

public class StartProgram extends BillingCalculator {

    private final Scanner inputValue;
    private boolean exited = false;

    public StartProgram() {
        this.inputValue = new Scanner(System.in);
    }

    public void start() {
        menuOption();
    }

    private void menuOption() {
        do {
            System.out.print("[1] Start program.\n[0] Exit.\n\nChoose option: ");

            int userChoiceOption = inputValue.nextInt();

            if (userChoiceOption == 0) {
                exited = true;
                return;
            }

            getUserData();
            // to separate input data and report
            System.out.println();
            displayReport();

        } while (!exited);
    }

    private void displayReport() {
        System.out.printf("""
            Last month readings: %d
            Current month readings: %d
            Rate charge: $%.2f

            Amount to pay: $%.2f this month
                        """,
        getLastMonthReading(), getCurrentMonthReading(),
        getRateCharge(), getAmountToPay()
        );
    }

    private void getUserData() {
        System.out.print("Enter last month readings: ");
        setLastMonthReading(inputValue.nextInt());

        System.out.print("Enter current month readings: ");
        setCurrentMonthReading(inputValue.nextInt());

        System.out.print("Enter rate charge: ");
        setRateCharge(inputValue.nextDouble());
    }

}
