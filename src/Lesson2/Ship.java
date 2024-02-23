package Lesson2;

public class Ship extends Transport implements Swimmable {
    int waterline;

    public int getWaterline() {
        return waterline;
    }

    public void setWaterline(int waterline) {
        this.waterline = waterline;
    }

    @Override
    void load() {
        System.out.println("Погрузка коабля");
    }

    @Override
    public void swim() {
        System.out.println("Корабль плывёт медленно");
    }
}
