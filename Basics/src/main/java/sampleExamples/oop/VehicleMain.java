package sampleExamples.oop;

//Example of implementation of Inheritance
class Vehicle {
    private String name;
    private String model;

    public Vehicle(String name, String model) {
        this.name = name;
        this.model = model;
    }
    public void getName(){
        System.out.print("This car is " + name+" " + model);
    }
}

//Single Inheritance
class FuelCar extends Vehicle{
    private String combustType;

    public FuelCar(String name, String model, String combustType) {
        super(name, model);
        this.combustType = combustType;
    }

    public void getFuelCar(){
        getName();
        System.out.print(", Combustion type " + combustType);
    }

}

//Hierarchical inheritance
class ElectricalCar extends Vehicle{
    private String batterPower;

    public ElectricalCar(String name, String model, String batterPower) {
        super(name, model);
        this.batterPower = batterPower;
    }
    public void getElecticalCar(){
        getName();
        System.out.print(", Battery Power " + batterPower);
    }
}
//Multi-level Inheritance
class Gasoline extends FuelCar{
    private String combustType;
    private String gasCapacity;

    public Gasoline(String name, String model, String combustType, String gasCapacity) {
        super(name, model, combustType);
        this.gasCapacity = gasCapacity;
    }
    public void getGasolineCar(){
        getName();
        System.out.print(", gas capacity " + gasCapacity);
    }

}
public class VehicleMain{
    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        FuelCar fc = new FuelCar("Honda","Accord","Petrol");
        fc.getFuelCar();
        System.out.println();

        System.out.println("Hierarchical inheritance");
        ElectricalCar ec = new ElectricalCar("Tesla","ModeXY","200MWH");
        ec.getElecticalCar();
        System.out.println();

        System.out.println("Multi - level Inheritance");
        Gasoline gc = new Gasoline("Toyota","Corolla","Gasoline","30 liters");
        gc.getGasolineCar();

    }
}

