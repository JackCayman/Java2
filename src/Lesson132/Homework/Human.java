package Lesson1.Homework;

public class Human implements Movement{
    private String name;
    private int maxRun = 5;
    private int maxJump = 2;

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
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
