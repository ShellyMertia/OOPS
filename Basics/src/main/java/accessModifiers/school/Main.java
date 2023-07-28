package accessModifiers.school;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.rank = 10;
        System.out.println(s.rank);
//      s.address = "CYSI"; //'address' has private access in 'accessModifiers.school.Student'
        s.marks = 100;
    }
}
