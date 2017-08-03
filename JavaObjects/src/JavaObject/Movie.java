package JavaObject;
public class Movie {

    private String TITLE;
    private double MINUTES;
    private final double MAX_MINUTES = 200;
    private final double MIN_MINUTES = 60;
    private int VIEWERS;
    private final int MAX_VIEWERS = 70;
    private final int MIN_VIEWERS = 1;

public Movie(){
    TITLE = " ";
    MINUTES = 0;
    VIEWERS = 0;
    }

public Movie(String tempTITLE, double tempMINUTES, int tempVIEWERS){
        setTITLE(tempTITLE);
        setMINUTES(tempMINUTES);
        setVIEWERS(tempVIEWERS);
        }

    public void setTITLE(String tempTITLE){
        TITLE = tempTITLE;
        }

    public void setMINUTES(double tempMINUTES){

        if (tempMINUTES <= MAX_MINUTES && tempMINUTES >= MIN_MINUTES) {
            MINUTES = tempMINUTES;
        } else {
            System.out.println("Error, minutes need to be between 60 and 200");
        }
        }

     public void setVIEWERS(int tempVIEWERS){
         if (tempVIEWERS <= MAX_VIEWERS && tempVIEWERS >= MIN_VIEWERS) {
            VIEWERS  = tempVIEWERS;
        } else {
            System.out.println("Error, number of viewers must be between 1 and 70");
        }
        }

    public String getTITLE() {
        return TITLE;
        }

    public double getMINUTES() {
        return MINUTES;
        }

    public int getVIEWERS() {
        return VIEWERS;
        }

public String toString (){
        return "MINUTES: " + getMINUTES() + ", TITLE: " + getTITLE() + ", NUMBER OF VIEWERS: " + getVIEWERS();
}
    
    /*
     public static void main(String[] args) {
     Movie movie1 = new Movie();
     Scanner input = new Scanner(System.in);
     
     System.out.println("Movie search");
     System.out.print("Enter minutes of film: ");
     movie1.setMINUTES(input.nextDouble());

     input.nextLine();
     System.out.print("Enter movie title: ");
     movie1.setTITLE(input.nextLine());

     System.out.print("Enter number of viewers: ");
     movie1.setVIEWERS(input.nextInt());

     System.out.println(movie1.toString());
    }
    */

}
