import java.io.IOException;

public class Menu{

	public static void main(String[] args) throws IOException{
        //Program Starts Here
        Menu menuProgram = new Menu();  // create object program 
        menuProgram.run();              // run the menu function
    }

	public void run() throws IOException { 
        char pick;	// what the User picks for user imput
        boolean exit = false;	// when the program starts we do not want to exit 
       
        	for(;;) {
				// call to menu to Display menu and get user pick
            	pick = menu(); 
           		// if the user picks a correct pick, then enter the Switch 
            	if(pick == 'c' || pick == 'l' || pick == 'r' || pick == 'e'){
            		switch (pick){
                		case 'c':  
                			System.out.println("Create Object test");      
                    		break;	// break out of the Switch 
                		case 'l':  
                			System.out.println("List object");        
                    		break;	// break out of the Switch 
                		case 'r':
                			System.out.println("Remove objects");
                    		break;	// break out of the Switch 
                		case 'e':
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
        char pick; 
        System.out.println("--------------------");
        System.out.println("***MENU***"); 
        System.out.println("(c) Create object"); 
        System.out.println("(l) List objects");
        System.out.println("(r) Remove objects ");
        System.out.println("(e) EXIT PROGRAM");
        pick = UserInput.getChar();
        System.out.println("---------------------");   
        return pick; 
    }
}
