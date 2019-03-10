package Hello;

import java.io.IOException;

public class ImBackJava {

    private People peopleData = new People(1000);

    public static void main(String[] args) throws IOException {
        //Program Starts Here
        ImBackJava peopleProgram = new ImBackJava();  // create object program 
        peopleProgram.run();

    }

    public ImBackJava() {
        // I wiil put code here that will read a file and import data later. 
        // put some data in the array to have somthing to work with. 
        person person1 = new person("bob", 43, 1919);
        person person2 = new person("Mike", 27, 3433);
        person person3 = new person("joe", 34, 2321);

        peopleData.insert(person1); // put the person in the Array 
        peopleData.insert(person2); // put the person in the Array 
        peopleData.insert(person3); // put the person in the Array 

    }

    public void run() throws IOException {
        char pick;	// what the User picks for user imput
        boolean exit = false;	// when the program starts we do not want to exit 

        for (;;) {
            // call to menu to Display menu and get user pick
            pick = menu();
            // if the user picks a correct pick, then enter the Switch 
            if (pick == 'c' || pick == 'l' || pick == 'r' || pick == 'e') {
                switch (pick) {
                    case 'c':
                        System.out.println("Create Object test");
                        makePerson();
                        break;	// break out of the Switch 
                    case 'l':
                        System.out.println("List objects");
                        peopleData.list();
                        break;	// break out of the Switch 
                    case 'r':
                        System.out.println("Remove objects");
                        removeObject();
                        break;	// break out of the Switch 
                    case 'e':
                        System.out.println("EXIT");
                        exit = true;
                        break;	// break out of the Switch 
                    }
            } else { // else the user did not choose correctly 
                System.out.println("Try Again Select from the menu");
            }
            if (exit == true) // break out of the loop 
            {
                break;
            }
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

    public void makePerson() throws IOException {
        // get that data 
        System.out.println("enter a new person into database"); 
        System.out.print("get that name: ");
        String tempName = UserInput.getString();
        System.out.print("get that age: ");
        int tempAge = UserInput.getInt();
        System.out.print("get that ID number: ");
        int tempid = UserInput.getInt();
        // create that object from that data 
        person p1 = new person(tempName, tempAge, tempid);
        // insert that object into the array. 
        peopleData.insert(p1); // put the person in the Array 

    }

    public void removeObject() throws IOException {

        int entryNumber;
        boolean found = false;

        System.out.println("removePerson from dateBase");
        System.out.println("enter ID number of person to be removed");
        entryNumber = UserInput.getInt();

        for (int i = 0; i < peopleData.getSize(); i++) {

            if (peopleData.accessArray(i).getID() == entryNumber) {
                System.out.println("Found!");
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Not Found!");
        }
    } // end of remove 
    
} // end of class 
