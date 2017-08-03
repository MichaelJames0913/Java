
package JavaObject;
public class VideoGame {

    private String TITLE;
    private int PLAYERS; 
    private final int MAX_PLAYERS = 4;
    private final int MIN_PLAYERS = 1;
    private double PRICE;
    private final double MAX_PRICE = 55;
    private final double MIN_PRICE = 45;


public VideoGame() {
        TITLE = " ";
        PLAYERS = 0;
        PRICE = 0;
        }

public VideoGame (String tempTITLE, int tempPLAYERS, double tempPRICE) {
        setTITLE(tempTITLE);
        setPLAYERS(tempPLAYERS);
        setPRICE(tempPRICE);
        }

    public void setTITLE(String tempTITLE){
        TITLE = tempTITLE;
        }

    public void setPLAYERS(int tempPLAYERS){

        if (tempPLAYERS <= MAX_PLAYERS && tempPLAYERS >= MIN_PLAYERS) {
            PLAYERS = tempPLAYERS;
        } else {
            System.out.println("Error. Players must be between 1 and 4"); 
        }
        }

     public void setPRICE(double tempPRICE){
         if (tempPRICE <= MAX_PRICE && tempPRICE >= MIN_PRICE) {
            PRICE  = tempPRICE;
        } else {
            System.out.println("Error, Price must be between 20 and 55");
        }
        }

     public String getTITLE() {
        return TITLE;
        }

    public int getPLAYERS() {
        return PLAYERS;
        }

    public double getPRICE() {
        return PRICE;
        }
     
     public String toString (){
        return "TITLE: " + getTITLE() + ", PLAYERS: " + getPLAYERS() + ", PRICE: " + getPRICE();  
     } 
     /*
     public static void main(String[] args) {
     VideoGame videogame1 = new VideoGame();
     Scanner input = new Scanner(System.in);
     
     System.out.println("Video Game search");
     System.out.print("Enter Game title: ");
     videogame1.setTITLE(input.nextLine());

     System.out.print("Enter number of players:  ");
     videogame1.setPLAYERS(input.nextInt());

     System.out.print("Enter price of the game: ");
     videogame1.setPRICE(input.nextDouble());

     System.out.println(videogame1.toString());
    }
    */
}
