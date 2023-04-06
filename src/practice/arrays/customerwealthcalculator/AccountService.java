package src.practice.arrays.customerwealthcalculator;

public class AccountService {

    private final Account account;
    private double balance;

    public AccountService(double balance, Account account) {
        this.balance = balance;
        this.account = account;
    }

    public void deposit(double amount) {
        if (amount < 1) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance += amount;
    }

    public boolean isCorrectPIN(int pin) {
        return this.getAccount().getAccountPIN() == pin;
    }

    public void withdraw(double amount) {

        if (amount < 1) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }

        if (amount > getBalance()) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public Account getAccount() {
        return account;
    }
}
