package src.practice.strings;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateStringFormatter {

    public static void main(String[] args) {

        String dateString = "10/08/2006";
        LocalDate localDate = toLocalDate(dateString);

        System.out.println(LocalDate.parse("10/08/2006", DateTimeFormatter.ofPattern("MM/dd/yyyy")));

    }

    public static LocalDate toLocalDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.parse(dateStr, formatter);
    }

}
