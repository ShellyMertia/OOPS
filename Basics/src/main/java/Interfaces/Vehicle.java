package Interfaces;

public interface Vehicle {
    void startEngine();
    void startAC();
    void startMedia();

    // with interfaces we are setting up a contract, that every vehicle will have the methods present
    // inside the Vehicle and will have their own implementation.
    // We cannot create a objet of an interface.
}
