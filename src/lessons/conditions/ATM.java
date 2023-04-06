package src.lessons.conditions;

import java.text.DecimalFormat;
import java.util.Scanner;

class Account {

    private double accountBalance;
    private String customerName;
    private int accountPIN;
    private final DecimalFormat decimalFormatter;

    public Account() {
        this.customerName = "";
        this.accountPIN = 0;
        this.accountBalance = 0.0;
        decimalFormatter = new DecimalFormat("0.00");
    }

    public void deposit(double amount) {
        if (amount > 0)
            this.accountBalance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.accountBalance) {
            this.accountBalance -= amount;
            return;
        }
        System.out.println("Haraagaaga kuguma filna :(");
    }

    public void setCustomerName(String name) {
        if (!name.trim().isEmpty())
            this.customerName = name;
    }

    public void setAccountPIN(int PIN) {
        if (PIN > 0)
            this.accountPIN = PIN;
    }

    public double getAccountBalance() {
        return Double.parseDouble(decimalFormatter.format(this.accountBalance));
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public int getAccountPIN() {
        return this.accountPIN;
    }

}

public class ATM {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        Account userAccount = new Account();

        System.out.println("Si aad u isticmaasha barnaamijka waa inaad account abuurataa.");

        System.out.print("Fadlan soo geli magacaaga: ");
        userAccount.setCustomerName(inputValue.nextLine());

        System.out.print("Geli PIN-kaaga cusub: ");
        userAccount.setAccountPIN(inputValue.nextInt());

        userLogin(userAccount, inputValue);

    }

    private static void userLogin(Account userAccount, Scanner inputValue) {
        int userPIN = 1;

        while (userPIN != userAccount.getAccountPIN()) {
            System.out.println("\nSi aad barnaamijka u isticmaashid.");
            System.out.print("Fadlan geli PIN-kaaga: ");
            userPIN = inputValue.nextInt();
        }

        optionMenu(userAccount, inputValue);

    }

    private static void optionMenu(Account userAccount, Scanner inputValue) {
        boolean isNotFinished = true;

        while (isNotFinished) {
            System.out.print("""
                    [1] Itus Haraagaaga.
                    [2] Lacag dhigasho.
                    [3] Lacag la bixid.
                    [4] Lacag wareejin.
                    [5] Bedal lambar sireedka.
                    [0] Kabax.

                    Dooro qeybta aad rabtid:\040""");

            int userChoice = inputValue.nextInt();

            switch (userChoice) {
                case 1 -> System.out.println("Haraagaagu waa $" + userAccount.getAccountBalance());
                case 2 -> depositingMoney(userAccount, inputValue);
                case 3 -> withdrawingMoney(userAccount, inputValue);
                case 4 -> transferringMoney(userAccount, inputValue);
                case 5 -> resetAccountPIN(userAccount);
                case 0 -> isNotFinished = false;
                default -> System.out.println("Fadlan isku day inaad doorato lambar jira :)");
            }
        }
    }

    private static void resetAccountPIN(Account userAccount) {
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Fadlan geli magacaaga: ");
        String customerName = inputValue.nextLine();

        if (userAccount.getCustomerName().equals(customerName)) {
            System.out.print("Fadlan geli PIN-kaaga cusub: ");
            userAccount.setAccountPIN(inputValue.nextInt());
            System.out.println("Waa laguu bedalay PIN-kaaga mahadsanid :)");
            return;
        }

        System.out.println("Macsalaamo");
    }

    private static void transferringMoney(Account userAccount, Scanner inputValue) {
        System.out.println("Lacagta koontada kugu jirta waa $" + userAccount.getAccountBalance());

        System.out.print("Soo geli lambarka/koontada aad lacagta u direysid: ");
        int accountTo = inputValue.nextInt();

        System.out.print("Soo geli lacagta aad direysid: $");
        double amountToTransfer = inputValue.nextDouble();

        if (!(amountToTransfer > userAccount.getAccountBalance())) {
            userAccount.withdraw(amountToTransfer);
            System.out.println("Waxaad " + accountTo + " udirtay lacag dhan $" + amountToTransfer );
            System.out.println("Haraagaagu waa $" + userAccount.getAccountBalance());
            return;
        }

        System.out.println("Haraagaagu kuguma filna :(");

    }

    private static void withdrawingMoney(Account userAccount, Scanner inputValue) {
        System.out.println("Lacagta koontada kugu jirta waa $" + userAccount.getAccountBalance());

        System.out.print("Soo geli lacagta aad kala baxeysid: $");
        double withdrawAmount = inputValue.nextDouble();

        userAccount.withdraw(withdrawAmount);

        System.out.printf("Waxaad la baxday lacag dhan $%.2f Haraagaagu waa $%.2f.\n", withdrawAmount,
                userAccount.getAccountBalance());
    }

    private static void depositingMoney(Account userAccount, Scanner inputValue) {
        System.out.print("Soo geli lacagta aad dhiganeysid; $");
        userAccount.deposit(inputValue.nextDouble());
    }

}
