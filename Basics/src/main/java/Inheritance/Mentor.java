package Inheritance;

public class Mentor extends User{


//    public Mentor() {
//        super(4, "678", "7899909090");
//    }


    public Mentor() {
    }

    public Mentor(int id, String name, String phoneNumber) {
        super(id, name, phoneNumber);
    }

    public void greetAll(){
        super.greet();
        super.helloWorld();
    }

    public void greetFromMentor(){
        System.out.println("Hello everyone ! I am your Mentor");
    }
}
