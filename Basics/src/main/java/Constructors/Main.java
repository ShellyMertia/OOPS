package Constructors;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.engineSize = 800;
        c1.noOfSeats = 4;
        c1.name  = "Maruti";
        c1.brand = "Susuki";
        Car c2 = new Car("G Wagon","Mercedez Benz",4, 4000);
        Car c3 = c1; //Shallow Copy //C1 and C2 are holding the same address

        Car c4 = new Car("Mercedez Benz", 4, 4000);


        Phone iphone13 = new Phone("iphone","Apple",13,1
        ,3000,12,2,64,64000);

        Phone iphone14 = new Phone(iphone13);

        Phone iphone15 = new Phone(iphone14); //Deep  Copy

        Phone iphone16 = iphone14; //Shallow copy
    }
}
