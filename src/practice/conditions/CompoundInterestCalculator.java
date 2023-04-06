package src.practice.conditions;

import java.text.DecimalFormat;
import java.util.Scanner;

class CompoundInterest {

    private static final int number_of_compounding = 1;
    
    private double amount;
    private double principle_amount;
    private double rate;
    private double time_in_years;
    private DecimalFormat decimalFormatter = new DecimalFormat("0.00");

    public CompoundInterest(){}

    public CompoundInterest(double principle_amount, double rate, double time_in_years){
        this.principle_amount = principle_amount;
        this.rate = rate;
        this.time_in_years = time_in_years;
    }

    public void setPrincipleAmount(double principle_amount) {
        this.principle_amount = principle_amount;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTimeInYears(double time_in_years) {
        this.time_in_years = time_in_years;
    }

    public double getAmount() {

        amount = getPrincipleAmount() * Math.pow((1 + getRate() / number_of_compounding), (number_of_compounding * getTimeInYears()));

        return Double.parseDouble(decimalFormatter.format(amount));
    }

    private double getPrincipleAmount() {
        return principle_amount;
    }

    private double getRate() {
        return rate / 100;
    }

    private double getTimeInYears() {
        return time_in_years;
    }

}

public class CompoundInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CompoundInterest annualCompound = new CompoundInterest();

        System.out.print("Enter principle amount: ");
        var principle_amount = input.nextDouble();
        annualCompound.setPrincipleAmount(principle_amount);

        System.out.print("Enter rate: %");
        var rate = input.nextDouble();
        annualCompound.setRate(rate);

        System.out.print("Enter time in years: ");
        var time_in_years = input.nextDouble();
        annualCompound.setTimeInYears(time_in_years);

        System.out.println("\nThe total amount accrued is $" + annualCompound.getAmount());

    }

}
