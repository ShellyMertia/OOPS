package Inheritance;

public class User {
    private int id;
    public String name ;
    public String phoneNumber;

    public void greet(){
        System.out.println("Hi everyone !");
    }

    public User() {
    }

    public User(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void helloWorld(){
        System.out.println("Hello everyone !!");
    }
}
