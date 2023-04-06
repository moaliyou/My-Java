package src.challenges.hackerrank.intermediate;

import java.util.*;

public class GradingStudents {

    public static void main(String[] args) {

        System.out.println(gradingStudents(Arrays.asList(45, 39, 72, 83, 33, 29, 57, 61)));

    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        // si aan ugu wareego loop-ka
        // waa inaa helaa
        // tirada ardayda/grades-ka
        int numberOfStudents = grades.size();

        // haddii aysan jirin
        // arday waxay ka dhigan tahay
        // in wax shaqo ah la qaban
        // sidaas darteed lasoo celiyo -1
        if (numberOfStudents == 0)
            return List.of(-1);


        for (int index = 0; index < numberOfStudents; index++) {

            // hadii grade-ka ardayga
            // uu ka yar yahay 38 wax
            // dhibco buuxin ah ma sameen doono
            if (grades.get(index) > 37) {

                // xisaabinta lambarka
                // ugu dhow ee dhibcaha buuxin lahaa
                int nextMultipleNum = (int) (Math.floor(grades.get(index) / 5.0) * 5) + 5;

                // xisaabinta farqiga u dhexeeyo
                // dhibcaha ardayga iyo
                // lambarka lagu buuxin lahaa
                int difference = nextMultipleNum - grades.get(index);

                // buuxinta dhibcaha
                // hadii farqiga
                // uu ka yar yahy 3
                if (difference < 3) {
                    grades.set(index, nextMultipleNum);
                }

            }
        }

        return grades;
    }

}
