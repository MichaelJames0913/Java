package BinarySearch;

import java.io.IOException;
import java.util.Scanner;

public class UserInput {
/////////////////////////////////GET METHODS////////////////////////////////////
    //the get methods use the scanner class for input, and return that data. 
    public static int getInt() throws IOException {
        Scanner input = new Scanner(System.in);
        int theInt = input.nextInt();
        return theInt;
    }

    public static double getDouble() throws IOException {
        Scanner input = new Scanner(System.in);
        double theDouble = input.nextDouble();
        return theDouble;
    }

    public static char getChar() throws IOException {
        Scanner input = new Scanner(System.in);
        String theChar = input.next();
        return theChar.charAt(0);
    }

    public static String getString() throws IOException {
        Scanner input = new Scanner(System.in);
        String theString = input.nextLine();
        return theString;
    }
//////////////////////////////OVERLOADED METHODS////////////////////////////////
    //The pattern for all methods is call the original method.
    //check the input, return valid input or loop back and ask for re-input when the data is invalid. 
    public static int getInt(int min, int max) throws IOException {
        int theInt = getInt();
        while (theInt < min || theInt > max) {
            System.out.println("number not between: " + min + " and  " + max);
            System.out.print("Enter number again: ");
            theInt = getInt();
        }
        return theInt;
    }

    public static double getDouble(double min, double max) throws IOException {
        double theDoub = getDouble();
        while (theDoub < min || theDoub > max) {
            System.out.println("number not between: " + min + " and  " + max);
            System.out.print("Enter number again: ");
            theDoub = getDouble();
        }
        return theDoub;
    }

    public static char getChar(char min, char max) throws IOException {
        char theChar = getChar();
        while (theChar < min || theChar > max) {
            System.out.println("number not between: " + min + " and  " + max);
            System.out.print("Enter number again: ");
            theChar = getChar();
        }
        return theChar;
    }

    public static String getString(int min, int max) throws IOException {
        String theString = getString();
        while (theString.length() < min || theString.length() > max) {
            System.out.println("String not between: " + min + " and  " + max);
            System.out.print("Enter String again: ");
            theString = getString();
        }
        return theString;
    }
}
