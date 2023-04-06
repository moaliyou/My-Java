package src.projects.electricity_billing.modal;

import src.projects.electricity_billing.helperclass.BillingHelperClass;

public class Billing extends BillingHelperClass {

    private long lastMonthReading;
    private long currentMonthReading;
    private double rateCharge;

    public Billing() {
        this.lastMonthReading = 0;
        this.currentMonthReading = 0;
        this.rateCharge = 0;
    }

    public Billing(long lastMonthReading, long currentMonthReading, double rateCharge) {
        this.lastMonthReading = lastMonthReading;
        this.currentMonthReading = currentMonthReading;
        this.rateCharge = rateCharge;
    }

    public void setCurrentMonthReading(long currentMonthReading) {
        if (isValidNumber(currentMonthReading))
            this.currentMonthReading = currentMonthReading;
    }

    public long getCurrentMonthReading() {
        return this.currentMonthReading;
    }

    public void setLastMonthReading(long lastMonthReading) {
        if (isValidNumber(lastMonthReading))
            this.lastMonthReading = lastMonthReading;
    }

    public long getLastMonthReading() {
        return lastMonthReading;
    }

    public void setRateCharge(double rateCharge) {
        if (isValidRate(rateCharge))
            this.rateCharge = rateCharge;
    }

    public double getRateCharge() {
        return rateCharge;
    }

}