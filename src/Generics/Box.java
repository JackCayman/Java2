package Generics;

import java.util.List;

public class Box<T extends Fruit> {

    public List<T> box;

    public Box(List<T> box) {
        this.box = box;
    }

    public double getWeight() {
        double weight = 0.0;
        for (T t : box) {
            weight = weight + t.getWeight();
        }
        return weight;
    }

    public void addFruit(T t) {
        this.box.add(t);
    }

    public boolean compare(Box<?> box) {            //extends Fruit
        return getWeight() == box.getWeight();
    }

    public void sumBox(Box<T> box1) {
        for (T t : box) {
            box1.addFruit(t);
        }
        box.clear();
    }
}
