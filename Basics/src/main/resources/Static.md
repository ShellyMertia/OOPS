# Static
We have three static members 
1. Attributes
2. Methods
3. constructors

#### Static Attributes:
- Attributes at class level
     
       class Student{
         int fullMarks;
         int marks;
       }
- if we create multiple objects of the class student. Each object will have 
  there own copy, they will contains there own values. 

         S1 : fullMarks:50            S2 : fullMarks:50
            : marks:45                     marks:43
     
         S3 : fullMarks:50           S3 : fullMarks:50
            : marks:47                  : marks:46            
- fullMarks will be common to all the objects.It doesn't make a sense to make a copy of fullMarks.
- In the scenarios where we want to keep something common , we can make the attribute static;

       class Student{
        static  int fullMarks;
        int marks;
       }
- Static attributes won't be present inside objects, but somewhere in the class memory. Every object will be able to 
access the static attribute.The value won't be copied.

#### Static methods:

- methods which are present at class level.
- Many times we want to use any object without creating an object.
- Example : Utility Methods.
- Always a static member(attribute/method) is invoked using class reference [className].
- we can invoke using object , but it's not a good practice.Why ? Internally, Java fetches class name references and 
  there we be extra step.


Static members exists in class Area.
They are invoked using className.
They are common to all the objects.

Object level attributes + methods exists inside each object, inside heap + invoked by objectName.

Static Variables /methods 
non-static methods can access : YES
static methods can access: YES


Non-static variable/methods:
non-static methods can access : YES
static methods can access: NO 

A static method is always called using className. And to access any object level variable we need the objectName.

### Overriding of static methods
Can we override static methods : YES
Can we achieve polymorphism : NO



      