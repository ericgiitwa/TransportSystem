public class Driver extends BaseUser {
    private boolean available = true;
    private double rating;
    private Car mycar;

    public Driver(String name, String phone, int id, int age, double rating) {
        super(name, phone, age);
        this.rating = rating;
        this.mycar = mycar;
    }

    public Car getMyCar() {
        return this.mycar;
    }

    @Override
    public void confirmRide() {
        System.out.println("Driver " + getName() + " accepted.");
    }

    public void setAvailability(boolean status) {
        this.available = status;
    }

    public boolean getAvailable(){return available;}

    public void checkAvailability() {
        if (this.available = true) {
            System.out.println("You can select a new passanger to transport");
        } else {
            System.out.println("Complete the current ride first!");
        }
    }

}