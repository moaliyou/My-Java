package src.practice.conditions;

public class GradeBook {

    public static void main(String[] args) {
        System.out.println(getGrade(44,55,52));
        System.out.println(getGrade(70,70,70));
        System.out.println(getGrade(84,79,85));
        System.out.println(getGrade(92,93,94));
    }

    public static char getGrade(int s1, int s2, int s3) {

        int score = (s1 + s2 + s3) / 3;
        char grade;

        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 60 && score < 70) {
            return 'D';
        }

        return 'F';
    }

}
