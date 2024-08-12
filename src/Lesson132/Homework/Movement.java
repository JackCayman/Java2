package Lesson1.Homework;

public interface Movement {
    void run(int distance);
    void jump(int height);
    public int getMaxJump();
    public int getMaxRun();
}
