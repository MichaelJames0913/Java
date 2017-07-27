package project1;

import java.io.IOException;

public class CalculateTip{

    public static void calculate() throws IOException{
       
        double subtotal=0.0;
        double tiprate=0.0;
        double tip=0.0;
        double total=0.0;

        System.out.print("Enter Subtotal ");
        subtotal = UserInput.getDouble();

        System.out.print("Enter tiprate ");
        tiprate = UserInput.getDouble();

    	tip = subtotal * (tiprate / 100);
    	total = subtotal + tip;

        System.out.println("Tip: " + tip + "$");
        System.out.println("Total with tip: " + total + "$");
    }
    
}