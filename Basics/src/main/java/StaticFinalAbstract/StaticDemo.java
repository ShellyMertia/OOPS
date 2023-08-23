package StaticFinalAbstract;

public class StaticDemo {
    public static void main(String[] args) {
        Student.fullMarks = 50;

        Student s1 = new Student(45);
        Student s2 = new Student(43);
        Student s3 = new Student(42);
        s3.fullMarks = 60;  // the value for fullMarks changed for every object
        // not a good practice, we should access static variables using ClassName

        System.out.println("FullMarks for s1 : " + s1.fullMarks  + "," + s1.marks);
        System.out.println("FullMarks for s1 : " + s2.fullMarks  + "," + s2.marks);
        System.out.println("FullMarks for s1 : " + s2.fullMarks  + "," + s2.marks);

        Student sobj = new Student(45);
        sobj.printStudentMarks();
        sobj.greet();

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.greet();

        Student sRef = new IntelligentStudent();
        sRef.greet(); //sRef -> Student -> Student.greet()


    }
}
