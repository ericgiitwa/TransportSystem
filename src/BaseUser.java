import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public abstract class BaseUser implements UserActions {
    private String name;
    private String phoneNumber;
    private int age;
    private String currentLocation = "Unknown";

    public void setProfile() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("ENTER YOUR NAME");
            this.name = scanner.nextLine();

            System.out.println("ENTER YOUR PHONE NUMBER");
            this.phoneNumber = scanner.nextLine();

            System.out.println("ENTER YOUR AGE");
            this.age = Integer.parseInt(scanner.nextLine());

            try (FileWriter writer = new FileWriter("BaseUser.txt", true)) {
                writer.write(name + "," + phoneNumber + "," + age + "\n");
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input.");
        } finally {
            scanner.close();
        }
    }
}
//    public String getName() { return name; }
//
//    @Override
//    public void setLocation(String destination) {
//        this.currentLocation = destination;
//    }
//
//    @Override
//    public void getLocation() {
//        System.out.println(name + " is currently at: " + currentLocation);
//    }
//
//    @Override
//    public void verifyAge() {
//        if (age >= 18) {
//            System.out.println(name + " is verified at age " + age);
//        } else {
//            System.out.println(name + " cannot ride without an adult present");
//        }
//    }
//
//    @Override
//    public abstract void confirmRide();//abstract so Passenger and Driver handle it differently
//}