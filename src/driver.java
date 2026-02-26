public class driver extends baseUser{
    private boolean Available;
    private car mycar;
    private double rating;

    public driver(String Name, String phoneNumber,int IDNumber, int age, double rating, car car){
        super(Name, phoneNumber, age);
        this.rating = rating;
        this.mycar = car;
    }

    public boolean getAvailable(){return Available;}

    public void setAvailable(int DLNumber){this.Available = Available;}

    public void displayDriver() {
        System.out.println("Driver: " + getName() + "Rating: " + rating);
        System.out.println("Vehicle: " + mycar.getCarDetails());
    }

    public void requestPassengerInfo(passenger p){
        System.out.println(p.displayPassenger());
    }




}
