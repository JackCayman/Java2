package Lesson1.Homework;

public class Cat extends Runner implements RunAndJump {

    public Cat(String name) {
        super(name);
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public int jump() {
        return 3;
    }
}
