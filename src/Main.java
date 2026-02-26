public class Main {
    public static void main(String[] args){
        System.out.println("WELCOME TO OUR TRANSPORTATION APP");

        passenger p1 = new passenger("Lenny", "07123...", 25);
        driver d1 = new driver("Jason", "07222...", 30);
        Vehicle myCar = new Vehicle("Midnight Blue", "Tesla", "Model 3",
                "Sedan", "ABC-1234", 987654, 5);

        p1.getLocation();
        d1.getLocation();
        p1.verifyAge();
        p1.confirmRide();


    }
}