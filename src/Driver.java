public class Driver extends BaseUser {
    private boolean available = true;
    private double rating;

    public Driver(String name, String phone, int id, int age, double rating) {
        super(name, phone, age);
        this.rating = rating;
    }

    @Override
    public void confirmRide() {
        System.out.println("Driver " + getName() + " has accepted the request.");
    }

    public void setAvailable(boolean status) {
        this.available = status;
    }
}