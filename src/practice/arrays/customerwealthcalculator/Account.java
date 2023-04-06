package src.practice.arrays.customerwealthcalculator;

public class Account {

    private final long accountNo;
    private final int accountPIN;

    public Account(long accountNo, int accountPIN) {
        this.accountNo = accountNo;
        this.accountPIN = accountPIN;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public int getAccountPIN() {
        return accountPIN;
    }
}
