public class passenger extends baseUser  {
    private double rating;


    public passenger(String Name, String phoneNumber, int IDNumber, int age, double rating) {
        super(Name, phoneNumber, age);
        this.rating = rating;

    }
//    public void displayPassenger(){
//        System.out.println("Name: " + getName() + "phoneNumber: " + getPhoneNumber());
//
//    }
//
//    public void requestDriverInfo(driver d) {
//        System.out.println(d.displayDriver());
//    }
}
