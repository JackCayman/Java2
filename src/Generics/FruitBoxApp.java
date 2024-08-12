package Generics;

import java.util.ArrayList;

public class FruitBoxApp {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        Object obj = 23;


        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

        appleBox.sumBox(appleBox1);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox.getWeight());

    }

}
