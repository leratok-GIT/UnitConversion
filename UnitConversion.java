package unitconversion;
import java.util.InputMismatchException;
import java.util.Scanner;
 
 
/**
 
* An application that will accept inputs from the user, and
 
* The program should convert the unities.
 
* which is from Feet to Meters, From Pounds to Kgs, from Fahrenheit to Celsius
 
*/
 
public class UnitConversion {
    public static void main(String[] args) {
 
        Scanner secondOne;
 
        // showing the conversion option to the user
 
        try ( // creating a scanner object
 
                Scanner firstOne = new Scanner(System.in)) {
 
            // showing the conversion option to the user
 
            System.out.println("""
 
                                       Which conversion do you want to convert between A - C:
 
                                       A) Feet to Meters
 
                                       B) Pound to Kgs
 
                                       C) Fahrenheit to Celsius
 
                                       """);
 
            // reads the user inputs
 
            String letterChoice = firstOne.nextLine();
 
 
            // scanner object input for the quantity to be coverted
 
            secondOne = new Scanner(System.in);
 
            System.out.println("Enter the Quantity to be converted: ");
 
//          float num = secondOne.nextInt();
 
            float num = 0;
 
            // calculation for the converstion of the units
 
            float meters = (float) (num * 0.305);
 
            float kilograms = (float) (num * 0.454);
 
            float celsuis = (float) ((num - 32) / 1.8);
 
            // performing the converstion based on the users choice.
 
        // Handle InputMismatchException
 
        try {
 
            num = firstOne.nextFloat();
 
        } catch (InputMismatchException e) {
 
            System.out.println("Invalid input. Please enter a number.");
 
            firstOne.next(); // Clear the invalid input
 
            return;
 
        }
 
            System.out.println("============================");
 
            switch (letterChoice.toUpperCase()) {
 
                //the .toUppercase is to handle the case sentitive inputs
 
                case "A" -> System.out.println(num + "ft to " + meters + "m" );
 
                case "B" -> System.out.println(num + "lb to " + kilograms + "kgs");
 
                case "C" -> System.out.println(num + "°F to " + celsuis + "°C");
 
                default -> System.out.println("You have enter an incorrect choice MY DEAR!!");
 
            }
 
            System.out.println("============================");
 
            //the .toUppercase is to handle the case sentitive inputs
 
            // closing the scanners
 
        }
 
        secondOne.close();
 
    }
 
}