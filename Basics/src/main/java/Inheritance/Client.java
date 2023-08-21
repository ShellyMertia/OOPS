package Inheritance;

public class Client {
    public static void main(String[] args) {
        Mentor n = new Mentor();
        n.greet();
        //n.id = 1;
        n.setId(4);
        n.name = "ABS";
        n.phoneNumber ="494";
    }
}
