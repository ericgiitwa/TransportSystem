import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class BaseUser implements UserActions {
    private String name;
    private String phoneNumber;
    private int age;
    private String currentLocation = "Unknown";

    public static void setProfile(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("ENTER YOUR NAME");
            String name = scanner.nextLine();
            System.out.println("ENTER YOUR PHONE NUMBER");
            String phoneNumber = scanner.nextLine();
            System.out.println("ENTER YOUR AGE");
            String age = scanner.nextLine();

        }
        catch(InputMismatchException e){}
        finally {
            scanner.close();
        }
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