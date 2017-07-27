package project1;

import java.io.IOException;

public class FeetMeters {
	// convert Feet to Meter
    public static void feetToMeters() throws IOException {
      
        double feet = 0.0;
        double meters = 0.0;

        System.out.print("Enter Feet: ");
        feet = UserInput.getDouble();
      
        meters = feet * .305;
        
        System.out.println(meters + " meters");
        } 
}