package Polymorphism;

public class ICECar extends Vehicle{

    @Override  //optional and has no functionality -> increases readability and checks for override
    public void startEngine(){
        System.out.println("ICE Car engine is starting");
    }
    @Override
    public void startMedia(){
        System.out.println("Starting media via bluetooth");
    }

    public void startEngineDemo(){
        super.startEngine();  // if we want to bring the implementation from the Parent class
        this.startEngine();

        System.out.println("Demo");
    }

    public void autoUnlockDoors(){
        System.out.println("Doors are unlocked automatically");
    }


}
