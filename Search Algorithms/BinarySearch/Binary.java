/* 
 * This program compares linear and binary seaches through an array of 91 names
 * and prithe nts out the averages and the number of saves the binary search makes 
 * it reaches its overhead of 1698.
 */
package BinarySearch;

import java.io.IOException;

public class Binary {
    
    private final String[] names = {"fred", "barney", "tom", "jerry", "larry", "moe", "curly",
            "betty", "wilma", "bart", "homer", "marge", "maggie", "lisa",
            "pebbles", "bambam", "smithers", "burns", "milhouse", "george", "astro",
            "dino", "mickey", "minnie", "pluto", "goofy", "donald", "huey",
            "louie", "dewey", "snowwhite", "happy", "doc", "grumpy", "sneezy",
            "dopey", "sleepy", "bambi", "belle", "gaston", "tarzan", "jane",
            "simba", "scar", "mufasa", "ariel", "flounder", "bugs", "daffy",
            "elmer", "foghorn", "chickenhawk", "roger", "jessica", "hank", "bobby",
            "peggy", "spot", "pongo", "perdy", "buzz", "potatohead", "woody",
            "chuckie", "tommy", "phil", "lil", "angelica", "dill", "spike",
            "pepe", "speedy", "yosemite", "sam", "tweety", "sylvester", "granny",
            "spiderman", "batman", "superman", "supergirl", "robin", "catwoman", "penguin",
            "thing", "flash", "silversurfer", "xmen", "pokemon", "joker", "wonderwoman"
        }; 
    
    private String[] sortednames; // array of sorted names 
   
    boolean exit; 
    
    String SearchName; 
    String nameInput;
    int numSearch;
    int linearComp;
    int binaryComp;
    int linearCompTotal;
    int binaryCompTotal;
    // int savings;
    
    //////////////////////////////// MAIN //////////////////////////////////////
    public static void main(String[] args) throws IOException {
        Binary program = new Binary();  
        program.run(); 
    }
    ////////////////////////////////////////////////////////////////////////////
    Binary(){
        
        this.exit = false;  // we don't want to exit until the user sets true 
        this.numSearch = 0; // 
        this.linearComp = 0; 
        this.binaryComp = 0;
        this.linearCompTotal = 0; 
        this.binaryCompTotal = 0;
        //this.savings = 0; 
       
        /////////////////////////////SORTED NAMES///////////////////////////////
      
        this.sortednames = insertionSort(this.names); //Sort the new array
        
        /*
        for(int i = 0; i < this.sortednames.length; i++){   // are the names sorted ?  
            System.out.println(this.sortednames[i]);
        }
        */ 
    }
    
    ////////////////////////////////////////////////////////////////////////////
    public void run() throws IOException{
    
        ////////////////////////// DO WHILE LOOP ///////////////////////////////
        do { // Do this code while exit is != to ture 
            
            this.linearComp = 0; // set the comparison numbers back to 0 
            this.binaryComp = 0; 
            
            System.out.print("Enter a name to search for: ");
            this.nameInput = UserInput.getString();
            // check if the user wants to exit the program 
            if (this.nameInput.equals("exit")) {
                this.exit = true;
            } else {
                /* lets look at binarySearch first because it faster, get 
                   the number of comparisons made or find out if the name is 
                   even in the array. 
                NOTE: in order binary search to work the data must be sorted. 
                */ 
                this.binaryComp = binarySearch(this.sortednames, this.nameInput);
                if(this.binaryComp == 0){
                    // name NOT in array, don't waste time runing Linear Search. 
                    System.out.println("name is not in array "); 
                }else{
                    // name is in array so do a Linear Search. 
                    this.linearComp = linearSearch(names, nameInput);  
                }
                
                System.out.println("binaryComp: " + this.binaryComp);
                System.out.println("linearComp: " + this.linearComp);
                
                
                
                /*
                linearCompTotal += linearComp;
                binaryCompTotal += binaryComp;
                // numSearch++;
                
                // System.out.println("numSearch" + numSearch); 

                //savings = (linearCompTotal / numSearch) - (binaryCompTotal / numSearch);
                */
            }

            // int linearAverage = (linearCompTotal / numSearch);
            // int binaryAverage = (binaryCompTotal / numSearch);
            /*
            //if (linearComp != 0) {// only display the output if data is good. 
            System.out.println("Linear search: " + linearComp + " comparisons"
                    + ", average " + linearAverage + " comparisons per linear search");
            System.out.println("Binary Search: " + binaryComp + " comparisons" + ", average "
                    + (binaryAverage) + " comparisons per linear search");
            System.out.println("Binary search currently saves " + savings
                    + " comparisons on average per search");
            */
        } while (exit != true); 
    }
    //////////////////////////// LINEAR SEARCH /////////////////////////////////
    /* 
    * Linear search is simple, but slow, Linear search starts at the beginning of 
    * array and searches each index util it finds the search item or the search  
    * reaches the end of the array. 
    *
    * best case search time : O(1), item could be in the first index
    * worst case: O(n), item could be in the last index 
    * average O(n), on average it takes O(n)
    */
    public static int linearSearch(String[] names, String nameInput) {
        int comparisons = 0;    // keep track of how many times we do a check 
        boolean find = false;   // did we find the search item 

        for (int i = 0; i < names.length; i++) { // loop the through array 
            if (names[i].equals(nameInput)) {   // comparison 
                comparisons = i + 1; // number of indexes searched + 1 = comparisons  
                find = true; // we found it ! 
                return comparisons; // return the number times me made a comparison 
            }// end of if 
        }// end of for loop 
        return 0;
    }

/////////////////////////////BINARY SEARCH//////////////////////////////////////
    public static int binarySearch(String[] names, String key) {

        int lower = 0;
        int upper = names.length - 1;
        int mid;
        int comp = 0;

        while (lower <= upper) {

            mid = (lower + upper) / 2;
            
            if (names[mid].equals(key)) {
                return ++comp;
            } else if (names[mid].compareTo(key) < 0) {
                lower = mid + 1;
                comp++;
            } else if (names[mid].compareTo(key) > 0) {
                upper = mid - 1;
                comp++;
            }
        }
       
        return 0; 
        
    }


////////////////////////////INSERTION SORT//////////////////////////////////////  

    public static String[] insertionSort(String[] array) {
        int comp = 0;
        int in, out;

        for (out = 1; out < array.length; out++) // out is dividing line
        {
            String temp = array[out]; // remove marked item
            in = out; // start shifts at out
            while (in > 0 && array[in - 1].compareTo(temp) >= 0) // until one is smaller,
            {
                ++comp;
                array[in] = array[in - 1]; // shift item right,
                --in; // go left one position
            }

            array[in] = temp; // insert marked item
        } // end for
        return array;
    } // end insertionSort()

 //////////////////////////////COPY ARRAY////////////////////////////////////////
    static void copyArray(String[] source, String[] target) {

        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
    }

}
