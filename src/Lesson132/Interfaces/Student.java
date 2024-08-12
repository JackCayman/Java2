package Lesson1.Interfaces;

public class Student implements Studiable,Workable {
    @Override
    public void study() {
        System.out.println("2");
    }
    public void  worker(){
        System.out.println("4");
    }
}
