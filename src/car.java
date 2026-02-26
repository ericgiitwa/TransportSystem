public class car {
        private String brand;
        private String model;
        private String regPlate;
        private String color;
        private int capacity;

        public car(String brand, String model, String regPlate, String color, int capacity) {
            this.brand = brand;
            this.model = model;
            this.regPlate = regPlate;
            this.color = color;
            this.capacity = capacity;
        }

        // Getters to allow other classes to see the car info
        public String getCarDetails() {
            return color + " " + brand + model + " " + regPlate + "";
        }
    }


