# Abstract Classes
Abstract class "can" (ability) contains abstract methods.
- consists of abstract methods
- can have common attributes as well
- we can have some common methods also


Example : We have a Vehicle interface. ICECar and ElectricCar implements Vehicle interface.
the attribute noOfWheel can be common to all the classes
the method honk can be common to all the classes.
Instead of making a Vehicle as interface we can use Vehicle as abstract class


Q. Should an abstract class have at least one abstract methods? : No
Q. Can we create objects of an abstract class : No
Q. Can an abstract class have constructor: YES , Not to create an object bt to initialize variables.

Why do we need interfaces if abstract classes can do everything?
Java doesn't support multiple inheritance. If a class extends a single abstract class , it won't be able to extend any
other class. with interface, we can still inherit another class and can inherit multiple interface.

Interfaces are generally used when the methods we want to use in it are not necessarily related to the classes which 
implement them. eg. recycleMe() can be used on vehicles and also on electronics.
