package Lesson1.Homework;

public class Robot extends Runner implements RunAndJump {




    public Robot(String name) {
        super(name);
    }

    @Override
    public int run() {
        return 500;
    }

    @Override
    public int jump() {
        return 10 ;
    }
}
