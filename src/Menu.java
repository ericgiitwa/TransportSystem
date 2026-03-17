import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {
    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO OUR TRANSPORTATION APP");
        System.out.println("Select your Account:");
        System.out.println("1. Passenger");
        System.out.println("2. Driver");
        try {
            String choice = scanner.nextLine();
            switch (choice) {
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
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please enter the correct data type.");
        }
        finally {
            scanner.close();
        }
    }
}
