package Constructors;

/*
Create a class Student with following requirements
      i. Two data members
        age:int
        name:String
        ii. Four constructors
        Default constructor: Should set age to 0 and name to null
        Constructor with int parameter: Should set age to the passed parameter and name to null
        Constructor with String parameter: Should set name to the passed parameter and age to 0
        Constructor with two parameters - int and String. Should set the age to int parameter and name to String parameter
        The assignment code should only be in the 4th constructor. The top 3 constructors should use telescoping to invoke the 4th constructor.*/

public class Student {
    // write the code of student class here
    int age;
    String name;

    //Default constructor
    public Student() {
    }

    public Student(int age) {
        //Telescoping constructor call
        this(age,null);
    }

    public Student(String name) {
        //Telescoping constructor call
        this(0,name);
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
