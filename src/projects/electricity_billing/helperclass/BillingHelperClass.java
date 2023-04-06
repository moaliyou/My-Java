package src.projects.electricity_billing.helperclass;

public class BillingHelperClass {
    
    // to check whether integer is greater than 0 or not
    // usually used when we have to input a whole number
    // like taking input of number of test cases etc
    public static boolean isValidNumber(long testValue)
    {
        return (testValue >= 0);
    }

    // to check whether decimal is greater than 0.1 or not
    // usually used when we have to input a decimal number
    // like taking input of number of test cases or rate charge
    public static boolean isValidRate(double testValue)
    {
        return (testValue >= 0.1);
    }
}
