package Lesson2;

public abstract class Transport {
    int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    abstract void load();
}
