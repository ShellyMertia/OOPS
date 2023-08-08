package Constructors;

public class Phone {
    String modelName;
    String brandName;
    int modelNumber;
    int displaySize;
    int batterySize;
    int megaPixels;
    int numberOfCameras;
    int ram;
    int price;

    public Phone(String modelName, String brandName, int modelNumber, int displaySize, int batterySize, int megaPixels, int numberOfCameras, int ram, int price) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.modelNumber = modelNumber;
        this.displaySize = displaySize;
        this.batterySize = batterySize;
        this.megaPixels = megaPixels;
        this.numberOfCameras = numberOfCameras;
        this.ram = ram;
        this.price = price;
    }

    public Phone(Phone phone) {
        modelName = phone.modelName;
        brandName = phone.brandName;
        modelNumber = phone.modelNumber + 1;
        displaySize = phone.displaySize;
        batterySize = phone.batterySize;
        megaPixels = phone.megaPixels;
        numberOfCameras = phone.numberOfCameras;
        ram = phone.ram;
        price = phone.price + 10000;
    }
}
