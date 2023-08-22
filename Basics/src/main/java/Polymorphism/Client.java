package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //Method overloading
        //sout println method can take different types of arguments : because of method overloading
//        System.out.println("Hi everyone");
//        System.out.println(1);
//        System.out.println(true);
//        System.out.println();
        Vehicle v = new Vehicle();
        v.startEngine();

        ICECar iceCar = new ICECar();
        iceCar.startEngine();
        iceCar.startEngineDemo();


        /*
        * Vehicle has 3 methods,
        * ICECar has 5 methods, 3 inherited, and 2 new methods
        * Out of them 3 inherited 2 are overridden
        *
        * */

        Vehicle vehicle = new ICECar();
        //using the vehicle ref variable,how many method will I be able to call
        vehicle.startAC();  //method will be executed from IceCar
        vehicle.startEngine(); //method executed will have same logic as vehicle
        vehicle.startMedia(); //method will be executed from IceCar
        //vehicle.autoUnlockDoors();  -> not doable

        System.out.println(" ---- Upcasting Advantages---");
        List<Vehicle> vehicles = new ArrayList<>();
        ICECar maruti = new ICECar();
        ICECar mahindra = new ICECar();
        ElectricCar tata = new ElectricCar();
        ElectricCar tesla = new ElectricCar();
        vehicles.add(maruti);  //upcasting
        vehicles.add(mahindra);
        vehicles.add(tata);
        vehicles.add(tesla);
        startAllCars(vehicles);


        Vehicle v1 = new ElectricCar();
        v1.startEngine();
        Vehicle v2 = new AdvancedElectricCar();
        v2.startEngine();
        ElectricCar ec = new AdvancedElectricCar();
        ec.startEngine();
        AdvancedElectricCar ac = new AdvancedElectricCar();


    }

    public static void startAllCars(List<Vehicle> vehicles){
            for(Vehicle v: vehicles){
                v.startEngine();
            }
    }
}
