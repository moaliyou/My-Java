package src.practice.functions;

import java.util.Scanner;


public class Circle {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.println("A program calculates the area and circumference of circle.\n");

        // Getting the input from the user
        // and holding the value into a variable
        System.out.print("Enter the radius value: ");
        double radius = inputValue.nextDouble();

        // Printing the area of circle
        System.out.printf("\nThe area of circle is %.2f\n", getArea(radius));

        // Printing the circumference of circle
        System.out.printf("The circumference of circle is %.2f\n", getCircumference(radius));


    }

    /**
     * @description A method calculate the area of the circle
     *
     * @param radius The value specified by the user
     * @return The area of the circle
     */
    static double getArea(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }

    /**
     * @description A method calculates the circumference of circle
     *
     * @param radius The value specified by the user
     * @return The circumference of circle
     */
    static double getCircumference(double radius) {
        return (2 * Math.PI * radius);
    }

}
