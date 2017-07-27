/*
* this is some of the very first java code that I have ever written.
* It uses 9 classes, each with it’s own purpose to preform some 
* type of calculation. The program uses a menu to select which 
* calculation to run. user input is taken from UserInput.java. 
*
* @author Michael James Schmidt
* @version 2.0 7-24-17
*/
package project1;

import java.io.IOException;

public class Project1 {

    ////////////////////////// M A I N  //////////////////////////
    public static void main(String[] args) throws IOException {
        // Program Starts Here
        Project1 theProgram = new Project1();   // create object program 
        theProgram.run();   // run the menu function
    } // end of main 

    //////////////////////////  R U N  //////////////////////////
    public void run() throws IOException {
        // this method holds the main loop that displays the menu, and listen for the users choice.  
        char choice;	// what the User picks for user imput
        boolean exit = false;	// when the program starts we do not want to exit 
        // messages about program 
        System.out.println("\n" + "---------------------" + "\n");
        System.out.println("Project 1 From Computer Science 111 at COC");
        System.out.println("Program written in java by Michael James Schmidt");
        System.out.println("Select a function from the menu to run that function.");

        for (;;) { // loop forever until we hit a break 
            // call to menu to Display menu and get user choice
            choice = menu();
            // if the user picks a correct choice, then enter the Switch 
            if (choice == '1' || choice == '2' || choice == '3' || choice == '4'
                    || choice == '5' || choice == '6' || choice == '7' || choice == '8') {
                // switch That takes in the users choice
                switch (choice) {
                    case '1':    
                        CalculateCylinder.calculate();
                        break;	// break out of the Switch 
                    case '2':
                        CalculateTip.calculate();
                        break;	
                    case '3':
                        ConvertTemp.convert();
                        break;	
                    case '4':
                        FeetMeters.feetToMeters();
                        break;
                    case '5':
                        JAVAMessage.message();
                        break;
                    case '6':
                        MyInitials.theInitials();
                        break;
                    case '7':
                        WelcomeInMessageDialogBox.theGUIMessage();
                        break;
                    case '8':
                        exit = true; // ready to exit the program 
                        break;	// break out of the Switch 
                }
            } else { // else the user did not choose correctly 
                System.out.println("Try Again Select from the menu");
            }   
            if (exit == true){  // break out of the forever loop and exit the program  
                break;
            }
        } // end of forever loop   
    } // end of run 

    //////////////////////////  M E N U  //////////////////////////
    public static char menu() throws IOException {
        char menuChoice;
        System.out.println("\n" + "---------------------" + "\n");
        System.out.println("***MENU***");
        System.out.println("(1) CalculateCylinder");
        System.out.println("(2) CalculateTip");
        System.out.println("(3) ConvertTemp");
        System.out.println("(4) Feet to Meters");
        System.out.println("(5) JAVA");
        System.out.println("(6) My initials");
        System.out.println("(7) WelcomeInMessageDialogBox");
        System.out.println("(8) EXIT ");
        menuChoice = UserInput.getChar();
        System.out.println("\n" + "---------------------" + "\n");
        return menuChoice;
    } // end of menu 
} // end of Project1 class