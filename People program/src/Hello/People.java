package Hello;

public class People {

    private int maxSize;
    private person[] theArray;
    private int size = 0;

    public int getSize() {
        return size;
    }

    

    People(int s) {
        maxSize = s;
        theArray = new person[maxSize];
    }

    public void insert(person newPerson) {

        theArray[size] = newPerson;
        size++;

    }
    
    public person accessArray(int indexNum){
  
        return theArray[indexNum]; 
                
    }
    

    public void list() {

        System.out.println(" ");
        for (int i = 0; i < size; i++) {

            System.out.println("Name: " + theArray[i].getNAME() + " Age: " + theArray[i].getAGE() + " ID: " + theArray[i].getID());

        }
        System.out.println(" ");
    }
}