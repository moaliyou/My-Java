package src.lessons.conditions;

import java.util.*;

public class TestClass {

    public static void main(String[] args) {

        int[] numList = { 3, 2, 4};
        int targetSumNum = 6;

        System.out.println(Arrays.toString(findIndicesOf(numList, targetSumNum)));

    }

    /**
     * @findIndicesOf - waa method/function raadinaaya 2 number
     *                  marki leysku daro keenaya integer number-ka
     *                  lana siiyay
     * 
     * @param numList - waa array-da uu user-ka soo gelinayo
     * @param targetSumNum - waa integer number-ka 
*                            lagaa rabo inaad ku raadisid
     * 
     * @return - hadii lasoo helo lambarkaas waxaa lasoo celin doonaa
     *           2-da index ee marki leysku daro keenayo 'targetSumNum'
     */
    public static int[] findIndicesOf(int[] numList, int targetSumNum) {

        // waa inaa lambar walbo
        // ku darnaa lambarada
        // la ina siiyay ama array-ga
        // ku jira si aan u raadino
        // integer number-ka nalaga rabo
        for (int index1 = 0; index1 < numList.length; index1++) {

            for (int index2 = 1; index2 < numList.length; index2++) {

                // si aan u soo celino ama helno
                // 2-da god/index keeni kara
                // marki leysku daro integer 
                // number-ka nagala rabo
                if (numList[index1] + numList[index2] == targetSumNum)

                    return new int[] { index1, index2 };

            }

        }

        // hadii aan weyno
        // integer number-ka
        // nagala rabay waxaa
        // soo celin doonnaa -1
        return new int[] { -1 };
    }

}
