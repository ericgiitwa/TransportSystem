public class Main {
    public static void main(String[] args){
        System.out.print("WELCOME TO OUR TRANSPORTATION APP");

        passanger p1 = new passanger("Lenny Chingi", "07123...", 25);
        driver d1 = new driver("Jason Kangogo", "07222...", 30);
        Vehicle myCar = new Vehicle("Midnight Blue", "Tesla", "Model 3",
                "Sedan", "ABC-1234", 987654, 5);



        myCar.displayDetails();

    }
}