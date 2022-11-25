package src.lessons.conditions;

public class SortNumbers {

    public static void main(String[] args) {
        
        int num1 = 9, num2 = 8, num3 = 1;

        if (num1 < num2) {
            
            if (num2 < num3) {
                System.out.printf("%d %d %d \n", num1, num2, num3);
            } else {

                if (num3 < num1) {
                    System.out.printf("%d %d %d \n", num3, num1, num2);
                } else {
                    System.out.printf("%d %d %d \n", num1, num3, num2);
                }   // END IF

            }   // END IF

        } else {
            
            if (num1 < num3) {
                System.out.printf("%d %d %d \n", num2, num1, num3);
            } else {

                if (num3 < num2) {
                    System.out.printf("%d %d %d \n", num3, num2, num1);
                } else {
                    System.out.printf("%d %d %d \n", num2, num3, num1);
                }   // END IF

            }   // END IF

        }   // END IF

    }
    
}
