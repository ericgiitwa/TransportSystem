import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
        private String brand;
        private String model;
        private String regPlate;
        private String color;
        private int capacity;

//        public Car(String brand, String model, String regPlate, String color, int capacity) {
//            this.brand = brand;
//            this.model = model;
//            this.regPlate = regPlate;
//            this.color = color;
//            this.capacity = capacity;
//        }

    public static void carRegistration(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("INPUT YOUR VEHICLES BRAND:");
            String brand = scanner.nextLine();
            System.out.println("INPUT YOUR VEHICLES model:");
            String model = scanner.nextLine();
            System.out.println("INPUT YOUR VEHICLES regPlate:");
            String regPlate = scanner.nextLine();
            System.out.println("INPUT YOUR VEHICLES color:");
            String color = scanner.nextLine();
            System.out.println("your vehicle details are: "+color + " " + brand + model + " " + regPlate);
        }
        catch (InputMismatchException e) {}
        finally{
            scanner.close();
        }

    }

    }


