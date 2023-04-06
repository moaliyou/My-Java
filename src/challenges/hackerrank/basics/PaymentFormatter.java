package src.challenges.hackerrank.basics;

import java.text.NumberFormat;
import java.util.Locale;

public class PaymentFormatter {

    public static void main(String[] args) {

        NumberFormat formatPayment = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

        double currency = 45218.12;

        System.out.println(formatPayment.getCurrency().getDisplayName());

        System.out.println(
                NumberFormat
                        .getCurrencyInstance(new Locale("en", "in"))
                        .format(currency).replace("₹", "Rs.")
        );

    }

}
