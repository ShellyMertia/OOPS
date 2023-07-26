package sampleExamples.oop;

public class AdditionMain {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a + b+ c;
    }

    public static void main(String[] args) {
        AdditionMain am = new AdditionMain();
        System.out.println(am.add(2,3));
        System.out.println(am.add(2,3,5));

    }
}
