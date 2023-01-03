package src.lessons.conditions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElement {

    public static void main(String[] args) {

        int[] listOfElements = {4, 1, 2, 1, 2};

        int index1, index2;

        for (index1 = 0; index1 < listOfElements.length; index1++) {

            for (index2 = 0; index2 < listOfElements.length; index2++){

                if (listOfElements[index1] == listOfElements[index2] && index1 != index2)
                    break;

            }

            if (index2 == listOfElements.length) {
                System.out.println(listOfElements[index1]);
            }

        }


    }

}
