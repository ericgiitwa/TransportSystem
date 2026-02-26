public class Passenger extends BaseUser {
    private double rating;

    public Passenger(String name, String phone, int id, int age, double rating) {
        super(name, phone, age);
        this.rating = rating;
    }

    @Override
    public void confirmRide() {
        System.out.println("Passenger " + getName() + " has confirmed the ride.");
    }
}