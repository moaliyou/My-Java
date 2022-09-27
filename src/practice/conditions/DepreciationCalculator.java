package src.practice.conditions;

public class DepreciationCalculator {

    public static void main(String[] args) {
        calculateDepreciationValue(100_000, 2_000, 20);
    }

    static void calculateDepreciationValue(double assetCost, double salvageValue, int depreciationYears){
        double depreciationValue = (assetCost - salvageValue) / depreciationYears;

        System.out.printf("The depreciation value is $%.2f", depreciationValue);
    }

}
