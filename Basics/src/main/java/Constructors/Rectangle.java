package Constructors;
/*Create a set of classes to meet following requirements

        a. Create a class Point

i. It should have 2 data-members: x and y ii. Add a constructor with two parameters: x and y iii. Add a copy constructor


        b. Create a class Rectangle

i. It should have 2 data-members

        - 1. topLeft (Point)
        - 2. bottomRight (Point)

        ii. Add a constructor with 4 parameters of type int: topLeftX, topLeftY, bottomRightX, bottomRightY
        iii. Add a constructor with 2 parameters of type Point: topLeft, bottomRight
        iv. Add a constructor with 1 parameter of type Rectangle
        v. Make sure that Rectangle constructors make deep copies*/

public class Rectangle {
    // write the code of Rectangle class here
    Point topLeft ;
    Point bottomRight;
    public Rectangle(int topLeftX, int topLeftY, int  bottomRightX, int  bottomRightY) {
       topLeft =  new Point(topLeftX,topLeftY);
       bottomRight = new Point(bottomRightX,bottomRightY);

    }
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public Rectangle(Rectangle r) {
        this(r.topLeft,r.bottomRight);
    }
}
