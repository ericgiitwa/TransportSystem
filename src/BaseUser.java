public abstract class BaseUser implements UserActions {
    private String name;
    private String phoneNumber;
    private int age;
    private String currentLocation = "Unknown";

    public BaseUser(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() { return name; }

    @Override
    public void setLocation(String destination) {
        this.currentLocation = destination;
    }

    @Override
    public void getLocation() {
        System.out.println(name + " is currently at: " + currentLocation);
    }

    @Override
    public void verifyAge() {
        if (age >= 18) {
            System.out.println(name + " is verified at age " + age);
        } else {
            System.out.println(name + " cannot ride without an adult present");
        }
    }

    @Override
    public abstract void confirmRide();//abstract so Passenger and Driver handle it differently
}