package sampleExamples.oop;
/*
Example of implementation of Abstraction in programming languages
 */
public class CircleClass {
    //Attributes of Circle
    private double radius;
    private double pi;

    //Constructors
    //Default constructor

    public CircleClass() {
        radius = 0;
        pi = 3.142;
    }
    //Parameterized constructor
    public CircleClass(double radius) {
        this.radius = radius;
        pi = 3.142;
    }

    //Methods
    public double area(){
        return pi * radius * radius;
    }

    public double circumference(){
        return 2 * pi * radius;
    }

    //Main
    public static void main(String[] args) {
       CircleClass c1 = new CircleClass(5);
        System.out.printf("Area of circle = %.2f %n",c1.area());
        System.out.printf("Circumference of circe = % .2f %n", c1.circumference());
    }

}
