public class driver extends baseUser{
    private int IDNumber;
    private int DLNumber; // drivers licence
    private boolean Available;

    public driver(String Name, String phoneNumber, int age){
        super(Name, phoneNumber, age);
        this.IDNumber = IDNumber;
        this.DLNumber = DLNumber;
    }
    public int getIDNumber(){return IDNumber;}
    public int getDLNumber(){return DLNumber;}
    public boolean getAvailable(){return Available;}

    public void setIDNumber(int IDNumber){this.IDNumber = IDNumber;}
    public void setDLNumber(int DLNumber){this.DLNumber = DLNumber;}
    public void setAvailable(int DLNumber){this.Available = Available;}




}
