package src.lessons.conditions;

import java.util.*;

public class Shop {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        String itemName;
        int itemQuantity;

        System.out.println("Dukaanlaha: Maxaan kaa iibiyaa?");
        System.out.print("Aniga: ");
        itemName = scanner.nextLine();

        if (itemName.equalsIgnoreCase("Ukun")){

            System.out.println("Dukaanlaha: imisaa ku siiyaa?");
            System.out.print("Aniga: ");
            itemQuantity = scanner.nextInt();

            if (itemQuantity == 5 || itemQuantity == 3){

                System.out.printf("Dukaanlaha: waa tanaa %d ukun.\n", itemQuantity);
                System.out.println("Aniga: Mahadsanid.");
                return;

            }

            System.out.println("Dukaanlaha: " + itemQuantity + " ukun ah mahaayo hadda.");
            System.out.println("Aniga: Haye, 5 xabo rooti isii");
            return;
        }

        System.out.println("Dukaanlaha: Guriga ku laabo soo hubi waxa laguu soo diray");

    }
    
}
