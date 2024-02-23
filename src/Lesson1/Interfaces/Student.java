package Lesson1.Interfaces;

public class Student implements Studyable,HardWorkable {

    @Override
    public void study() {
        System.out.println("Студент учиться только перед сессией");
    }

    @Override
    public void work() {
        System.out.println("Студент ещё и работает");
    }

    @Override
    public void workHard() {
        System.out.println("Студент ещё и вкалывает");
    }



    }

