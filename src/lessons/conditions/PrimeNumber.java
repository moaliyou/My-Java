package src.lessons.conditions;

public class PrimeNumber {

    public static void main(String[] args) {
        
        System.out.println(isPrimeNumber(21));

    }

    private static boolean isPrimeNumber(int number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2 || number == 3){
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(number); i++){
            if ((number % i == 0) || (number % (i + 2) == 0)){
                return false;
            }
        }

        return true;
        
    }
    
}
