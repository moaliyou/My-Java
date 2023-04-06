package src.practice.arrays.customerwealthcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {

    private final String customerName;
    private final Map<Long, AccountService> accountServiceMap;

    public Customer(String customerName) {

        if (customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException("Please enter your name");
        }

        this.customerName = customerName;
        this.accountServiceMap = new HashMap<>();
    }

    public void addAccount(Account account,double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("Initial Balance must be positive");
        }

        AccountService accountService = new AccountService(balance, account);
        this.accountServiceMap.put(account.getAccountNo(), accountService);
    }

    public void removeAccount(long accountNo) {

        AccountService removedAccount = accountServiceMap.remove(accountNo);

        if (removedAccount == null)
            throw new IllegalArgumentException("Account not found :(");

    }

    public void removeAllAccount() {
        accountServiceMap.clear();
    }

    public AccountService getAccountService(long accountNo) {
        return accountServiceMap.get(accountNo);
    }

    public List<Long> getAccountNumbers() {
        return new ArrayList<>(accountServiceMap.keySet());
    }

    public String getCustomerName() {
        return customerName;
    }
}
