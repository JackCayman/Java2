package Lesson2;

public class Cater extends Transport implements Swimmable {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    void load() {
        System.out.println("Грузим катер припасами");
    }
}
