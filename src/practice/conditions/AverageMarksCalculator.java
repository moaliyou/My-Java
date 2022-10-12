package src.practice.conditions;

import java.util.Scanner;

class AverageMarks {

    double average_marks;
    double sum_marks = 0;
    public static int number_of_marks = 0;

    public AverageMarks(){}

    public AverageMarks(double average_marks, double sum_marks){
        this.average_marks = average_marks;
        this.sum_marks = sum_marks;
    }

    public void setSumMarks(double sum_marks) {
        this.sum_marks += sum_marks;
    }

    public double getSumMarks(){
        return sum_marks;
    }

    public double getAverageMarks() {
        average_marks = getSumMarks() / number_of_marks;
        return average_marks;
    }


}

public class AverageMarksCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AverageMarks marks = new AverageMarks();

        System.out.println("To quit the program type/enter zero(0).\n");

        System.out.print("Enter subject marks: ");
        double subjectMarks = input.nextDouble();

       while (subjectMarks != 0){

           AverageMarks.number_of_marks++;

           marks.setSumMarks(subjectMarks);

           System.out.print("Enter another subject marks: ");
           subjectMarks = input.nextDouble();

       }

        System.out.printf("""
                        
                        Total sum : %.2f
                        Number of subjects : %d
                        Average : %.2f
                        """,
                marks.getSumMarks(),
                AverageMarks.number_of_marks,
                marks.getAverageMarks());

    }

}
