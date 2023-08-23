The following are the essential building blocks of object -oriented programming
- Attributes
- Methods
- Classes
- Objects

# Principles of OOPS
 There is one principle that is : Abstraction

Pillars of OOPs
 - Inheritance
 - Encapsulation
 - Polymorphism


 # Abstraction
 - The concept of making something abstract( representing something
 in terms of ideas)
 - In Object - oriented programming it simplifies the programs' structure.
 - It focuses on revealing the necessary details of system and hiding irrelevant information.
 - It shows what an object does and hides how it does.

  Advantages of Abstraction
  - I reduces complexity of the system from user's perspective.
  - Reusable code
  - extensible code
  - maintainable code
  - Refines modularity of the application.


     Data hiding : Masking a class's internal operations and only providing an interface through which other entities
     can interact with the class without being aware of what is happening within.

     The goal is th eto implement classes in a way that prevents unauthorized access to or modification of the original
     contents of a class by its instance.

  Components of Data hiding
   Encapsulation
   Abstraction


 # Encapsulation
   - Technique to achieve data hiding.
   - Encapsulation in OOP refers to binding data and the methods to manipulate that data together in a single unit—class.
   - A class can be thought of as a capsule with methods and attributes inside it.

Advantages of Encapsulation
- Simpler to modify and maintain
- Which data member we wish to keep hidden or accessible can be specified.
- We choose which variables are read-only and write-only (increases flexibility).


Abstraction vs Encapsulation
Abstraction
It focuses on the design level of the system.
It hides unnecessary data to simplify the structure.
It highlights the work that the object performs.
Abstraction means to hide implementation using interface and
abstract classes.


Encapsulation
It focuses on the application level of the system.
It restricts access to data to prevent its misuse.
It deals with the internal working of the object.
Encapsulation means to hide data using getter and setter
functions.


# Inheritance
Inheritance provides a way to create a new class from an existing class. The new class is a specialized
version of the existing class such that it inherits all the public attributes (variables) and methods of the
existing class. The existing class is used as a starting point or base to create the new class.

  IS-A relation
  Whenever there is IS-A relationship between objects, we can use inheritance.
   For Example : Dog is a Animal. (Parent class : Animal, Child class : Dog)

   Types of Inheritance
   1. Single Inheritance
   2. Multiple Inheritance
   3. Multi - level Inheritance
   4. Hierarchical Inheritance
   5. Hybrid Inheritance

Advantages
- Re-usability
- Extensibility
- Data hiding
- Code Modification easily.


# Polymorphism
In programming, polymorphism is a phenomenon that allows an object to have several different forms
and behaviors.
For example, take the Animal class. There are many different animals, e.g., lion, deer, dog, and crocodile, etc.
So, they are all animals, but their properties are different. The animal class can have a method, makeNoise. Its
implementation should be different for a lion, deer, or any other animal as they all have different noises. This
is called polymorphism.


Types of Polymorphism
 - Dynamic Polymorphism
   Dynamic polymorphism is the mechanism that defines the methods with the same name, return type, and
   parameters in the base class and derived classes.
   Hence, the call to an overridden method is decided at
   runtime. That is why dynamic polymorphism is also known as runtime polymorphism. It is achieved by
   method overriding.
 - Static Polymorphism
   Static polymorphism is also known as compile-time polymorphism, and it is achieved by method
   overloading or operator overloading.

 Dynamic Polymorphism VS Static Polymorphism
   Dynamic
    Polymorphism that is resolved during runtime is known as
    dynamic polymorphism.
    Method overriding is used in dynamic polymorphism.
    Mostly used to have a separate implementation for a method
    that is already defined in the base class.
    Arguments must be the same in the case of overriding.
    Arguments must be the same in the case of overriding.
    Private and sealed methods cannot be overridden.
    Private and sealed methods cannot be overridden.

   Static
    Private and sealed methods cannot be overridden.
    Method overloading is used in static polymorphism.
    Mostly used to increase the readability of the code.
    Arguments must be different in the case of overloading.
    Return type of the method does not matter.
    Private and sealed methods can be overloaded.
    Gives better performance because the binding is being done
    at compile-time.











