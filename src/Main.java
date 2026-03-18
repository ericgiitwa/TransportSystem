import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("WELCOME TO OUR TRANSPORTATION APP");
        System.out.println("Select your Account:");
        System.out.println("1. Passenger");
        System.out.println("2. Driver");

Scanner scanner = new Scanner(System.in);
        try {
            String choice = scanner.nextLine();
            switch (choice) {
                case "Passenger":
                    Passenger.passengerMenu();
                case "Driver":
                    Driver.driverMenu();
            }
        }


        catch(InputMismatchException e){
            }
        finally {
            scanner.close();
        }


//
//        Passenger p1 = new Passenger("Lenny Chingi", "0711223344", 194072, 24, 3.44);
//        Passenger p2 = new Passenger("Jason Kangogo", "0722334455", 200316, 17, 4.66);
//
//        Car car1 = new Car("Toyota Fielder", "KDL 123X", "Silver", "Green", 4);
//        Driver d1 = new Driver("Eric Giitwa", "0733445566", 200857, 23, 5.00);
//
//        p1.setLocation("Nairobi CBD");
//        d1.setLocation("Westlands");
//
//        p1.getLocation();
//        d1.getLocation();
//        d1.confirmRide();
//
//        p1.verifyAge();
//        d1.verifyAge();
//
//        d1.setAvailability(true);
//        d1.checkAvailability();

    }
}