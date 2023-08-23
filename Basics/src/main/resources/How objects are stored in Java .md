
Car c = new Car();
Car - Name of the class
c - reference variable
new - Java keyword
Car() - Default Constructor of class Java

# JVM memory locations

JVM has five memory locations namely −

Heap − Runtime storage allocation for objects (reference types).

Stack − Storage for local variables and partial results. A stack contains frames and allocates one for each thread. Once a thread gets completed, this frame also gets destroyed. It also plays roles in method invocation and returns.

PC Registers − Program Counter Registers contains the address of an instruction that JVM is currently executing.

Execution Engine − It has a virtual processor, interpreter to interpret bytecode instructions one by one and a JIT, just in time compiler.

Native method stacks − It contains all the native methods used by the application.

Car c = new Car();  : A object of car gets created
Object will be created in the heap memory and will have some address.
The reference variable will be created in the stack memory which will store the address of the object.

The stack is used for primitive data types, temporary variables, object addresses etc. The heap is used for storing objects in memory.

Garbage Collector: https://newrelic.com/blog/best-practices/java-garbage-collection
Objects take memory.
Garbage collection in Java is the automated process of deleting code that’s no longer needed or used. This automatically frees up memory space and ideally makes coding Java apps easier for developers.


