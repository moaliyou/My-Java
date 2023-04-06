package src.practice.functions;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.print("Enter No. of subjects: ");
        int numOfSubjects = inputValue.nextInt();

        double totalMarks = 0;
        int percentageMarks;

        for (int counter = 1; counter <= numOfSubjects; counter++) {
            System.out.print("Enter subject " + counter + " marks: ");
            totalMarks += inputValue.nextInt();
        }

        percentageMarks = (int)(totalMarks / numOfSubjects);

        System.out.printf("Your grade is %s\n", getGrade(percentageMarks));

    }

    static String getGrade(double percentageMarks) {

        if ((percentageMarks > 90) && (percentageMarks < 101))
            return "AA";
        else if ((percentageMarks > 80) && (percentageMarks < 91))
            return "AB";
        else if ((percentageMarks > 70) && (percentageMarks < 81))
            return "BB";
        else if ((percentageMarks > 60) && (percentageMarks < 71))
            return "BC";
        else if ((percentageMarks > 50) && (percentageMarks < 61))
            return "CD";
        else if ((percentageMarks > 40) && (percentageMarks < 51))
            return "DD";

        return (percentageMarks > 100) ? "Invalid" : "Fail";
    }

}
