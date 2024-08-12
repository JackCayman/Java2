package Lesson1.Homework;

public class Cat implements Movement {

    public Cat(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    private int maxRun = 3;
    private int maxJump = 1;
    private String name;

    @Override
    public void run(int distance) {

        if (distance > maxRun) {
            System.out.println(name + " не смог пробежать");
        } else {
            System.out.println(name + " Пробежал");
        }
    }

    @Override
    public void jump(int height) {

        if (height > maxJump) {
            System.out.println(name + " не смог перепрыгнуть");

        } else {
            System.out.println(name + " Перепрыгнул");
        }
    }
}
