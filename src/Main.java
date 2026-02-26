public class Main {
    public static void main(String[] args){
        System.out.println("WELCOME TO OUR TRANSPORTATION APP");

        passenger p1 = new passenger("Lenny Chingi", "0711223344", 194072, 24,3.44);
        passenger p2 = new passenger("Jason Kangogo", "0722334455", 200316, 25,4.66);
        car taxi1 = new car("Toyota Fielder", "KDL 123X", "Silver","green" ,4);
        driver d1 = new driver("Eric Giitwa", "0733445566",200857, 23, 5.00,taxi1);

        p1.getLocation();
        d1.getLocation();
        p1.verifyAge();
        p1.confirmRide();


    }
}