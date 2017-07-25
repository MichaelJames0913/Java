import java.io.IOException;

public class CalculateCylinder{

 public static void calculate() throws IOException{
        double radius = 0.0;
        double area = 0.0;
        double length = 0.0;
        double volume = 0.0;

        System.out.print("Enter Radius: ");
        radius = UserInput.getDouble();

        System.out.print("Enter Length: ");
        length = UserInput.getDouble();

        area = radius * radius * 3.14159; // that is pi
        volume = area * length;

        System.out.println("The Volume of the Cylinder is: " + volume + " Units");
    }
    	
}