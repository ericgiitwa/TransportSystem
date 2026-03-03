import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO OUR TRANSPORTATION APP");
        System.out.println("Select your Account:");
        System.out.println("1. Passenger");
        System.out.println("2. Driver");

        String accountChoice = scanner.nextLine();
        switch (accountChoice){
            case "Passenger":
                System.out.println("HELLO Passenger");
                System.out.println("create new account");
                System.out.println("Sign in");
                System.out.println("View wallet");
                System.out.println("View rating");

            case "Driver":
                System.out.println("HELLO Driver");
                System.out.println("create new account");
                System.out.println("Sign in");
                System.out.println("View wallet");
                System.out.println("View rating");

        }

        scanner.close();






        Passenger p1 = new Passenger("Lenny Chingi", "0711223344", 194072, 24, 3.44);
        Passenger p2 = new Passenger("Jason Kangogo", "0722334455", 200316, 17, 4.66);

        Car car1 = new Car("Toyota Fielder", "KDL 123X", "Silver", "Green", 4);
        Driver d1 = new Driver("Eric Giitwa", "0733445566", 200857, 23, 5.00);

        p1.setLocation("Nairobi CBD");
        d1.setLocation("Westlands");

        p1.getLocation();
        d1.getLocation();
        d1.confirmRide();

        p1.verifyAge();
        d1.verifyAge();

        d1.setAvailability(true);
        d1.checkAvailability();

    }
}