package StaticFinalAbstract;

public class Client {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        swap(p);  //p hlds reference/address of the object
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println("------------------------------");
        int x = 10;
        int y = 20;
        swap(x,y);
        System.out.println(x);
        System.out.println(y);
    }

    private static void swap(Point p) {  //copy of address is being passed
        int temp = p.x;
        p.x = p.y;
        p.y = temp;
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
class Point{
    int x;
    int y;

}
