package src.practice.conditions;

import java.text.DecimalFormat;

class Investment{

    private double presentValue;
    private double interestRate;
    private double timePeriod;

    Investment(double presentValue, double interestRate, double timePeriod){
        this.presentValue = presentValue;
        this.interestRate = interestRate;
        this.timePeriod = timePeriod;
    }

    Investment(){}

    public void setPresentValue(double presentValue){
        this.presentValue = presentValue;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public void setTimePeriod(double timePeriod){
        this.timePeriod = timePeriod;
    }

    public double getPresentValue(){
        return presentValue;
    }

    public double getInterestRate(){
        return interestRate / 100;
    }

    public double getTimePeriod(){
        return timePeriod;
    }

    public double getFutureValue(){
        DecimalFormat decimalFormatter = new DecimalFormat("0.00");

        String futureValue = decimalFormatter.format(getPresentValue() *  (Math.pow((1 + getInterestRate()), getTimePeriod())));
        
        return Double.parseDouble(futureValue);
    }

}

public class FutureInvestment {
    
    public static void main(String[] args) {
        
        Investment invest = new Investment(1_000, 6, 7);

        System.out.println(invest.getFutureValue());

    }

}
