package src.practice.arrays.customerwealthcalculator.tests;

import src.practice.arrays.customerwealthcalculator.Account;
import src.practice.arrays.customerwealthcalculator.Customer;

public class CustomerTestDriven {

    public static void main(String[] args) {

        Account firstAccount = new Account(38298493, 3829);
        Account secondAccount = new Account(93298434, 8436);
        Account thirdAccount = new Account(74738742, 2382);
        Account fourthAccount = new Account(56683741, 4385);

        Customer customerOne = new Customer("Mahmoud");

        customerOne.addAccount(secondAccount, 100);
        customerOne.addAccount(fourthAccount, 150);
        customerOne.addAccount(thirdAccount, 650);


        System.out.println(customerOne.getAccountNumbers());

        customerOne.removeAccount(fourthAccount.getAccountNo());

        System.out.println("After we removed: " + customerOne.getAccountNumbers());

    }

}
