
import java.io.IOException;

public class FeetMeters {

    public static void feetToMeters() throws IOException {
        // Convert Feet to Meter
        double feet = 0.0;
        double meters = 0.0;

        System.out.print("Enter Feet: ");
        feet = UserInput.getDouble();
      
        meters = feet * .305;
        
        System.out.println(meters + " meters");
        }
        
}