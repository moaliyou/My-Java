package src.practice.conditions;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        // Creating an input object stream
        // to get the character
        // from the user's keyboard
        Scanner scan = new Scanner(System.in);

        // Displaying some info
        // about the program task
        System.out.println("""
                The task of this program is to get a character
                and tell if it's vowel or consonant.
                """);

        // Asking the user to enter
        // any character of his choice
        // and converting it to lowercase
        // to void multi-condition
        // then holding it into variable
        // called character
        System.out.print("Enter any character: ");
        char character = scan.next().charAt(0);

        // closing the input stream object
        scan.close();

        // checking if the character
        // is a vowel or consonant
        if (isVowel(character)) {

            System.out.printf("%s is a vowel. \n", character);
            return;

        }

        System.out.printf("%s is a consonant. \n", character);

    }


    // A method takes a character as argument
    // and it returns 'true' if the given character
    // is a vowel and/or 'false' if it isn't
    private static boolean isVowel(char character){
        return 
        character == 'a' || character == 'A' || 
        character == 'e' || character == 'E' || 
        character == 'i' || character == 'I' || 
        character == 'o' || character == 'O' || 
        character == 'u' || character == 'U';
    }

}
