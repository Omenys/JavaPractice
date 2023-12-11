// Car Class Example Problem

class Car {
    // FIELDS
    private int yearModel = 0;
    private String make = "";
    private int speed = 0;

    // CONSTRUCTOR
    public Car(int yearModel, String make) {
        this.setYearModel(yearModel);
        this.setMake(make);
        this.setSpeed(0);
    }

    // GETTERS
    // Get year model
    public int getYearModel() {
        return this.yearModel;
    }

    // Get make
    public String getMake() {
        return this.make;
    }

    // Get speed
    public int getSpeed() {
        return this.speed;
    }

    // SETTERS
    // Set year model
    public void setYearModel(int year) {
        this.yearModel = year;
    }

    // Set make
    public void setMake(String make) {
        this.make = make;
    }

    // Set speed
    public void setSpeed(int speed) {
        this.speed = speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    // Method to add 5 to speed for each time it is called
    public int accelerate(int mph) {
        this.setSpeed(this.getSpeed() + mph);
        return this.getSpeed();
    }

    // Method to subtract 5 from speed each time it is called
    public int brake(int mph) {
        this.setSpeed(this.getSpeed() - mph);
        return getSpeed();
    }
}

public class CarClass {
    public static void main(String args[]) {

        // Create instance of car class
        Car car = new Car(2017, "Toyota Prius");

        // Call accelerate 5 times and display speed
        System.out.println("\nAccelerating");
        System.out.println("-------------");
        System.out.printf("The car's current speed is: %d%n", car.getSpeed());
        for (int i = 0; i < 5; i++) {
            System.out.printf("The car's current speed is: %d%n", car.accelerate(5));
        }

        // Call brake 5 times and display speed
        System.out.println("\nBraking");
        System.out.println("-------------");
        System.out.printf("The car's current speed is: %d%n", car.getSpeed());
        for (int i = 0; i < 5; i++) {
            System.out.printf("The car's current speed is: %d%n", car.brake(5));
        }
    }
}
