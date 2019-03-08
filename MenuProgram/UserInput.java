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
}