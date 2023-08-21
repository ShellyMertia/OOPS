package Inheritance;

public class Mentor extends User{

    public Mentor() {
        super(4, "678", "7899909090");
    }

    public Mentor(int id, String name, String phoneNumber) {
        super(id, name, phoneNumber);
    }
}
