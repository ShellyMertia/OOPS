package sampleExamples.oop;
//Example of Implementation of Method Overriding

class Animal{
    public void printAnimal(){
        System.out.println("I am from the Animal class");
    }
    void printAnimalTwo(){
        System.out.println("I am from the Animal class");
    }
}
class Lion extends Animal{
    //method overriding

    @Override
    void printAnimalTwo() {
        System.out.println("I am from the Lion class");
    }
}
public class AnimalMain {
    public static void main(String[] args) {
        Animal animal;
        Lion lion = new Lion();
        animal = lion;
        animal.printAnimal();
        animal.printAnimalTwo();
    }


}
