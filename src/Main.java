public class Main {
    public static void main(String[] args){
        System.out.println("WELCOME TO OUR TRANSPORTATION APP");

        Passenger p1 = new Passenger("Lenny Chingi", "0711223344", 194072, 24, 3.44);
        Passenger p2 = new Passenger("Jason Kangogo", "0722334455", 200316, 17, 4.66);

        Car taxi1 = new Car("Toyota Fielder", "KDL 123X", "Silver", "Green", 4);
        Driver d1 = new Driver("Eric Giitwa", "0733445566", 200857, 23, 5.00);

        p1.setLocation("Nairobi CBD");
        d1.setLocation("Westlands");

        p1.getLocation();
        d1.getLocation();

        p1.verifyAge();
        d1.verifyAge();


    }
}