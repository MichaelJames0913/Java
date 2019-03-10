package Hello;

public class person {

    private int AGE;
    private int ID;
    private String NAME;

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    // if created but given no values at time of creation.
    public person() {
        AGE = 0;
        ID = 0;
        NAME = "NONE";
    }

    // giving values at the time of creation.
    public person(String tempNAME, int tempAGE, int tempID) {
        setNAME(tempNAME);
        setAGE(tempAGE);
        setID(tempID);
    }

    public String toString() {
        String personData = "NAME: " + getNAME() + "\n" + "AGE:  " + getAGE() + "\n" + "ID: " + getID() + "\n";
        return personData;
    }
}
