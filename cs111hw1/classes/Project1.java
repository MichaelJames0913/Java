import java.io.IOException;

public class Project1{

	public static void main(String[] args) throws IOException{
        //Program Starts Here
        Project1 theProgram = new Project1();  // create object program 
        theProgram.run();              // run the menu function
    }

	public void run() throws IOException { 
        System.out.println("\n" + "Project 1 run  ");
        char choice;	// what the User picks for user imput
        boolean exit = false;	// when the program starts we do not want to exit 
        // message about program 
        System.out.println("\n" + "---------------------" + "\n");
        System.out.println("Project 1 From Computer Science 111 at COC");
        System.out.println("Program written in java by Michael James Schmidt");
        System.out.println("Select a function from the menu to run that function."); 

        	for(;;) {
				// call to menu to Display menu and get user choice
            	choice = menu(); 
           		
                // if the user picks a correct choice, then enter the Switch 
            	if(choice == '1' || choice == '2' || choice == '3' || choice == '4' 
                    || choice == '5' || choice == '6' || choice == '7' || choice == '8' ){
            		
                    switch (choice){
                		case '1':  
                			//System.out.println("choice 1 ");      
                    		CalculateCylinder.calculate(); 
                            break;	// break out of the Switch 
                		case '2':  
                			//System.out.println("choice 2");
                            CalculateTip.calculate();         
                    		break;	// break out of the Switch 
                		case '3':
                			//System.out.println("choice 3 ");
                            ConvertTemp.convert();
                    		break;	// break out of the Switch 
                		case '4':
                            //System.out.println("Feet to Meters");
                            FeetMeters.feetToMeters(); 
                            break; 
                        case '5':
                            //System.out.println("JAVA"); 
                            JAVAMessage.message();
                            break; 
                        case '6':
                            //System.out.println("MyInitials"); 
                            MyInitials.theInitials();
                            break; 
                        case '7':
                            System.out.println("Welcome InMessage DialogBox"); 
                            WelcomeInMessageDialogBox.theGUIMessage(); 
                            break;  
                        case '8':
                			System.out.println("EXIT");
                    		exit = true; 
                    		break;	// break out of the Switch 
					}	
				}else{ // else the user did not choose correctly 
					System.out.println("Try Again Select from the menu"); 
				}
            	if(exit == true) // break out of the loop 
                	break; 
        	} // end of run loop   
	} // end of run 

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
    }
}