package src.practice.exceptions;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class StandardDeviationCalculator {

    public static void main(String[] args) {
        System.out.println(getSampleStandardDeviation(Arrays.asList(3, 7, 2, 10, 5)));
    }

    private static double getSampleStandardDeviation(List<Integer> listOfNumbers) throws NullPointerException {

        int numbersLength = listOfNumbers.size();

        double variance = getSumOfSquaredDeviations(listOfNumbers) / (numbersLength - 1);

        return Double.parseDouble(new DecimalFormat("0.000").format(Math.sqrt(variance)));

    }

    private static double getSumOfSquaredDeviations(List<Integer> listOfNumbers) {
        double sumOfSquaredDeviations = 0;
        double mean = getMean(listOfNumbers);

        for (int number : listOfNumbers)
            sumOfSquaredDeviations += Math.pow((number - mean), 2);

        return sumOfSquaredDeviations;
    }

    private static double getMean(List<Integer> listOfNumbers) {
        double mean = 0;

        for (int number : listOfNumbers)
            mean += number;

        return mean / listOfNumbers.size();
    }

}
