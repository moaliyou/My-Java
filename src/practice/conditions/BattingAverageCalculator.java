package src.practice.conditions;

import java.text.DecimalFormat;
import java.util.*;

class BattingAverage{

    private int number_of_hits;
    private int number_of_bats;
    private DecimalFormat decimalFormatter = new DecimalFormat("0.000");

    public BattingAverage(){}

    public BattingAverage(int number_of_hits, int number_of_bats){
        this.number_of_hits = number_of_hits;
        this.number_of_bats = number_of_bats;
    }

    public void setNumber_of_bats(int number_of_bats) {
        this.number_of_bats = number_of_bats;
    }

    public void setNumber_of_hits(int number_of_hits) {
        this.number_of_hits = number_of_hits;
    }

    private int getNumber_of_bats() {
        return number_of_bats;
    }

    private int getNumber_of_hits() {
        return number_of_hits;
    }

    public double getBattingAverage(){
        double battingAverageValue = (double) getNumber_of_hits() / getNumber_of_bats();
        return Double.parseDouble(decimalFormatter.format(battingAverageValue));
    }

}

public class BattingAverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BattingAverage baseball = new BattingAverage();

        System.out.print("Enter total number of hits: ");
        baseball.setNumber_of_hits(input.nextInt());

        System.out.print("Enter total number of bats: ");
        baseball.setNumber_of_bats(input.nextInt());

        System.out.println("\nBatting average is " + baseball.getBattingAverage());

    }


}
