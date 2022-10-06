package src.lessons.arrays;

import java.util.Arrays;

class Marks {

    private int number_of_subjects;
    private int[] marks;

    public Marks() {
    }

    public Marks(int number_of_subjects, int[] marks) {
        this.number_of_subjects = number_of_subjects;
        this.marks = marks;
    }

    public Marks(int number_of_subjects) {
        this.marks = new int[number_of_subjects];
    }

    public Marks(int[] marks) {
        this.marks = marks;
        setNumberOfSubjects(this.marks.length);
    }

    private int getNumberOfSubjects() {
        return getMarks().length;
    }

    public void setNumberOfSubjects(int number_of_subjects) {
        this.number_of_subjects = number_of_subjects;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
        setNumberOfSubjects(this.marks.length);
    }

    public void addMark(int mark) {

        int[] new_marks = Arrays.copyOf(marks, marks.length + 1);

        new_marks[new_marks.length -1] = mark;

        setMarks(new_marks);

    }

}

public class StudentMarks {

    public static void main(String[] args) {

        Marks studentMarks = new Marks();

        int[] marks = {22, 44, 30, 80, 76, 61};

        studentMarks.setMarks(marks);

//        for (int mark : marks)
//            studentMarks.addMark(mark);

        studentMarks.addMark(90);

        System.out.println(Arrays.toString(studentMarks.getMarks()));

    }

}
