package StaticFinalAbstract;

public class Student {
    //int fullMarks;
    static int fullMarks;
    int marks;

    public Student() {
    }

    public Student(int marks) {
        this.marks = marks;
    }

    public void printStudentMarks(){
        System.out.println("Full marks = " + Student.fullMarks);
        System.out.println("Marks = " + this.marks);
    }

    public static void printFullMarks(){
        System.out.println("Full Marks = " + Student.fullMarks);
        //System.out.println(marks); // non-static members can't be accessed from static methods
    }

    public static void printFullMarks(Student s){
        System.out.println("Full Marks = " + Student.fullMarks);
        System.out.println(s.marks); //s is non-static but not a variable of the same class

    }
    public static void greet(){
        System.out.println("Hello, how are you doing?");
    }

}
