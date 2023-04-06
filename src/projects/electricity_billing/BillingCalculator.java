package src.projects.electricity_billing;

import src.projects.electricity_billing.modal.Billing;

public class BillingCalculator extends Billing {

    public BillingCalculator() {

    }

    /**
     * <p>Returns the value to pay for the current month billing.</p>
     * 
     * @author moaliyou
     * 
     * @return the amount to pay for the current month.
     */
    public double getAmountToPay() {
        long kilowatt = Math.abs(getLastMonthReading() - getCurrentMonthReading());
        return (kilowatt * getRateCharge());
    }
    
}
