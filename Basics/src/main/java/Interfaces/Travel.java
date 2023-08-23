package Interfaces;

public class Travel {
   // public Tata tata;
    public Vehicle vehicle;

    public Travel(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void travel(){
        System.out.println("Starting with the trip ");
        vehicle.startEngine();
        vehicle.startMedia();
        vehicle.startAC();
    }
}
