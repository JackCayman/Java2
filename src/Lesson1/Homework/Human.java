package Lesson1.Homework;

public class Human extends Runner implements RunAndJump {
    public Human(String name) {
        super(name);
    }

    @Override
    public int run() {
        return 400;
    }

    @Override
    public int jump() {
        return 2;
    }
}
