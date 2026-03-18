import java.util.InputMismatchException;
import java.util.Scanner;
public class Passenger extends BaseUser {
    private double rating;

    public Passenger(String name, String phone, int id, int age, double rating) {
        //super(name, phone, age);
        this.rating = rating;
    }

    public static void passengerMenu(){
        Scanner Scanner = new Scanner(System.in);
        try{
            System.out.println("HELLO Passenger");
            System.out.println("1. create new account");
            System.out.println("2. Sign in");
            System.out.println("3. View wallet");
            System.out.println("4. View rating");
            System.out.println("5. ORDER RIDE");

            String choice = Scanner.nextLine();
            switch (choice) {
                case "1": // create new account
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
        System.out.println("Passenger " + getName() + " has confirmed the ride.");
    }
}