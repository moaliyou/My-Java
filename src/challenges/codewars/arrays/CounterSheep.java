package src.challenges.codewars.arrays;

public class CounterSheep {

    public static void main(String[] args) {

//        Boolean[] array1 = new Boolean[5];

        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        System.out.println(countSheep(array1));

    }

    private static int countSheep(Boolean[] arrayOfSheep) {

        int numOfSheep = 0;

        for (Boolean sheep : arrayOfSheep) {

            if (sheep != null && sheep)
                numOfSheep++;

        }

        return numOfSheep;

    }

}
