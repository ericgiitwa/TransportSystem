import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver extends BaseUser {
    private boolean available = true;
    private double rating;
    private Car mycar;
//
//    public Driver(String name, String phone, int id, int age, double rating) {
//        super(name, phone, age);
//        this.rating = rating;
//        this.mycar = mycar;
//    }

    public static void driverMenu(){
        Scanner Scanner = new Scanner(System.in);
        try{
            System.out.println("HELLO Driver");
            System.out.println("1. create new account");
            System.out.println("2. Sign in");
            System.out.println("3. View wallet");
            System.out.println("4. View rating");
            System.out.println("5. SELECT CLIENT");

            String choice = Scanner.nextLine();
            switch (choice) {
                case "1":// create new account
                    BaseUser.setProfile();
//                case "2":// Sign in
//
//                case "3": //View wallet
//
//                case "4": //View rating

            }

        }
        catch(InputMismatchException e){}
        finally {
            Scanner.close();
        }


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