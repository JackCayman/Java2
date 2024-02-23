package Lesson1.Interfaces;

public interface HardWorkable extends Workable {
    void workHard();



   default void workVeryHard() {
         workHard();
        System.out.println("По умолчанию очень тяжело");
    }
}
