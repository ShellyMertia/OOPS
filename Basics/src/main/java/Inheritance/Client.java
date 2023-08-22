package Inheritance;

public class Client {
    public static void main(String[] args) {
        Mentor n = new Mentor();
        n.greet();
        //n.id = 1;
        n.setId(4);
        n.name = "ABS";
        n.phoneNumber ="494";

        //Upcasting
        User u = new Mentor();
        u.helloWorld();
        u.greet();
        //u.greetFromMentor() ; --> additional features are being able to use

        //Down - casting / explicit casting because we have to explicitly cast
       // Mentor m = new User();  error while compiling
        Mentor men = (Mentor) new User();
        men.greetFromMentor();   // Run time error : highly prone to errors
        //Exception in thread "main" java.lang.ClassCastException: class Inheritance.User cannot be cast to class Inheritance.Mentor (Inheritance.User and Inheritance.Mentor are in unnamed module of loader 'app')
        //	at Inheritance.Client.main(Client.java:20)

        printName(new Mentor());
        printName(new User());


    }

    public static void printName(User user)
    {
        System.out.println(user.getName());
    }
    //same method can be used for both the Mentor object and user object. Advantages of upcasting

}
