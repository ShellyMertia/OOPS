package Constructors;

public class Car {

    String name;

    String brand;
    int noOfSeats;

    int engineSize;

    //no argument constructor
    public Car(){
        name = "name";
        brand = "Jaguar";
        noOfSeats = 4;
        engineSize = 4000;
    }

    //Parameterized Constructor
    public Car(String name, String brand, int noOfSeats, int engineSize) {
        System.out.println("Currently inside the parameterized constructor");
        this.name = name;
        this.brand = brand;
        this.noOfSeats = noOfSeats;
        this.engineSize = engineSize;
    }

    public Car(String brand, int noOfSeats, int engineSize) {
        this.brand = brand;
        this.noOfSeats = noOfSeats;
        this.engineSize = engineSize;
    }
}
