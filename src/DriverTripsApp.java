import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DriverTripsApp {

    static HashMap<String, Integer> tripCounts = new HashMap<>();

    public static void DriverTripsApp() {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("DRIVER MENU");
            System.out.println("1. Add Trip");
            System.out.println("2. View Trip Summary");
            System.out.println("3. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter destination:");
                    String destination = scanner.nextLine();
                    addTrip(destination);
                    break;

                case "2":
                    viewTripSummary();
                    break;

                case "3":
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }

    public static void addTrip(String destination) {
        tripCounts.put(destination, tripCounts.getOrDefault(destination, 0) + 1);
        System.out.println("Trip to " + destination + " recorded.");
    }

    public static void viewTripSummary() {

        if (tripCounts.isEmpty()) {
            System.out.println("No trips recorded yet.");
            return;
        }

        System.out.println("TRIP SUMMARY");

        int totalTrips = 0;

        for (Map.Entry<String, Integer> entry : tripCounts.entrySet()) {
            String destination = entry.getKey();
            int count = entry.getValue();

            System.out.println(destination + " → " + count + " trips");
            totalTrips += count;
        }

        System.out.println("Total Trips: " + totalTrips);
    }
}