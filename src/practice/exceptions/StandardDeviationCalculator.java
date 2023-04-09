package src.practice.exceptions;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class StandardDeviationCalculator {

    public static void main(String[] args) {
        System.out.println(getSampleStandardDeviation(Arrays.asList(2, 4, 6, 8, 9)));
    }

    private static double getSampleStandardDeviation(List<Integer> listOfNumbers) throws NullPointerException {

        if (listOfNumbers == null)
            throw new NullPointerException("Please try to initialise your list.");

        if (listOfNumbers.size() == 0)
            return 0;

        int numbersLength = listOfNumbers.size();

        double variance = getSumOfSquaredDeviations(listOfNumbers) / (numbersLength - 1);

        return Double.parseDouble(new DecimalFormat("0.000").format(Math.sqrt(variance)));

    }

    private static double getSumOfSquaredDeviations(List<Integer> listOfNumbers) {
        double sumOfSquaredDeviations = 0;
        double mean = getMean(listOfNumbers);

        for (int number : listOfNumbers)
            sumOfSquaredDeviations += Math.pow((number - mean), 2.0);

        return sumOfSquaredDeviations;
    }

    private static double getMean(List<Integer> listOfNumbers) {
        double mean = 0;

        for (int number : listOfNumbers)
            mean += number;

        return mean / listOfNumbers.size();
    }

}
