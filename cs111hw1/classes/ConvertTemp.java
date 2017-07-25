import java.io.IOException;

public class ConvertTemp {

    public static void convert() throws IOException {
        // convert celsius to fahrenheit
        double fahrenheit = 0.0;
        double celsius = 0.0;

        System.out.print("Enter Celsius : ");
        celsius = UserInput.getDouble();

        fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        System.out.println(fahrenheit + " Fahrenheit");
    }
    
}
