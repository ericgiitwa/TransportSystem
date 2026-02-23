public class Vehicle {
    private String vehicleColour;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleType;
    private String licencePlate;
    private int vinNumber;
    private int noSeats;


    public  Vehicle(String vehicleColour, String vehicleBrand,String vehicleModel,String vehicleType, String licencePlate, int vinNumber, int noSeats){
        this.vehicleColour = vehicleColour;
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.vehicleType = vehicleType;
        this.licencePlate = licencePlate;
        this.vinNumber = vinNumber;
        this.noSeats = noSeats;
    }

    void displayDetails() {
        System.out.println("Confirm your Vehicle details Bellow:");
        System.out.println(vehicleColour + vehicleBrand + vehicleModel + vehicleType + licencePlate + vinNumber + noSeats);
    }
}
