package accessModifiers;

import accessModifiers.school.Student;

public class Main extends Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.rank = 20;
        System.out.println(s.rank);
        //s.name = "guhu"; //'name' has protected access in 'accessModifiers.school.Student'
       // s.marks = 50 ; //'marks' is not public in 'accessModifiers.school.Student'. Cannot be accessed from outside package
         Main m = new Main();
         m.name = "ABCD"; //protected accessible
       //  m.marks = 90; //default not accessible
        // m.rank = 2; //private not accessible


    }
}
