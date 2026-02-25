public class passanger extends baseUser {

    public passanger(String Name, String phoneNumber, int age) {
        super(Name, phoneNumber, age);
    }

    public void orderRide(String vehicle) {
        System.out.println(getName() + "ordered a " + vehicle);
    }
}
