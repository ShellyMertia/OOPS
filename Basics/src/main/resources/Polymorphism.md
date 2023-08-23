A a = new A();
B b = new B();
A a = new B();
B b = new A();

We can do all four

Example : A company has launched a TV. Apart from basic functionality it comes with three smart features.

      [_*__*__ *__] R1      -->       ____________________
                                      | 3 smart features  |
                                      |                   |
                                      |                   |
                                      |___________________| S1



     __________
     [_*_*_*_*_*] R2                  ____________________
                                      | 5 smart features  |
          ---->                       |     3(from S1)    |
                                      |      + 2 (new)    |
                                      |___________________| S2


   R1 -> S1  =>  A a = new A();
   R2 -> S2 =>  B b = new B();


   Can we use remote R1 for S2 ?
   A a = new B();  This is called upcasting/Implicit casting
   Child to parent
    - Doable ( syntactically doable ) - Yes
    - Can we use all the five feature - No ( all the features in the class won't be accessible)
    - Can it lead to any error ? No - because the remote doesn't have enough button to do extra things.
    - Not prone to errors.


    R2 -> S1
    B b = new A(); ( down-casting /explicit casting)
    - Doable - Yes
    - All the features of the child class won't be accessible.
    - Is it prone to errors - Highly . Why because if some presses new buttons in this case. we don't what can go wrong.
    - Not recommended.
    - Then why does this exists? Because it not only exists for objects but it also exists for primitive objects.
    long l = 120l;
    int n = (int)l; we can do that


    Polymorphism
    Method overloading and method overriding

    Method overloading :

      public void greet(String name ){
            sout("Hi" );
      }
    methods with same names
    how does Java identifies  a method? - Using it's signature
    public void greet(String name)
                |_________________|
                   method signature (name + parameters)


    greet(String)
    greet(int)
    greet()

    Can we have duplicate method signatures in a class? - No
    Can we have duplicate methods name with different parameters in a class ? - yes ( method overloading)


    Method overriding
    ------------------

                          __________________
                         |     Vehicle      |
                         | ________________ |
                         |  startEngine()   |
                         |__________________|
                         /                  \
                        /                    \
                       /                      \
             -----------------              ------------------
            |  ICE CAR        |             |  Electric Car  |
            |-----------------|             |----------------|
            | startEngine()   |             | startEngine()  |
            |_________________|             |________________|
             /             \                  /         \
            /               \                /           \
        Mahindra          Maruti           Telsa         Tata
     startEngine()    startEngine()    startEngine()  startEngine()

     - method signature remains the same, but the logic/implementation inside the method should be different.
     - we can achieve this by method overriding.
     - startEngine() - same method signature.
     - but implementation is different in parent and child class
     - In case of upcasting the method invoked will always be the method present in object.
     Parent p = new Child();
     - methods possible to invoke are the methods present in parent class.
     - methods executed would be the methods from child class.
     - Reference variable gives you the option to call the members of the class.Using the reference variable only
     we can call the attribute or the methods of the class.
     - Execution depends on teh object.

     Use Cases:












