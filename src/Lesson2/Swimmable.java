package Lesson2;

public interface Swimmable {
    default void swim(){
        System.out.println("Плывёт как-то по умолчанию");
    }
}
