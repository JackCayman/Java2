package Lesson1.Homework;

public class Robot implements Movement {
    private String name;
    private int maxRun = 10000;
    private int maxJump = 5;

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public Robot(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance> maxRun){
            System.out.println(name+" не смог пробежать");

        }else {
            System.out.println(name+" пробежал");

        }
    }

    @Override
    public void jump(int height) {

        if (height> maxJump){
            System.out.println(name+" не смог перепрыгнуть");

        }else {
            System.out.println(name+" Перепрыгнул");

        }
    }
}
