
package JavaObject; 
import java.io.IOException;

public class JavaObject { 

	public static void main(String[] args) throws IOException {

		JavaObject program = new JavaObject(); 
		program.run(); 
	} // end of main 

	public void run() throws IOException { 
        char pick;	// what the User picks for user imput
        boolean exit = false;	// when the program starts we do not want to exit 
       
        	for(;;) {
				// call to menu to Display menu and get user pick
            	pick = menu(); 
           		// if the user picks a correct pick, then enter the Switch 
            	if(pick == '1' || pick == '2' || pick == '3' || pick == 'e'){
            		switch (pick){
                		case '1':  
                			System.out.println("Create a Car object");
                			createCarObject();      
                    		break;	// break out of the Switch 
                		case '2':  
                			System.out.println("Create a Movie object");
                			createMovieObject();        
                    		break;	// break out of the Switch 
                		case '3':
                			System.out.println("create a Video Game object");
                			createVideoGameObject();
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
        System.out.println("(1) Car object"); 
        System.out.println("(2) Movie object");
        System.out.println("(3) Video game object ");
        System.out.println("(e) EXIT PROGRAM");
        pick = UserInput.getChar();
        System.out.println("---------------------");   
        return pick; 
    }

    public static void createCarObject() throws IOException {
    	
    	Car car1 = new Car(); // new car object 

        System.out.print("Enter make of car: ");
        car1.setMAKE(UserInput.getString());
        
        System.out.print("Enter number of cylinders: ");
        car1.setCYLINDERS(UserInput.getInt());
        
        System.out.print("Enter desired Price: ");
        car1.setPRICE(UserInput.getDouble());
        
        System.out.println(car1.toString());

    }

    public static void createMovieObject() throws IOException{
    	Movie movie1 = new Movie();
     
    	System.out.println("Movie search");
     	System.out.print("Enter minutes of film: ");
     	movie1.setMINUTES(UserInput.getDouble());

     	System.out.print("Enter movie title: ");
     	movie1.setTITLE(UserInput.getString());

     	System.out.print("Enter number of viewers: ");
     	movie1.setVIEWERS(UserInput.getInt());

     	System.out.println(movie1.toString());

    }

    public static void createVideoGameObject() throws IOException{
    	VideoGame videogame1 = new VideoGame();
     
     	System.out.println("Video Game search");
     	System.out.print("Enter Game title: ");
     	videogame1.setTITLE(UserInput.getString());

     	System.out.print("Enter number of players: ");
     	videogame1.setPLAYERS(UserInput.getInt());

     	System.out.print("Enter price of the game: ");
     	videogame1.setPRICE(UserInput.getDouble());

     	System.out.println(videogame1.toString());

    }
} // end of class 